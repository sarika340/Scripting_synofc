package Page_object;

import org.apache.velocity.runtime.directive.Break;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Register_variable_data_page {
    public WebDriver ldriver;
    public WebDriver driver;

    public Register_variable_data_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[@class='MuiButton-label']")
    WebElement login;

    @FindBy(xpath = "//*[@type='text']\n")
    WebElement Username;
    @FindBy(xpath="//*[@type='password']\n")
    WebElement password;
    @FindBy(xpath = "//*[text()=\"login\"]")
    WebElement login_button;
    @FindBy(xpath = "//span[contains(text(),'Master')]")
    WebElement master;

    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span")
    WebElement mouse_over_clint;

    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[2]/span")
    WebElement clint;
    @FindBy(xpath="//span[contains(text(),'Register Variable-Data')]")
    WebElement Register;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]")
    WebElement Add_register;
    @FindBy(xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement registeration_value;
    @FindBy(xpath="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
   WebElement Doucument_name;
    @FindBy(xpath="//*[text()=\"save\"]")
    WebElement Save_button;
    @FindBy(xpath="//*[text()='Variable Data']")
    WebElement text;
    @FindBy(xpath="//*[@placeholder=\"Search\"]")
    WebElement search;
    @FindBy(xpath="(//*[text()=\"delete\"])[2]")
    WebElement delete;
    @FindBy(xpath="(//*[text()=\"delete\"])[4]")
    WebElement delete_popup;


    //Actions items----------------------------------------------------------------------------------------------------------------
    public void set()
    {
        login.click();
    }
    public void setusername(String uname)
    {
        Username.clear();
        Username.sendKeys(uname);
        System.out.println("Enter the email id");
    }
    public void Setpassword(String pass)
    {
        password.clear();
        password.sendKeys(pass);
        System.out.println("Enter the password");
    }
    public void setLogin_button()
    {
        System.out.println("click on Login");
        login_button.click();

    }
    public void setMaster()
    {
        master.click();
    }

    public void setMouse_over_clint() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
        actions.moveToElement(menuOption).perform();
    }
    public void setClint()
    {
        clint.click();
    }
    public void setRegister() {
    Register.click(); }
    public void setAdd_register() {
        Add_register.click();
    }
    public void setRegisteration_value(String value) {
        registeration_value.sendKeys(value);
    }
    public void setDoucument_name(String doc_name) {
        Doucument_name.sendKeys(doc_name);
    }

    public boolean setSave_button(String dac_name) throws InterruptedException {
        boolean result =false;
             Save_button.click();
             Thread.sleep(5000);

        if(text.isDisplayed())
        {
            search.sendKeys(dac_name);
            Thread.sleep(2000);
            if(driver.findElements(By.xpath("//*[starts-with(text(),'"+dac_name+"')]")).size()>1)
            {
                System.out.println(" New User successfully added in Guest User");
                Thread.sleep(5000);
                delete.click();
                System.out.println("delete Guest User");
                Thread.sleep(5000);
                delete_popup.click();
                System.out.println("delete Guest User pop up appears");
                result =true;
            }
            else
            {
                System.out.println(" New User not added in Guest User");
            }
        }
        else
        {
            System.out.println("Guest User page not displaying once clicked on submit button");
        }
               return result;

    }







      /*  if(driver.findElements(By.xpath("//*[text()='Variable Data']")).size()>0) {
            List<WebElement> elements = driver.findElements(By.xpath("//tbody//tr"));
            int count = elements.size();
            System.out.println("Count of Register Variable - " + count);

            for(int i =count;i>0;i--){
                String doc=   driver.findElement(By.xpath("//tbody//tr["+i+"]//td[1]")).getText();
                System.out.println(" Added Doc value " + doc );

                System.out.println("Doc value displaying in Registered page " +dac_name);

                if (doc.equals(dac_name))
                {

                    System.out.println("Doc Successfully added in Registered page" );
                    break;

                }
                else{
                    System.out.println("Doc already exist or NOt added properly");
                }
            }

        }

        else{

            System.out.println(" Employe not added ");
        }*/
    }


