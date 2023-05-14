package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ChartPage;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    private WebDriver webDriver;

    public  CheckoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User already on checkout information page")
    public void verifyCheckoutPage() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyCheckoutPage());
    }
    @When("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as postalCode")
    public void inputInformation(String firstName, String lastName, String postalCode) {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);
        checkoutPage.clickContinueButton();

    }


}
