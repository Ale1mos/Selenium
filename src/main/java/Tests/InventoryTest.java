package Tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class InventoryTest {
    private WebDriver driver;

    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void addBackpackToCart(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickOnAddBackpack();

        String expectedNumber = "1";
        String actualNumber = inventoryPage.getCountCart();

        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void scrollToDown(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.scrollToBottom();
    }

    @Test
    public void clickOnCart(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickOnItemCart();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
