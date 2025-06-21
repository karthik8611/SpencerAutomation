package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinitions.Hooks;
import uistore.*;
import utils.*;

public class RegisterPage extends Base{
    ExtentTest test;
    WebDriverHelper wh= new WebDriverHelper(driver);
    public void step1(){
     test=Hooks.report.createTest("TestCase 3","success");
     wh.clickOnElement(RegisterUI.user);
     test.log(Status.PASS,"clicked on userIcon");
     
    }

    public void step2(){
     wh.clickOnElement(RegisterUI.login1);
    }

    public void step3(){
     wh.clickOnElement(RegisterUI.username);
     wh.sendKeys(RegisterUI.username, "testing@gmail.com");
     wh.clickOnElement(RegisterUI.password);
     wh.sendKeys(RegisterUI.password,"Example20@");
     test.log(Status.PASS,"entered username and password");
     wh.clickOnElement(RegisterUI.mainLogin);

     test.log(Status.PASS,"clicked on Login");
     Screenshot.captureScreenShot("screenshot1");
     test.log(Status.PASS,"captured on screenshot");

     }
}
