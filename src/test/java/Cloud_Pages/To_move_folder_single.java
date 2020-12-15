package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_move_folder_single {
    public WebDriver driver;

    public To_move_folder_single(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement admistration;
    @FindBy(xpath = "//*[text()=\"Functional Exp. 1\"]")
    WebElement function;




    @FindBy(xpath = "(//*[text()=\"Move\"])[2]")
    WebElement move;

    @FindBy(xpath = "(//*[text()=\"Single Folder\"])")
    WebElement single_folder;

    @FindBy(xpath = "(//*[@class=\"mdc-select__native-control customFieldText py-0\"])[9]")
    WebElement To_move;

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement adtration;

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement astration;

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement admistratn;

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement admistrat;

    @FindBy(xpath = "//*[@id=\"UHJvamVjdCBJR0k=/SGVhZCBPZmZpY2U=/VGF4_anchor\"]")
    WebElement admistrn;

}
