package Page_object;

import org.apache.velocity.runtime.directive.Break;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Employee_permission {
    public WebDriver ldriver;
    public WebDriver driver;

    public Employee_permission(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Roles And Permission')]")
    WebElement Role_permission;
    @FindBy(xpath = "//*[text()=\"Employee Permission\"]")
    WebElement Employee_Permission;
    @FindBy(xpath = "//*[text()='Submit']")
    WebElement submit_button_emp;
    public Employee_permission() {

    }


    public void setRole_permission() {

        Role_permission.click();
        System.out.println("Click on Roles and permission");

    }

    public void setEmployee_Permission() {
        Employee_Permission.click();
    }

    public void setGo() throws InterruptedException {
        Actions actions =new Actions(driver);
        WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
        Thread.sleep(2000);
        String[] st={"#0000ff","#008000","#FF7043"};
        String[] st1={"Read","Write","Admin"};
        int[] count ={1,2,3};
        for(int i=0;i<3;i++) {
            Thread.sleep(5000);

            this.setSubmit_button(st[i],count[i],st1[i]);
        }
    }

    public void setSubmit_button(String hexcolor,int count,String access) throws InterruptedException {

        for(int i=1;i<=8;i++)
        {
            driver.findElement(By.xpath("(//*[ @type=\"checkbox\" ])["+count+"]")).click();
            count =count+4;
        }
        Thread.sleep(2000);
        submit_button_emp.click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).clear();
        driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
        //--------------------------------Get the color of button
        System.out.println("get the color of module -" + access);
        int size=0;
        for(int i=1;i<=8;i++)
        {
            Thread.sleep(5000);

            String color = driver.findElement(By.xpath("(//*[@title=\""+access+"\"])["+i+"]")).getCssValue("background-color");
            String colourhex =Color.fromString(color).asHex();
            Thread.sleep(5000);
            if(colourhex.equalsIgnoreCase(hexcolor)){
                size++;
            }
            else
            {
                System.out.println("Button not highlightes ad Read");
                break;
            }
        }
        if (size==8){
            System.out.println("All the Button highlightes ad "+access);
        }
    }

}
