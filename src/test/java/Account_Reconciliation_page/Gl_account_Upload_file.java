package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gl_account_Upload_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Gl_account_Upload_file(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"Download Sample\"]")
    WebElement download;

    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath = "//div//input[@type=\"file\"]")
    WebElement ac_utton;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement acbutton;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement a_button;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement c_button;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_bton;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    public void setCloud() throws InterruptedException {
        Thread.sleep(3000);
        cloud.click();
        Thread.sleep(5000);
      //  download.click();
        Thread.sleep(8000);
//file.click();
        Thread.sleep(8000);

        file.sendKeys("/home/nisha/Downloads/new gl_acount.xls");
        Thread.sleep(8000);

        save.click();
        Thread.sleep(5000);

        close.click();
        Thread.sleep(5000);

        mouse.click();
        Thread.sleep(5000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys("123");
            System.out.println(" New User successfully added in GLaccount");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in GLaccount");
        } else {
            System.out.println(" New User not added in GLaccount");
        }


    }
}
