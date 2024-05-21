package Tests;

import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    public WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
    }

//    @Test
//    public void shouldBeVisibleForm(){
//        driver.get("https://www.saucedemo.com/");
//        loginPage.login("standard_user","secret_sauce");
//
//        inventoryPage.clickOnItemCart();
//        cartPage.clickOnCheckout();
//        Assert.assertTrue("a", cartPage.isSomeElementVisible());
//    }




}
