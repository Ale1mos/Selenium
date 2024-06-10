package Tests;

import Pages.GoogleHomePage;
import Utils.TestRailClient;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GoogleSearchTest {
    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private TestRailClient testRailClient;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        googleHomePage = new GoogleHomePage(driver);
        testRailClient = new TestRailClient("https://alejandra1.testrail.io","alejandramosqueirazapata1@gmail.com","DcKiisccGda6fuXHTZ9l-S6YagVK3HoVIgMT4qtbU");
    }
    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");

        googleHomePage.enterSearchTerm("ae");
        googleHomePage.submitSearch();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(d -> d.getTitle().toLowerCase().startsWith("ae"));

        assertEquals("ae - Buscar con Google", driver.getTitle());

        // Agregar resultado a TestRail
        try {
            testRailClient.addResultForCase(1, 1, 1, "Test passed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
