package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
    private WebDriver driver;
    private By searchBox = By.cssSelector("#APjFqb");

    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterSearchTerm(String searchTerm){
        driver.findElement(searchBox).sendKeys(searchTerm);
    }

    public void submitSearch(){
        driver.findElement(searchBox).submit();
    }
}
