package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cost_center_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Cost_center_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"business\"]")
    WebElement cost;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement Code1;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath = "(//*[@name=\"remarks\"])")
    WebElement remark;
    @FindBy(xpath = "(//*[text()=\"Save\"])")
    WebElement save;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement cd;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;

    public void setCost() throws InterruptedException {
        Thread.sleep(8000);

        cost.click();
    }

    public void setAdd( ) throws InterruptedException {
        add.click();
        Thread.sleep(8000);
        Code1.sendKeys(number);

    }



    public void setDecription( ) throws InterruptedException {
        decription.sendKeys(random_name);
        Thread.sleep(8000);

    }

    public void setRemark() throws InterruptedException {
        remark.sendKeys(random_Second_name);
        Thread.sleep(8000);

    }

    public void setSave() throws InterruptedException {
        save.click();
        Thread.sleep(8000);

    }

    public void setSearch() throws InterruptedException {
       // search.sendKeys(number);
        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(number);
            Thread.sleep(8000);
            // select.sendKeys(random_name);
            System.out.println(" New User successfully added in cost center");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            Thread.sleep(8000);

            //  driver.close();
            System.out.println(" New User successfully Deleted in cost center");
        } else {
            System.out.println(" New User not added in cost center");
        }

    }


}
