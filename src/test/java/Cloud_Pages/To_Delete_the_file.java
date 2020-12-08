package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Delete_the_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);
    public To_Delete_the_file(WebDriver rdriver)
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


}
