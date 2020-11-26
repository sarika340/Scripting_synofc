package Page_object;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cost_center_page {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);

    public Cost_center_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    //*[text()="developer_board"]
    @FindBy(xpath = "//*[text()=\"business\"]")
    WebElement mouse;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement code;
    @FindBy(xpath = "(//*[@ name=\"description\"])[3]")
    WebElement description;
    @FindBy(xpath = "//*[@ name=\"remarks\"]")
    WebElement remark;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[@type=\"text\"])[8]")
    WebElement varify;
    @FindBy(xpath = "(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath = "(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath = "(//*[text()=\"Cost Center\"])[2]")
    WebElement cost_center;
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement moaaause;
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement mohhuse;
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement moaause;
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement mzoaause;
//(//*[text()="close"])[3]
@FindBy(xpath = "(//*[text()=\"close\"])[3]")
WebElement close;
    public void setMouse() throws InterruptedException {
        Thread.sleep(3000);
        mouse.click();
    }
    public void setAdd() throws InterruptedException {
        Thread.sleep(8000);
        add.click();
    }
    public void setCode() throws InterruptedException {
        Thread.sleep(5000);
        code.sendKeys(Utilities_class.randomnemeric(4));
        //description.sendKeys(random_name);
        // remark.sendKeys(random_Second_name);
        //  save.click();
    }
    public void setDescription() throws InterruptedException {
        Thread.sleep(3000);
        description.sendKeys(random_name);
    }
    public void setRemark() throws InterruptedException {
        Thread.sleep(3000);
        remark.sendKeys(random_Second_name);
    }
    public void setSave() throws InterruptedException {
        Thread.sleep(5000);
        save.click();
        Thread.sleep(5000);
        close.click();
        Thread.sleep(5000);
mouse.click();
    }
    public void setVarify() throws InterruptedException {
        if (varify.isDisplayed()) {
            Thread.sleep(8000);
            varify.sendKeys(random_name);
            System.out.println(" New User successfully added in Cost center");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in Cost center");
        } else {
            System.out.println(" New User not added in Cost center");
        }
    }
}


