package Step_defination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class onestep {
    public WebDriver driver;


    @Before
    public void start() throws InterruptedException {
        System.setProperty("Webdriver.chromeDriver", ".//chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.syncoffice.com/module-test-dashboard/dashboard");
        Thread.sleep(40000);
        driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();
        Thread.sleep(40000);

        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("damawalemidc@gmail.com");
        Thread.sleep(40000);

        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Creta_123");
        Thread.sleep(40000);

        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("");

        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("");

        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("");

    }
    @After
    public void close()
    {
        driver.close();
    }
}
