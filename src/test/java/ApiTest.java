import io.restassured.RestAssured;
//import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

public class ApiTest {
    @Test
    public void testGetUser() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
    @Test
    public void testGetComments() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/comments/1")
                .then()
                .statusCode(200)
                .body("email", equalTo("Eliseo@gardner.biz"));
    }
//    @Test
//    public void testUnauthorizedAccess() {
//        RestAssured.baseURI = "https://qa.inteligenio.com/";
//
//        given()
//                .auth().none() // Se usa para simular una autenticación sin credenciales
//                .when()
//                .get("/posts/1")
//                .then()
//                .statusCode(401);
//    }
    @Test
    public void testUnauthorizedAccess() {
        RestAssured.baseURI = "https://qa.inteligenio.com/"; // Reemplaza con la URL de tu API

        given()
                .auth().preemptive().basic("usuario_incorrecto", "contrasena_incorrecta") // Simulamos credenciales incorrectas
                .when()
                .get("/home") // Reemplaza con la ruta que requiere autenticación
                .then()
                .statusCode(200);
    }
    @Test
    public void testUnauthorizedAccess1() {
        RestAssured.baseURI = "https://httpbin.org";

        given()
                .auth().preemptive().basic("invalid_user", "invalid_password") // Simulamos credenciales incorrectas
                .when()
                .get("/basic-auth/user/passwd") // Endpoint que requiere autenticación
                .then()
                .statusCode(401);
    }
}
