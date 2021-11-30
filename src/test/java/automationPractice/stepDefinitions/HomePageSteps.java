package automationPractice.stepDefinitions;

import automationPractice.Pages.HomePage;
import automationPractice.Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage=new HomePage();

    @Given("^I am on the Home page$")
    public void isUserOnHomePage(){
        Assert.assertTrue(homePage.isHomeTabsDisplayed());
    }
    @When("^I select SignIn link$")
    public void clickSignInLink(){
        homePage.clickSignInLink();
    }
}
