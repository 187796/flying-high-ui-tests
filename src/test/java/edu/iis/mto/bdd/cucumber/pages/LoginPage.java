package edu.iis.mto.bdd.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://localhost:8080/#/welcome")
public class LoginPage extends PageObject {
    private WebElement email;
    private WebElement password;

    private WebElement signin;

    public void signinWithCredentials(String userEmail,String userPassword){
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        signin.click();
    }
}
