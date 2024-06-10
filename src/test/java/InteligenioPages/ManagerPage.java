package InteligenioPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManagerPage {
    private WebDriver driver;
    public By managerInput = By.cssSelector("#app > div > div > nav > div.v-navigation-drawer__content > div > div.v-list.v-sheet.theme--dark.v-list--dense > div.v-list-group.custom-list-group > div > div.v-list-item__content.subtitle-1.nav.font-weight-bold > p");
    public By licenseInput = By.cssSelector("#app > div.v-application--wrap > div > nav > div.v-navigation-drawer__content > div > div.v-list.v-sheet.theme--dark.v-list--dense > div.v-list-group.custom-list-group.v-list-group--active.yellow--text.text--accent-4 > div.v-list-group__items > div:nth-child(2) > a > div");
    private By licenseCreateBtn = By.cssSelector("#app > div.v-application--wrap > div > main > div > div > div > div:nth-child(2) > div > div > div.v-window.v-item-group.theme--light.v-tabs-items > div > div > div > div.row > div > div > button > span");
    private By lisenceRol = By.id("input-294");
    private By teacherOption = By.xpath("//*[@id=\"list-item-312-2\"]/div/div");
    private By nameRol = By.id("input-286");
    private By text = By.xpath("//*[@id=\"input-294\"]");

    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickManager(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement managerInputElement = wait.until(ExpectedConditions.elementToBeClickable(managerInput));
        managerInputElement.click();
        WebElement licenseInputElement = driver.findElement(licenseInput);
        licenseInputElement.click();
        WebElement licenseCreateBtnElement = wait.until(ExpectedConditions.elementToBeClickable(licenseCreateBtn));
        licenseCreateBtnElement.click();
    }

    public void licenseRolClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement licenseRolElement = wait.until(ExpectedConditions.elementToBeClickable(lisenceRol));
        licenseRolElement.click();
    }

    public void chooseOptionTeacher(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement teacherOptionElement = wait.until(ExpectedConditions.elementToBeClickable(teacherOption));
        teacherOptionElement.click();
    }

    public String getLicenseRol(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement licenseRolElement = wait.until(ExpectedConditions.visibilityOfElementLocated(text));
        return licenseRolElement.getText();
    }

    public void NameRolClick(String name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nameRolElement = wait.until(ExpectedConditions.elementToBeClickable(nameRol));
        nameRolElement.sendKeys(name);
    }
}
