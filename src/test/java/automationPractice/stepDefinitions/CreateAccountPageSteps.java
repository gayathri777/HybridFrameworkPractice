package automationPractice.stepDefinitions;

import automationPractice.Pages.CreateAccountPage;
import automationPractice.Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountPageSteps {
    CreateAccountPage createAccountPage=new CreateAccountPage();
    @Then("^I Should be on the Registration page$")
    public void isRegistrationPageDisplayed(){
        Utils.waitForPageLoad();
        createAccountPage.isCreateAccountPageDisplayed();
    }
    @When("^I Select title as (.*)$")
    public void selectTitle(String title){
        createAccountPage.selectTitle(title);
    }
    @And("^I provide firstName as (.*)$")
    public void enterFirstName(String firstName){
        createAccountPage.enterFirstName(firstName);
    }
    @And("^I select Date of birth as (.*) (.*) (.*)$")
    public void selectDateOfBirth(String date, String month, String year){
        createAccountPage.enterDob(date,month,year);
    }
    @And("^I select state as (.*)")
    public void selectState(String state){
        createAccountPage.selectState(state);
    }
    @And("^I click register button$")
    public void clickRegisterButton(){
        createAccountPage.clickRegisterButton();
    }
    @Then("^Account should not be created and I should see validation messages$")
    public void isAccountCreationFailed(){
        Assert.assertTrue(createAccountPage.isValidationBlockDisplayed());
    }
}
