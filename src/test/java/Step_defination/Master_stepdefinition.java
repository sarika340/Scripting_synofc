package Step_defination;

import Page_object.*;
import Utilities.Utilities_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Master_stepdefinition  extends Utilities_class
{ String doc1= Utilities_class.randomalphabet(4);
public Guest_user_page Guest;
public Employee_to_company_page emp;
public Register_variable_data_page lp;
public WebDriver driver;
    public Cloud_Create_folder_page Cloud;

public Employee_permission Roles;
public Guest_permission_page pages;
public Assign_Guest_user_page  Assign_Guest;
public Client_to_staff staff;
public Staff_permission permission;


    //...........................................................................................................
//............................Register Varible data..(Client)......................................................
//............................................................................................................
            @Given("I launch chrome browser")
            public void i_launch_chrome_browser() throws InterruptedException {
            System.setProperty("Webdriver.chromeDriver", ".//chromedriver");
            driver = new ChromeDriver();
            Guest=new Guest_user_page(driver);
            pages=new Guest_permission_page(driver);
            emp=new Employee_to_company_page(driver);
            Roles=new Employee_permission(driver);
            staff=new Client_to_staff(driver);
            permission=new Staff_permission(driver);
            lp = new Register_variable_data_page(driver);
            Assign_Guest=new Assign_Guest_user_page(driver);
                Cloud =new Cloud_Create_folder_page(driver);

                System.out.println("launch google page");
            Thread.sleep(2000);
            driver.manage().window().maximize();
        }
        @When("I open Url {string}")
        public void i_open_Url(String string) throws InterruptedException {
            System.out.println(" google page");
            driver.get(string);
            System.out.println("launch the url");
            Thread.sleep(2000);
        }
        @Then("I Click on login button")
        public void i_Click_on_login_button() throws InterruptedException {
            lp.set();
            Assert.assertEquals("SyncOffice" ,driver.getTitle());
            System.out.println("Successfully Syncoffice URL launched");
            Thread.sleep(2000);
        }
        @Then("I enter UserName {string} And Password {string}")
        public void i_enter_UserName_And_Password(String email, String password) throws InterruptedException {
            lp.setusername(email);
            lp.Setpassword(password);
            Thread.sleep(2000);
        }
        @Then("I Click on Login")
        public void i_Click_on_Login() throws InterruptedException {
            lp.setLogin_button();
            Assert.assertEquals("SyncOffice" ,driver.getTitle());
            System.out.println("Syncoffice Home Page Displayed");
            Thread.sleep(2000);
        }
        @Then("Click on masters")
        public void click_on_masters() throws InterruptedException {
            lp.setMaster();
            System.out.println("Click on masters");
            Thread.sleep(2000);
        }
        @Then("click on client should open list")
        public void click_on_client_should_open_list() throws InterruptedException {
            lp.setMouse_over_clint();
            System.out.println("click on client should open list");
            Thread.sleep(2000);
        }
        @Then("click  on Register Varible data")
        public void click_on_Register_Varible_data() throws InterruptedException {
            lp.setClint();
            lp.setRegister();
            System.out.println("click  on Register Varible data");
            Thread.sleep(2000);
        }

        @Then("page {string} should display")
        public void page_should_display(String string) throws InterruptedException {
            Actions actions =new Actions(driver);
            WebElement closeMenuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[1]/div[2]"));
            actions.moveToElement(closeMenuOption).perform();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            System.out.println("page_should_display");
            Thread.sleep(2000);
        }
        @Then("Click on Add button on Register Varible data")
        public void click_on_Add_button_on_Register_Varible_data() throws InterruptedException {
            Thread.sleep(2000);
            lp.setAdd_register();
            System.out.println("Click on Add button on Register Varible data");

        }
        @Then("Registraion value data")
        public void registraion_value_data() throws InterruptedException {
            lp.setRegisteration_value(doc1);
            System.out.println("Registraion value data");
            Thread.sleep(2000);
        }
        @Then("Enter the Doucument name")
        public void enter_the_Doucument_name() throws InterruptedException {
            lp.setDoucument_name(doc1);
            System.out.println("Enter the Doucument name");
            Thread.sleep(2000);
        }
        @Then("Click on save button")
        public void click_on_save_button() throws InterruptedException {
            Boolean result = lp.setSave_button(doc1);
            Assert.assertFalse(result);
        }


 //...........................................................................................................................
//............................Employee_To_Client..(Roles_permission)......................................................
//............................................................................................................
    @Then("Click on Add Employee_To_Client")
    public void click_on_Add_Employee_To_company() {
        driver.findElement(By.xpath("//span[contains(text(),'Employee to Client')]")).click();
        System.out.println("Click on Add Employee_To_Client");

    }
    @Then("Select the Client")
    public void select_the_Client() throws InterruptedException {
        Actions actions =new Actions(driver);
        WebElement closeMenuOption = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]"));
        actions.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on Element");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
    }
    @Then("Select the Location")
    public void select_the_Location() {
       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
        System.out.println("Select the Location");
    }
    @Then("Select the Department")
    public void select_the_Department() {
            System.out.println("Select the Department");
    }
    @Then("click on Staff_to_client")
    public void click_on_Staff_to_client() {
        driver.findElement(By.xpath("//span[contains(text(),'Staff to Client')]\n")).click();
        System.out.println("Select the Location");

    }

    @Then("Select the client in dropdownlist")
    public void select_the_client_in_dropdownlist() {
    }






//...........................................................................................................
//............................ Guest_user..(Guest_user)......................................................
//............................................................................................................
    @Then("click on Guest_user Module")
    public void click_on_Guest_user_Module() throws InterruptedException {
      Guest.setClick_on_Guesruser();
        System.out.println("click on Guest_user Module");

    }
    @Then("click on Guest_user sub module")
    public void click_on_Guest_user_sub_module() {
       Guest.setClick_on_Sub_Guesruser();
        System.out.println("click on Guest_user sub module");

    }
    @Then("Guest user page should display")
    public void guest_user_page_should_display() throws InterruptedException {
                Guest.setGuset_user_page();
       System.out.println("Guest user page should display");
    }
    @Then("click on add button")
    public void click_on_add_button() throws InterruptedException {
            Guest.setClick_on_add_button();
        System.out.println("click on add button");

    }
    @Then("Enter All mendetry fields")
    public void enter_All_mendetry_fields() throws InterruptedException {
                Guest.set_Mandatory_field();
        System.out.println("Enter All mendetry fields");

    }
    @Then("click on save Button and should display successful pop up")
    public void click_on_save_Button_and_should_display_successful_pop_up() {
        System.out.println("click on save Button and should display successful pop up");

    }
     @Then("close the browser")
     public void close_the_browser() {
      driver.close();
     System.out.println("close the browser");

     }



//...........................................................................................................
//............................Employee Permissions..(Roles and permission)......................................................
//............................................................................................................
    @Then("Mouse over on module list")
    public void mouse_over_on_module_list() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div/div/nav/div[3]/div[1]/div[1]/span"));
        actions.moveToElement(menuOption).perform();
        System.out.println("Mouse over on module list");

    }
    @Then("Click on Roles and Permissions tab")
    public void click_on_Roles_and_Permissions_tab() throws InterruptedException {
                Roles.setRole_permission();
                System.out.println("Click on Roles and Permissions tab");

    }

    @Then("Click on the Employee Permissions SubTab")
    public void click_on_the_Employee_Permissions_SubTab() throws InterruptedException {
                Thread.sleep(2000);
     Roles.setEmployee_Permission();
        System.out.println("Click on the Employee Permissions SubTab");

    }
    @When("Search Employee")
    public void search_Employee() throws InterruptedException {
      Roles.setGo();
        System.out.println("Search Employee");

    }
    @Then("select the Read Permission options for Modules")
    public void select_the_Read_Permission_options_for_Modules() throws InterruptedException {
                Roles.setRole_permission();
        System.out.println("select the  Permission options for Modules");

    }
    @Then("Select Modules to apply to the specific Employee")
    public void select_Modules_to_apply_to_the_specific_Employee() throws InterruptedException {
                Roles.setRole_permission();
        System.out.println("Select Modules to apply to the specific Employee");


    }


//........................................................................................
//.........Employee to Company...(ROLES AND PERMISSION)............................................................
// ..........................................................................................
    @Then("Click on Employee to Company")
    public void click_on_Employee_to_Company() throws InterruptedException {
                emp.setEmployee_to_Company();
        System.out.println("Click on Employee to Company");


    }
    @When("Select Employee Company,Departments")
    public void select_Employee_Company_Departments() throws InterruptedException {
        emp.setAll_emp();
        System.out.println("Select all Employee");

        Thread.sleep(3000);
        emp.setAll_company();
        System.out.println("Select all Company");

    }
    @Then("Click On Submit To Assign the Selected Company")
    public void click_On_Submit_To_Assign_the_Selected_Company() throws InterruptedException {
        System.out.println("Click on submit");
        emp.setSubmit();
        System.out.println("Click On Submit To Assign the Selected Company");

    }






//..................................................................................................
//.........Guest User Permission..(Guest User)............................................................
// .................................................................................................
    @Then("Click on  Guest User Permission")
    public void click_on_Guest_User_Permission() throws InterruptedException {
        Thread.sleep(2000);
        pages.setGuest_User_Permission();
        System.out.println("Click on  Guest User Permission");

    }
    @Then("Select the Guest User")
    public void select_the_Guest_User() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement menuOption = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
        actions.moveToElement(menuOption).perform();
        pages.setSearch_Guest();
        System.out.println("Select the Guest User");

    }
    @Then("Select the Permission options")
    public void select_the_Permission_options() throws InterruptedException {
        Thread.sleep(2000);
        pages.setGuest();
        System.out.println("Select the Permission options");

    }
    @Then("Click on Submit")
    public void click_on_Submit() {
        System.out.println("Select the Permission options");

    }






    //..................................................................................................
//......... Assign Guest User..(Guest User)............................................................
// .................................................................................................
    @Then("Click on Assign Guest User submodule")
    public void click_on_Assign_Guest_User_submodule() throws InterruptedException {
                Thread.sleep(3000);
        Assign_Guest.setAssign_user();
        System.out.println("Click on Assign Guest User submodule");
    }

    @Then("Select the Guest User field")
    public void select_the_Guest_User_field() {
System.out.println("guest user");
    }

    @Then("Client, Location\\(s), Department\\(s)")
    public void client_Location_s_Department_s() throws InterruptedException {
                Thread.sleep(3000);
                Assign_Guest.setSearch_Guest();
                System.out.println("Click on search button");
        Assign_Guest.setSingle_guest();
        System.out.println("Select the  Guest ");

        Assign_Guest.setSingle_client();
        System.out.println("Select the Client ");

        Assign_Guest.setSubmit();
        System.out.println("Client on submit button ");

        Thread.sleep(3000);

        Assign_Guest.setAll_guest();
        System.out.println("Select the All Guest ");

        Thread.sleep(3000);
        Assign_Guest.setAll_client();
        System.out.println("Select the All Client ");
        Thread.sleep(3000);

    }
    @Then("click on Submit_button to Assign the CGuest Users to Client")
    public void click_on_Submit_button_to_Assign_the_CGuest_Users_to_Client() throws InterruptedException {
       Assign_Guest.setSubmit();
        System.out.println("Click on submit button ");

    }





    //..................................................................................................
//......... Staff to Client..(Roles and permission)............................................................
// ................................................................................................
    @Then("Click on Staff to Client")
    public void click_on_Staff_to_Client() throws InterruptedException {
                Thread.sleep(5000);
        staff.setStaff_to_client();
        System.out.println("Click on Staff to Client");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()=\"IBM\"]\n")).click();
        System.out.println("Click on Staff to Client");

    }
    @When("Select Client from the list")
    public void select_Client_from_the_list() throws InterruptedException {
      // driver.findElement(By.xpath("//*[text()=\"IBM\"]\n")).click();
        Thread.sleep(4000);
        staff.setDrop_down();
        System.out.println("Select the Client ");
        Thread.sleep(2000);
    }

    @Then("Select Staff to Assign")
    public void select_Staff_to_Assign() throws InterruptedException {
      // driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
        staff.setAll_client();

        Thread.sleep(2000);
    }
    @Then("Select Locations of Selected Client")
    public void select_Locations_of_Selected_Client() throws InterruptedException {
       // driver.findElement(By.xpath("( //*[@type=\"checkbox\"])[4]")).click();
        Thread.sleep(3000);
        staff.setAll_staff();
        System.out.println("Select Locations of Selected Client ");

    }





    //..................................................................................................
//.........Assign the Staff permission..(Roles and permission)............................................................
// ................................................................................................

    @Then("Click on Client Name to give Permissions")
    public void click_on_Client_Name_to_give_Permissions() throws InterruptedException {
        Thread.sleep(2000);

        permission.setPermission();
        System.out.println("Click on Client Name to give Permissions");
    }

    @Then("Select the type of permissions")
    public void select_the_type_of_permissions() throws InterruptedException {
        Thread.sleep(8000);
        permission.setText();
        Thread.sleep(2000);
        permission.setBox();
        System.out.println("Select the type of permissions");

    }

    @Then("Click on Submit Button")
    public void click_on_Submit_Button() {
        System.out.println("Click on Submit Button");

    }








    //..................................................................................................
//.........Cloud..(Click on Cloud)............................................................
// ................................................................................................

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
    public void create_folder_pop_up_opens_Name_a_new_Folder() {
        Cloud.setText_box();
    }

    @Then("Click On Create Button")
    public void click_On_Create_Button() throws InterruptedException {
        System.out.println("Click On Create Button");
        Thread.sleep(3000);


    }

    @Then("Verify")
    public void verify() {
        System.out.println("verify");


    }










}