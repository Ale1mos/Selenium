package PracticeTests;

import InteligenioPages.LoginPageInteligenio;
import PracticePages.RadioButtonPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {
    public WebDriver driver;
    public RadioButtonPage radioButtonPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        radioButtonPage = new RadioButtonPage(driver);
    }

    @Test
    public void testSuccessfulManager(){
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.selectedYes();
    }
}
