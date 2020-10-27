package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Guest_permission_page {
    public WebDriver driver;

    public Guest_permission_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Guest User Permission')]\n")
    WebElement Guest_User_Permission;
    @FindBy(xpath = "(//*[@type=\"text\"])[1]")
    WebElement Search_Guest;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[6]")
    WebElement Guest;
    @FindBy(xpath = "//*[text()='Submit']")
    WebElement submit_button_emp;
    @FindBy(xpath = "")
    WebElement q;
    @FindBy(xpath = "")
    WebElement f;

    public void setGuest_User_Permission() {
        Guest_User_Permission.click();
    }

    public void setSearch_Guest() {
        Search_Guest.sendKeys("Gopal");
    }

    public void setGuest() throws InterruptedException {

        Guest.click();
        String[] st={"#0000ff","#008000","#FF7043"};
        String[] st1={"Read","Write","Admin"};
        int[] count ={1,2,3};
        Random random = new Random();
        int a =random.nextInt(3);
        System.out.println(a);
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])["+(a+1)+"]")).click();


        /*for(int i=0;i<3;i++) {
            Thread.sleep(5000);

        }*/
    }



   /* public void setSubmit_button(String hexcolor,int count,String access) throws InterruptedException {
        for(int i=1;i<=8;i++)
        {
            driver.findElement(By.xpath("(//*[ @type=\"checkbox\" ])["+count+"]")).click();
            count =count++;
        }

    }*/
}

