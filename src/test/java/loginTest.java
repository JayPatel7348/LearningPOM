/**
 * @author Jaypatel
 */
import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
    public WebDriver driver;
    @Test
    public void setUp() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.invoiceplane.com/sessions/login"); // Replace with the actual login page URL
        loginPage loginPage = new loginPage(driver);
        loginPage.enterUsername("admin@invoiceplane.com");
        loginPage.enterPassword("demopassword");
        loginPage.clickLoginButton();
    }


}

