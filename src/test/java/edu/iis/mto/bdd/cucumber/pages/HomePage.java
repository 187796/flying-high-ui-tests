package edu.iis.mto.bdd.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DefaultUrl("http://localhost:8080/#/welcome")
public class HomePage extends PageObject {

    @FindBy(id="welcome-message")
    private WebElement message;

    public void checkWelomeMessage(String firstName){
        assertThat(message.getText(),equalTo("Witaj "+firstName));
    }
}
