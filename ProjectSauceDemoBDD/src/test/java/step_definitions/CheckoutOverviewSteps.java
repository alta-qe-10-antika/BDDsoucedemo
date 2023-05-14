package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.ChartPage;
import org.example.pageObject.CheckoutOverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewSteps {

    private WebDriver webDriver;

    public CheckoutOverviewSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User already on Checkout Overview page")
    public void CheckoutOverviewPage() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        Assert.assertTrue(checkoutOverviewPage.verifyCheckoutOverviewPage());
    }

    @And("User already check Total Price")
    public void verifyTotalPrice() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        Assert.assertEquals(checkoutOverviewPage.verifyTotalPrice(), checkoutOverviewPage.verifyTotalPrice());

    }
    @Then("User click Finish Button")
    public void clickFinishButton() {
            CheckoutOverviewPage checkoutOverviewPage1 = new CheckoutOverviewPage(webDriver);
            checkoutOverviewPage1.clickFinishButton();

        }
    }
