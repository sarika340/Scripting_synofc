package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request_log_of_folder_and_to_Approve_page {
    public WebDriver driver;

    public Request_log_of_folder_and_to_Approve_page(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    ////*[@type="text"]
    @FindBy(xpath = "//*[text()=\"delete_sweep\"]")
    WebElement dlt_Request ;
    @FindBy(xpath = "//*[text()=\"Request Log\"]")
    WebElement Request_Log ;
    @FindBy(xpath = "//*[text()=\"My Team\"]")
    WebElement my_team ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement remark ;
    @FindBy(xpath = "(//*[@class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-1  d-flex align-items-center\"])[2]/span/span/span/input")
    WebElement text_box ;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement aprrove ;
    @FindBy(xpath = "    (//*[text()=\"cancel\"])\n")
    WebElement reject ;
    @FindBy(xpath = "(//*[text()=\"save\"])[2]")
    WebElement aprroe ;

    public void setDlt_Request( ) {
        dlt_Request.click();
    }

    public void setRequest_Log( ) {
        Request_Log.click();


    }

    public void setMy_team() {
        my_team.click();
    }

    public void setText_box() throws InterruptedException {
        Thread.sleep(5000);

        text_box.click();
    }

    public void setRemark() throws InterruptedException {
        Thread.sleep(5000);

        remark.sendKeys("aaaa");
        Thread.sleep(5000);
    }

    public void setAprrove() throws InterruptedException{
        text_box.click();
        Thread.sleep(5000);

        aprrove.click();
    }
}
