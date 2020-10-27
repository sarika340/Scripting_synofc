package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_to_staff {
    public WebDriver driver;

    public Client_to_staff(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//span[contains(text(),'Staff to Client')]")
    WebElement Staff_to_client;
    @FindBy(xpath = "")
    WebElement a;
    @FindBy(xpath = "")
    WebElement b;
    @FindBy(xpath = "")
    WebElement c;
    @FindBy(xpath = "")
    WebElement d;
    @FindBy(xpath = "")
    WebElement e;
    @FindBy(xpath = "")
    WebElement u;
}
