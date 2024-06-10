package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    public WebDriver driver;

    private By yesInput = By.className("custom-control-label");
    private By impressiveRadioInput = By.id("impressiveRadio");

    public RadioButtonPage (WebDriver driver){
        this.driver = driver;
    }

    public void selectedYes(){
        WebElement yesInputElement = driver.findElement(yesInput);
        yesInputElement.click();
    }

}
