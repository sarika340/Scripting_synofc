package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Download_the_file_page {

    public WebDriver driver;

    public To_Download_the_file_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement admistration;
    @FindBy(xpath = "//*[@type=\"text\"]")
    WebElement serach;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement check_box;
    @FindBy(xpath = "(//*[text()=\"get_app\"])[1]")
    WebElement download;
    @FindBy(xpath = "")
    WebElement sk;
    @FindBy(xpath = "")
    WebElement ss;
    @FindBy(xpath = "")
    WebElement sf;
    @FindBy(xpath = "")
    WebElement su;


    public void setAdmistration() throws InterruptedException {
        admistration.click();
        Thread.sleep(4000);
    }


    public void setSerach() throws InterruptedException{
        serach.sendKeys("GL.xls");
        Thread.sleep(5000);

    }

    public void setCheck_box()throws InterruptedException {
        check_box.click();
        Thread.sleep(5000);

    }

    public void setDownload()throws InterruptedException {
        download.click();
        Thread.sleep(6000);

    }
}
