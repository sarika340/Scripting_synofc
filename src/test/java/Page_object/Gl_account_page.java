package Page_object;

import Utilities.Utilities_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gl_account_page {

    public WebDriver driver;

    public Gl_account_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_button;
    @FindBy(xpath = "//*[text()=\"account_balance_wallet\"]")
    WebElement mouse;
    @FindBy(xpath = "//*[text()=\"GL Account\"]")
    WebElement gl_account;
    @FindBy(xpath = "//*[text()=\"Account Reconciliation\"]")
    WebElement ac_page;
    @FindBy(xpath = "(//*[text()=\"add\"])[1]")
    WebElement add;
    @FindBy(xpath = "//*[@name=\"gl_code\"]")
    WebElement gl_ode;
    @FindBy(xpath = "(//*[@name=\"description\"])[3]")
    WebElement discription;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement select;
    @FindBy(xpath = "(//div[text()=\"DELL\"])[1]")
    WebElement dell;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement slect_2;
    @FindBy(xpath = "(//div[text()=\"All\"])[1]")
    WebElement all_1;
    @FindBy(xpath = "(//div[text()=\"Select...\"])[1]")
    WebElement slet_2;
    @FindBy(xpath = "(//div[text()=\"All\"])[2]")
    WebElement ALL2_;
    @FindBy(xpath = "//*[@name=\"gl_account_purpose\"]")
    WebElement purpose_;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;

    public void setAc_button() {
        ac_button.click();
    }

    public void setMouse() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouse).perform();
        mouse.isDisplayed();
    }

    public void setGl_account( ) {
        gl_account.click();
    }
    public void setAdd( ) {
        add.click();
    }
    public void setGl_ode() {
        gl_ode.sendKeys(Utilities_class.randomnemeric(7));
    }

    public void setDiscription() {
        discription.sendKeys(Utilities_class.randomalphabet(9));
    }

    public void setDell() throws InterruptedException {
        select.click();
        Thread.sleep(3000);
        dell.click();
        Thread.sleep(3000);
        slect_2.click();
        Thread.sleep(3000);
        all_1.click();
        Thread.sleep(3000);
        slet_2.click();
        Thread.sleep(3000);
        ALL2_.click();
        Thread.sleep(3000);
purpose_.sendKeys(Utilities_class.randomalphabet(9));
save.click();


    }


}
