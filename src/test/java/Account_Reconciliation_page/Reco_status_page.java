package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reco_status_page {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(2);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Reco_status_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="//*[text()=\"Reco Status\"]")
    WebElement Reco_status;
    @FindBy(xpath="(//*[@aria-hidden=\"true\"])[43]")
    WebElement add;
    @FindBy(xpath="//*[@name=\"reco_name\"]")
    WebElement reconame;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath="//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "(//*[text()=\"close\"])[4]")
    WebElement close;



    public void setSetting() throws InterruptedException {
        setting.click();
        Thread.sleep(8000);
      //  Reco_status.click();
      //  Thread.sleep(8000);
        add.click();


    }

    public void setreconame() throws InterruptedException {
        Thread.sleep(8000);
        reconame.sendKeys(random_name);
        Thread.sleep(8000);
        decription.sendKeys(random_name+random_num);
        Thread.sleep(8000);
        save.click();
        Thread.sleep(8000);
     //   search.sendKeys(random_name);
       // Thread.sleep(8000);

       // close.click();
     //   Thread.sleep(8000);

        Reco_status.click();
        Thread.sleep(8000);

        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(random_num);
            System.out.println(" New User successfully added in  Reco_status");
            Thread.sleep(8000);
            // delete.click();
            Thread.sleep(8000);
            //  dlt_2.click();
           // driver.close();
            System.out.println(" New User successfully Deleted in Reco_status");
        } else {
            System.out.println(" New User not added in Reco_status");
        }



    }

    public void setSearch() throws InterruptedException {
        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(random_name);
            System.out.println(" New User successfully added in  Reco_status");
            Thread.sleep(8000);
           // delete.click();
            Thread.sleep(8000);
          //  dlt_2.click();
            System.out.println(" New User successfully Deleted in Reco_status");
        } else {
            System.out.println(" New User not added in Reco_status");
        }

    }
}
