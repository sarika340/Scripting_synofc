package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
public class Client_to_staff {
    public static void main(String[] args) throws InterruptedException {

        //span[contains(text(),'Staff to Client')]
        System.out.println("hello sarika");

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
        driver.findElement(By.xpath("//span[contains(text(),'Staff to Client')]\n")).click();
        Actions actions1 =new Actions(driver);

        WebElement closeMenuOption = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]/input[1]"));
        actions1.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);
        System.out.println("Click on Employee");
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]/input[1]")).click();
    }
}
