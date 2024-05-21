import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class inventoryPage {
    public static void main (String[] args){
        String url = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

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

        inventory inventoryPageInstance = new inventory(driver);

        inventoryPageInstance.clickOnBackpackAddBtn();
        inventoryPageInstance.clickOnRedTshirt();

        String actualMessage = inventoryPageInstance.getMessage();
        String expectedMessage = "Products";
        assertEquals(expectedMessage,actualMessage);

        String actualNumber = inventoryPageInstance.getNumber();
        String expectedNumber = "2";
        assertEquals(expectedNumber,actualNumber);

//        @After
//        public void tearDown(){
//            if(driver!=null){
//                driver.quit();
//            }
//        }




    }


}