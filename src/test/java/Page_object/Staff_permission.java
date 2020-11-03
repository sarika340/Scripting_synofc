package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Staff_permission {
    public WebDriver driver;

    public Staff_permission(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Staff Permisiion\"]")
    WebElement permission;
    //   @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement text;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[8]")
    WebElement box;
    @FindBy(xpath = "//*[text()=\"LCD\"]")
    WebElement lcd;
    @FindBy(xpath = "")
    WebElement uv;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement submit;

    public void setPermission() {
        permission.click();
    }

    public void setText() {
        lcd.click();
    }

    public void setBox() throws InterruptedException
    {
        box.click();
        Random random = new Random();
        int a = random.nextInt(3);
        System.out.println(a);
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[" + (a + 1) + "]")).click();
        submit.click();
        Thread.sleep(3000);
        lcd.click();


    }
    }
