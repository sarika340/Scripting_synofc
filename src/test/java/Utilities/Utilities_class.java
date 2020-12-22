package Utilities;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.google.common.io.Files;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class Utilities_class {
protected static String profile;
    public WebDriver driver;



public void setupSuite()
{
    profile=System.getenv("ENV");
    if(profile==null)
    {
        Assert.fail("Env varible not set");
    }

}

    public static String randomalphabet(int count) {

        return RandomStringUtils.randomAlphabetic(count);
    }
    public static String randomnemeric(int count) {

        return RandomStringUtils.randomNumeric(count);
    }

    public static String randomalphanemeric(int count) {

        return RandomStringUtils.randomAlphanumeric(count);

    }

    public static String current_date() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Todays date : " + strDate);
        return strDate;
    }


    public static String before_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Getting current date
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -7);
        //Date after adding the days to the current date
        String before_date = sdf.format(cal.getTime());
        System.out.println("Date after Addition: " + before_date);
        return before_date;
    }


    public static String Add_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //Getting current date
        Calendar cal = Calendar.getInstance();
        //Displaying current date in the desired format
        //Number of Days to add
        cal.add(Calendar.DAY_OF_MONTH, 7);
        //Date after adding the days to the current date
        String Add_date = sdf.format(cal.getTime());
        //Displaying the new Date after addition of Days to current date
        System.out.println("Date after Addition: "+Add_date);
        return Add_date;
    }



public static void screenshot(WebDriver driver) throws IOException {
    TakesScreenshot tc=(TakesScreenshot)driver;
   File src_file= tc.getScreenshotAs(OutputType.FILE);
    File dest_file= new  File("");
    Files.copy(src_file,dest_file);
}



    }




