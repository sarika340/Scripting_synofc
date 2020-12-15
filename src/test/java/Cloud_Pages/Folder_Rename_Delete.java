package Cloud_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Folder_Rename_Delete {
    public WebDriver driver;

    public Folder_Rename_Delete(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[text()=\"Functional Exp. 1\"]")
    WebElement function;
    @FindBy(xpath = "//*[text()=\"New Folder\"]\n")
    WebElement new_folder;
    @FindBy(xpath = "(//*[text()=\"automation\"])")
    WebElement auto;
    @FindBy(xpath = "(//*[text()=\"Rename\"])")
    WebElement rename;
    @FindBy(xpath = "(//*[text()=\"Download\"])[2]")
    WebElement download;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement text_box ;
    @FindBy(xpath = "//*[text()=\"Create\"]")
    WebElement create ;
    @FindBy(xpath = "(//*[@type=\"text\"])[2]")
    WebElement folder_rename ;
    @FindBy(xpath = "//*[text()=\"Rename\"]")
    WebElement click_rename ;
    @FindBy(xpath = "(//*[text()=\"Delete\"])[2]")
    WebElement delete ;
    @FindBy(xpath = "//*[text()=\"Syncoffice\"]")
    WebElement syn ;
    WebElement dete;
    @FindBy(xpath = "//*[@type=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[text()=\"save\"]")
    WebElement save_dlt;
    public void setFunction() throws InterruptedException {
        Thread.sleep(8000);

        Actions ac=new Actions(driver);
        ac.contextClick(function).build().perform();
        Thread.sleep(8000);

    }

    public void setText_box( )throws InterruptedException  {
        new_folder.click();

        Thread.sleep(8000);

        text_box.sendKeys("automation");
        Thread.sleep(8000);

        create.click();
    }

    public void setAuto() throws InterruptedException {
        Thread.sleep(8000);

        Actions ac=new Actions(driver);
        ac.contextClick(auto).build().perform();
        Thread.sleep(8000);
    }

    public void setRename( ) throws InterruptedException {
        rename.click();
        Thread.sleep(8000);


    }

    public void setFolder_rename() throws InterruptedException {
        folder_rename.clear();
        Thread.sleep(8000);

        folder_rename.sendKeys("Syncoffice");
        Thread.sleep(8000);

        click_rename.click();
        Thread.sleep(4000);

    }

    public void setSyn() throws InterruptedException {
        Actions ac=new Actions(driver);
        ac.contextClick(syn).build().perform();
       // delete.click();
        Thread.sleep(8000);
        download.click();

    }
    public void setDelete() throws InterruptedException {
        Thread.sleep(8000);
        Actions ac=new Actions(driver);
        ac.contextClick(syn).build().perform();
        Thread.sleep(8000);

        delete.click();
        Thread.sleep(8000);

        password.sendKeys("Creta_123");
        Thread.sleep(8000);

        save_dlt.click();
        Thread.sleep(5000);

    }


}
