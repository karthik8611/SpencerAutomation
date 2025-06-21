package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ctc.wstx.dtd.ChoiceContentSpec;

import stepdefinitions.Hooks;
import uistore.*;
import utils.*;

public class ChocolatePage extends Base {
    ExtentTest test;

    WebDriverHelper wh = new WebDriverHelper(driver);
    public void step1(){
      test=Hooks.report.createTest("Test1","success");
      wh.clickOnElement(ChocolateUI.search);
      wh.clickOnElement(ChocolateUI.searchBar);

    }
    public void step2(){
        wh.clickOnElement(ChocolateUI.Go);
        test.log(Status.PASS,"searched chocolate clicked Go");

    }

    public void step3(){
    wh.clickOnElement(ChocolateUI.showMore);
     wh.clickOnElement(ChocolateUI.dairy);
     wh.clickOnElement(ChocolateUI.addButton);
     wh.clickOnElement(ChocolateUI.cartIcon);
    test.log(Status.PASS,"click on diary and item added to cart");
    }
    
}
