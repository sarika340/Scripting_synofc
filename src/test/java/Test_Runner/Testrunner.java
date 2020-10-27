package Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "/home/nisha/master_syncoffice/Features/Guest_user_to-client",glue = "Step_defination"
       //, monochrome = true
       // , dryRun = true,
       //  plugin = {"pretty","html:test-output"}
)


public class Testrunner {
}
