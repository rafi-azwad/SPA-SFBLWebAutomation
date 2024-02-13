package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

    @CucumberOptions(
            features = {"src/test/resources/Features/"},
            tags = "@login or @replacementSummarySheet",
            glue = {"SPAStepDefinition"},
            monochrome = true,
            dryRun = false,
            plugin = {
                    "pretty", "html:build/reports/replacementSummarySheetFeature.html"
            })

    @Test
    public class ReplacementSummarySheetRunnerTest extends AbstractTestNGCucumberTests {


    }

