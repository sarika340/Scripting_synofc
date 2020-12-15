package Cloud_Pages;

import Utilities.Utilities_class;
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class To_Zip_Mail_Any_Folder {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String name= Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(5);
    public To_Zip_Mail_Any_Folder(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"Functional Exp. 1\"]")
    WebElement function;

    @FindBy(xpath = "//*[text()=\"Zip & Mail\"]")
    WebElement mail;
    @FindBy(xpath = "    //*[text()=\"CC\"]\n")
    WebElement CC;
    @FindBy(xpath = "//*[text()=\"BCC\"]")
    WebElement Bcc;
    @FindBy(xpath = " (//*[@type=\"text\"])[4]\n")
    WebElement cc_text;
    @FindBy(xpath = " (//*[@type=\"text\"])[5]\n")
    WebElement bcc_mail;
    @FindBy(xpath = "    (//*[@type=\"text\"])[3]\n")
    WebElement To;
    @FindBy(xpath = "(//*[@type=\"text\"])[6]")
    WebElement subject;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"Details\"]")
    WebElement Details;

    public void setDetails() throws InterruptedException {
        Actions ac=new Actions(driver);
        ac.contextClick(function).build().perform();
        Thread.sleep(8000);
        Details.click();
        Thread.sleep(8000);

    }

    public void setFunction() throws InterruptedException {

        Actions ac=new Actions(driver);
        ac.contextClick(function).build().perform();
        Thread.sleep(8000);
        // function1.click();
    }


    public void setMail() {
        mail.click();
    }

    public void setCC() {
        CC.click();
        Bcc.click();
    }



    public void setTo() {
        To.sendKeys(random_name+"gmail.com");
    }
    public void setCc_text() {
        cc_text.sendKeys(name+"gmail.com");
    }
    public void setBcc_mail() {
        this.bcc_mail.sendKeys(random_Second_name+"gmail.com");
    }

    public void setSubject() {
        this.subject.sendKeys(random_Second_name);
    }

    public void setSave() {
        save.click();
    }
}
