package SPAStepDefinition;

import Core.ScreenRecorderUtil;
import Core.ScreenShotUtil;
import SearchPage.ShortProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static SPAStepDefinition.LoginStepDefinition.driver;

public class ShortProductsStepDefinition {
    ShortProductsPage spp;
    @When("select short product")
    public void selectShortProduct() {
        spp = new ShortProductsPage(driver);
        spp.selectShortProducts();
    }

    @And("fill the short products required information")
    public void fillTheShortProductsRequiredInformation() throws InterruptedException {
        spp.addItems();

    }

    @Then("save the short products information")
    public void saveTheShortProductsInformation() {
        spp.saveShortProducts();
       // ScreenShotUtil.getScreenshot("short products");

    }
}
