package edu.iis.mto.bdd.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


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
