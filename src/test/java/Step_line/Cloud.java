package Step_line;

import Cloud_Pages.Cloud_folder;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cloud  {
    public Cloud_folder Cloud;


    @Then("Click on Cloud")
    public void click_on_Cloud() throws InterruptedException {
        Cloud.setClick_on_cloud();
        Thread.sleep(3000);

    }

    @Then("Click on My Cloud")
    public void click_on_My_Cloud() throws InterruptedException {
        Cloud.setMycloud();
        Thread.sleep(3000);

    }

    @Then("Click on Create Folder Icon")
    public void click_on_Create_Folder_Icon() throws InterruptedException {
        Cloud.setAdd();
        Thread.sleep(3000);
    }
    @When("Create folder pop up opens Name a new Folder")
    public void create_folder_pop_up_opens_Name_a_new_Folder() throws InterruptedException {
        Cloud.setText_box();
    }

    @Then("Click On Create Button")
    public void click_On_Create_Button() throws InterruptedException {
        System.out.println("Click On Create Button");
        Thread.sleep(3000);

    }
    @Then("Verify")
    public void verify() throws InterruptedException {
        System.out.println("verify");
        Thread.sleep(4000);
      //  driver.close();
        Thread.sleep(4000);

    }

}
