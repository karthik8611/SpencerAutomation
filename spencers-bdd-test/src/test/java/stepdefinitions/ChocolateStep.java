package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utils.*;
import uistore.*;
public class ChocolateStep  extends Base{
    ChocolatePage cp= new ChocolatePage();
    WebDriverHelper wh= new WebDriverHelper(driver);
    
@Given("user is able to access the application")
public void user_is_able_to_access_the_application() {

  
}


@When("user is able to enter {string}")
public void user_is_able_to_enter(String input) {
   cp.step1();
   wh.sendKeys(ChocolateUI.searchBar, input);
   cp.step2();
   cp.step3();
}
@Then("user is able to click on dairy and cart")
public void user_is_able_to_click_on_dairy_and_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
