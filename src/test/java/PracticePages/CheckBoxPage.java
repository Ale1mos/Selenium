package PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxPage {
    public WebDriver driver;

    private By homeInput = By.cssSelector("#selectOne > div");
    public CheckBoxPage (WebDriver driver){
        this.driver = driver;
    }

    public void clickHomeInput(){
        WebElement homeInputElement = driver.findElement(homeInput);
        Select dropdown = new Select(homeInputElement);
        dropdown.selectByVisibleText("Desktop");
//        homeInputElement.click();
    }
}
