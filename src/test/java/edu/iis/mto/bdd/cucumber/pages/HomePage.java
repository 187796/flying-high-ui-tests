package edu.iis.mto.bdd.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DefaultUrl("http://localhost:8080/#/home")
public class HomePage extends PageObject {

    @FindBy(id="welcome-message")
    private WebElement message;

    public String getWelcomeMessage(){
        return message.getText();
    }
}
