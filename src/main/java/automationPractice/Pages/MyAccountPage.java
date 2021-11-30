package automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {
    @FindBy(css=".account")
    WebElement accountName;
    @FindBy(css=".logout")
    WebElement signOutLink;
    @FindBy(css=".myaccount-link-list")
    WebElement myAccountPanel;

    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }
    public String getSignInUserAccountName(){
        return accountName.getText();
    }
    public void clickSignOutLink(){
        signOutLink.click();
    }
    public boolean isMyAccountPanelDisplayed(){
        return myAccountPanel.isDisplayed();
    }
}

