package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinitions.Hooks;
import utils.*;
import uistore.*;

public class GroceryPage extends Base {
    ExtentTest test;
    WebDriverHelper wh= new WebDriverHelper(driver);
    public void step1(){
     test=Hooks.report.createTest("TestCase 2","success");
     wh.clickOnElement(GroceryUI.grocery);

    
    }

    public void step2(){
        wh.clickOnElement(GroceryUI.viewAll);
        test.log(Status.PASS,"clicked on grocery and  selects viewAll");
    }

    public void step3(){
        wh.clickOnElement(GroceryUI.edible);
        test.log(Status.PASS,"clicked on edible oil");
    }
}
