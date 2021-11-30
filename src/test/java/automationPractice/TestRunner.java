package automationPractice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/",
        tags= "@smoke",
        plugin={"html:target/gayathriReports"})
public class TestRunner {
}
