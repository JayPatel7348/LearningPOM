package Pages.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jaypatel
 */
public class addClient {

    WebDriver driver;

    // Constructor to initialize the driver
    public addClient(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define WebElements using Page Factory annotations
    @FindBy(xpath = "//span[normalize-space()='Clients']")
    private WebElement clientsHeading;

    @FindBy(xpath = "//a[contains(text(), 'Add Client')]")
    private WebElement addClientLink;

    @FindBy(xpath = "//a[normalize-space()='View Clients']")
    private WebElement viewClientsLink;

    // Create methods to interact with the elements
    public String getClientsHeadingText() {
        return clientsHeading.getText();
    }

    public void clickAddClientLink() {
        addClientLink.click();
    }

    public void clickViewClientsLink() {
        viewClientsLink.click();
    }

}
