package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sub_ac {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chromeDriver", ".//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syncoffice.com/module-test-dashboard/dashboard");
        System.out.println("launch google page");

        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//*[@class=\"MuiButton-label\"])[1]")).click();
        driver.getTitle();
        System.out.println(driver.getTitle()
        );
        System.out.println("Login");
        driver.findElement(By.xpath("//*[@type='text']\n")).sendKeys("damawalemidc@gmail.com");
        driver.findElement(By.xpath("      //*[@type='password']\n")).sendKeys("Creta_123");

        driver.findElement(By.xpath("//*[text()=\"login\"]")).click();
        System.out.println("click on Login");
        driver.findElement(By.xpath("//*[text()=\"Account Reconciliation\"]")).click();

        driver.findElement(By.xpath("//*[text()=\"account_balance\"]")).click();

        driver.findElement(By.xpath("//*[text()=\"GL Sub Account\"]")).click();

        driver.findElement(By.xpath("(//*[text()=\"add\"])[1]")).click();

       driver.findElement(By.xpath("//*[@name=\"gl_code\"]")).sendKeys("MANI");

      driver.findElement(By.xpath("(//*[@name=\"description\"])[3]")).click();









        //select_gender.click();
        //female.click();
        Thread.sleep(5000);
        System.out.println("4headoffice");

        //select_designation.click();
        Thread.sleep(5000);
       // master.click();
        Thread.sleep(5000);
        System.out.println("1headoffice");

       // select_dept.click();
        Thread.sleep(5000);
       // ms_office.click();
        Thread.sleep(5000);
        System.out.println("2headoffice");

        // select_loc.click();
        Thread.sleep(5000);
        // Head_office.click();
        Thread.sleep(5000);
        System.out.println("headoffice");
        //  js.executeScript("document.master.value=ms_office;");
        // js.executeScript("document.select_loc.click();");



        JavascriptExecutor executor = (JavascriptExecutor) driver;
       // executor.executeScript("arguments[0].click();", select_loc);
        Thread.sleep(5000);

        //executor.executeScript("arguments[0].click();", Head_office);


        //
    }
}