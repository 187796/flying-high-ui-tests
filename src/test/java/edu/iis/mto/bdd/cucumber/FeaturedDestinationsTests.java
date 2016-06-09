package edu.iis.mto.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber" }, tags = {"@feat-destinations"}, glue = "edu.iis.mto.bdd.cucumber.steps")
public class FeaturedDestinationsTests {

}
