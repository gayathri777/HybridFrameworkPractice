package automationPractice.Pages;

import automationPractice.Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage extends BrowserFactory {
    public static WebDriver driver=getDriver();
    //public static WebDriver driver=BrowserFactory.getDriver();
    public BasePage(){
        System.out.println("init basepage");
        PageFactory.initElements(driver,this);
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public String getTitle(){
        return driver.getTitle();
    }



}
