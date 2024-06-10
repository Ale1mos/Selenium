package InteligenioTests;

import InteligenioPages.LoginPageInteligenio;
import InteligenioPages.ManagerPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerTest {
    private WebDriver driver;
    public LoginPageInteligenio loginPageInteligenio;
    public ManagerPage managerPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\qa\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPageInteligenio = new LoginPageInteligenio(driver);
        managerPage = new ManagerPage(driver);
    }

    @Test
    public void testSuccessfulManager(){
        driver.get("https://qa.inteligenio.com/login");
        loginPageInteligenio.writeUsername("inteligenio");
        loginPageInteligenio.writePassword("Admin123456");
        loginPageInteligenio.clickLoginBtn();
        managerPage.clickManager();
        managerPage.licenseRolClick();
        managerPage.chooseOptionTeacher();
        String texto = managerPage.getLicenseRol();
        System.out.println("a"+texto);
//        managerPage.NameRolClick("Docente");

    }
}
