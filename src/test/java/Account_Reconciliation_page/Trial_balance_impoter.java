package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trial_balance_impoter {

    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);

    public Trial_balance_impoter(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"arrow_downward\"]")
    WebElement arrow;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select;
    @FindBy(xpath = "//*[text()=\"Road Rash\"]")
    WebElement road_rash;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement select1;
    @FindBy(xpath = "//*[text()=\"skldnfk\"]")
    WebElement manage;
    @FindBy(xpath = "(//*[@id=\"date-range\"])[2]")
    WebElement date;
    @FindBy(xpath = "(//*[text()=\"Nov\"])[3]")
    WebElement nov;
    @FindBy(xpath = "(//*[text()=\"Nov\"])[4]")
    WebElement nov2;
    @FindBy(xpath = "(//*[text()=\"Apply\"])[2]")
    WebElement apply;
    @FindBy(xpath = "(//*[text()=\"cloud_upload\"])[1]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"delete\"]")
    WebElement delete;
    @FindBy(xpath = "(//*[text()=\"delete\"])[2]")
    WebElement dlt_2;
    @FindBy(xpath = "(//*[@type=\"text\" ])[2]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;

    public void setArrow() throws InterruptedException {
        Thread.sleep(4000);

        arrow.click();
        Thread.sleep(4000);
        select.click();
        Thread.sleep(4000);

        road_rash.click();
        Thread.sleep(4000);

        select1.click();
        Thread.sleep(4000);

        manage.click();
        Thread.sleep(4000);




    }

    public void setDate( )throws InterruptedException {
        date.click();
        Thread.sleep(4000);

        nov.click();
        Thread.sleep(4000);

        nov2.click();
        Thread.sleep(4000);

        apply.click();
        Thread.sleep(4000);
    }

    public void setFile() throws InterruptedException {
        file.sendKeys("/home/nisha/Downloads/trialbalanceWithGLSubGLCost (2).xlsx");
        Thread.sleep(4000);

    }


    public void  setSave() throws InterruptedException {
        save.click();
        Thread.sleep(4000);
        search.sendKeys("skldnfk");
        Thread.sleep(4000);
        delete.click();
        Thread.sleep(4000);

        dlt_2.click();
        Thread.sleep(4000);





    }
}
