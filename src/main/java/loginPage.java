import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
    private WebDriver driver;

    private By userInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.cssSelector(".btn_action");

    public loginPage(WebDriver driver){
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
}


