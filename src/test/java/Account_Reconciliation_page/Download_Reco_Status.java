package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download_Reco_Status {

    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Download_Reco_Status(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="//*[text()=\"Reco Status\"]")
    WebElement Reco_status;
    @FindBy(xpath="//*[text()=\"cloud_upload\"]")
    WebElement cloud;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[3]")
    WebElement selct_box;
    @FindBy(xpath="(//*[@type=\"button\"])[28]")
    WebElement arrow;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[5]")
    WebElement nextselect;
    @FindBy(xpath="(//*[@type=\"checkbox\"])[7]")
    WebElement modify;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    //(//*[text()="Download"])[3]
    @FindBy(xpath="(//*[text()=\"Download\"])[3]")
    WebElement doenload;
    @FindBy(xpath="(//*[text()=\"Download\"])[4]\n")
    WebElement doenload1;
    public void setSetting() throws InterruptedException {
        Thread.sleep(4000);
      //  setting.click();
        Thread.sleep(4000);
      //  Reco_status.click();

        Thread.sleep(4000);
        search.sendKeys("nisha");
        Thread.sleep(4000);
        cloud.click();
        Thread.sleep(4000);
        selct_box.click();
        Thread.sleep(4000);
        arrow.click();
        Thread.sleep(4000);

        nextselect.click();
        Thread.sleep(4000);

        modify.click();
        Thread.sleep(4000);
        Thread.sleep(7000);

doenload.click();
        doenload1.click();
        Thread.sleep(7000);

        //driver.close();
    }
}
