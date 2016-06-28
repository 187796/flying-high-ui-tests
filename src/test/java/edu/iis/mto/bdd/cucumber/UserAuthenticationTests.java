package edu.iis.mto.bdd.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber" },  tags = {"@authentication"}, glue = "edu.iis.mto.bdd.cucumber.steps")
public class UserAuthenticationTests {

}
