package PracticeTests;

import PracticePages.CheckBoxPage;
import PracticePages.RadioButtonPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {
    public WebDriver driver;
    public CheckBoxPage checkBoxPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Test
    public void testSuccessfulManager(){
        driver.get("https://demoqa.com/checkbox");
        checkBoxPage.clickHomeInput();
    }
}
