package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/Features/"},
        tags = "@login or @invoiceReturnFromRetailer",
        glue = {"SPAStepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/invoiceReturnFromRetailerFeature.html",
                // "json:build/reports/allFeature.json"

        })

@Test
public class InvoiceReturnFromRetailerRunnerTest extends AbstractTestNGCucumberTests {


}


