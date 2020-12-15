package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_paste_any_copy_data_page {
    public WebDriver driver;

    public To_paste_any_copy_data_page(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"Functional Exp. 1\"]")
    WebElement function;
    @FindBy(xpath = " (//*[text()=\"More\"])[2]\n")
    WebElement more;
    @FindBy(xpath = " (//*[text()=\"Copy\"])[2]\n")
    WebElement copy;
    @FindBy(xpath = "  (//*[text()=\"Paste\"])\n")
    WebElement paste;
    @FindBy(xpath = "//*[text()=\"Functional Exp. 1 Distress\"]")
    WebElement function1;
    @FindBy(xpath = "")
    WebElement btton;
    @FindBy(xpath = "")
    WebElement bttn;
    @FindBy(xpath = "")
    WebElement tton;
    @FindBy(xpath = "")
    WebElement butto;

    public void setFunction() {
        function.click();
    }

    public void setMore() {
        more.click();
    }

    public void setCopy() {
        copy.click();
    }

    public void setFunction1() throws InterruptedException {
        Actions ac=new Actions(driver);
        ac.contextClick(function1).build().perform();
        Thread.sleep(8000);
       // function1.click();
    }

    public void setPaste() {
        paste.click();
    }
}
