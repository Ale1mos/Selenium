import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class createSchool {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.inteligenio.com/login");

        driver.manage().window().maximize();

        //Credentials
        String username = "inteligenio";
        String password = "Admin123456";

        //Locators by Id
        WebElement usernameInput = driver.findElement(By.id("input-27"));
        WebElement passwordInput = driver.findElement(By.id("input-28"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div/div/div/div/div[6]/button"));



        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement managerModule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div > div > nav > div.v-navigation-drawer__content > div > div.v-list.v-sheet.theme--dark.v-list--dense > div.v-list-group.custom-list-group > div > div.v-list-item__content.subtitle-1.nav.font-weight-bold > p")));

        WebDriverWait waitElement = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement manageSchool = waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/nav/div[1]/div/div[1]/div[3]/div[2]/div[2]/a/div")));
        manageSchool.click();

        //WebElement managerModule =driver.findElement(By.cssSelector("#app > div > div > nav > div.v-navigation-drawer__content > div > div.v-list.v-sheet.theme--dark.v-list--dense > div.v-list-group.custom-list-group > div > div.v-list-item__content.subtitle-1.nav.font-weight-bold > p"));
        managerModule.click();
        //WebElement manageSchoolModule = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/nav/div[1]/div/div[1]/div[3]/div[2]/div[1]/a/div"));
        //manageSchoolModule.click();
        //WebElement createSchoolBtn = driver.findElement(By.id("//*[@id=\"app\"]/div[1]/div/main/div/div/div/div[2]/div[1]/div/div/button/span"));
        //createSchoolBtn.click();
    }
}
