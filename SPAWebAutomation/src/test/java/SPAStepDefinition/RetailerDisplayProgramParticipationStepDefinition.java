package SPAStepDefinition;

import SearchPage.RetailerDisplayProgramParticipationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static SPAStepDefinition.LoginStepDefinition.driver;

public class RetailerDisplayProgramParticipationStepDefinition {
    RetailerDisplayProgramParticipationPage rdpp;
    @When("select retailer display program participation")
    public void selectRetailerDisplayProgramParticipation() {
       rdpp = new RetailerDisplayProgramParticipationPage(driver);
       rdpp.selectRetailerDisplayProgramParticipation();
    }

    @And("fill the required information")
    public void fillTheRequiredInformation()  {
       rdpp.displayProgramName();
       //rdpp.displayParticipationDetails();
    }

    @Then("save the information")
    public void saveTheInformation() {
    }
}
