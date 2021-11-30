package automationPractice.stepDefinitions;

import automationPractice.Pages.AuthenticationPage;
import automationPractice.Pages.HomePage;
import automationPractice.Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthenticationPageSteps {
    AuthenticationPage authenticationPage=new AuthenticationPage();
    @Then("^I should be on Authentication page$")
    public void isUserOnAuthenticationPage(){
        Assert.assertTrue(authenticationPage.isCreateAccountPanelDisplayed());
    }
    @When("^I provide username as (.*) and password as (.*)$")
    public void enterCredentials(String uname, String pwd){
        authenticationPage.enterEmail(uname);
        authenticationPage.enterPassword(pwd);
    }
    @And("^click SignIn button$")
    public void clickSignInButton(){
        authenticationPage.clickSignInButton();
    }
    @Then("^I should be on SignIn Page$")
    public void isUserOnSignInPanel(){
        authenticationPage.isLoginPanelDisplayed();
    }
    @And("^I should see validation message as (.*)$")
    public void isValidationMessageDisplayed(String message){
        System.out.println(message+"  2  "+authenticationPage.getValidationMessage());
        Assert.assertEquals(message,authenticationPage.getValidationMessage());
    }
    @Then("^I should see createAccountPanel on Authentication page$")
    public void isCreateAccountPanelDisplayed(){
        authenticationPage.isCreateAccountPanelDisplayed();
    }
    @When("^I Enter emailId as (.*) and click create an Account button$")
    public void clickCreateAccountButton(String email){
        authenticationPage.enterEmailAndContinue(email);
    }

}
