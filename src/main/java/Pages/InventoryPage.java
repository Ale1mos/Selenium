package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;

    private By backPack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By countCart = By.cssSelector("#shopping_cart_container > a > span");
    private By itemCart = By.cssSelector("#shopping_cart_container > a");

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnAddBackpack(){
        WebElement backPackElement = driver.findElement(backPack);
        backPackElement.click();
    }

    public String getCountCart (){
        WebElement countCartElement = driver.findElement(countCart);
        return countCartElement.getText();
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void clickOnItemCart(){
        WebElement itemCartElement = driver.findElement(itemCart);
        itemCartElement.click();
    }
}
