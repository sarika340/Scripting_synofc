package Step_defination;



import Page_object.*;
import Utilities.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Master_stepdefinition  extends Base_Class {
    String doc1=Base_Class.randomalphabet(4);
public Guest_user_page Guest;
public Employee_to_company_page emp;
        public Register_variable_data_page lp;
        public WebDriver driver;
    public Employee_permission Roles;
public Guest_permission_page pages;
public Assign_Guest_user_page  Assign_Guest;




    //...........................................................................................................
//............................Register Varible data..(Client)......................................................
//............................................................................................................
            @Given("I launch chrome browser")
            public void i_launch_chrome_browser() throws InterruptedException {
            System.setProperty("Webdriver.chromeDriver", ".//chromedriver");
            driver = new ChromeDriver();
            lp = new Register_variable_data_page(driver);
            Guest=new Guest_user_page(driver);
            pages=new Guest_permission_page(driver);
            emp=new Employee_to_company_page(driver);
            Roles=new Employee_permission(driver);
                Assign_Guest=new Assign_Guest_user_page(driver);
            System.out.println("launch google page");
            Thread.sleep(2000);
            driver.manage().window().maximize();
        }
        @When("I open Url {string}")
        public void i_open_Url(String string) throws InterruptedException {
            System.out.println(" google page");
            driver.get(string);
            System.out.println("lounch the url");
            Thread.sleep(2000);
        }
        @Then("I Click on login button")
        public void i_Click_on_login_button() {
            lp.set();
            System.out.println("Login");
        }
        @Then("I enter UserName {string} And Password {string}")
        public void i_enter_UserName_And_Password(String email, String password) {
            lp.setusername(email);
            lp.Setpassword(password);
        }
        @Then("I Click on Login")
        public void i_Click_on_Login() throws InterruptedException {
            lp.setLogin_button();
            System.out.println("click on Login");
            Thread.sleep(2000);
        }
        @Then("Click on masters")
        public void click_on_masters() throws InterruptedException {
            lp.setMaster();
            Thread.sleep(2000);
        }
    @Then("click on client should open list")
    public void click_on_client_should_open_list() throws InterruptedException {
        lp.setMouse_over_clint();
        System.out.println("Done Mouse hover on 'Employee' from Menu");
    }
    @Then("click  on Register Varible data")
    public void click_on_Register_Varible_data() {
        lp.setClint();
        lp.setRegister();
        System.out.println("1111Done Mouse hover on 'Employee' from Menu");
    }
        @Then("page {string} should display")
        public void page_should_display(String string) throws InterruptedException {
            Actions actions =new Actions(driver);
            WebElement closeMenuOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[1]/div[2]"));
            actions.moveToElement(closeMenuOption).perform();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            System.out.println("Mouse hover on 'Register' from Menu");
            Thread.sleep(2000);
        }
        @Then("Click on Add button on Register Varible data")
        public void click_on_Add_button_on_Register_Varible_data() throws InterruptedException {
            Thread.sleep(2000);
            lp.setAdd_register();
        }
        @Then("Registraion value data")
        public void registraion_value_data() throws InterruptedException {
         lp.setRegisteration_value(doc1);
            Thread.sleep(2000);
        }
        @Then("Enter the Doucument name")
        public void enter_the_Doucument_name() throws InterruptedException {
            lp.setDoucument_name(doc1);
            Thread.sleep(2000);
        }
        @Then("Click on save button")
        public void click_on_save_button() throws InterruptedException {
        lp.setSave_button(doc1);
            Thread.sleep(2000);
        }





 //...........................................................................................................................
//............................Employee_To_Client..(Roles_permission)......................................................
//............................................................................................................
    @Then("Click on Add Employee_To_Client")
    public void click_on_Add_Employee_To_company() {
        driver.findElement(By.xpath("//span[contains(text(),'Employee to Client')]")).click();
    }
    @Then("Select the Client")
    public void select_the_Client() throws InterruptedException {
        Actions actions =new Actions(driver);
        WebElement closeMenuOption = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/input[1]"));
        actions.moveToElement(closeMenuOption).perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Mouse hover on 'Register' from Menu");
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
        driver.findElement(By.xpath("//span[contains(text(),'Staff to Client')]\n")).click();}

    @Then("Select the client in dropdownlist")
    public void select_the_client_in_dropdownlist() {
    }






//...........................................................................................................
//............................ Guest_user..(Guest_user)......................................................
//............................................................................................................
    @Then("click on Guest_user Module")
    public void click_on_Guest_user_Module() throws InterruptedException {
      Guest.setClick_on_Guesruser();
    }
    @Then("click on Guest_user sub module")
    public void click_on_Guest_user_sub_module() {
       Guest.setClick_on_Sub_Guesruser();
    }
    @Then("Guest user page should display")
    public void guest_user_page_should_display() throws InterruptedException {
                Guest.setGuset_user_page();
       System.out.println("Guest user page should display");
    }
    @Then("click on add button")
    public void click_on_add_button() throws InterruptedException {
            Guest.setClick_on_add_button();
    }
    @Then("Enter All mendetry fields")
    public void enter_All_mendetry_fields() throws InterruptedException {
                Guest.set_Mandatory_field();
    }
    @Then("click on save Button and should display successful pop up")
    public void click_on_save_Button_and_should_display_successful_pop_up() {
        Guest.setSave(doc1);
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
    }
    @When("Search Employee")
    public void search_Employee() throws InterruptedException {
      Roles.setGo();
    }
    @Then("select the Read Permission options for Modules")
    public void select_the_Read_Permission_options_for_Modules() throws InterruptedException {
                Roles.setRole_permission();
    }
    @Then("Select Modules to apply to the specific Employee")
    public void select_Modules_to_apply_to_the_specific_Employee() throws InterruptedException {
                Roles.setRole_permission();


    }






//........................................................................................
//.........Employee to Company...(ROLES AND PERMISSION)............................................................
// ..........................................................................................
    @Then("Click on Employee to Company")
    public void click_on_Employee_to_Company() throws InterruptedException {
                emp.setEmployee_to_Company();

    }
    @When("Select Employee Company,Departments")
    public void select_Employee_Company_Departments() throws InterruptedException {
        emp.setAll_emp();
        Thread.sleep(3000);
        emp.setAll_company();
    }
    @Then("Click On Submit To Assign the Selected Company")
    public void click_On_Submit_To_Assign_the_Selected_Company() throws InterruptedException {
        System.out.println("Click on submit");
        emp.setSubmit();
    }






//..................................................................................................
//.........Guest User Permission..(Guest User)............................................................
// .................................................................................................
    @Then("Click on  Guest User Permission")
    public void click_on_Guest_User_Permission() throws InterruptedException {
        Thread.sleep(2000);
        pages.setGuest_User_Permission();
    }
    @Then("Select the Guest User")
    public void select_the_Guest_User() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement menuOption = driver.findElement(By.xpath("(//*[@type=\"text\"])[1]"));
        actions.moveToElement(menuOption).perform();
        pages.setSearch_Guest();
    }
    @Then("Select the Permission options")
    public void select_the_Permission_options() throws InterruptedException {
        Thread.sleep(2000);
        pages.setGuest();
    }
    @Then("Click on Submit")
    public void click_on_Submit() {

    }


    @Then("Click on Assign Guest User submodule")
    public void click_on_Assign_Guest_User_submodule() throws InterruptedException {
                Thread.sleep(3000);
    Assign_Guest.setGuest_to_client();
    }

    @Then("Client\\(s) - Location\\(s) - Department\\(s)")
    public void client_s_Location_s_Department_s() {
    Assign_Guest.setAssign_user();
    }

    @Then("click on Submit to Assign the CGuest Users to Client")
    public void click_on_Submit_to_Assign_the_CGuest_Users_to_Client() throws InterruptedException {
        Thread.sleep(3000);

        Assign_Guest.radio_btn();

    }










}