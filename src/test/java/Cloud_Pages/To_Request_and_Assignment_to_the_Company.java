package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_Request_and_Assignment_to_the_Company {
    public WebDriver driver;

    public To_Request_and_Assignment_to_the_Company(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()=\"transfer_within_a_station\"]")
    WebElement assign;
    @FindBy(xpath = "(//*[@type=\"checkbox\"])[2]")
    WebElement chekbox;
    @FindBy(xpath = "//*[text()=\"Save\"]")
    WebElement save;
    @FindBy(xpath = "(//*[text()=\"Request Log\"])")
    WebElement Request;
    @FindBy(xpath = "(//*[text()=\"email\"])[3]")
    WebElement email;
    @FindBy(xpath = "(//*[@class=\"w-100 text-right\"])/span/span/span/input")
    WebElement box;
    @FindBy(xpath = "    //*[text()=\"Approve\"]\n")
    WebElement aprove;
    @FindBy(xpath = "//*[text()=\"Team Log\"]")
    WebElement team;
    @FindBy(xpath = "(//*[text()=\"email\"])[3]")
    WebElement emil;
    //*[text()="Approve"]

    public void setAssign() throws InterruptedException {
        Thread.sleep(8000);

        assign.click();
        Thread.sleep(8000);
        chekbox.click();
        Thread.sleep(8000);
        Thread.sleep(8000);

        save.click();
        Thread.sleep(8000);
        Thread.sleep(8000);

        Request.click();
        Thread.sleep(8000);

        email.click();
        Thread.sleep(8000);

        team.click();
        Thread.sleep(8000);

        box.click();
        Thread.sleep(8000);

        aprove.click();
    }
}
