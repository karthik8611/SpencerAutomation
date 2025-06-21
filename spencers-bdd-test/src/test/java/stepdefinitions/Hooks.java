package stepdefinitions;
import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.*;

public class Hooks extends Base{
    public static ExtentReports report;

    @Before
    public void open(){
     openBrowser();
     report =Reporter.generateExtentReport("report");
    }


    @After
    public void close(){
        report.flush();
        driver.quit();
    }



}