package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.ChartPage;
import org.example.pageObject.SalesPage;
import org.openqa.selenium.WebDriver;

public class ChartSteps {

    private WebDriver webDriver;

    public  ChartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User Remove chart Tshirt Red")
    public void RemoveChartTshirtRed() {
        ChartPage chartPage = new ChartPage(webDriver);
        chartPage.clickRemoveTshirtRed();

    }
    @Then("User Checkout")
    public void Checkout() {
        ChartPage chartPage = new ChartPage(webDriver);
        chartPage.clickCheckout();

    }
}
