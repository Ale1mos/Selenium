import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args){
        String url = "https://demoqa.com/droppable";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        //Instantiate the actions class
        Actions action = new Actions(driver);

        //Define the from and to

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        //User the method dragAndDrop
        //action.dragAndDrop(from, to).build().perform();
        action.dragAndDropBy(from,290,200).build().perform();





    }
}
