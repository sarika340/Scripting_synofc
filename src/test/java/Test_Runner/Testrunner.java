package Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.core.backend.ObjectFactory;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(




        features ="/home/nisha/master_syncoffice/Cloud.features/To_Preview",glue = "Step_defination"
      // , monochrome = true /*  display the console output in a proper readable format */
       , dryRun = false
        //to check the mapping is between feature file and step definition
     , plugin = {"html:target/cucumber-reports","pretty"}
)

public class Testrunner {


}