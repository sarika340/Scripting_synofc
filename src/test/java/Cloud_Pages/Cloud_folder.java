package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cloud_folder {
    public WebDriver driver;

    public Cloud_folder(WebDriver rdriver)
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
    @FindBy(xpath = "//*[text()=\"Folder Name\"]")
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

    public void setText_box() throws InterruptedException {
        Thread.sleep(9000);
        text_box.sendKeys(Utilities_class.randomalphabet(6));
        Thread.sleep(9000);
        create.click();
    }
}
