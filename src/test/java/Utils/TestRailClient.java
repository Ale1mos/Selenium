package Utils;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class TestRailClient {
    private final String baseUrl;
    private final String username;
    private final String apiKey;

    public TestRailClient(String baseUrl, String username, String apiKey) {
        this.baseUrl = baseUrl;
        this.username = username;
        this.apiKey = apiKey;
    }

    public String addResultForCase(int runId, int caseId, int statusId, String comment) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        String auth = username + ":" + apiKey;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());

        String body = "{\"status_id\": " + statusId + ", \"comment\": \"" + comment + "\"}";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(baseUrl + "/index.php?/api/v2/add_result_for_case/" + runId + "/" + caseId))
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic " + encodedAuth)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
