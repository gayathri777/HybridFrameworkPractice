package automationPractice.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    public static WebDriver webdriver;
    public static void startBrowser(){
        System.out.println("In StartBrowser: "+AutomationConstants.REMOTE_BROWSER);
        if(AutomationConstants.REMOTE_BROWSER==true){
            System.out.println("In StartBrowser");
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setExperimentalOption("w3c",true);
            browserOptions.setPlatformName("Windows 10");
            browserOptions.setBrowserVersion("latest");
            Map<String, Object> sauceOptions = new HashMap<>();
            browserOptions.setCapability("sauce:options", sauceOptions);
            try {
                webdriver=new RemoteWebDriver(new URL(AutomationConstants.SELENIUM_GRID_URL),browserOptions);
            } catch (MalformedURLException e) {
                System.out.println("in Exception");
                e.printStackTrace();
            }
        }else if(AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")){
            System.out.println("in chrome");
            WebDriverManager.chromedriver().setup();
            webdriver=new ChromeDriver();
        }
        webdriver.get(AutomationConstants.BASE_URL);
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public static void stopBrowser(){

        if(webdriver!=null){
            System.out.println("closing driver");
            webdriver.close();
            webdriver.quit();
        }else{
            System.out.println("web driver value: "+webdriver);
            webdriver.quit();
        }
    }
    public static WebDriver getDriver(){
      if(webdriver==null){
            System.out.println("getting new driver");
            BrowserFactory.startBrowser();
        }
        System.out.println("getting old driver");
        return webdriver;
    }
}
