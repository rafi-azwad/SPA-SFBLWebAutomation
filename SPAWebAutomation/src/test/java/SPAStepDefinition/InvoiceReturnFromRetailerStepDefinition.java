package SPAStepDefinition;

import Core.ScreenShotUtil;
import SearchPage.InvoiceReturnFromRetailerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class InvoiceReturnFromRetailerStepDefinition {
    InvoiceReturnFromRetailerPage irp;
    @When("select invoice return from retailer")
    public void selectInvoiceReturnFromRetailer() {
        irp = new InvoiceReturnFromRetailerPage(driver);
        irp.selectInvoiceReturn();
    }

    @And("write the invoice number")
    public void writeTheInvoiceNumber() {
        irp.writeInvoiceNumber();
        irp.returnDate();
    }

    @And("select full or partial return")
    public void selectFullOrPartialReturn() {
        irp.selectFullOrPartialButton();
    }
    @And("write return quantity")
    public void writeReturnQuantity() throws InterruptedException {
        irp.writeReturnQty();
    }

    @Then("save the invoice return from retailer")
    public void saveTheInvoiceReturnFromRetailer() {
        irp.saveReturnQty();
        //ScreenShotUtil.getScreenshot("invoice return from retailer");
    }


}
