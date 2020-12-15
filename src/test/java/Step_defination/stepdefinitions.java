 package Step_defination;

import Account_Reconciliation_page.*;
import Cloud_Pages.*;
import Master_GuestUser_page.Assign_Guest_user_page;
import Master_GuestUser_page.Guest_permission_page;
import Master_GuestUser_page.Guest_user_page;
import Master_Roles_and_Permission_Page.*;
import Utilities.Utilities_class;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

 public class stepdefinitions extends Utilities_class {
     String doc1 = Utilities_class.randomalphabet(4);
     public Upload_file up_file;
     public To_preview preview;
     public To_move_folder_single single_folder;
     public Guest_user_page Guest;
     public To_Request_and_Assignment_to_the_Company assign_company;
     public To_see_Request_made_bt_logged_emp dlt_request;
     public Advance_Search ad_search;
     public Employee_to_company_page emp;
     public Register_variable_data_page lp;
     public WebDriver driver;
     public Reco_status_page Reco;
     public Cost_Center_upload_file bulkcost;
     public Management_entity_page entity;
     public Cloud_folder Cloud;
     public To_Zip_Mail_Any_Folder mail;
     public Folder_Rename_Delete f_r_d;
     public To_paste_any_copy_data_page paste;
     public Request_log_of_folder_and_to_Approve_page log;
     public To_Set_the_Limit_to_the_employee_to_Download_and_Upload limit;
     public To_Download_the_file_page dwn_file;
     public Gl_category gl;
     public Cloud_move_file_location move;
     public Download_Reco_Status reco_bulk;
     public Gl_account_Upload_file bulk;
     public Employee_permission Roles;
     public Guest_permission_page pages;
     public Assign_Guest_user_page Assign_Guest;
     public Client_to_staff staff;
     public Staff_permission permission;
     public Gl_account_page Gl_page;
     public sub_GL_account sub_Gl;
     public EMP_Account_Reconcilation emp_role;
     public Cost_center_page cost;
     public Score_page score;
     public Trial_balance_impoter trial;
     public Gl_Category_upload_file bulk_category;
     public Download_Score scoredata;
     public Auto_delete_file auto_dlt;
     //public static Logger log;
     public Cloud_copy_file copy_file;

     public Cloud_move_file_location move_file;
     public Employee_upload_file_RC emp_upload;
     // static Logger log = Logger.getLogger(Master_stepdefinition.class.getName());


     //...........................................................................................................
//............................Register Varible data..(Client)......................................................
//............................................................................................................
     @Given("I launch chrome browser")
     public void i_launch_chrome_browser() throws InterruptedException {
         Thread.sleep(2000);
         System.setProperty("Webdriver.chromeDriver", ".//chromedriver");
         driver = new ChromeDriver();
         Reco = new Reco_status_page(driver);
         dwn_file = new To_Download_the_file_page(driver);
         copy_file = new Cloud_copy_file(driver);
         ad_search = new Advance_Search(driver);
         preview=new To_preview(driver);
         move = new Cloud_move_file_location(driver);
         up_file = new Upload_file(driver);
         paste = new To_paste_any_copy_data_page(driver);
         log = new Request_log_of_folder_and_to_Approve_page(driver);
         emp_upload = new Employee_upload_file_RC(driver);
         bulkcost = new Cost_Center_upload_file(driver);
         gl = new Gl_category(driver);
         emp_role = new EMP_Account_Reconcilation(driver);
         scoredata = new Download_Score(driver);
         Guest = new Guest_user_page(driver);
         single_folder=new To_move_folder_single(driver);
         assign_company=new To_Request_and_Assignment_to_the_Company(driver);
         auto_dlt = new Auto_delete_file(driver);
         pages = new Guest_permission_page(driver);
         reco_bulk = new Download_Reco_Status(driver);
         emp = new Employee_to_company_page(driver);
         Roles = new Employee_permission(driver);
         staff = new Client_to_staff(driver);
         Gl_page = new Gl_account_page(driver);
         score = new Score_page(driver);
         move_file = new Cloud_move_file_location(driver);
         bulk_category = new Gl_Category_upload_file(driver);
         trial = new Trial_balance_impoter(driver);
         permission = new Staff_permission(driver);
         lp = new Register_variable_data_page(driver);
         Assign_Guest = new Assign_Guest_user_page(driver);
         Cloud = new Cloud_folder(driver);
         dlt_request=new To_see_Request_made_bt_logged_emp(driver);
         sub_Gl = new sub_GL_account(driver);
         cost = new Cost_center_page(driver);
         bulk = new Gl_account_Upload_file(driver);
         limit = new To_Set_the_Limit_to_the_employee_to_Download_and_Upload(driver);
         entity = new Management_entity_page(driver);
         f_r_d = new Folder_Rename_Delete(driver);
         System.out.println("launch google page");
         Thread.sleep(2000);
         driver.manage().window().maximize();
     }

     @When("I open Url {string}")
     public void i_open_Url(String string) throws InterruptedException, IOException {
         Thread.sleep(8000);
         driver.get(string);
         System.out.println("launch the url");
         Thread.sleep(2000);
         // junitWriter.write("sarika mishra");

     }

     @Then("I Click on login button")
     public void i_Click_on_login_button() throws InterruptedException {
         // Thread.sleep(8000);

         lp.set();
         Assert.assertEquals("SyncOffice", driver.getTitle());
         System.out.println("Successfully Syncoffice URL launched");
         // log.info("Successfully Syncoffice URL launched");


         Thread.sleep(2000);
     }

     @Then("I enter UserName {string} And Password {string}")
     public void i_enter_UserName_And_Password(String email, String password) throws InterruptedException {
         //Thread.sleep(8000);

         lp.setusername(email);
         lp.Setpassword(password);
         Thread.sleep(4000);
     }

     @Then("I Click on Login")
     public void i_Click_on_Login() throws InterruptedException {
         //Thread.sleep(8000);

         lp.setLogin_button();
         Assert.assertEquals("SyncOffice", driver.getTitle());
         System.out.println("Syncoffice Home Page Displayed");
         Thread.sleep(2000);

     }

     @Then("Click on masters")
     public void click_on_masters() throws InterruptedException {
         lp.setMaster();
         //log.info("Click on masters");
         Thread.sleep(2000);
     }

     @Then("click on client should open list")
     public void click_on_client_should_open_list() throws InterruptedException {
         Thread.sleep(8000);
         lp.setMouse_over_clint();
         System.out.println("click on client should open list");
         Thread.sleep(2000);
     }

     @Then("click  on Register Varible data")
     public void click_on_Register_Varible_data() throws InterruptedException {
         Thread.sleep(4000);
         lp.setClint();
         Thread.sleep(2000);
         lp.setRegister();
         System.out.println("click  on Register Varible data");
         Thread.sleep(2000);

     }

     @Then("page {string} should display")
     public void page_should_display(String string) throws InterruptedException {
         Thread.sleep(8000);
         Actions actions = new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[1]/div[2]"));
         actions.moveToElement(closeMenuOption).perform();
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
         Thread.sleep(8000);
         driver.close();
         Thread.sleep(4000);

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
         Actions actions = new Actions(driver);
         WebElement closeMenuOption = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]"));
         actions.moveToElement(closeMenuOption).perform();
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
     public void select_the_client_in_dropdownlist() throws InterruptedException {
         Thread.sleep(8000);
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);

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
     public void close_the_browser() throws InterruptedException {
         System.out.println("close the browser");
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);
     }


     //...........................................................................................................
//............................Employee Permissions..(Roles and permission)......................................................
//............................................................................................................
     @Then("Mouse over on module list")
     public void mouse_over_on_module_list() throws InterruptedException {
         Actions actions = new Actions(driver);
         Thread.sleep(8000);
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
         System.out.println("select the  Permission options for Modules");

     }

     @Then("Select Modules to apply to the specific Employee")
     public void select_Modules_to_apply_to_the_specific_Employee() throws InterruptedException {
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
         Thread.sleep(4000);
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
     public void click_on_Submit() throws InterruptedException {
         System.out.println("Select the Permission options");
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);

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
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);
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
         Thread.sleep(4000);
         staff.setDrop_down();
         System.out.println("Select the Client ");
         Thread.sleep(2000);
     }

     @Then("Select Staff to Assign")
     public void select_Staff_to_Assign() throws InterruptedException {
         staff.setAll_client();
         Thread.sleep(2000);
     }

     @Then("Select Locations of Selected Client")
     public void select_Locations_of_Selected_Client() throws InterruptedException {
         Thread.sleep(3000);
         staff.setAll_staff();
         System.out.println("Select Locations of Selected Client ");
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);
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
     public void click_on_Submit_Button() throws InterruptedException {
         System.out.println("Click on Submit Button");
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);

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
         driver.close();
         Thread.sleep(4000);

     }


     //..................................................................................................
//...........(Account Reconciliation=Gl account)............................................................
// ..........................................................................................
     @And("Click on Account Reconciliation tab")
     public void clickOnAccountReconciliationTab() throws InterruptedException {
         //  Gl_page.setAc_button();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[text()=\"Account Reconciliation\"]")).click();
         System.out.println("Click on Account Reconciliation");
         Thread.sleep(3000);

     }

     @Then("Click on Account Reconciliation")

     public void click_on_Account_Reconciliation() throws InterruptedException {
         Gl_page.setAc_button();
         Thread.sleep(3000);
         System.out.println("Click on Account Reconciliation");

     }

     @Then("Hover on Right Side panel")
     public void hover_on_Right_Side_panel() throws InterruptedException {
         Gl_page.setMouse();
         Thread.sleep(3000);
         System.out.println("Hover on Right Side panel");


     }

     @Then("Click on GL Account")
     public void click_on_GL_Account() throws InterruptedException {
         System.out.println("Click on GL Account");
     }


     @Then("Click on Add Button on View GL Account")
     public void click_on_Add_Button_on_View_GL_Account() throws InterruptedException {
         Thread.sleep(3000);
         Gl_page.setAdd();
         System.out.println("Click on Add Button on View GL Account");

     }


     @When("Enter GL Account Code")
     public void enter_GL_Account_Code() throws InterruptedException {
         Thread.sleep(3000);
         Gl_page.setGl_ode();
         Thread.sleep(3000);
         System.out.println("Enter GL Account Code");

     }


     @When("Enter GL Description")
     public void enter_GL_Description() throws InterruptedException {
         Thread.sleep(3000);
         System.out.println("Enter GL Description");
         Thread.sleep(3000);
     }

     @When("Enter All mendetry fields on Gl Category")
     public void enter_All_mendetry_fields_on_Gl_Category() throws InterruptedException {
         Gl_page.setCircle();
         System.out.println("Enter All mendetry fields on Gl Category");
         Thread.sleep(3000);
     }

     @When("Click on Add button on Legal Entity")
     public void click_on_Add_button_on_Legal_Entity() {
         System.out.println("Click on Add button on Legal Entity");

     }

     @When("Enter All mendetry fields on Legal Entity")
     public void enter_All_mendetry_fields_on_Legal_Entity() throws InterruptedException {
         Gl_page.setCircle1();
         Thread.sleep(3000);
         System.out.println("Enter All mendetry fields on Legal Entity");

     }

     @And("Click on Gl Save Button")
     public void clickOnGlSaveButton() {
         System.out.println("Click on Gl Save Button");

     }


     @When("Click on Add button on Managment Entity")
     public void click_on_Add_button_on_Managment_Entity() {
         System.out.println("Click on Add button on Managment Entity");

     }

     @When("Enter All mendetry fields on Managment Entity")
     public void enter_All_mendetry_fields_on_Managment_Entity() throws InterruptedException {
         Gl_page.setCircle2();
         System.out.println("Enter All mendetry fields on Managment Entity");

     }

     @And("Enter Gl Category, Legal Entity,Managment Entity")
     public void enterGlCategoryLegalEntityManagmentEntity() {
         System.out.println("Enter Gl Category, Legal Entity,Managment Entity");

     }

     @When("Search GL Account which is currently added")
     public void search_GL_Account_which_is_currently_added() {
         System.out.println("Search GL Account which is currently added");

     }

     @When("Delete GL Account")
     public void delete_GL_Account() {
         System.out.println("Delete GL Account");

     }


     @When("save and verify")
     public void save_and_verify() {
         System.out.println("save and verify");
     }


     //..................................................................................................
//...........(Account Reconciliation)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel GL Category")
     public void hover_on_Right_Side_panel_GL_Category() throws InterruptedException {
         gl.setMouse_over();
         System.out.println("Hover on Right Side panel GL Category");
         Thread.sleep(3000);

     }

     @Then("Click on GL Category")
     public void click_on_GL_Category() throws InterruptedException {
         gl.setGl_page();
         Thread.sleep(3000);
         System.out.println("Click on GL Category");

     }

     @Then("Click on Add Button on GL Category")
     public void click_on_Add_Button_on_GL_Category() {
         System.out.println("Click on Add Button on GL Category");
     }

     @Then("Enter Name on Add Account Category Drawer")
     public void enter_Name_on_Add_Account_Category_Drawer() throws InterruptedException {
         gl.setName();
         System.out.println("Enter Description on Account Category Drawer");

     }

     @Then("Enter Description on Account Category Drawer")
     public void enter_Description_on_Account_Category_Drawer() throws InterruptedException {
         System.out.println("Enter Description on Account Category Drawer");
     }

     @Then("save Gl category")
     public void save_Gl_category() {
         System.out.println("save Gl category");

     }

     @Then("Search Gl category which is currently added")
     public void search_Gl_category_which_is_currently_added() {
         System.out.println("Search Gl category which is currently added");

     }

     @Then("Delete Gl category")
     public void delete_Gl_category() throws InterruptedException {
         System.out.println("Delete Gl category");
         Thread.sleep(4000);
         driver.close();
         Thread.sleep(4000);

     }


     //..................................................................................................
//...........(Account Reconciliation)............................................................
// ..........................................................................................

     @When("Click on Management Entity’s Add button")
     public void click_on_Management_Entity_s_Add_button() throws InterruptedException {
         //                entity=new Management_entity_page(driver);
         Thread.sleep(2000);
         entity.setAdd_mangement();
         Thread.sleep(2000);
         System.out.println("Click on Management Entity’s Add button");

     }

     @When("Select Legal Entity to assign a Management entity with")
     public void select_Legal_Entity_to_assign_a_Management_entity_with() throws InterruptedException {
         entity.setSelect();
         Thread.sleep(2000);
         entity.setMicrosoft();
         System.out.println("Select Legal Entity to assign a Management entity with");

     }

     @When("Enter Name which should be associated with")
     public void enter_Name_which_should_be_associated_with() {
         entity.setName();
         System.out.println("Enter Name which should be associated with");

     }

     @When("Enter Code")
     public void enter_Code() {
         entity.setCode();
         System.out.println("Enter Code");

     }

     @Then("Enter the Description")
     public void enter_the_Description() throws InterruptedException {
         entity.setDescription();
         entity.setSave();
         System.out.println("Enter the Description");

     }

     @Then("varify the page")
     public void varify_the_page() {
         System.out.println("varify");
     }

     @Then("Click on GL_Entity_page")
     public void click_on_GL_Entity_page() {

         System.out.println("Click on GL_Entity_page");
     }

     @Then("Fill all the mandatory field And should enable save  button")
     public void fill_all_the_mandatory_field_And_should_enable_save_button() throws InterruptedException {
         entity.mendtory_fields();
         Thread.sleep(4000);
         System.out.println("Fill all the mandatory field And should enable save  button");
         driver.close();
     }


     //..................................................................................................
//...........(Account Sub Reconciliation)............................................................
// ..........................................................................................

     @Then("Hover on Sub GL Account")
     public void hover_on_Sub_GL_Account() throws InterruptedException {
         Thread.sleep(6000);
         sub_Gl.setAccount_balance();
         Thread.sleep(3000);
     }

     @Then("Click on Sub GL Account")
     public void click_on_Sub_GL_Account() throws InterruptedException {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Click on Add Button on View sub GL Account")
     public void click_on_Add_Button_on_View_sub_GL_Account() throws InterruptedException {
         System.out.println("Enter GL_Description Sub GL Account");
     }

     @Then("Select the  Gl Account")
     public void select_the_Gl_Account() throws InterruptedException {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Enter Name which should be associated_with Sub GL Account")
     public void enter_Name_which_should_be_associated_with_Sub_GL_Account() {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Enter GL_Description Sub GL Account")
     public void enter_GL_Description_Sub_GL_Account() throws InterruptedException {
         sub_Gl.setPurpose();
         System.out.println("Enter GL_Description Sub GL Account");
     }

     @Then("Select on cost center Sub GL Account")
     public void select_on_cost_center_Sub_GL_Account() {
         System.out.println("Enter GL_Description Sub GL Account");

     }

     @Then("Select Legal Entity to assign a Management entity with_sub Gl account")
     public void select_Legal_Entity_to_assign_a_Management_entity_with_sub_Gl_account() {
         System.out.println("Select Legal Entity to assign a Management entity with_sub Gl account");

     }

     @Then("Select on Management Entity’s Sub GL Account")
     public void select_on_Management_Entity_s_Sub_GL_Account() {
         System.out.println("Select on Management Entity’s Sub GL Account");

     }

     @Then("Enter Base currency nd Risk category")
     public void enter_Base_currency_nd_Risk_category() {
         System.out.println("Enter Base currency nd Risk category");

     }

     @Then("Enter Amount range")
     public void enter_Amount_range() {
         System.out.println("Enter Amount range");

     }

     @Then("Enter the Account Purpose")
     public void enter_the_Account_Purpose() {
         System.out.println("Enter the Account Purpose");

     }

     @Then("Enter the JVM FLOW")
     public void enter_the_JVM_FLOW() {
         System.out.println("Enter the JVM FLOW");

     }

     @Then("Save the sub Gl account")
     public void save_the_sub_Gl_account() {
         System.out.println("Save the sub Gl account");

     }

     @Then("Search sub Gl account which is currently added")
     public void search_sub_Gl_account_which_is_currently_added() {
         System.out.println("Search sub Gl account which is currently added");

     }

     @Then("Delete sub Gl account")
     public void delete_sub_Gl_account() {
         System.out.println("Delete sub Gl account");
         driver.close();

     }


     //..................................................................................................
//...........(Account Employee)............................................................
// ..........................................................................................

     @Then("Hover on Right Side panel Employee")
     public void hover_on_Right_Side_panel_Employee() {
         emp_role = new EMP_Account_Reconcilation(driver);
         emp_role.setMouse();
         System.out.println("Enter the JVM FLOW");

     }

     @Then("Click on Employee")
     public void click_on_Employee() throws InterruptedException {
         emp_role.setEmp();
         emp_role.setAdd();
         System.out.println("Enter the JVM FLOW");


     }

     @Then("Click on Add Icon on Add Employee Drawer")
     public void click_on_Add_Icon_on_Add_Employee_Drawer() throws InterruptedException {
         System.out.println("Select Legal Entity to add the Employee in");

     }

     @Then("Enter First Middle and Last Name")
     public void enter_First_Middle_and_Last_Name() throws InterruptedException {
         emp_role.setFirstclass();
         System.out.println("Enter the JVM FLOW");

     }

     @Then("Select Legal Entity to add the Employee in")
     public void select_Legal_Entity_to_add_the_Employee_in() {
         System.out.println("Select Legal Entity to add the Employee in");

     }

     @Then("Enter the Badge Code")
     public void enter_the_Badge_Code() {
         System.out.println("Enter the Badge Code");


     }

     @Then("Click and Select the Date of Joining")
     public void click_and_Select_the_Date_of_Joining() throws InterruptedException {
         emp_role.setDOB();
         System.out.println("Click and Select the Date of Joining");

     }

     @And("Click and Select the Date of Birth Official and Actual")
     public void clickAndSelectTheDateOfBirthOfficialAndActual() {
         System.out.println("Click and Select the Date of Birth \\( Official and Actual )");

     }

     @Then("Select the Gender")
     public void select_the_Gender() throws InterruptedException {
         emp_role.setFemale();
         System.out.println("Select the Gender");

     }

     @Then("Select the Department to Assign with Employee")
     public void select_the_Department_to_Assign_with_Employee() {
         System.out.println("Enter the Badge Code");

     }

     @Then("Select the Designation to Assign with Employee")
     public void select_the_Designation_to_Assign_with_Employee() {
         System.out.println("Select the Designation to Assign with Employee");

     }

     @Then("Select the Location to Assign with Employee")
     public void select_the_Location_to_Assign_with_Employee() {
         System.out.println("Select the Location to Assign with Employee");

     }

     @Then("Enter the Mobile Number")
     public void enter_the_Mobile_Number() {
         System.out.println("Enter the Mobile Number");

     }

     @Then("Enter the Official Email")
     public void enter_the_Official_Email() {
         System.out.println("Enter the Official Email");

     }

     @Then("Click on Save")
     public void click_on_Save() throws InterruptedException {
         System.out.println("Click on Save");

     }


     //..................................................................................................
//...........(Trial balance)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel Trial Balance")
     public void hover_on_Right_Side_panel_Trial_Balance() throws InterruptedException {
         trial.setArrow();
     }

     @Then("Click on Trial Balance Importer")
     public void click_on_Trial_Balance_Importer() {
         System.out.println("Click on Trial Balance Importer");

     }

     @Then("Click on Download sample file")
     public void click_on_Download_sample_file() {
         System.out.println("Click on Download sample file");

     }

     @Then("Select Legal Entity for Trial Balance")
     public void select_Legal_Entity_for_Trial_Balance() {
         System.out.println("Click on Download sample file");
     }


     @Then("Select Management Entity \\(Which will shows you assigned to Legal Entity)")
     public void select_Management_Entity_Which_will_shows_you_assigned_to_Legal_Entity() {
         System.out.println("Select Management Entity \\(Which will shows you assigned to Legal Entity)");
     }

     @Then("Select the Range of Period")
     public void select_the_Range_of_Period() throws InterruptedException {
         trial.setDate();
         System.out.println("Select the Range of Period");
     }

     @Then("Click on upload \\(After adding the records into it)")
     public void click_on_upload_After_adding_the_records_into_it() throws InterruptedException {
         trial.setFile();
         System.out.println("Enter the Badge Code");

     }

     @Then("Click on Save and verify Trial Balance")
     public void click_on_Save_and_verify_Trial_Balance() throws InterruptedException {
         trial.setSave();
     }

     @Then("Search Trial Balance which is currently added")
     public void search_Trial_Balance_which_is_currently_added() {
         System.out.println("Search Trial Balance which is currently added");

     }

     @Then("Delete Trial Balance")
     public void delete_Trial_Balance() {
         System.out.println("Enter the Badge Code");

     }


     @Then("Click on sub GL Account")
     public void click_on_sub_GL_Account() {
         System.out.println("Click on sub GL Account");  // Write code here that turns the phrase above into concrete actions
     }

     @Then("Click on Import Icon on View sub GL Account")
     public void click_on_Import_Icon_on_View_sub_GL_Account() {
         System.out.println("Click on Import Icon on View sub GL Account");
     }

     @Then("Verify  sub GL Account file")
     public void verify_sub_GL_Account_file() {
         System.out.println("Verify  sub GL Account file");

     }


     //..................................................................................................
//...........(GL Account upload data)............................................................
// ..........................................................................................
     @Then("Click on Import Icon on View GL Account")
     public void click_on_Import_Icon_on_View_GL_Account() throws InterruptedException {
         bulk.setCloud();
         System.out.println("Click on Import Icon on View GL Account");

     }

     @Then("Select the file from the list")
     public void select_the_file_from_the_list() {
         System.out.println("Select the file from the list");

     }

     @Then("Click on Save Button")
     public void click_on_Save_Button() {
         System.out.println("Select the file from the list");

     }

     @Then("Save file data")
     public void save_file_data() {
         System.out.println("Select the file from the list");
     }

     @Then("Verify  GLaccount file")
     public void verify_GLaccount_file() {
         System.out.println("Select the file from the list");
     }


     //..................................................................................................
//...........(GL Category bulk data)............................................................
// ..........................................................................................
     @Then("Click on GL Category bulk data")
     public void click_on_GL_Category_bulk_data() throws InterruptedException {
         bulk_category = new Gl_Category_upload_file(driver);
         bulk_category.setMouse_over(); // Write code here that turns the phrase above into concrete actions
     }

     @Then("Click on Import Icon on View GL Category")
     public void click_on_Import_Icon_on_View_GL_Category() throws InterruptedException {
         //  bulk_category.setCloud();// Write code here that turns the phrase above into concrete actions
     }

     @Then("Select the file from the GL Category list")
     public void select_the_file_from_the_GL_Category_list() {
         System.out.println("Select the file from the list");
     }

     @Then("Click on Save Button on GL Category")
     public void click_on_Save_Button_on_GL_Category() {
         System.out.println("Click on Save Button on GL Category");

     }

     @Then("Save  data on GL Category")
     public void save_data_on_GL_Category() {
         System.out.println("Save  data on GL Category");
     }

     @Then("Search Gl category file which is currently added")
     public void search_Gl_category_file_which_is_currently_added() {
         System.out.println("Search Gl category file which is currently add");

     }

     @Then("Delete Gl category file")
     public void delete_Gl_category_file() {
         System.out.println("Delete Gl category file");

     }

     @Then("Verify upload file")
     public void verify_upload_file() {
         System.out.println("Verify upload file");
     }


     //..................................................................................................
//...........(Cost Center)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel Cost Center")
     public void hover_on_Right_Side_panel_Cost_Center() throws InterruptedException {
         cost = new Cost_center_page(driver);
         //  cost.setMouse();
         System.out.println("Hover on Right Side panel Cost Center");


     }

     @Then("Click on Cost Center")
     public void click_on_Cost_Center() throws InterruptedException {
         cost.setCost();
         Thread.sleep(3000);

         System.out.println("Click on Cost Centre");
     }

     @Then("Click on Add Button on View Cost Center")
     public void click_on_Add_Button_on_View_Cost_Center() throws InterruptedException {
         System.out.println("Click on Add Button on View Cost Center");

     }

     @Then("Enter Code on Cost Center")
     public void enter_Code_on_Cost_Center() throws InterruptedException {
         cost.setAdd(); // cost.setCode();
         System.out.println("Enter Code on Cost Center");


     }

     @Then("Enter Enter Description on Cost Center")
     public void enter_Enter_Description_on_Cost_Center() throws InterruptedException {
         cost.setDecription();
         System.out.println("Enter Enter Description on Cost Center");

     }

     @Then("Enter Remarks on Cost Center")
     public void enter_Remarks_on_Cost_Center() throws InterruptedException {
         cost.setRemark();
         System.out.println("Enter Remarks on Cost Center");

     }

     @Then("Click on Save on Cost Center")
     public void click_on_Save_on_Cost_Center() throws InterruptedException {
         cost.setSave();
         System.out.println("Click on Save on Cost Center");
     }

     @Then("Search Cost Centre  which is currently added")
     public void search_Cost_Centre_which_is_currently_added() throws InterruptedException {
         cost.setSearch();
         System.out.println("Search Cost Centre  which is currently added");

     }

     @Then("Delete Cost Centre")
     public void delete_Cost_Centre() throws InterruptedException {
         System.out.println("Delete Cost Centre");

     }


     //..................................................................................................
//...........(Reco  reco status)............................................................
// ..........................................................................................

     @Then("Click on Settings")
     public void click_on_Settings() throws InterruptedException {
         Reco.setSetting();
     }

     @Then("Click on Reco Status Pane")
     public void click_on_Reco_Status_Pane() throws InterruptedException {
         Reco.setreconame();

     }

     @Then("Click on Add button on View Reco Status")
     public void click_on_Add_button_on_View_Reco_Status() throws InterruptedException {
         Reco.setSearch();

     }

     @Then("Enter the Name on Reco Status")
     public void enter_the_Name_on_Reco_Status() {
         System.out.println("Enter the Name on Reco Status");


     }

     @Then("Enter the Description on Reco Status")
     public void enter_the_Description_on_Reco_Status() {
         System.out.println("Enter the Description on Reco Status");

     }

     @Then("Click on Save Button on Reco Status")
     public void click_on_Save_Button_on_Reco_Status() {
         System.out.println("Click on Save Button on Reco Status");

     }


     //..................................................................................................
//...........(score pane)............................................................
// ..........................................................................................
     @Then("Click on Settings Score")
     public void click_on_Settings_Score() throws InterruptedException {
         score.setSetting();
         System.out.println("Click on Settings Score");


     }

     @Then("Click on Score Pane")
     public void click_on_Score_Pane() throws InterruptedException {
         System.out.println("Click on Score Pane");

     }

     @Then("Click on Add button on View Score")
     public void click_on_Add_button_on_View_Score() {
         System.out.println("Click on Add button on View Score");

     }

     @Then("Enter the Name")
     public void enter_the_Name() {
         System.out.println("Enter the Name");

     }

     @Then("Enter the Description Score")
     public void enter_the_Description_Score() {
         System.out.println("Enter the Description Score");

     }

     @Then("Click on Score Save Button")
     public void clickOnScoreSaveButton() {
         System.out.println("Click on Score Save Button");

     }

     @And("Search Score  which is currently added")
     public void searchScoreWhichIsCurrentlyAdded() {
         System.out.println("Search Score  which is currently added");

     }

     @And("Delete Score")
     public void deleteScore() {
         System.out.println("Delete Score");

     }


     //..................................................................................................
//...........(cost center upload data)............................................................
// ..........................................................................................
     @Then("Hover on Right Side panel Setting \\(Cost Centre)")
     public void hover_on_Right_Side_panel_Setting_Cost_Centre() throws InterruptedException {
         bulkcost.setMouse();
     }

     @Then("Click on Import Icon on View Cost Centre")
     public void click_on_Import_Icon_on_View_Cost_Centre() throws InterruptedException {
         System.out.println("Click on Import Icon on View Cost Centre");
     }

     @Then("Select the file from the list for Cost Centre")
     public void select_the_file_from_the_list_for_Cost_Centre() {
         System.out.println("Select the file from the list for Cost Centre");
     }

     @Then("Click on Save Button on Cost Centre")
     public void click_on_Save_Button_on_Cost_Centre() {
         System.out.println("Click on Save Button on Cost Centre");

     }

     @Then("Search Cost Centre file which is currently added")
     public void search_Cost_Centre_file_which_is_currently_added() {
         System.out.println("Search Cost Centre file which is currently added");

     }

     @Then("Delete Cost Centre file")
     public void delete_Cost_Centre_file() {
         System.out.println("Delete Cost Centre file");

     }


     //..................................................................................................
//...........(Reco and download reco status  data)............................................................
// ..........................................................................................
     @Then("Click on Reco Status")
     public void click_on_Reco_Status() throws InterruptedException {
         reco_bulk.setSetting();
     }

     @Then("Click on Import Icon on View Reco Status")
     public void click_on_Import_Icon_on_View_Reco_Status() throws InterruptedException {
         Thread.sleep(3000);
         System.out.println("Click on Import Icon on View Reco Status");
     }

     @Then("Select the file from the Reco Status list")
     public void select_the_file_from_the_Reco_Status_list() throws InterruptedException {
         System.out.println("Select the file from the Reco Status list");

     }

     @Then("Click on Download button")
     public void click_on_Download_button() {
         System.out.println("Click on Download button");
     }


     //..................................................................................................
//...........(score download)............................................................
// ..........................................................................................

     @Then("Click on Settings Score download data")
     public void click_on_Settings_Score_download_data() throws InterruptedException {
         scoredata.setSetting();
         System.out.println("Click on Settings Score download data");
     }

     @Then("Click on Import Icon on View Score")
     public void click_on_Import_Icon_on_View_Score() {
         System.out.println("Click on Import Icon on View Score");
     }

     @Then("Select the file from the list download")
     public void select_the_file_from_the_list_download() {
         System.out.println("Select the file from the list download");
     }


     //..................................................................................................
//...........(Employee tab)............................................................
// ..........................................................................................

     @Then("Click on  Employee tab")
     public void click_on_Employee_tab() throws InterruptedException {
         emp_upload = new Employee_upload_file_RC(driver);
         emp_upload.setFile();
         System.out.println("Click on  Employee tab");

     }

     @Then("Click on Import Icon on View  Employee tab")
     public void click_on_Import_Icon_on_View_Employee_tab() {
         System.out.println("Click on Import Icon on View  Employee tab");

     }

     @Then("Verify  Employee file")
     public void verify_Employee_file() {
         driver.close();
         System.out.println("Verify  Employee file");

     }


     @And("Search Reco Status which is currently added")
     public void searchRecoStatusWhichIsCurrentlyAdded() {
         System.out.println("Search Reco Status which is currently added");

     }

     @And("Delete Reco Status")
     public void deleteRecoStatus() {
         System.out.println("Delete Reco Status");

     }


     //..................................................................................................
//...........(Cloud files to  move )............................................................
// ..........................................................................................

     @And("Select files to Move")
     public void selectFilesToMove() throws InterruptedException {
         System.out.println("Select files to Move");
         move.setMs();
     }

     @And("Click on Move Icon")
     public void clickOnMoveIcon() throws InterruptedException {
         System.out.println("Click on Move Icon");
         move.setButton();
     }

     @When("Move Files drawer opens up Select the Location")
     public void moveFilesDrawerOpensUpSelectTheLocation() throws InterruptedException {
         System.out.println("Move Files drawer opens up Select the Location");

         move.setDrop_down();
     }

     @And("Click On Move button")
     public void clickOnMoveButton() {
         System.out.println("Click On Move button");
         move.setSave();
     }


     //..................................................................................................
//...........(Cloud files to  copy )............................................................
// ..........................................................................................
     @Then("Select files to Copy")
     public void select_files_to_Copy() throws InterruptedException {
         copy_file.setMs();
         System.out.println("Select files to Copy");

     }

     @Then("Click on Copy Icon")
     public void click_on_Copy_Icon() throws InterruptedException {
         copy_file.setSearch();
         System.out.println("Click on Copy Icon");

     }

     @When("Copy Files drawer opens up Select the Location")
     public void copy_Files_drawer_opens_up_Select_the_Location() throws InterruptedException {
         copy_file.setButton();
         System.out.println("Copy Files drawer opens up Select the Location");

     }

     @When("Click On Copy button")
     public void click_On_Copy_button() throws InterruptedException {
         Thread.sleep(3000);

         copy_file.setCopy();
         Thread.sleep(3000);

         copy_file.setDrop_down();
         Thread.sleep(3000);
         copy_file.setSave();
         System.out.println("Click On Copy button");


     }

     @And("Click On save")
     public void clickOnSave() {
         System.out.println("Click On save");
     }

     @And("Search copy file which is currently added")
     public void searchCopyFileWhichIsCurrentlyAdded() {
         System.out.println("Search copy file which is currently added");

     }

     @And("Delete file")
     public void deleteFile() {
         System.out.println("Delete file");

     }


     //..................................................................................................
//...........(Cloud files to  restore )............................................................
// ..........................................................................................

     @And("Click on Restore Icon")
     public void clickOnRestoreIcon() throws InterruptedException {
         auto_dlt.setMs();
     }

     @When("Restore Drawer opens up then Enter the Days Cycle to Delete the Files")
     public void restoreDrawerOpensUpThenEnterTheDaysCycleToDeleteTheFiles() {
         System.out.println("Delete file");

     }


     //..................................................................................................
//...........(Cloud files to  restore )............................................................
// ..........................................................................................
     @And("Select files to Download")
     public void selectFilesToDownload() throws InterruptedException {
         dwn_file.setAdmistration();
         Thread.sleep(3000);
         dwn_file.setSerach();
     }

     @And("Click on Download Icon")
     public void clickOnDownloadIcon() throws InterruptedException {
         Thread.sleep(5000);
         dwn_file.setCheck_box();
     }

     @Then("Verify the cloud Download")
     public void verifyTheCloudDownload() throws InterruptedException {
         Thread.sleep(5000);
         dwn_file.setDownload();
     }


     //..................................................................................................
//...........(Cloud Limit Icon )............................................................
// ..........................................................................................

     @And("Click on Limit Icon")
     public void clickOnLimitIcon() throws InterruptedException {
         limit.setAdmistration();
         Thread.sleep(4000);
         limit.setLimit();
         Thread.sleep(9000);
     }

     @When("Select the data Range to upload and Download in Upload Limit and Download Limit")
     public void selectTheDataRangeToUploadAndDownloadInUploadLimitAndDownloadLimit() throws InterruptedException {
         limit.setSearch();
         Thread.sleep(4000);
     }

     @Then("Select the Data Unit")
     public void selectTheDataUnit() throws InterruptedException {
         limit.setBox();
         Thread.sleep(4000);
     }

     @And("Seact the File Type")
     public void seactTheFileType() throws InterruptedException {
         limit.setGB();
         Thread.sleep(4000);
     }

     @Then("Select the Select the employees to Apply the Data count")
     public void selectTheSelectTheEmployeesToApplyTheDataCount() throws InterruptedException {
         limit.setDownload();
         Thread.sleep(4000);
     }


     @Then("Click on Limit Button to Use common Selection for Multiple and Select Employee")
     public void clickOnLimitButtonToUseCommonSelectionForMultipleAndSelectEmployee() throws InterruptedException {
         limit.setGB1();
         Thread.sleep(4000);
     }

     @Then("Click on Save button")
     public void clickOnSaveButton() throws InterruptedException {
         limit.setLimit2();
         Thread.sleep(8000);
     }

     @Then("Verify Limit option")
     public void verifyLimitOption() throws InterruptedException {
         limit.setUpload_limit();
         Thread.sleep(6000);
         limit.setDownload_limit();
         Thread.sleep(4000);
     }


     //..................................................................................................
//...........(Cloud mail Icon )............................................................
// ..........................................................................................


     @Then("Select files to send")
     public void select_files_to_send() {

     }

     @Then("Click on Email Icon")
     public void click_on_Email_Icon() {

     }

     @When("Email Files drawer opens up and Add To email")
     public void email_Files_drawer_opens_up_and_Add_To_email() {

     }

     @Then("Click on CC and BCC to add the other Email Recipients")
     public void click_on_CC_and_BCC_to_add_the_other_Email_Recipients() {

     }

     @Then("Enter Matter to send with file")
     public void enter_Matter_to_send_with_file() {

     }

     @Then("Click on Zip to ZIp Or Unzip files")
     public void click_on_Zip_to_ZIp_Or_Unzip_files() {

     }

     @Then("Click On Add button on drawer to add files")
     public void click_On_Add_button_on_drawer_to_add_files() {

     }

     @Then("Click On Remove button on drawer to Remove files")
     public void click_On_Remove_button_on_drawer_to_Remove_files() {

     }

     @Then("Click on Send")
     public void click_on_Send() {

     }


     //..................................................................................................
//...........(Cloud Upload Icon )............................................................
// ..........................................................................................
     @Then("Click on Upload")
     public void click_on_Upload() {
         up_file.setAdmistration();
     }

     @Then("Click on Upload Folder")
     public void click_on_Upload_Folder() throws InterruptedException {
         up_file.setClick_on_upload();

     }

     @Then("Select the Folder")
     public void select_the_Folder() throws InterruptedException {
         up_file.setFile();

     }

     @Then("Click on Upload button")
     public void click_on_Upload_button() throws InterruptedException {
         up_file.setUpload();
         Thread.sleep(5000);

     }

     @Then("Search Upload file which is currently added\\(Cloud)")
     public void search_Upload_file_which_is_currently_added_Cloud() throws InterruptedException {
         up_file.setFince();
         Thread.sleep(5000);
     }

     @Then("Click On Delete button")
     public void click_On_Delete_button() throws InterruptedException {
         up_file.setSearch();
         Thread.sleep(5000);
     }

     @Then("Delete Pop up opens up Enter the Password")
     public void delete_Pop_up_opens_up_Enter_the_Password() throws InterruptedException {
         up_file.setButton();
         Thread.sleep(5000);
     }

     @Then("Click on the DeleteButton")
     public void click_on_the_DeleteButton() throws InterruptedException {
         up_file.setDelete();

     }


     //..................................................................................................
//...........(Cloud Advance_Search Icon )............................................................
// ..........................................................................................


     @Then("Select the Files")
     public void selectTheFiles() throws InterruptedException {
         ad_search.setMs();
     }

     @And("Click on Advance Search Icon")
     public void clickOnAdvanceSearchIcon() throws InterruptedException {
         ad_search.setBox();
     }

     @When("Advance Search Page opens up then Select then Search File Name")
     public void advanceSearchPageOpensUpThenSelectThenSearchFileName() throws InterruptedException {
         ad_search.setSearch();

     }

     @Then("Select the Date Range")
     public void selectTheDateRange() throws InterruptedException {
         ad_search.setFile_name();
         //ad_search.setSep();
     }

     @And("Seact the File Type for Advance Search")
     public void seactTheFileTypeForAdvanceSearch() throws InterruptedException {
         ad_search.setDate();
     }

     @Then("Select the File Size")
     public void selectTheFileSize() throws InterruptedException {
         ad_search.setUploaded_by();

     }

     @Then("Select the Specific Location to Search")
     public void selectTheSpecificLocationToSearch() throws InterruptedException {
         ad_search.setLocation();
         System.out.println("Select the Specific Location to Search");
     }

     @Then("Click on Search")
     public void clickOnSearch() {
         System.out.println("Click on Search");

     }

     @Then("To go to the File Location Click on the File Searched")
     public void toGoToTheFileLocationClickOnTheFileSearched() {
         System.out.println("To go to the File Location Click on the File Searched");

     }


     @And("Click on Delete Request Icon and Select Request Log")
     public void clickOnDeleteRequestIconAndSelectRequestLog() throws InterruptedException {
         log.setDlt_Request();
         Thread.sleep(4000);

         log.setRequest_Log();
         Thread.sleep(4000);


     }

     @Then("Click on My Team and Select the files to approve or Reject")
     public void clickOnMyTeamAndSelectTheFilesToApproveOrReject() throws InterruptedException {
         log.setMy_team();
         Thread.sleep(4000);

         log.setText_box();

         Thread.sleep(4000);
         log.setText_box();
         Thread.sleep(4000);
     }

     @Then("Enter Remarks")
     public void enterRemarks() throws InterruptedException {
         log.setRemark();
         Thread.sleep(4000);
     }

     @Then("Click on Approve or Reject")
     public void clickOnApproveOrReject() throws InterruptedException {

         log.setAprrove();
         Thread.sleep(4000);
     }













     @Then("Right Click on folder \\(Level {int})")
     public void right_Click_on_folder_Level(Integer int1) throws InterruptedException {
         f_r_d.setFunction();
     }

     @Then("Click on New Folder")
     public void click_on_New_Folder() throws InterruptedException {
         f_r_d.setText_box();
     }

     @Then("on New folder Pop up Enter Name of New Folder")
     public void on_New_folder_Pop_up_Enter_Name_of_New_Folder() throws InterruptedException {
         f_r_d.setAuto();
     }

     @Then("Click on Create Folder")
     public void click_on_Create_Folder() throws InterruptedException {
         f_r_d.setRename();
     }

     @Then("Right Click on folder")
     public void right_Click_on_folder() throws InterruptedException {
         f_r_d.setFolder_rename();

     }

     @Then("Click on Rename option")
     public void click_on_Rename_option() throws InterruptedException {
         f_r_d.setSyn();
     }

     @Then("Rename folder popup should display")
     public void rename_folder_popup_should_display() throws InterruptedException {
         f_r_d.setDelete();
     }

     @Then("Enter the new name")
     public void enter_the_new_name() {
         System.out.println("Enter the new name");
     }

     @Then("Click on Rename button")
     public void click_on_Rename_button() {
         System.out.println("Enter the new name");

     }

     @Then("Right Click on folder and click on Download button")
     public void rightClickOnFolderAndClickOnDownloadButton() {
         System.out.println("Enter the new name");

     }

     @Then("Again Right Click on folder")
     public void again_Right_Click_on_folder() {
         System.out.println("Enter the new name");

     }

     @Then("Click on Delete option")
     public void click_on_Delete_option() {
         System.out.println("Enter the new name");

     }

     @Then("Delete Pop up should display")
     public void delete_Pop_up_should_display() {
         System.out.println("Enter the new name");

     }

     @Then("Enter the password")
     public void enter_the_password() {
         System.out.println("Enter the new name");

     }

     @Then("Click On Delete")
     public void click_On_Delete() {
         System.out.println("Enter the new name");

     }












     @And("Click on More")
     public void clickOnMore() throws InterruptedException {
         // paste.setFunction();
         Thread.sleep(6000);
         paste.setMore();
         Thread.sleep(6000);

         paste.setCopy();
         Thread.sleep(6000);

     }

     @Then("Click on Paste")
     public void clickOnPaste() throws InterruptedException {
         paste.setFunction1();
         Thread.sleep(6000);
         paste.setMore();
         Thread.sleep(6000);

         paste.setPaste();
     }










     @Then("Right Click on folder to see the Details")
     public void rightClickOnFolderToSeeTheDetails() {
     }

     @Then("Right Click on folder to Zip & Mail")
     public void rightClickOnFolderToZipMail() throws InterruptedException {
         mail.setFunction();
         Thread.sleep(4000);

     }

     @And("Click on Zip & Mail option from the list")
     public void clickOnZipMailOptionFromTheList() throws InterruptedException {
         mail.setCC();
         Thread.sleep(4000);

     }

     @Then("Enter to Email On Zip and Email Pop up")
     public void enterToEmailOnZipAndEmailPopUp() throws InterruptedException {
         mail.setTo();
         Thread.sleep(4000);
     }

     @Then("Enter to email, CC and Bcc")
     public void enterToEmailCCAndBcc() throws InterruptedException {
         mail.setCc_text();
         Thread.sleep(4000);

         mail.setBcc_mail();
         Thread.sleep(4000);

     }

     @Then("Enter Subject to Send to the Recipient")
     public void enterSubjectToSendToTheRecipient() throws InterruptedException {
         mail.setSubject();
         Thread.sleep(4000);

     }


     @And("Click on Send \\(mail)")
     public void clickOnSendMail() throws InterruptedException {
         mail.setSave();
         Thread.sleep(4000);

     }












     @Then("Right Click on folder \\(Level {int} onwards)")
     public void rightClickOnFolderLevelOnwards(int arg0) {

     }

     @And("Click or Hover on Move")
     public void clickOrHoverOnMove() {
     }

     @Then("Select option Single Folder")
     public void selectOptionSingleFolder() {
     }

     @Then("select the folder to move")
     public void selectTheFolderToMove() {
     }

     @Then("Select the location on the drawer named Move Folder")
     public void selectTheLocationOnTheDrawerNamedMoveFolder() {
     }

     @Then("Click on Move")
     public void clickOnMove() {
     }












     @Then("Click on Delete Request and Select the files to Remove Requests from the list")
     public void clickOnDeleteRequestAndSelectTheFilesToRemoveRequestsFromTheList()throws InterruptedException {
         dlt_request.setBox();

     }

     @Then("Click on Remove")
     public void clickOnRemove()throws InterruptedException {
         dlt_request.setRemove();
     }








     @And("Click on Assign Icon")
     public void clickOnAssignIcon() throws InterruptedException {
         assign_company.setAssign();
     }

     @Then("Select either All Company or Select Company - Location - Department to request")
     public void selectEitherAllCompanyOrSelectCompanyLocationDepartmentToRequest() {
         System.out.println("Select either All Company or Select Company - Location");
     }

     @Then("Select the Select the Reporting Authority to to send request to")
     public void selectTheSelectTheReportingAuthorityToToSendRequestTo() {
         System.out.println("Select the Select the Reporting Authority to to send request to");

     }




     @Then("Click on Client Cloud")
     public void clickOnClientCloud() throws InterruptedException {
Thread.sleep(8000);
         driver.findElement(By.xpath("//*[text()=\"Client Cloud\"]")).click();
     }

     @And("Click on Create Folder Icon\\(Client Cloud)")
     public void clickOnCreateFolderIconClientCloud() throws InterruptedException{
         Thread.sleep(9000);
//driver.findElement(By.xpath("//*[text()=\"add\"]")).click();
         Cloud.setAdd();
         Thread.sleep(8000);

        // Cloud.setAdd();


     }

     @And("Hover on file")
     public void hoverOnFile() throws InterruptedException {
         preview.setFolder();
         Thread.sleep(8000);


         preview.setElement();
         Thread.sleep(8000);

         preview.setDownload();
         Thread.sleep(8000);

         preview.setRename();
         Thread.sleep(8000);



         preview.setUpload_file();
         Thread.sleep(8000);

         preview.setFinance();
         Thread.sleep(8000);

         preview.setLink();
         Thread.sleep(8000);

         preview.setEmail();
         Thread.sleep(8000);

         preview.setExport();
         Thread.sleep(8000);

         preview.setDlt();
         Thread.sleep(8000);

     }

     @Then("Click Preview Icon")
     public void clickPreviewIcon() {
     }
 }