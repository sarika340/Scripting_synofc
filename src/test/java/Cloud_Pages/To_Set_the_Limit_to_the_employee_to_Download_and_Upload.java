package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Set_the_Limit_to_the_employee_to_Download_and_Upload {
    public WebDriver driver;

    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public To_Set_the_Limit_to_the_employee_to_Download_and_Upload(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "(//*[@role=\"presentation\"])[9]")
    WebElement admistration;
    @FindBy(xpath = "(//*[text()=\"error_outline\"])[1]")
    WebElement limit;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement search;
    @FindBy(xpath = "(//*[@id=\"upload_limit_5\"])")
    WebElement upload_box;

    @FindBy(xpath = "//*[@id=\"upload_limit_type_5\"]//*[text()=\"GB\"]")
    WebElement GB;
    @FindBy(xpath = "//*[@id=\"download_limit_5\"]")
    WebElement download;
    @FindBy(xpath = "//*[@id=\"download_limit_type_5\"]//*[text()=\"GB\"]")
    WebElement GB1;
    @FindBy(xpath = "//*[@class=\"mdc-layout-grid__inner mdc-typography--subtitle2   border-bottom px-1 py-1\"]//div[4]")
    WebElement checkbox;
    @FindBy(xpath = "(//*[text()=\"Limit\"])[3]")
    WebElement limit2;
    @FindBy(xpath = "(//*[@class=\"mdc-notched-outline mdc-notched-outline--upgraded\"])[4]")
    WebElement upload_limit;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement download_limit;
    @FindBy(xpath = "(//*[@class=\"mdc-select mdc-select--outlined  w-100 customFieldHeight\"])[4]//*[text()=\"GB\"]")
    WebElement Type_MB;
    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[5]//*[@value=\"mb\"]")
    WebElement type_mb;
    public void setAdmistration() {
        admistration.click();
    }

    public void setLimit() {
        limit.click();
    }

    public void setSearch() throws InterruptedException {
        search.sendKeys("TWO");
        Thread.sleep(500);

        checkbox.click();
    }



    public void setBox() throws InterruptedException {
        upload_box.clear();
        Thread.sleep(500);
        upload_box.sendKeys("2");
    }
    public void setGB() throws InterruptedException {
        GB.click();
        Thread.sleep(500);

    }

    public void setDownload() throws InterruptedException {
        download.clear();
        download.sendKeys("2");
        Thread.sleep(500);

    }

    public void setGB1() throws InterruptedException {
        GB1.click();
        Thread.sleep(5000);
////*[@class="mdc-layout-grid__inner mdc-typography--subtitle2   border-bottom px-1 py-1"]//div[4]
    }

    public void setLimit2() {
        limit2.click();
    }

    public void setUpload_limit() throws InterruptedException {
        Thread.sleep(5000);

        upload_limit.sendKeys("1");
    }

    public void setDownload_limit()throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", download_limit);

      /*  Actions actions = new Actions(driver);
        actions.moveToElement(download_limit);
        actions.click();
        actions.sendKeys("3");
        actions.build().perform();
        Thread.sleep(5000);
      //  download_limit.sendKeys("3");*/
        Thread.sleep(5000);

        type_mb.click();
        Thread.sleep(5000);

        Type_MB.click();

    }
}
