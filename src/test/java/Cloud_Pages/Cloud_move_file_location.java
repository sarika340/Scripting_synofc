package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cloud_move_file_location {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public Cloud_move_file_location(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//*[text()=\"MS Office\"])[2]")
    WebElement ms;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement button;
    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[6]")
    WebElement drop_down;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[4]")
    WebElement financer;
    @FindBy(xpath = "(//*[text()=\"move_to_inbox\"])[1]")
    WebElement ac_buttn;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;


    public void setMs() throws InterruptedException {
        ms.click();
Thread.sleep(2000);
    }

    public void setButton() throws InterruptedException {
        button.click();
        Thread.sleep(2000);

        ac_buttn.click();
    }

    public void setDrop_down()throws InterruptedException {
        Thread.sleep(2000);

        drop_down.click();
        Select sc=new Select(drop_down);
       // sc.deselectByVisibleText("MS Office");
       // sc.deselectByValue();
        driver.findElement(By.xpath("(//*[text()=\"Financer\"])[4]")).click();
        Thread.sleep(2000);

    }

    public void setSave() {

        save.click();
    }
}


