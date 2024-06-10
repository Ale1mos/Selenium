package InteligenioPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageInteligenio {
    private WebDriver driver;

    private By usernameInput = By.id("input-27");
    private By passwordInput = By.id("input-28");
    private By loginBtn = By.cssSelector("#app > div > div > div > div > div.row > div > div > div > div > div:nth-child(6) > button");

    public LoginPageInteligenio(WebDriver driver){
        this.driver = driver;
    }

    public void writeUsername(String username){
        WebElement usernameInputElement = driver.findElement(usernameInput);
        usernameInputElement.sendKeys(username);
    }

    public void writePassword(String password){
        WebElement passwordInputElement = driver.findElement(passwordInput);
        passwordInputElement.sendKeys(password);
    }

    public void clickLoginBtn(){
        WebElement loginBtnElement = driver.findElement(loginBtn);
        loginBtnElement.click();
    }
}
