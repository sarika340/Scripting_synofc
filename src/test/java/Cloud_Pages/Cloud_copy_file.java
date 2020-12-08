package Cloud_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Cloud_copy_file {
    public WebDriver driver;

    public Cloud_copy_file(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement search ;
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement mycloud ;

    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement ms;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement button;
    @FindBy(xpath = "    //*[text()=\"file_copy\"]\n")
    WebElement copy;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement buon;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement buttn;
    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[6]")
    WebElement drop_down;
    @FindBy(xpath = "(//*[text()=\"OPD\"])[4]")
    WebElement financer;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save;
    @FindBy(xpath = "    (//*[text()=\"delete\"])[1]\n")
    WebElement delete;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save_dlt;
    public void setMs() throws InterruptedException {
        ms.click();
        Thread.sleep(5000);

    }

    public void setSearch()throws InterruptedException  {
        search.sendKeys("SYN.png");
        Thread.sleep(2000);

    }

    public void setButton() throws InterruptedException {
        button.click();
        Thread.sleep(2000);

    }

    public void setCopy()throws InterruptedException  {
        copy.click();
        Thread.sleep(2000);

    }



    public void setDrop_down()throws InterruptedException {
        Thread.sleep(2000);

        drop_down.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()=\"OPD\"])[4]")).click();
        Thread.sleep(2000);

    }

    public void setSave() throws InterruptedException{
        Thread.sleep(8000);

        save.click();
        Thread.sleep(9000);
        search.clear();
        Thread.sleep(9000);

        search.sendKeys("SYN.png");
        Thread.sleep(8000);
        button.click();
        Thread.sleep(8000);

        delete.click();
        Thread.sleep(9000);

password.sendKeys("Creta_123");
        Thread.sleep(8000);

save_dlt.click();
        Thread.sleep(5000);

    }

}
