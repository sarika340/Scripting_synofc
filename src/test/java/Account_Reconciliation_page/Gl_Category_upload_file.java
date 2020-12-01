package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gl_Category_upload_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Gl_Category_upload_file(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="//*[text()=\"developer_board\"]")
    WebElement mouse_over;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    @FindBy(xpath = "(//*[text()=\"cloud_upload\"])[3]")
    WebElement upload;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement select;
    @FindBy(xpath="(//*[text()=\"GL Account\"])[3]")
    WebElement Gl_page;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement ud;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement clod;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cud;

    public void setMouse_over() throws InterruptedException {
        Thread.sleep(3000);

        mouse_over.click();
        Thread.sleep(3000);

        cloud.click();
        Thread.sleep(7000);
        Thread.sleep(5000);
        file.sendKeys("/home/nisha/Downloads/glAccountCategory (2).xls");
       // upload.click();
        Thread.sleep(5000);
        save.click();
        Thread.sleep(8000);

        if (select.isDisplayed()) {
            Thread.sleep(8000);
            select.sendKeys("cfdd");
            Thread.sleep(8000);
            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in Gl category");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in Gl category");
        } else {
            System.out.println(" New User not added in Gl category");
        }

    }
    }



