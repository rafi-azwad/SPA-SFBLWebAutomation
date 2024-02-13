package SPAStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.RequisitionToFactoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class RequisitionToFactoryStepDefinition {

    RequisitionToFactoryPage rtp;
    @When("select requisition to factory")
    public void selectRequisitionToFactory() {
        rtp = new RequisitionToFactoryPage(driver);
        rtp.selectRequisitionToFactory();
    }

    @And("select the add items")
    public void selectTheAddItems() throws InterruptedException {
        rtp.addItems();
    }

    @And("write how many boxes you require")
    public void writeHowManyBoxesYouRequire() {
        rtp.writeBoxes();
    }

    @Then("save the requisition to factory's information")
    public void saveTheRequisitionToFactorySInformation() {
        rtp.saveInformation();
        //ScreenShotUtil.getScreenshot("requisition to factory details");

    }
}
