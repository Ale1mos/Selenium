import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventory {
    private WebDriver driver;

    private By backpackAddBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By redTshirtAddBtn = By.cssSelector("#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    private By messageText = By.cssSelector("#header_container > div.header_secondary_container > span");
    private By numberOfProducts = By.cssSelector("#shopping_cart_container > a > span");

    public inventory(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnBackpackAddBtn(){
        WebElement backpackAddBtnElement = driver.findElement(backpackAddBtn);
        backpackAddBtnElement.click();
    }

    public void clickOnRedTshirt(){
        WebElement redTshirtAddBtnElement = driver.findElement(redTshirtAddBtn);
        redTshirtAddBtnElement.click();
    }

    public String getMessage(){
        WebElement messageTextElement = driver.findElement(messageText);
        return messageTextElement.getText();
    }

    public String getNumber(){
        WebElement numberOfProductsElement = driver.findElement(numberOfProducts);
        return numberOfProductsElement.getText();
    }
}
