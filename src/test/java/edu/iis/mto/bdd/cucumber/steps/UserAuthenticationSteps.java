package edu.iis.mto.bdd.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.iis.mto.bdd.cucumber.pages.HomePage;
import edu.iis.mto.bdd.cucumber.pages.LoginPage;
import edu.iis.mto.bdd.cucumber.workflowsteps.AuthenticationWorkFlowSteps;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class UserAuthenticationSteps {
	private WebDriver driver ;
   LoginPage loginPage;
   HomePage homePage;

    @Steps
    AuthenticationWorkFlowSteps authenticationWorkFlowSteps;
	
	@Before
	public void init(){
		driver = new FirefoxDriver();
	}
	
    @Given("^(.*) is a registered Frequent Flyer$")
    public void givenARegisteredFrequentFlyer(FrequentFlyerMember user) {}

    @When("^(.*) authenticates with a valid email address and password$")
    public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(FrequentFlyerMember user) {
//    	driver.get("http://localhost:8080/#/welcome");
//    	driver.findElement(By.name("email")).sendKeys(user.getEmail());
//		driver.findElement(By.name("password")).sendKeys(user.getPassword());
//		driver.findElement(By.name("signin")).click();
        
        authenticationWorkFlowSteps.enterEmailAndPasswordFor(user);
    }

    @Then("^(.*) should be given access to (?:her|his) account$")
    public void thenTheUserShouldBeGivenAccessToAccount(FrequentFlyerMember userName) {
        authenticationWorkFlowSteps.verifyWelcomeMessageFor(userName);


    	//assertThat(driver.findElement(By.id("welcome-message")).getText(), equalTo("Witaj "+userName.getFirstName()));
    }

    @Given("^(.*) has logged on$")
    public void aUserHasLoggedOnAs(FrequentFlyerMember user) {
        authenticationWorkFlowSteps.enterEmailAndPasswordFor(user);

//    	driver.get("http://localhost:8080/#/welcome");
//    	driver.findElement(By.name("email")).sendKeys(user.getEmail());
//		driver.findElement(By.name("password")).sendKeys(user.getPassword());
//		driver.findElement(By.name("signin")).click();
    }

    @When("^(?:.*) views the home page$")
    public void whenAUserViewsTheHomePage() {}
    
    @After
    public void close(){
    	driver.close();
    }

}
