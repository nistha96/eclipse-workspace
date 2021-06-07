package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition extends base{

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver = initiateDriver();  
    }
    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);   
    }

    @And("^CLick on Login link in home page to land on Secure sign Page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_page() throws Throwable {
    	
    	LandingPage lp = new LandingPage(driver);
    	if(lp.getPopupSize().size()>0)
    	{
    		lp.getPopup().click();
    	}
    	LoginPage l=lp.getLogin();
    	//lp.getLogin().click();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
    	LoginPage l = new LoginPage(driver);
    	l.email().sendKeys(strArg1);
		l.password().sendKeys(strArg2);
		l.login().click();  
    }

    @SuppressWarnings("deprecation")
	@Then("^Verfiy that user is succesfully logged in$")
    public void verfiy_that_user_is_succesfully_logged_in() throws Throwable {
      portalHomePage p = new   portalHomePage(driver);
      Assert.assertTrue(p.getSearchBox().isDisplayed());
      
    }
    @And("^Close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
    }

}