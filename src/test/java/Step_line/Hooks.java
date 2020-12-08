package Step_line;


import Master_Roles_and_Permission_Page.Register_variable_data_page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends Abstract {
    WebDriver driver = getDriver();
  public Register_variable_data_page lp;
    @Before("@smoke3")
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() throws InterruptedException {
        Thread.sleep(8000);
        System.setProperty("Webdriver.chromeDriver", ".//chromedriver");
        driver = new ChromeDriver();
        System.out.println("launch google page");
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }
    @When("I open Url {string}")
    public void i_open_Url(String string) throws InterruptedException, IOException {
        Thread.sleep(8000);
        driver.get(string);
        System.out.println("launch the url");
        Thread.sleep(2000);

    }
    @Then("I Click on login button")
    public void i_Click_on_login_button() throws InterruptedException {
driver.findElement(By.xpath("//*[text()=\"Sign in\"]")).click();
     //   lp.set();
        Assert.assertEquals("SyncOffice" ,driver.getTitle());
        System.out.println("Successfully Syncoffice URL launched");
        // log.info("Successfully Syncoffice URL launched");


        Thread.sleep(2000);
    }
    @Then("I enter UserName {string} And Password {string}")
    public void i_enter_UserName_And_Password(String email, String password) throws InterruptedException {
driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("damawalemidc@gmail.com");
driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Creta_123");
       // lp.setusername(email);
       // lp.Setpassword(password);
        Thread.sleep(4000);
    }



    @Then("I Click on Login")
    public void i_Click_on_Login() throws InterruptedException {
        //Thread.sleep(8000);
       driver.findElement(By.xpath("(//*[@role=\"button\"])[3]")).click();
    //    lp.setLogin_button();
        Assert.assertEquals("SyncOffice" ,driver.getTitle());
        System.out.println("Syncoffice Home Page Displayed");
        Thread.sleep(2000);

    }




    @After
    public void afterScenario(){

        System.out.println("This will run after the every Scenario");
        // driver.navigate().to("https://www.syncoffice.com/module-test-newmaster/master/cmpLocation");
    }
}
