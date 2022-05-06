package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},

        glue = {"steps"},

        plugin = {"json:target/cucumber.json"},

        dryRun = false
)
public class _1_RunnerGeneral extends AbstractTestNGCucumberTests {
}
