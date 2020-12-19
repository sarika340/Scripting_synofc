package com.company;

import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class EMmployee_to_company {
       private static ExtentTest test;
        private static boolean flag;
        public static Scenario scenario;
        private static String scenarioName;



        private static  Logger LOGGER= LogManager.getLogger(EMmployee_to_company.class);

        static Logger log = Logger.getLogger(EMmployee_to_company.class.getName());

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello sarika");


        System.setProperty("Webdriver.chromeDriver", ".//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syncoffice.com/module-test-dashboard/dashboard");
        System.out.println("launch google page");
        Thread.sleep(2000);
           // log.info("my name is khan");
          //  log.info("sarika mishra");
          //  LOGGER.info("I am insideSetup");
         //   scenario.write("I am inside tear down");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//*[@class=\"MuiButton-label\"])[1]")).click();
        System.out.println("Login");
        driver.findElement(By.xpath("//*[@type='text']\n")).sendKeys("sarika.mishra@candytechnologies.in");
        driver.findElement(By.xpath("      //*[@type='password']\n")).sendKeys("123456");






        driver.findElement(By.xpath("//*[text()=\"login\"]")).click();
        System.out.println("click on Login");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);

        driver.findElement(By.xpath("//span[contains(text(),'Master')]")).click();
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
        //Mouse hover menuOption 'Employee'
        Thread.sleep(2000);
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Employee' from Menu");
        driver.findElement(By.xpath("//span[contains(text(),'Roles And Permission')]")).click();
        driver.findElement(By.xpath("//*[text()=\"Employee to Company\"]")).click();
        //driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/span[2]")).click();
        WebElement closeMenuOption = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]/input[1]"));
        actions.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type=\"checkbox\"][1]")).click();
        System.out.println("Click on Employee");
        //*[@type="checkbox"])[6]
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[6]")).click();
        //*[text()="Submit"]
        driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();
        System.out.println("Click on submit");

        Thread.sleep(8000);


        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();
        driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[7]")).click();
        driver.findElement(By.xpath("//*[text()=\"Submit\"]")).click();


    }




}