package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jaypatel
 */
public class forgotPassword {

    public WebDriver driver;

    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;

    @FindBy(xpath = "//*[@id='password_reset']/form/button")
    WebElement clickReset;

    public forgotPassword(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterResetEmail(String resetEmail)
    {
        inputEmail.sendKeys(resetEmail);
    }

    public void Reset()
    {
        clickReset.click();
    }
}
