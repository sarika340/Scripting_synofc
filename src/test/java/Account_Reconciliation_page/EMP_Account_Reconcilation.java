package Account_Reconciliation_page;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMP_Account_Reconcilation {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name = Utilities_class.randomalphabet(5);
    public String middle_name = Utilities_class.randomalphabet(5);

    public EMP_Account_Reconcilation(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    //*[text()="developer_board"]
    @FindBy(xpath = "//*[text()=\"people_outline\"]")
    WebElement mouse;
    @FindBy(xpath = "//*[text()=\"Employee\"]")
    WebElement emp;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"firstname\"]")
    WebElement firstclass;
    @FindBy(xpath = "//*[@name=\"middlename\"]")
    WebElement middile;
    @FindBy(xpath = "//*[@name=\"lastname\"]")
    WebElement last_name;
    @FindBy(xpath = "//*[@name=\"badge_code\"]")
    WebElement code;
    @FindBy(xpath = "//*[@name=\"username\"]")
    WebElement mail;
    @FindBy(xpath = "//*[@type=\"tel\"]")
    WebElement phone;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement DOB;
    @FindBy(xpath = "(//*[text()=\"2\"])[2]")
    WebElement date_2;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement dob_official;
    @FindBy(xpath = "(//*[text()=\"5\"])[2]")
    WebElement date_3;
    @FindBy(xpath = "(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement dob_actual;
    @FindBy(xpath = "(//*[text()=\"6\"])[2]")
    WebElement date_4;

    @FindBy(xpath = "//*[text()=\"Female\"]")
    WebElement female;

    @FindBy(xpath = "(//*[text()=\"Project IGI\"])[2]")
    WebElement Project_IGI;
    @FindBy(xpath = "//*[text()=\"MS Office\"]")
    WebElement ms_office;
    @FindBy(xpath = "(//*[text()=\"Master\"])[4]")
    WebElement master;
    @FindBy(xpath = "(//*[text()=\"Head Office\"])[1]")
    WebElement Head_office;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement select_gender;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement select_entity;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement select_dept;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement select_designation;
    @FindBy(xpath = "(//*[text()=\"Select...\"])[1]")
    WebElement select_loc;
    @FindBy(xpath = "(//*[text()=\"2020\"])[2]")
    WebElement offical_2020;
    @FindBy(xpath = "//*[text()=\"2000\"]")
    WebElement offial_2000;
    @FindBy(xpath = "//*[text()=\"Mumbai\"]")
    WebElement loc;
    ////*[text()="Save"]
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;

    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement varify_Employee;

    @FindBy(xpath = "(//*[text()=\"delete\"])[3]")
    WebElement delete;
    @FindBy(xpath = "(//*[text()=\"delete\"])[4]")
    WebElement dlt;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;
    // @FindBy(xpath = "(//*[@type=\"text\"])[7]")
    // WebElement varify_Emple;
//(//*[text()="delete"])[3]
    public void setMouse() { // //  (//*[@type="text"])[7]

        Actions ac = new Actions(driver);
        ac.moveToElement(mouse).build().perform();
        // mouse.click();
    }

    public void setEmp() throws InterruptedException {
        emp.click();
        Thread.sleep(4000);
        add.click();


    }

    public void setAdd() throws InterruptedException {
        Thread.sleep(4000);

    }

    public void setFirstclass() throws InterruptedException {
        Thread.sleep(5000);
        firstclass.sendKeys(random_name);
        Thread.sleep(5000);
        middile.sendKeys(middle_name);
        Thread.sleep(5000);
        last_name.sendKeys(random_Second_name);
        Thread.sleep(5000);

        Thread.sleep(5000);
        mail.sendKeys(random_name + "@gmail.com");
        Thread.sleep(5000);
        phone.sendKeys("9" + Utilities_class.randomnemeric(9));
        Thread.sleep(5000);


    }

    public void setDOB() throws InterruptedException {
        DOB.click();
        Thread.sleep(5000);
        date_2.click();
        Thread.sleep(5000);
        dob_official.click();
        Thread.sleep(5000);

        offical_2020.click();
        Thread.sleep(5000);

        offial_2000.click();
        Thread.sleep(5000);
        date_3.click();
        Thread.sleep(5000);
        dob_actual.click();
        Thread.sleep(5000);
        date_4.click();
        Thread.sleep(5000);

    }

    public void setFemale() throws InterruptedException {

        select_entity.click();
        Thread.sleep(5000);
        Project_IGI.click();
        Thread.sleep(5000);
        System.out.println("3headoffice");
        code.clear();
        Thread.sleep(5000);
        code.sendKeys(Utilities_class.randomnemeric(5));
        select_gender.click();
        female.click();
        Thread.sleep(5000);
        System.out.println("4headoffice");
        select_dept.click();
        Thread.sleep(5000);
        ms_office.click();
        Thread.sleep(5000);
        System.out.println("2headoffice");

        select_designation.click();
        Thread.sleep(5000);
        master.click();
        Thread.sleep(5000);
        System.out.println("1headoffice");

        select_loc.click();
        Thread.sleep(5000);
        loc.click();
        Thread.sleep(5000);
        save.click();
        Thread.sleep(6000);
        Thread.sleep(8000);

     //   driver.close();

    }
}





