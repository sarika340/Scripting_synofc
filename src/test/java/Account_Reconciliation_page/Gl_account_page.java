package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gl_account_page {

    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Gl_account_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_button;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    @FindBy(xpath = "//*[text()=\"GL Account\"]")
    WebElement gl_account;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_page;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"gl_code\"]")
    WebElement gl_ode;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement selct;
    @FindBy(xpath = "(//*[text()=\"Expense\"])[12]")
    WebElement expance;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement selct1;
    @FindBy(xpath = "(//*[text()=\"Project IGI\"])[2]")
    WebElement project_igi;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement selct2;
    @FindBy(xpath = "//*[text()=\"Select all\"]")
    WebElement mg;
    @FindBy(xpath = "//*[text()=\"add_circle\"]")
    WebElement circle;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[2]")
    WebElement circle1;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[3]")
    WebElement circle2;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement discription;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement select;
    @FindBy(xpath = "(//*[@ type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement slect_2;

    @FindBy(xpath = "//*[@name=\"city\"]")
    WebElement city;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement slet_2;
    @FindBy(xpath = "(//div[text()=\"All\"])[2]")
    WebElement ALL2_;
    @FindBy(xpath = "//*[@name=\"gl_account_purpose\"]")
    WebElement purpose_;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement save;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name1;
    @FindBy(xpath="//*[@name=\"comp_code\"]")
    WebElement code_comp;
    @FindBy(xpath="//*[@name=\"cmpLocName\"]")
    WebElement loc;
    @FindBy(xpath="//*[@ name=\"address1\"]")
    WebElement address;
    @FindBy(xpath="//*[@ name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath="//*[@name=\"email\"]")
    WebElement mail;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"1\"])[1]")
    WebElement lc_5;
    @FindBy(xpath="(//*[text()=\"Select...\"])[3]")
    WebElement Select_entity;
    @FindBy(xpath="(//*[text()=\"MAX PAYNE\"])[2]")
    WebElement max;
    @FindBy(xpath="(//*[text()=\"add_circle\"])[1]")
    WebElement add_category;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name_category;
    @FindBy(xpath="(//*[text()=\"Save\"])[2]")
    WebElement save_category;
    @FindBy(xpath = "//*[@name=\"landline_num\" ]")
    WebElement number1;

    @FindBy(xpath = "(//*[text()=\"Select...\"])[2]")
    WebElement mng_slct;
    @FindBy(xpath = "(//*[text()=\"Test Associations\"])[2]")
    WebElement test_assoction;
    @FindBy(xpath = "//*[@name=\"code\" ]")
    WebElement code;
    @FindBy(xpath = "//*[@name=\"landline_num\" ]")
    WebElement numbr1;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save1;
    @FindBy(xpath = "//*[@name=\"landline_num\" ]")
    WebElement numr1;
    @FindBy(xpath = "//*[text()=\"cloud_download\"]")
    WebElement cloud;
    @FindBy(xpath = "//*[text()=\"Download Sample\"]")
    WebElement download;

    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement file;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete1;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_21;
    @FindBy(xpath = "//div//input[@type=\"file\"]")
    WebElement ac_utton;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse1;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement acbutton;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement a_button;
    @FindBy(xpath = "(//*[text()=\"GL Account\"])[2]")
    WebElement gl_page;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_bton;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save2;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close1;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search1;
    public void setAc_button() {
        ac_button.click();
    }

    public void setMouse() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouse).perform();
        mouse.isDisplayed();
       //WebElement gl= gl_page.getText();
    }

    public void setGl_account( ) {

        gl_account.click();
    }
    public void setAdd( ) {
        add.click();
        Assert.assertEquals("GL Account" ,gl_page.getText());

    }
    public void setGl_ode() throws InterruptedException{

        gl_ode.sendKeys(number);
        Thread.sleep(3000);

        discription.sendKeys(random_name);
        Thread.sleep(3000);


    }

    public void setCircle() throws InterruptedException  {
        circle.click();
        Thread.sleep(5000);

        name1.sendKeys(random_name);
        Thread.sleep(5000);

        save.click();
        Thread.sleep(5000);

        selct.click();
        Thread.sleep(5000);
        expance.click();
        Thread.sleep(5000);

    }

    public void setCircle1( ) throws InterruptedException {
        circle1.click();
        Thread.sleep(4000);

        mail.sendKeys(random_name+"@gmail.com");
        Thread.sleep(3000);

        System.out.println("Enter email address");
        name1.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);

        code_comp.sendKeys(Utilities_class.randomnemeric(5));
        Thread.sleep(3000);

        loc.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);

        address.sendKeys(Utilities_class.randomalphabet(5));
        Thread.sleep(3000);
        DATE.click();
        Thread.sleep(6000);
        lc_5.click();
        Thread.sleep(6000);

        Select_entity.click();
        Thread.sleep(4000);

        max.click();
        Thread.sleep(4000);

        pincode.sendKeys("494442");
        Thread.sleep(8000);

        Actions actions = new Actions(driver);
        actions.moveToElement(city).perform();
        city.isDisplayed();

        Thread.sleep(4000);
        city.click();
        Thread.sleep(4000);

        number1.sendKeys(Utilities_class.randomnemeric(9));
        Thread.sleep(4000);

        save.click();
        Thread.sleep(6000);

        selct1.click();
        Thread.sleep(5000);
        project_igi.click();

    }

    public void setCircle2( )throws InterruptedException {
        Thread.sleep(5000);

        circle2.click();
        Thread.sleep(5000);

        mng_slct.click();
        Thread.sleep(5000);

        test_assoction.click();
        Thread.sleep(5000);

        name1.sendKeys(random_name);
        Thread.sleep(5000);

        code.sendKeys(number);
        Thread.sleep(5000);
          save.click();
        Thread.sleep(5000);

        selct2.click();
        Thread.sleep(5000);
        mg.click();
        Thread.sleep(5000);
        purpose_.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//*[text()=\"save\"])[1]")).click();
        Thread.sleep(5000);

        close.click();
        Thread.sleep(5000);

        mouse.click();
        Thread.sleep(5000);
        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(number);
            System.out.println(" New User successfully added in Gl account");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            System.out.println(" New User successfully Deleted in Gl account");
        } else {
            System.out.println(" New User not added in Gl account");
        }}





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

            save2.click();
            Thread.sleep(5000);

            close1.click();
            Thread.sleep(5000);

            mouse1.click();
            Thread.sleep(5000);

            if (search1.isDisplayed()) {
                Thread.sleep(8000);
                search1.sendKeys("123");
                System.out.println(" New User successfully added in Cost center");
                Thread.sleep(8000);
                delete1.click();
                Thread.sleep(8000);
                dlt_21.click();
                System.out.println(" New User successfully Deleted in Cost center");
            } else {
                System.out.println(" New User not added in Cost center");
            }


        }
    }









