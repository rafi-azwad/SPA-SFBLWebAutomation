package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/Features/"},
        tags = "@login or @invoiceDisplay",
        glue = {"SPAStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/invoiceDisplayFeature.html",
                // "json:build/reports/allFeature.json"

        })

@Test
public class InvoiceDisplayRunnerTest extends AbstractTestNGCucumberTests {


}

