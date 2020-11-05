package Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(




        features = "/home/nisha/master_syncoffice/Feature_file/Account_recociliation.feature",glue = "Step_defination"
      // , monochrome = true /*  display the console output in a proper readable format */
       // , dryRun = false,// to check the mapping is between feature file and step definition
     , plugin = {"html:target/cucumber","pretty"}
)
public class Testrunner {
}
