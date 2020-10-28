package Test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(



        features = "/home/nisha/master_syncoffice/Features/To_Assign_Client_staff_to_Clientstaff",glue = "Step_defination"
       //, monochrome = tru
       // , dryRun = true,
       //  plugin = {"pretty","html:test-output"}
)

public class Testrunner {
}
