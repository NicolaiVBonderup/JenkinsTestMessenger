package dk.profac.jenkinstestmessenger;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = {"pretty", "html:target/cucumber"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = "dk.profac.jenkinstestmessenger",
        features = {"src/test/java/dk/profac/resources/cucumber"})
public class RunCucumberTest {

}
