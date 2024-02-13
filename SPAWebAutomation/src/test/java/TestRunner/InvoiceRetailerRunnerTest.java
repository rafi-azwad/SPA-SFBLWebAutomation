package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/Features/"},
        tags = "@login or @invoiceRetailer",
        glue = {"SPAStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/invoiceRetailerFeature.html",
                // "json:build/reports/allFeature.json"

        })

@Test
public class InvoiceRetailerRunnerTest extends AbstractTestNGCucumberTests {


}



