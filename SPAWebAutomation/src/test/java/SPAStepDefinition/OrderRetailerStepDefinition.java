package SPAStepDefinition;

import Core.ScreenRecorderUtil;
import Core.ScreenShotUtil;
import SearchPage.OrderRetailerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class OrderRetailerStepDefinition {
    OrderRetailerPage op;
    @Given("click on transaction option")
    public void clickOnTransactionOption() {
        op = new OrderRetailerPage(driver);
        op.clickTransaction();
        
    }

    @When("select order retailer")
    public void selectOrderRetailer() {
        op.selectOrderRetailer();
        
    }

    @And("fill in the required information")
    public void fillInTheRequiredInformation() throws InterruptedException {
        op.selectRequiredInformation();
       // ScreenShotUtil.getScreenshot("order information");
        
    }

    @Then("save and submit the information")
    public void saveAndSubmitTheInformation() {
        op.saveInformation();
       // ScreenShotUtil.getScreenshot("successfully save order information");

    }
}
