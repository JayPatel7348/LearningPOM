package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jaypatel
 */
public class Menu {

      WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Clients']")
    private WebElement clientsHeading;

    @FindBy(xpath = "//a[contains(text(),'Add Client')]")
    private WebElement addClientLink;

    @FindBy(xpath = "//a[normalize-space()='View Clients']")
    private WebElement viewClientsLink;
     public Menu(WebDriver driver)
     {
         this.driver=driver;
         PageFactory.initElements(driver,this);
     }

    public void clickAddClientLink()
    {
        clientsHeading.click();
        addClientLink.click();
    }

    public void clickViewClientLink()
    {
        clientsHeading.click();
        viewClientsLink.click();
    }


}
