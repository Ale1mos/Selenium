package Tests;

import Pages.CartPage;
import Pages.CheckoutStepOnePage;
import Pages.InventoryPage;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class CheckoutStepOneTest {
    public WebDriver driver;

    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;
    private CheckoutStepOnePage checkoutStepOnePage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        checkoutStepOnePage = new CheckoutStepOnePage(driver);
    }

    @Test
    public void fillForm(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickOnItemCart();
        cartPage.clickOnCheckout();
        checkoutStepOnePage.fillCheckoutForm("","b","1");
        checkoutStepOnePage.clickOnContinue();

        String actualMessage = "Error: First Name is required";
        String expectedMessage = checkoutStepOnePage.messageErrorFirstname();

        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void shouldToCheckOutStepTwo(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickOnItemCart();
        cartPage.clickOnCheckout();
        checkoutStepOnePage.fillCheckoutForm("a","b","1");
        checkoutStepOnePage.clickOnContinue();
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
