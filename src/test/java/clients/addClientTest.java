package clients;

import Pages.Menu;
import Pages.clients.addClient;
import Pages.forgotPassword;
import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static util.configReader.*;

/**
 * @author Jaypatel
 */
public class addClientTest {

    WebDriver driver;
    @BeforeClass
    public void doLogin() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getURL()); //getURL() calling from configReader
        loginPage loginPage = new loginPage(driver);
        loginPage.enterUsername(username());  //username() calling from configReader
        loginPage.enterPassword(password());  //password() calling from configReader
        loginPage.clickLoginButton();
    }
    @Test
    public void AddClientTest()
    {
        Menu menu=new Menu(driver);
        menu.clickAddClientLink();

        addClient addClient=new addClient(driver);

        
    }

}
