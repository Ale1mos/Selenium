import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
    public static void main (String[] args){
        String url = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locators by Id
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        //Locator by css
        WebElement loginBtn = driver.findElement(By.cssSelector(".btn_action"));

        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//
//
//public class Login {
//    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com");
//        driver.manage().window().maximize();
//
//        //Credentials
//        //String username = "standard_user";
//        //String password = "secret_sauce";
//
//        //Locators by Id
//        //WebElement usernameInput = driver.findElement(By.id("user-name"));
//        //WebElement passwordInput = driver.findElement(By.id("password"));
//        //WebElement loginBtn = driver.findElement(By.id("login-button"));
//
//        //Locators by Classname
//        //WebElement loginBtn = driver.findElement(By.className("btn_action"));
//
//        //Locator by Name
//        //WebElement loginBtn = driver.findElement(By.name("login-button"));
//
//        //Locator by xpath
//        //WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//
//        //Locator by css
//        //WebElement loginBtn = driver.findElement(By.cssSelector(".btn_action"));
//
//        //Login
//        //usernameInput.sendKeys(username);
//        //passwordInput.sendKeys(password);
//    }
//}

