package Page_object;

import Utilities.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Guest_user_page {

    public WebDriver driver;

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
    @FindBy(xpath="(//*[@type=\"text\"])[6]")
    WebElement first_name;
    @FindBy(xpath="(//*[@type=\"text\"])[8]")
    WebElement Last_name;
    @FindBy(xpath="//*[@type=\"tel\"]")
    WebElement mobile_number;
    @FindBy(xpath="(//*[@type=\"email\"])[2]")
    WebElement email;
    @FindBy(xpath="(//*[@type=\"text\"])[9]")
    WebElement Company_name;
    @FindBy(xpath="(//*[@placeholder=\"DD/MM/YYYY\" ])[1]")
    WebElement Login_from;
    @FindBy(xpath="(//*[@placeholder=\"DD/MM/YYYY\" ])[2]")
    WebElement Login_to;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement save;


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

        WebElement closeMenuOption = driver.findElement(By.xpath("(//*[text()=\"Guest User\"])[3]"));
        actions.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()=\"Guest User\"])[3]")).isDisplayed();
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

        first_name.sendKeys(Base_Class.randomalphabet(5));
        System.out.println("Enter First name");
        Thread.sleep(2000);
        Last_name.sendKeys(Base_Class.randomalphabet(5));
        System.out.println("Enter last name");
        Thread.sleep(2000);
        mobile_number.sendKeys("9" +Base_Class.randomnemeric(9));
        System.out.println("Enter Mobile Number");
        Thread.sleep(2000);
        Company_name.sendKeys(Base_Class.randomalphabet(6));
        System.out.println("Enter Company Name");
        Thread.sleep(2000);
        email.sendKeys(Base_Class.randomalphanemeric(6)+"@gmail.com");
        System.out.println("Enter email address");
        Thread.sleep(2000);
        Login_from.sendKeys(Base_Class.before_date());
        System.out.println("Enter Login From date");
        Thread.sleep(2000);

        Login_to.sendKeys(Base_Class.current_date());
        Thread.sleep(2000);
        save.click();
       // Login_To.sendKeys(Base_Class.current_date());
       // System.out.println("Enter Login To date");
    }
    public void setSave(String Guest_user) {
        if(driver.findElements(By.xpath("(//*[text()=\"Guest User\"])[3]")).size()>0) {
            List<WebElement> elements = driver.findElements(By.xpath("//tbody//tr"));
            int count = elements.size();
            System.out.println("Count of Register Variable - " + count);

            for(int i =count;i>0;i--){
                String user=   driver.findElement(By.xpath("//tbody//tr["+i+"]//td[1]")).getText();
                System.out.println(" Added Guest user  value " + user );

                System.out.println("Guest user value displaying in Registered page " +Guest_user);

                if (user.equals(Guest_user))
                {

                    System.out.println("Guest user Successfully added in Registered page" );
                    break;

                }
                else{
                    System.out.println("Guest user already exist or NOt added properly");
                }
            }

        }

        else{

            System.out.println(" Guest user not added ");
        }
    }
}
