package stepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Navigated to login url"); 
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Give username and password");   
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is getting displayed");   
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable{
    System.out.println(strArg1);	
    System.out.println(strArg2);	
    }
    
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

}
