package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By userInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.cssSelector(".btn_action");
    private By messageError = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password){
        WebElement usernameElement = driver.findElement(userInput);
        usernameElement.sendKeys(username);
        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.sendKeys(password);
        WebElement loginBtnElement = driver.findElement(loginBtn);
        loginBtnElement.click();
    }

    public String getTextActual(){
        WebElement messageTextElement = driver.findElement(messageError);
        return messageTextElement.getText();
    }

    public String password(){
        WebElement passwordElement = driver.findElement(passwordInput);
        return passwordElement.getAttribute("type");
    }
}
