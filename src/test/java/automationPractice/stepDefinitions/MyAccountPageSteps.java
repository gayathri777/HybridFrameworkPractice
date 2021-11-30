package automationPractice.stepDefinitions;

import automationPractice.Pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyAccountPageSteps {
    MyAccountPage myAccountPage=new MyAccountPage();
    @And("^I should be logged in successfully and I should be on My Account page$")
    public void isUserOnMyAccountPage(){
       myAccountPage.isMyAccountPanelDisplayed();
    }
    @Then("^I will signOut$")
    public void signOut(){
        myAccountPage.clickSignOutLink();
    }

}
