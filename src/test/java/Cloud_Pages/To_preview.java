package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_preview {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String name =Utilities_class.randomalphabet(5);

    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);

    public To_preview(WebDriver rdriver) {
        driver = rdriver;

        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[text()=\"Administration\"]")
    WebElement function;
    @FindBy(xpath = "//*[text()=\"Administration\"]")
    WebElement admistration;
    @FindBy(xpath = "//*[text()=\"Untitled Folder 2\"]")
    WebElement folder;
    @FindBy(xpath = "//*[text()=\"1\"]")
    WebElement element;
    @FindBy(xpath = "(//*[text()=\"get_app\"])[2]")
    WebElement download;
    @FindBy(xpath = "(//*[text()=\"title\"])")
    WebElement rename;
    @FindBy(xpath = "(//*[text()=\"find_replace\"])")
    WebElement replace_file;
    @FindBy(xpath = "(//*[text()=\"move_to_inbox\"])[2]")
    WebElement move;
    @FindBy(xpath = "(//*[text()=\"link\"])")
    WebElement link;
    @FindBy(xpath = "(//*[text()=\"layers\"])")
    WebElement varsion;
    @FindBy(xpath = "(//*[text()=\"delete\"])[2]")
    WebElement dlt;
    @FindBy(xpath = "(//*[text()=\"access_time\"])")
    WebElement file_log;
    @FindBy(xpath = "(//*[text()=\"email\"])[2]")
    WebElement email;
    @FindBy(xpath = "(//*[@type=\"rename\"])")
    WebElement rename_text;
    @FindBy(xpath = "(//*[text()=\"Rename\"])[2]")
    WebElement re_save;
    @FindBy(xpath = "//*[@type=\"file\"]")
    WebElement upload_file;
    @FindBy(xpath = "(//*[text()=\"Replace\"])[2]")
    WebElement replace;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[4]")
    WebElement finance;
    @FindBy(xpath = "(//*[text()=\"Move\"])[2]")
    WebElement move1;

    @FindBy(xpath = "(//*[text()=\"Add Link\"])\n")
    WebElement add_link;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement checkbox;
    @FindBy(xpath = "(//*[text()=\"Link\"])")
    WebElement link1;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[4]")
    WebElement fince;
    @FindBy(xpath = "//*[@class=\"text-right\"]//button")
    WebElement cencel;
    @FindBy(xpath = "    //*[text()=\"Export to Excel\"]\n")
    WebElement export;
    @FindBy(xpath = "(//*[@type=\"text\"])[3]")
    WebElement email_box;
    @FindBy(xpath = "(//*[@type=\"text\"])[4]")
    WebElement CC;
    @FindBy(xpath = "(//*[@type=\"text\"])[5]")
    WebElement bcc;
    @FindBy(xpath = "//*[text()=\"CC\"]")
    WebElement cc_text;
    @FindBy(xpath = "//*[text()=\"BCC\"]")
    WebElement bcc_text;
    @FindBy(xpath = "    (//*[@type=\"text\"])[6]\n")
    WebElement subject;
    @FindBy(xpath = "(//*[text()=\"Send\"])[2]")
    WebElement send;
    @FindBy(xpath = "//*[text()=\"remove_red_eye\"]")
    WebElement priview;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "   //*[text()=\"Save\"]\n")
    WebElement save;
    @FindBy(xpath = "     (//*[@class=\"ril-toolbar__item ril__toolbarItem\"])[4]//*[@type=\"button\"]\n")
    WebElement cencel1;
    @FindBy(xpath = "   //*[text()=\"Save\"]\n")
    WebElement savhe;
    public void setFolder() throws InterruptedException{
        admistration.click();
        Thread.sleep(6000);

    }

    public void setPriview()throws InterruptedException {
        element.click();
        Thread.sleep(6000);

        priview.click();
        Thread.sleep(6000);

        cencel1.click();
        Thread.sleep(6000);

    }

    public void setElement() throws InterruptedException{
        //Actions ac=new Actions(driver);
      //  ac.moveToElement(element).build().perform();
        element.click();
        Thread.sleep(6000);

    }
    public void setDownload() throws InterruptedException{
        download.click();
        Thread.sleep(6000);

    }
    public void setRename() throws InterruptedException {
        Thread.sleep(6000);

        rename.click();
        Thread.sleep(6000);
        rename_text.clear();
        Thread.sleep(6000);

        rename_text.sendKeys(Utilities_class.randomalphabet(6));
        Thread.sleep(6000);

        re_save.click();
        Thread.sleep(6000);

    }

    public void setUpload_file() throws InterruptedException {
        Thread.sleep(6000);
        element.click();
        Thread.sleep(6000);

        replace_file.click();
        Thread.sleep(6000);

        upload_file.sendKeys("/home/nisha/Desktop/Result_Account_Reconcilation/Add_Employee.png");
        Thread.sleep(6000);

        replace.click();
    }

    public void setFinance() throws InterruptedException {
        Thread.sleep(6000);
        element.click();
        Thread.sleep(6000);

        move.click();
        Thread.sleep(6000);

        finance.click();
        Thread.sleep(6000);

        move1.click();
    }

    public void setLink() throws InterruptedException {
        Thread.sleep(6000);
        element.click();
        Thread.sleep(6000);

        link.click();
        Thread.sleep(8000);

        add_link.click();
        Thread.sleep(8000);
        fince.click();
        Thread.sleep(6000);
        checkbox.click();
        Thread.sleep(6000);

         link1.click();
        Thread.sleep(6000);

        cencel.click();
    }

    public void setEmail() throws InterruptedException {
        element.click();

        Thread.sleep(6000);

        email.click();
        Thread.sleep(6000);

        email_box.sendKeys(random_name+"gmail.com");
        Thread.sleep(6000);

        cc_text.click();
        Thread.sleep(6000);

        bcc_text.click();
        Thread.sleep(6000);

        CC.sendKeys(random_Second_name+"gmail.com");
        Thread.sleep(6000);

        bcc.sendKeys(name+"gmail.com");
        Thread.sleep(6000);
        subject.click();
        Thread.sleep(6000);

        send.click();
        Thread.sleep(6000);


    }

    public void setExport() throws InterruptedException {
        element.click();

        Thread.sleep(6000);

        file_log.click();
        Thread.sleep(6000);

        export.click();
        Thread.sleep(6000);

    }

    public void setDlt()throws InterruptedException {
        element.click();

        dlt.click();
        Thread.sleep(8000);

        password.click();
        Thread.sleep(9000);

        save.click();

    }
}
