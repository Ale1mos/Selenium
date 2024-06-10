package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTextPage {
    public WebDriver driver;
    private By text = By.id("userEmail-label");

    public GetTextPage (WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        WebElement textElement = driver.findElement(text);
        return textElement.getText();
    }
}
