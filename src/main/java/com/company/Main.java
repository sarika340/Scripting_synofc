package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello sarika");

        System.setProperty("Webdriver.chromeDriver", ".//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syncoffice.com/module-test-dashboard/dashboard");
        System.out.println("launch google page");
        Thread.sleep(2000);
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
        driver.findElement(By.xpath("//*[text()=\"Employee Permission\"]")).click();
        WebElement closeMenuOption = driver.findElement(By.xpath("//*[text()=\"Company\"]"));
        actions.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("1111Done M68767ouse hover on 'Employee' from Menu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
        System.out.println("click on Login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("sarika");
        Thread.sleep(2000);

int count=1;
for(int i=1;i<=8;i++)
{
    driver.findElement(By.xpath("(//*[ @type=\"checkbox\" ])["+count+"]")).click();
    System.out.println("click on radio button");

    count =count+4;
}



    }
}
