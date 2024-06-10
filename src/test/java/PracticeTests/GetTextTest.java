package PracticeTests;

import PracticePages.CheckBoxPage;
import PracticePages.GetTextPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextTest {
    public WebDriver driver;
    public GetTextPage getTextPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        getTextPage = new GetTextPage(driver);
    }
    @Test
    public void testSuccessfulManager(){
        driver.get("https://demoqa.com/text-box");
        System.out.println(getTextPage.getText());
    }

}
