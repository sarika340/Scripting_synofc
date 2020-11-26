package Page_object;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Score_page {
    public WebDriver driver;
    public String random_num= Utilities_class.randomnemeric(6);
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(9);
    public Score_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[text()=\"settings\"]")
    WebElement setting;
    @FindBy(xpath="//*[text()=\"Score\"]")
    WebElement score;
    @FindBy(xpath="//*[text()=\"add\"]")
    WebElement add;
    @FindBy(xpath="//*[@name=\"score_name\"]")
    WebElement reconame;
    @FindBy(xpath="(//*[@name=\"description\"])[3]")
    WebElement decription;
    @FindBy(xpath="//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath="(//*[@type=\"text\"])[5]")
    WebElement search;
    @FindBy(xpath = "(//*[text()=\"close\"])[3]")
    WebElement close;


    public void setSetting() throws InterruptedException {
        setting.click();
        Thread.sleep(8000);

        score.click();
        Thread.sleep(8000);

        add.click();
        Thread.sleep(8000);

        reconame.sendKeys(random_name);
        Thread.sleep(8000);

        decription.sendKeys(random_Second_name);
        Thread.sleep(8000);
        save.click();
        Thread.sleep(8000);
close.click();
        Thread.sleep(8000);

score.click();


    }

    public void setSearch() throws InterruptedException {
        if (search.isDisplayed()) {
            Thread.sleep(8000);
            search.sendKeys(random_name);
            Thread.sleep(8000);

            search.clear();
            Thread.sleep(8000);

            search.sendKeys(random_name);

            System.out.println(" New User successfully added in Score center");
            Thread.sleep(8000);
            // delete.click();
            Thread.sleep(8000);
            //  dlt_2.click();
            System.out.println(" New User successfully Deleted in Score center");
        } else {
            System.out.println(" New User not added in Score center");
        }

    }
}
