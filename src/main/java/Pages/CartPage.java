package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriverWait wait;
    private WebDriver driver;

    public By checkoutBtn = By.id("checkout");
//    public By checkoutInfo = By.className("checkout_info");
//    public By continueBtn = By.id("continue");

    public CartPage (WebDriver driver){
        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnCheckout(){
        WebElement checkoutBtnElement = driver.findElement(checkoutBtn);
        checkoutBtnElement.click();
    }

//    public boolean isSomeElementVisible() {
//        try {
//            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutInfo));
//            return element.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
//    }

//    public void clickToContinue(){
//        WebElement continueBtnElement = driver.findElement(continueBtn);
//        continueBtnElement.click();
//    }
}
