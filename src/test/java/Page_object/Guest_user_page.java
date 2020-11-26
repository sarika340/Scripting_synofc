package Page_object;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Guest_user_page {

    public WebDriver driver;
    public String random_first_name =Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public Guest_user_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="(//*[text()=\"Guest User\"])[1]")
    WebElement click_on_Guesruser;
    @FindBy(xpath="(//*[text()=\"Guest User\"])[2]")
    WebElement click_on_Sub_Guesruser;
    @FindBy(xpath="(//*[text()=\"Guest User\"])[3]")
    WebElement guset_user_page;
    @FindBy(xpath="(//*[text()=\"add\"])[5]")
    WebElement click_on_add_button;
    @FindBy(xpath="(//*[@type=\"text\"])[3]")
    WebElement first_name;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement Last_name;
    @FindBy(xpath="//*[@type=\"tel\"]")
    WebElement mobile_number;
    @FindBy(xpath="(//*[@type=\"email\"])[1]")
    WebElement email;
    @FindBy(xpath="(//*[@type=\"text\"])[6]")
    WebElement Company_name;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[4]")
    WebElement Login_from;
    @FindBy(xpath="(//*[text()=\"5\"])[1]")
    WebElement sae;
    @FindBy(xpath="(//*[@type=\"button\"]//*[@focusable=\"false\"])[5]")
    WebElement Login_to;
    @FindBy(xpath="//*[text()=\"30\"]")
    WebElement date;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath="(//*[text()=\"Guest User\"])[2]")
    WebElement guestuser;
    @FindBy(xpath="(//*[@ type=\"text\"])[2]")
    WebElement search;
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete_popup;

    public void setClick_on_Guesruser() throws InterruptedException {
        click_on_Guesruser.click();
        Thread.sleep(3000);
    }

    public void setClick_on_Sub_Guesruser() {
        click_on_Sub_Guesruser.click();
        System.out.println("Sub Module clicked");
    }

    public void setGuset_user_page() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions =new Actions(driver);
        actions.moveToElement(guestuser).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);
        guestuser.isDisplayed();
        actions.moveToElement(guset_user_page).perform();

        System.out.println(guset_user_page.getText());
        Thread.sleep(2000);

        if(guset_user_page.getText().equalsIgnoreCase("Guest User")){
            System.out.println("Guest user displayed");
        }

    }

    public void setClick_on_add_button() throws InterruptedException {
        click_on_add_button.click();
        System.out.println("Click on add button");
        Thread.sleep(5000);
    }

    public void set_Mandatory_field() throws InterruptedException {

        first_name.sendKeys(random_first_name);
        System.out.println("Enter First name");
        Thread.sleep(2000);
        Last_name.sendKeys(random_Second_name);
        System.out.println("Enter last name");
        Thread.sleep(2000);
        mobile_number.sendKeys("9" + Utilities_class.randomnemeric(9));
        System.out.println("Enter Mobile Number");
        Thread.sleep(2000);
        Company_name.sendKeys(Utilities_class.randomalphabet(6));
        System.out.println("Enter Company Name");
        Thread.sleep(2000);
        email.sendKeys(random_first_name+"@gmail.com");
        System.out.println("Enter email address");
        Thread.sleep(3000);
        Login_from.click();
        Thread.sleep(3000);
        sae.click();
      //  Login_from.sendKeys(Base_Class.before_date());
        System.out.println("Enter Login From date");
        Thread.sleep(2000);
      //  sae.click();
        Login_to.click();
        Thread.sleep(2000);
        date.click();
    //    Login_to.sendKeys(Base_Class.current_date());
        Thread.sleep(2000);
        save.click();
        Thread.sleep(8000);
        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(random_first_name);
            Thread.sleep(8000);
            System.out.println(" New User successfully added in Cost center");
            Thread.sleep(8000);
            delete.click();
            Thread.sleep(8000);
            delete_popup.click();
            System.out.println(" New User successfully Deleted in Cost center");
        } else {
            System.out.println(" New User not added in Cost center");
        }

    }

}
