package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_see_Request_made_bt_logged_emp {
    public WebDriver driver;

    public To_see_Request_made_bt_logged_emp(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-1  d-flex align-items-center\"]")
    WebElement box;
    @FindBy(xpath = "//*[text()=\"Remove\"]")
    WebElement remove;
    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement admitration;
    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement adistration;


    public void setBox() throws InterruptedException {
        box.click();
        Thread.sleep(5000);
    }

    public void setRemove() throws InterruptedException{
        remove.click();
    }
}
