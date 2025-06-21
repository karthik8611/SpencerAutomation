package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GroceryPage;
import utils.*;
public class GroceryStep extends Base{
    GroceryPage gp = new GroceryPage();
    
@Given("user is able to access application for Grocery")
public void user_is_able_to_access_application_for_grocery() {
   
}
@When("user is able to click on Grocery")
public void user_is_able_to_click_on_grocery() {
   gp.step1();
   gp.step2();
}
@Then("user should click on edible")
public void user_should_click_on_edible() {
   gp.step3();
}
}
