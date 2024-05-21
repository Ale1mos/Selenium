package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutStepOnePage {
    private WebDriver driver;

    public By checkoutInfo = By.className("checkout_info");
    public By checkoutInputs = By.className("form_group");
    public By continueBtn = By.id("continue");
    public By getContinueBtn = By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3");

    public CheckoutStepOnePage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getFormGroups() {
        WebElement checkoutInfoElement = driver.findElement(checkoutInfo);
        return checkoutInfoElement.findElements(checkoutInputs);
    }

    public void fillCheckoutForm(String firstname,String lastname, String postalCode){
        List<WebElement> checkoutInputs = getFormGroups();
        checkoutInputs.get(0).findElement(By.cssSelector("input")).sendKeys(firstname);
        checkoutInputs.get(1).findElement(By.cssSelector("input")).sendKeys(lastname);
        checkoutInputs.get(2).findElement(By.cssSelector("input")).sendKeys(postalCode);
    }

    public void clickOnContinue(){
        WebElement continueBtnElement = driver.findElement(continueBtn);
        continueBtnElement.click();
    }

    public String messageErrorFirstname(){
        WebElement getContinueBtnElement = driver.findElement(getContinueBtn);
        return getContinueBtnElement.getText();
    }




}
