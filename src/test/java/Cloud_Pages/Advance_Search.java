package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Advance_Search {
    public WebDriver driver;

    public Advance_Search(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"Functional Exp. 1\"]")
    WebElement ms;
    @FindBy(xpath = "//*[text()=\"Search\"]")
    WebElement search ;
    @FindBy(xpath = "    (//*[text()=\"search\"])[1]\n")
    WebElement search1 ;
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement file_name ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement box ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[1]")
    WebElement file_type ;
    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[2]")
    WebElement uploaded_by ;
    @FindBy(xpath = "//*[@class=\"react-datepicker__month-select\"]")
    WebElement sep ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]\n")
    WebElement fil_type ;
    @FindBy(xpath = "//*[text()=\"10\"]")
    WebElement date1 ;
    @FindBy(xpath = "(//*[@ placeholder=\"DD/MM/YYYY\"])[1]")
    WebElement date ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]\n")
    WebElement png ;
    @FindBy(xpath = "(//*[text()=\"remove_red_eye\"])[1]")
    WebElement location ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]\n")
    WebElement ng ;
    @FindBy(xpath = "(//*[text()=\"MAX PAYNE\"])[2]")
    WebElement max_py ;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[4]\n")
    WebElement pnkg ;
   // (//*[text()="remove_red_eye"])[1]
    public void setMs() throws InterruptedException{
        ms.click();
    }



    public void setBox() throws InterruptedException{
        file_type.click();
    }

    public void setSearch()throws InterruptedException {
        search1.click();
    }

    public void setFile_name()throws InterruptedException {
        file_name.sendKeys("Trial");
        Thread.sleep(4000);


       png.click();



        search.click();
        Thread.sleep(4000);



    }

    public void setDate() throws InterruptedException {
        date.click();
        Thread.sleep(4000);
        date1.click();
        Thread.sleep(4000);
    }


    public void setUploaded_by() throws InterruptedException {
        uploaded_by.click();
        Thread.sleep(4000);

        max_py.click();
        Thread.sleep(4000);

        search.click();
        Thread.sleep(4000);


    }

    public void setLocation() throws InterruptedException {
        location.click();
        Thread.sleep(4000);

        file_name.sendKeys("Trial");    }
}
