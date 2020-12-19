package Cloud_Pages;

import Utilities.Utilities_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Email_Selected_file {
    public WebDriver driver;
    public String random_name = Utilities_class.randomalphabet(5);
    public String random_Second_name =Utilities_class.randomalphabet(5);
    public String number =Utilities_class.randomnemeric(5);


    public To_Email_Selected_file(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Functional Exp. 1 Distress\"]")
    WebElement functional;
    @FindBy(xpath = "(//*[text()=\"email\"])[1]")
    WebElement email;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement check_box;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement To_email;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[5]")
    WebElement check;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[3]")
    WebElement zip;
    @FindBy(xpath = "(//*[text()=\"add\"])[3]\n")
    WebElement add;
    @FindBy(xpath = "(//*[text()=\"Financer\"])[4]")
    WebElement finace;
    @FindBy(xpath = "//*[@class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-12 d-flex align-items-center\" ]/div/span")
    WebElement check1;
    @FindBy(xpath = "//*[text()=\"Attach\"]")
    WebElement Attach;
    @FindBy(xpath = "    //*[text()=\"save\"]\n")
    WebElement save;
    @FindBy(xpath = "     //*[@ contenteditable=\"true\"]\n")
    WebElement text;
    //*[@ contenteditable="true"]
    public void setFunctional() throws InterruptedException {
        functional.click();
        Thread.sleep(9000);
        email.click();
        Thread.sleep(9000);

        check_box.click();
        System.out.println("aaaaa");
        Thread.sleep(9000);

        To_email.sendKeys(random_name+"gmail.com");
        Thread.sleep(9000);

        zip.click();
        Thread.sleep(9000);

        check.click();
        Thread.sleep(9000);

        add.click();
        Thread.sleep(9000);

        finace.click();
        Thread.sleep(9000);

        check1.click();
        Thread.sleep(9000);

        Attach.click();
        Thread.sleep(9000);

        save.click();
    }

    //*[text()="save"]
    //*[text()="Attach"]
//(//*[@class="mdc-layout-grid__inner w-100"])[10]/span

}
