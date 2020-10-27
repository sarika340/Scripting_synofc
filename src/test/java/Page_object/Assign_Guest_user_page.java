package Page_object;

import Utilities.Base_Class;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Assign_Guest_user_page {

    public WebDriver driver;

    public Assign_Guest_user_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"Assign Guest User\"]")
    WebElement Assign_user ;
    @FindBy(xpath = "//h6[contains(text(),'Guest To Client')]")
    WebElement Guest_to_client ;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    WebElement radio_btn ;

    public void setAssign_user() {
        Assign_user.click();
    }

    public void setGuest_to_client() {
        Guest_to_client.getText();
        Assert.assertEquals("Guest To Client" ,Guest_to_client.getText());
        System.out.println("text");
    }


    public boolean radio_btn ()
    {
        Random rnd = new Random();
        List<WebElement> radios = driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]"));
        radios.get(rnd.nextInt(radios.size())).click();
        return true;
    }

}
