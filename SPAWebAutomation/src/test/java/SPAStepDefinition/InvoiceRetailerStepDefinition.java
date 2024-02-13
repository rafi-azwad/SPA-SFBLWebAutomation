package SPAStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.InvoiceRetailerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class InvoiceRetailerStepDefinition {
    InvoiceRetailerPage ir;
    @When("select invoice retailer")
    public void selectInvoiceRetailer() {
        ir = new InvoiceRetailerPage(driver);
        ir.selectInvoiceRetailer();
        
    }

    @And("fill delivery date and sr name")
    public void fillDeliveryDateAndSrName() throws InterruptedException {
        ir.selectDeliveryDateAndSRName();
    }

    @Then("view the information")
    public void viewTheInformation() {
        ir.viewDetails();
        //ScreenShotUtil.getScreenshot("view invoice retailer details");
        ir.allPosting();
    }
}
