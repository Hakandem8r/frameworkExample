package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@RegressionTest"
        ,
        features = {"src/test/java"},

        glue = {"steps"},

        /* Raporlar icin bunu ekliyoruz

        plugin= { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json",""+
        "junit:target/cucumber-result.xml"
         */

        dryRun = false
)

public class _4_RegressionTest extends AbstractTestNGCucumberTests {
}
