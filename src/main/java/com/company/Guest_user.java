package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class
Guest_user {


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
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()=\"login\"]")).click();
        System.out.println("click on Login");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[contains(text(),'Master')]")).click();
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
        actions.moveToElement(menuOption).perform();

        driver.findElement(By.xpath("(//*[text()=\"Guest User\"])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[text()='Guest User'])[2]")).click();
        Thread.sleep(2000);

        WebElement closeMenuOption = driver.findElement(By.xpath("(//*[text()='Guest User'])[3]"));
        actions.moveToElement(closeMenuOption).perform();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()=\"Guest User\"])[3]")).isDisplayed();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()=\"add\"])[5]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[@focusable=\"false\"])[11]"));
        System.out.println("date");
        WebElement element= driver.findElement(By.xpath("(//*[@focusable=\"false\"])[11] "));
       JavascriptExecutor executor = (JavascriptExecutor) driver;
      executor.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@focusable=\"false\"])[11]")).click();

        driver.findElement(By.xpath("//*[text()=\"5\"]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[@focusable=\"false\"])[12]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()=\"26\"]")).click();

       /* Thread.sleep(2000);
        Random random = new Random();
        int a = random.nextInt(3);
        System.out.println(a);

        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
*/

       // WebElement element= driver.findElement(By.xpath("(//*[@focusable=\"false\"])[11] "));
////        JavascriptExecutor executor = (JavascriptExecutor) driver;
////        executor.executeScript("arguments[0].click();", element);
////
    }
}