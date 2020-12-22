package Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import io.cucumber.core.backend.ObjectFactory;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(




        features ="/home/nisha/master_syncoffice/Account_Reconciliation.features/Add_category",glue = "Step_defination"
       , monochrome = true /*  display the console output in a proper readable format */
       , dryRun = false
        //to check the mapping is between feature file and step definition
     , plugin = {"html:target/cucumber-reports","pretty"}
)

public class Testrunner {


}