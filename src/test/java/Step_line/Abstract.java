package Step_line;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstract {
        protected static WebDriver driver;

        protected WebDriver getDriver(){
            if (driver == null)
            {
                driver = new ChromeDriver();
            }
            return driver;
        }
}
