package Tests;

import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin(){
       driver.get("https://www.saucedemo.com/");
       loginPage.login("standard_user","secret_sauce");

       String expectedUrl = "https://www.saucedemo.com/inventory.html";
       String actualUrl = driver.getCurrentUrl();
       assertEquals ("Las urls deben ser iguales",expectedUrl,actualUrl);
    }

    @Test
    public void testFailureLogin(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","a");

        String actualText = loginPage.getTextActual();
        String expectedText = "Epic sadface: Username and password do not match any user in this service";
        assertEquals(expectedText,actualText);
    }

    @Test
    public void testPasswordFieldIsSecure(){
        driver.get("https://www.saucedemo.com/");

        String expectedType="password";
        String actualType = loginPage.password();
        assertEquals(expectedType,actualType);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }




}
