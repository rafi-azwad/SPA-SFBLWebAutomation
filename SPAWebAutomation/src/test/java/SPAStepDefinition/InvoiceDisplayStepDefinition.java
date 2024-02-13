package SPAStepDefinition;

import Core.ScreenRecorderUtil;
import Core.ScreenShotUtil;
import SearchPage.InvoiceDisplayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class InvoiceDisplayStepDefinition {

    InvoiceDisplayPage id;
    @When("select invoice display")
    public void selectInvoiceDisplay() {
        id = new InvoiceDisplayPage(driver);
        id.clickInvoiceDisplay();
        
    }

    @And("select delivery date")
    public void selectDeliveryDate() {
        id.checkAndSelectDeliveryDate();
    }

    @Then("view the display information")
    public void viewTheDisplayInformation() {
        id.viewInvoiceDisplay();
        //ScreenShotUtil.getScreenshot("invoice display information");

    }
}
