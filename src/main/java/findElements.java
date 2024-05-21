import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("cuantos elementos " + inputs.size());

        for(int i = 0; i<inputs.size(); i++ ){
            if(i==0){
                inputs.get(i).sendKeys(username);
                //WebElement usernameInput = driver.findElement(By.id("user-name"));
                //usernameInput.sendKeys(username);
            }
            else if (i==1) {
                inputs.get(i).sendKeys(password);
                //WebElement passwordInput = driver.findElement(By.id("password"));
                //passwordInput.sendKeys(password);

            }
            else{
                inputs.get(i).click();
                //WebElement loginBtn = driver.findElement(By.id("login-button"));
                //loginBtn.click();
            }

        }

    }
}
