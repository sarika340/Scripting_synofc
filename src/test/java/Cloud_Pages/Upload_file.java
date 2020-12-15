package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);
    public Upload_file(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"cloud_upload\"]")
    WebElement click_on_upload ;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement admistration;
    @FindBy(xpath = "//*[text()=\"Upload File(s)\"]")
    WebElement upload_file ;
    @FindBy(xpath = "(//*[@type=\"file\"])[1]")
    WebElement file ;
    @FindBy(xpath = "(//*[text()=\"Upload\"])[2]")
    WebElement upload ;
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement search ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[1]")
    WebElement delete ;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement rtore ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save_dlt;
    @FindBy(xpath = "    //*[@class=\"jstree-wholerow jstree-wholerow-clicked\"]\n")
    WebElement fince;
    //*[@class="jstree-wholerow jstree-wholerow-clicked"]
    public void setAdmistration() { admistration.click();
    }

    public void setClick_on_upload() {
        click_on_upload.click();
    }


    public void setFile()  throws InterruptedException {
        file.sendKeys("/home/nisha/Desktop/Result_Account_Reconcilation/Add_Employee.png");
        Thread.sleep(4000);


    }

    public void setUpload() throws InterruptedException  {
        upload.click();
        Thread.sleep(6000);
        //admistration.click();
       // fince.click();
        Thread.sleep(4000);

    }

    public void setSearch() throws InterruptedException  {
        search.sendKeys("Add");
        Thread.sleep(4000);

    }

    public void setButton() throws InterruptedException  {
        button.click();
        Thread.sleep(4000);

    }

    public void setDelete() throws InterruptedException {
        Thread.sleep(4000);

        delete.click();
        Thread.sleep(4000);

        password.sendKeys("Creta_123");
        Thread.sleep(8000);

        save_dlt.click();
        Thread.sleep(5000);

    }

    public void setFince( ) {
        fince.click();
    }
}


