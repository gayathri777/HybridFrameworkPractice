package automationPractice.stepDefinitions;
import automationPractice.Pages.BasePage;
import automationPractice.Utils.AutomationConstants;
import automationPractice.Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends BasePage {
    @Before
    public void startUp(){
       /* System.out.println("starting browser");
        BrowserFactory.startBrowser();
        //wait page to load
        BrowserFactory.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));*/
        WebDriverManager.chromedriver().setup();
        //Open the browser
        driver= new ChromeDriver();

        //Open Url
        driver.get(AutomationConstants.BASE_URL);
        //wait page to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @After
    public void TearDown(){
        driver.close();
        //BrowserFactory.webdriver.close();
       // BrowserFactory.stopBrowser();
    }
}

