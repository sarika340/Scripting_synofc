package Page_object;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cloud_Create_folder_page {
    public WebDriver driver;

    public Cloud_Create_folder_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"Cloud\"]")
    WebElement click_on_cloud ;
    @FindBy(xpath = "//*[text()=\"My Cloud\"]")
    WebElement mycloud ;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement text_box ;
    @FindBy(xpath = "//*[text()=\"Create\"]")
    WebElement create ;


    public void setClick_on_cloud() {
        click_on_cloud.click();
    }

    public void setMycloud() {
        mycloud.isDisplayed();
    }

    public void setAdd() {
        add.click();
    }

    public void setText_box() {
        text_box.sendKeys(Utilities_class.randomalphabet(6));
        create.click();
    }
}
