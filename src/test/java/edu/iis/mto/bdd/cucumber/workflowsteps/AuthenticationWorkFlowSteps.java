package edu.iis.mto.bdd.cucumber.workflowsteps;

import edu.iis.mto.bdd.cucumber.pages.HomePage;
import edu.iis.mto.bdd.cucumber.pages.LoginPage;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AuthenticationWorkFlowSteps {
    LoginPage loginPage;
    HomePage homePage;

    @Step
    public void enterEmailAndPasswordFor(FrequentFlyerMember user){
        loginPage.open();
        loginPage.signinWithCredentials(user.getEmail(),user.getPassword());
    }

    @Step
    public void verifyWelcomeMessageFor(FrequentFlyerMember user){
        homePage.open();
        String welcomeMessage = homePage.getWelcomeMessage();
        assertThat(welcomeMessage,equalTo("Witaj "+user.getFirstName()));
    }
}
