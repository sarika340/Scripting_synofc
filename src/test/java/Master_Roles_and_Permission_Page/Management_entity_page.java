package Master_Roles_and_Permission_Page;


import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Management_entity_page {

    public WebDriver driver;
    public String random_num=Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public Management_entity_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="(//*[text()=\"add_circle\"])[3]")
    WebElement add_mangement;
    @FindBy(xpath="(//*[text()=\"Select...\"])[3]")
    WebElement select;
    @FindBy(xpath="(//*[text()=\"Project IGI\"])[2]")
    WebElement microsoft;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name;
    @FindBy(xpath="//*[@name=\"code\"]")
    WebElement code;
    @FindBy(xpath="(//*[@name=\"description\"])[4]")
    WebElement description;
    @FindBy(xpath="(//*[text()=\"save\"])[2]")
    WebElement save;
    @FindBy(xpath="(//*[text()=\"add_circle\"])[2]")
    WebElement add_circle;
    @FindBy(xpath="//*[@name=\"gl_code\" ]")
    WebElement glcode;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement dec;
    ////*[@name="gl_code" ]
  //  @FindBy(xpath="//*[@placeholder=\"DD/MM/YYYY\"]")
  //  WebElement date;//(//*[@type="button"])[22]
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
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[6]")
    WebElement DATE;
    @FindBy(xpath="(//*[text()=\"5\"])[1]")
    WebElement lc_5;
    @FindBy(xpath="(//*[text()=\"Select...\"])[4]")
    WebElement Select_entity;
    @FindBy(xpath="(//*[text()=Sarika Mishra")
    WebElement sl;
    @FindBy(xpath="(//*[text()=\"add_circle\"])[1]")
    WebElement add_category;
    @FindBy(xpath="//*[@name=\"name\"]")
    WebElement name_category;
    @FindBy(xpath="(//*[text()=\"Save\"])[2]")
    WebElement save_category;
    @FindBy(xpath = "//*[@name='landline_num'])]")
            WebElement number;
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


////*[@name="name"]

    public void setAdd_mangement() throws InterruptedException {
       // name1.sendKeys(random_name);
glcode.sendKeys(random_name);
dec.sendKeys(random_Second_name);
        add_category.click();
        Thread.sleep(5000);
        name.sendKeys(random_name);
        Thread.sleep(5000);

        description.sendKeys(random_Second_name);

        Thread.sleep(5000);

        save_category.click();
        Thread.sleep(5000);
        selct.click();
        Thread.sleep(5000);
        expance.click();
        Thread.sleep(5000);

        Thread.sleep(5000);
        selct1.click();
        Thread.sleep(5000);
        project_igi.click();
        Thread.sleep(5000);
        add_mangement.click();
        Thread.sleep(5000);
        select.click();
        Thread.sleep(5000);

        name.sendKeys(random_name);
        Thread.sleep(5000);

        description.sendKeys(random_Second_name);
        Thread.sleep(5000);

        description.sendKeys(random_Second_name);
        Thread.sleep(5000);

        save.click();

        selct2.click();
        Thread.sleep(5000);
        mg.click();
        Thread.sleep(5000);

        Thread.sleep(5000);

        selct.click();
        Thread.sleep(5000);
        expance.click();
        Thread.sleep(5000);
        Actions ac=new Actions(driver);

        // ac.moveToElement( driver.findElement(By.xpath("(//*[text()=\"Select...\"])[1]"))).build().perform();
      //  driver.findElement(By.xpath("(//*[text()=\"ram\"])[1]")).click();
      //  driver.findElement(By.xpath(random_name)).click();



    }

    public void setSelect() throws InterruptedException {
        add_mangement.click();
        Thread.sleep(5000);
        select.click();
    }

    public void setMicrosoft() {

        project_igi.click();
    }

    public void setName() {

        name.sendKeys(random_name);
    }

    public void setCode() {
        code.sendKeys(random_num);
    }

    public void setDescription() {
        description.sendKeys(random_Second_name);
    }

    public void setSave() throws InterruptedException {

        save.click();

        Thread.sleep(3000);
        selct.click();
        Thread.sleep(5000);
        expance.click();
        Thread.sleep(5000);
        selct1.click();
        Thread.sleep(5000);
        project_igi.click();
        Thread.sleep(5000);
        selct2.click();
        Thread.sleep(5000);
        mg.click();
        Thread.sleep(5000);
        add_circle.click();

    }
    public void mendtory_fields() throws InterruptedException {
        Thread.sleep(3000);
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
       // date_f.click();
        Thread.sleep(6000);
        lc_5.click();
        Thread.sleep(6000);

        pincode.sendKeys("494442");
        Thread.sleep(6000);
      //  date_f.click();
        number.sendKeys(Utilities_class.randomnemeric(9));
        Thread.sleep(6000);
       // date_f.click();
        Thread.sleep(6000);
      //  lc_5.click();
        driver.findElement(By.xpath(""));
        //  lc_5.click();
        Thread.sleep(6000);
        Select_entity.click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[text()=\"Sarika Mishra\"]")).click();
        Thread.sleep(6000);
        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[text()=save")).click();





    }
}
