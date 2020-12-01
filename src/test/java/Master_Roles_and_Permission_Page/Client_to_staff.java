package Master_Roles_and_Permission_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Client_to_staff {
    public WebDriver driver;

    public Client_to_staff(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//span[contains(text(),'Staff to Client')]")
    WebElement Staff_to_client;
    @FindBy(xpath = "// select[@class=\"mdc-select__native-control customFieldText py-0\" ]")
    WebElement drop_down;
    @FindBy(xpath = "//*[text()=\"IBM\"]\n")
    WebElement IBM;
    @FindBy(xpath = "//*[@type=\"checkbox\"]")
    WebElement all_stafft;
    @FindBy(xpath = "( //*[@type=\"checkbox\"])[4]")
    WebElement all_client;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement submit;
    @FindBy(xpath = "")
    WebElement u;

    public void setStaff_to_client() {
        Staff_to_client.click();
    }

    public void setDrop_down() throws InterruptedException {
        WebElement menuOption1 = driver.findElement(By.xpath("// select[@class=\"mdc-select__native-control customFieldText py-0\" ]"));
        Select sc=new Select(menuOption1);
        menuOption1.click();
        //sc.deselectByVisibleText("IBM");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()=\"IBM\"]\n")).click();
       Thread.sleep(5000);
    }



    public void setAll_client() throws InterruptedException {
        all_stafft.click();
        Thread.sleep(5000);

        all_client.click();
        Thread.sleep(5000);

           }

    public void setAll_staff() throws InterruptedException {
        submit.click();
        Thread.sleep(5000);

      //  driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")) .click();
       // Thread.sleep(5000);
      //  System.out.println("checkbox");

      //  driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[5]")) .click();
     //   System.out.println("checkbox");

     //   submit.click();

    }
}
