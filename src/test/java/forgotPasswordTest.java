import Pages.forgotPassword;
import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static util.configReader.getURL;

/**
 * @author Jaypatel
 */
public class forgotPasswordTest {

    @Test
    public void login() throws IOException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.invoiceplane.com/sessions/login");
    loginPage lgnPage = new loginPage(driver);
    lgnPage.clickForgotPasswordlgn();

    forgotPassword forgotPass=new forgotPassword(driver);
    forgotPass.enterResetEmail(getURL());  //geturl() calling from configReader
    forgotPass.Reset();
    }

}
