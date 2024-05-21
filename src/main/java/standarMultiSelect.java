import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class standarMultiSelect {
    public static void main(String[] args){
        String url = "https://demoqa.com/select-menu";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        Select cars = new Select(driver.findElement(By.name("cars")));

        //oldStyleMenu.selectByIndex(2);
        //oldStyleMenu.selectByValue("8");
        cars.selectByVisibleText("Audi");
        cars.selectByValue("volvo");
        cars.selectByIndex(1);
        //cars.deselectAll();
        cars.deselectByValue("audi");

    }
}
