package InteligenioTests;

import InteligenioPages.LoginPageInteligenio;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.assertEquals;

public class LoginTestInteligenio {
    private WebDriver driver;
    private LoginPageInteligenio loginPageInteligenio;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPageInteligenio = new LoginPageInteligenio(driver);
    }

    @Test
    public void testSuccessfulUsername(){
        driver.get("https://qa.inteligenio.com/login");
        loginPageInteligenio.writeUsername("52147541-274-420");
        loginPageInteligenio.writePassword("52147541");
        loginPageInteligenio.clickLoginBtn();
    }

}
