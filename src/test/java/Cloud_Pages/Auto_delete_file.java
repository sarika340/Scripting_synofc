package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_delete_file {
    public WebDriver driver;

    public Auto_delete_file(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    ////*[@type="text"]
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement serch ;
    @FindBy(xpath = "(//*[text()=\"delete\"])[1]")
    WebElement delete ;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement rtore ;
    @FindBy(xpath = "//*[text()=\"restore\"]")
    WebElement restore ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement text ;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[1]")
    WebElement ms;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement dlt;

    @FindBy(xpath = "    //*[text()=\"OverAll\"]\n")
    WebElement overall;
    @FindBy(xpath = "//*[@type=\"number\"]")
    WebElement sms;
    @FindBy(xpath = "(//*[@class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-12  mdc-typography--body2\"])[2]//input")
    WebElement mas;

    @FindBy(xpath = "    (//*[text()=\"Restore\"])[4]\n")
    WebElement maas;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[33]")
    WebElement mads;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "    //*[text()=\"Save\"]\n")
    WebElement save;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement passwod;

    public void setMs( ) throws InterruptedException {
        Thread.sleep(7000);

        ms.click();
        Thread.sleep(7000);
       // serch.sendKeys("Mat");
        Thread.sleep(7000);
        text.click();
        Thread.sleep(7000);
        delete.click();
        Thread.sleep(3000);

        passwod.sendKeys("Creta_123");
        Thread.sleep(4000);

        save.click();
        Thread.sleep(8000);

        restore.click();
        Thread.sleep(6000);

        overall.click();
        Thread.sleep(3000);
        sms.clear();
        Thread.sleep(3000);

        sms.sendKeys("16");
        Thread.sleep(8000);

        save.click();
        Thread.sleep(3000);

        mas.click();
        Thread.sleep(4000);

        maas.click();
        Thread.sleep(4000);

        password.sendKeys("Creta_123");
        Thread.sleep(4000);

        save.click();


    }
}
