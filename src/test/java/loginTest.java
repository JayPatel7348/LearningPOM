/**
 * @author Jaypatel
 */
import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static util.configReader.*;

public class loginTest {
    public WebDriver driver;
    @Test
    public void setUp() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get(getURL()); //getURL() calling from configReader
        loginPage loginPage = new loginPage(driver);
        loginPage.enterUsername(username());  //username() calling from configReader
        loginPage.enterPassword(password());  //password() calling from configReader
        loginPage.clickLoginButton();
    }


}

