package SPAStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.DamageStockTransferForReplacementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class DamageStockTransferForReplacementStepDefinition {
    DamageStockTransferForReplacementPage dstrp;
    @When("select  damage stock transfer for replacement")
    public void selectDamageStockTransferForReplacement() {
        dstrp = new DamageStockTransferForReplacementPage(driver);
        dstrp.selectDamageReplacementSummarySheet();
    }
    @And("add damage product")
    public void addDamageProduct() throws InterruptedException {
        dstrp.addItem();
    }
    @And("add damage policy")
    public void addDamagePolicy() throws InterruptedException {
        dstrp.addDamagePolicy();
    }

    @Then("save the damage stock transfer for replacement's information")
    public void saveTheDamageStockTransferForReplacementSInformation() {
        dstrp.saveInformation();
       // ScreenShotUtil.getScreenshot("damage stock transfer for replacement information");
    }



}
