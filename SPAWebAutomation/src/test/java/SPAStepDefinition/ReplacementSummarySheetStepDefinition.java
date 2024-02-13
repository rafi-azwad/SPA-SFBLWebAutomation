package SPAStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.ReplacementSummarySheetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class ReplacementSummarySheetStepDefinition {

    ReplacementSummarySheetPage rsp;
    @When("select replacement summary sheet")
    public void selectReplacementSummarySheet() {
        rsp = new ReplacementSummarySheetPage(driver);
        rsp.selectReplacementSummarySheet();
    }

    @And("select market name")
    public void selectMarketName() throws InterruptedException {
        rsp = new ReplacementSummarySheetPage(driver);
        rsp.selectMarketName();
    }

    @And("select replacement cause")
    public void selectReplacementCause(){
        rsp.selectReplacementCause();
    }

    @And("add product")
    public void addProduct() throws InterruptedException {
        rsp.selectProduct();

    }

    @Then("save the replacement summary sheet's information")
    public void saveTheReplacementSummarySheetSInformation() {
        rsp.saveInformation();
       // ScreenShotUtil.getScreenshot("replacement product summary sheet");
    }
}
