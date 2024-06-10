package Pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {
    public WebDriver driver;
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBtn;

    @FindBy(id = "finish")
    public WebElement finishBtn;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isMenuBtnDisplayed(){
        return menuBtn.isDisplayed();
    }

    public void setWindowSize(int width, int height){
        driver.manage().window().setSize(new Dimension(width,height));
    }

}
