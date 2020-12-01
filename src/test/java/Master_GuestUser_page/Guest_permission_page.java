package Master_GuestUser_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void setGuest_User_Permission() {
        Guest_User_Permission.click();
    }

    public void setSearch_Guest() {
        Search_Guest.sendKeys("Gopal");
    }

    public void setGuest() throws InterruptedException {
        boolean result =false;

        Guest.click();
        Random random = new Random();
        int a = random.nextInt(3);
        System.out.println(a);
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[" + (a + 1) + "]")).click();

        String test = driver.findElement(By.xpath("(//*[@class=\"d-inline-block\"])[2]//div[2]/div")).getText();
        if (test.equalsIgnoreCase("R") && a == 1) {
            System.out.println("Read selected successfully");
        } else if (test.equalsIgnoreCase("W") && a == 1) {
            System.out.println("Write selected successfully");
        } else {
            System.out.println("Admin selected successfully");
        }
    }

}

