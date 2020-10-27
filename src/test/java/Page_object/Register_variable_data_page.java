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
          //Actions items----------------------------------------------------------------------------------------------------------------
    public void set()
    {
        login.click();
        Assert.assertEquals("SyncOffice" ,driver.getTitle());
        System.out.println("Successfully Syncoffice URL launched");
    }
    public void setusername(String uname)
    {
        Username.clear();
        Username.sendKeys(uname);
    }
    public void Setpassword(String pass)
    {
        password.clear();
        password.sendKeys(pass);
    }
    public void setLogin_button()
    {
        login_button.click();
        Assert.assertEquals("SyncOffice" ,driver.getTitle());
        System.out.println("Syncoffice Home Page Displayed");
    }
    public void setMaster()
    {
        master.click();
    }

    public void setMouse_over_clint() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
        //Mouse hover menuOption 'Employee'
        Thread.sleep(2000);
        actions.moveToElement(menuOption).perform();
    }
    public void setClint()
    {
        clint.click();
    }
    public void setRegister()
{

    Register.click();

}
    public void setAdd_register() {
        Add_register.click();
    }
    public void setRegisteration_value(String value) {
        registeration_value.sendKeys(value);
    }
    public void setDoucument_name(String doc_name) {
        Doucument_name.sendKeys(doc_name);
    }

    public void setSave_button(String dac_name) throws InterruptedException {


        Save_button.click();
        Thread.sleep(5000);
        if(driver.findElements(By.xpath("//*[text()='Variable Data']")).size()>0) {
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
        }
    }
}

