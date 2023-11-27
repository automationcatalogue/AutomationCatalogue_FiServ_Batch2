package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@OrangeHRM",
        features = "src/test/java/bdd_testcases",
        glue = "stepDefinitions",
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        dryRun = false
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
