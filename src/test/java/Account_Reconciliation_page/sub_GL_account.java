package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sub_GL_account {
    public WebDriver driver;
    public String random_num = Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String number = Utilities_class.randomnemeric(4);

    public sub_GL_account(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"GL Sub Account\"]")
    WebElement sub_gl_act;
    @FindBy(xpath = "//*[text()=\"account_balance\"]")
    WebElement account_balance;
    @FindBy(xpath = "//*[@name=\"gl_code\"]")
    WebElement gl_ode;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement discription;
    @FindBy(xpath = "//*[text()=\"Select...\"]")
    WebElement select;
    @FindBy(xpath = "(//*[text()=\"50004\"])[2]")
    WebElement text;
    @FindBy(xpath = "//*[@name=\"sub_gl_code\"]")
    WebElement name;
    @FindBy(xpath = "//*[@name=\"code\"]")
    WebElement code;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement description;
    @FindBy(xpath = "//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[2]")
    WebElement add_circle;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement cost;
    @FindBy(xpath = "//*[text()=\"Exporters 2\"]")
    WebElement importer;
    @FindBy(xpath = "//*[@placeholder=\"DD/MM/YYYY\"]")
    WebElement date;//(//*[@type="button"])[22]
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name1;
    @FindBy(xpath = "//*[@name=\"comp_code\"]")
    WebElement code_comp;
    @FindBy(xpath = "//*[@name=\"cmpLocName\"]")
    WebElement loc;
    @FindBy(xpath = "//*[@ name=\"address1\"]")
    WebElement address;
    @FindBy(xpath = "//*[@ name=\"pincode\"]")
    WebElement pincode;
    @FindBy(xpath = "//*[@name=\"email\"]")
    WebElement mail;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement date_f;
    @FindBy(xpath = "(//*[text()=\"5\"])[1]")
    WebElement lc_5;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[5]")
    WebElement Select_entity;
    @FindBy(xpath = "(//*[text()=Sarika Mishra")
    WebElement sl;
    @FindBy(xpath = "(//*[text()=\"add_circle\"])[1]")
    WebElement add_category;
    @FindBy(xpath = "//*[@name=\"name\"]")
    WebElement name_category;
    @FindBy(xpath = "(//*[text()=\"Save\"])[2]")
    WebElement save_category;
    @FindBy(xpath = "//*[@name='landline_num'])]")
    WebElement anumber;
    @FindBy(xpath = "//*[@id=\"react-select-66-input\"]")
    WebElement drop;

    @FindBy(xpath = "(//*[text()=\"Select...\"])[5]")
    WebElement risk_category;

    @FindBy(xpath = "//*[@name=\"sub_gl_account_purpose\"]")
    WebElement purpose;

    @FindBy(xpath = "//*[@name=\"jv_flow\"] ")
    WebElement jv_flow;
    @FindBy(xpath = "//*[@name=\"from_range\"]")
    WebElement from_range;

    @FindBy(xpath = "//*[@name=\"to_range\"]")
    WebElement To_range;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[14]")
    WebElement checkbox;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[12]")
    WebElement debit_card;//(//*[@focusable="false"])[27]

    @FindBy(xpath = "(//*[@focusable=\"false\"])[27]")
    WebElement box;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[13]")
    WebElement yes_no;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement Rconciler;
    @FindBy(xpath = "//*[text()=\"Select all\"]")
    WebElement select_managment;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[6]")
    WebElement yes_n;
    @FindBy(xpath = "//*[text()=\"Two\"]")
    WebElement Reconcilar_two;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement Reviewer;
    @FindBy(xpath = "(//*[text()=\"GL Sub Account\"])[2]")
    WebElement sub_gl_page;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement inter;
    @FindBy(xpath = "//*[text()=\"Monthly\"]")
    WebElement monthly;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement external;
    @FindBy(xpath = "//*[text()=\"Quaterly\"]")
    WebElement month;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement slect_entity;
    @FindBy(xpath = "(//*[text()=\"Project IGI\"])[4]")
    WebElement project;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement risk;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[4]")
    WebElement smo;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement mangement;
    @FindBy(xpath = "(//*[text()=\"Critical\"])[1]")
    WebElement risk1;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement sve;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[6]")
    WebElement dlt_2;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;

    @FindBy(xpath = "(//*[text()=\"add_circle\"])[1]")
    WebElement add_cir;
    @FindBy(xpath = "//*[@name=\"code\" ]")
    WebElement clse;
    @FindBy(xpath = "(//*[@name=\"description\"  ])[4]")
    WebElement dec;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement save2;
    @FindBy(xpath = "//*[@name=\"remarks\"  ]")
    WebElement remark;


    public void setAccount_balance() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(account_balance).perform();
        account_balance.isDisplayed();
        Thread.sleep(8000);

        sub_gl_act.click();
        Thread.sleep(4000);
        add.click();
        Thread.sleep(4000);
        Assert.assertEquals("GL Sub Account" ,sub_gl_page.getText());
        Thread.sleep(4000);

        select.click();
        Thread.sleep(4000);

        text.click();
        Thread.sleep(4000);

        name.sendKeys(number);
        Thread.sleep(4000);

        description.sendKeys(random_Second_name);
        Thread.sleep(4000);

    }

    public void setAdd() throws InterruptedException {
        add.click();
        Thread.sleep(4000);
    }

    public void setSelect() throws InterruptedException {
        select.click();
        Thread.sleep(4000);
        text.click();
    }
    public void setGl_ode() {
        gl_ode.sendKeys(Utilities_class.randomnemeric(7));
    }

    public void setDiscription() {
        discription.sendKeys(Utilities_class.randomalphabet(9));
    }


    public void setName() {
        name.sendKeys(random_name);
        description.sendKeys(random_Second_name);
        ///add_circle.click();


    }


    public void mendtory_fields() throws InterruptedException {
        Thread.sleep(3000);
        mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(3000);
        System.out.println("Enter email address");
        name1.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);
        date_f.click();
        Thread.sleep(6000);
        lc_5.click();
        code_comp.sendKeys(Utilities_class.randomnemeric(5));
        Thread.sleep(3000);
        Thread.sleep(8000);
        Actions ac=new Actions(driver);
        ac.moveToElement(loc).perform();
        Thread.sleep(10000);
        loc.sendKeys(Utilities_class.randomalphabet(9));
        Thread.sleep(3000);
        address.sendKeys(Utilities_class.randomalphabet(5));
        Thread.sleep(3000);
        pincode.sendKeys("560066");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[text()=save")).click();
    }


    public void setPurpose() throws InterruptedException {
        purpose.sendKeys(random_name);
        Thread.sleep(6000);

        jv_flow.sendKeys(random_Second_name);
        Thread.sleep(6000);

        from_range.sendKeys(Utilities_class.randomnemeric(3));
        Thread.sleep(6000);

        To_range.sendKeys(Utilities_class.randomnemeric(5));
        Thread.sleep(6000);
        add_cir.click();
        Thread.sleep(5000);

        code.sendKeys(number);
        Thread.sleep(6000);

        dec.sendKeys(random_Second_name);
        Thread.sleep(6000);

        remark.sendKeys(random_num);
        Thread.sleep(6000);
save2.click();
        Thread.sleep(6000);

        cost.click();
        Thread.sleep(6000);
        importer.click();

 slect_entity.click();
        Thread.sleep(6000);
project.click();
        Thread.sleep(6000);
      //  smo.click();
        Thread.sleep(6000);
mangement.click();
        Thread.sleep(6000);
        select_managment.click();
        Thread.sleep(6000);
        risk.click();
        Thread.sleep(6000);
risk1.click();
        Thread.sleep(6000);

    /*    yes_no.click();
        Thread.sleep(6000);
        debit_card.click();

        Thread.sleep(6000);
Rconciler.click();
        Thread.sleep(6000);

Reconcilar_two.click();
        Thread.sleep(6000);
Reviewer.click();
        Thread.sleep(6000);
max.click();
        Thread.sleep(6000);

        checkbox.click();

inter.click();
        Thread.sleep(6000);

monthly.click();
        Thread.sleep(6000);

external.click();
        Thread.sleep(6000);
month.click();
        Thread.sleep(6000);
        //yes_no.click();
       // checkbox.click();
      */  Thread.sleep(6000);
save.click();
        Thread.sleep(8000);

        close.click();
        Thread.sleep(5000);
        account_balance.click();
        Thread.sleep(8000);
        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(number);
            System.out.println(" New User successfully added in Cost center");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            dlt_2.click();
            Thread.sleep(4000);

        System.out.println(" New User successfully Deleted in Cost center");
        } else {
            System.out.println(" New User not added in Cost center");
        }

    }



    }
