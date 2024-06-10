package Tests;

import Pages.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutStepTwoTest {
    public WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;
    private CheckoutStepOnePage checkoutStepOnePage;
    private CheckoutStepTwoPage checkoutStepTwoPage;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        checkoutStepOnePage = new CheckoutStepOnePage(driver);
        checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
    }
    @Test
    public void testResponsiveDesign(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickOnItemCart();
        cartPage.clickOnCheckout();
        checkoutStepOnePage.fillCheckoutForm("a","b","1");
        checkoutStepOnePage.clickOnContinue();

        checkoutStepTwoPage.setWindowSize(800,500);
        checkoutStepTwoPage.isMenuBtnDisplayed();
    }

    @Test
    public void testDisplayText(){
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user","secret_sauce");

        inventoryPage.clickOnItemCart();
        cartPage.clickOnCheckout();
        checkoutStepOnePage.fillCheckoutForm("a","b","1");
        checkoutStepOnePage.clickOnContinue();

        checkoutStepTwoPage.finishBtn.click();
    }

}
