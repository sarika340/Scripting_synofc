package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Email_Selected_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public To_Email_Selected_file(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "")
    WebElement ms;
    @FindBy(xpath = "")
    WebElement button;
    @FindBy(xpath = "")
    WebElement drop_down;
    @FindBy(xpath = "")
    WebElement financer;
    @FindBy(xpath = "")
    WebElement ac_buttn;
    @FindBy(xpath = "")
    WebElement save;



}
