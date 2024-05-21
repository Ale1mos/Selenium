import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
        public static void main (String[] args){
        String url = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.get(url);
        //driver.manage().window().maximize();

        try {
            driver.get(url);
            driver.manage().window().maximize();

            loginPage loginPageInstance = new loginPage(driver);
            loginPageInstance.login("standard_user", "secret_sauce");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit();
        }
    }
}
