package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {

    private WebDriver webDriver;

    public  SalesSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on sales page")
    public void verifySalesPage(){
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }

    @Then("User sort product Name Z to A")
    public void sorting(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickSortContainer();
        salesPage.clickSort();
    }

    @Then("User add item on cart")
    public void addBarang(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickAddCart1();
        salesPage.clickAddCart2();
    }

    @And("User Click cart")
    public void ShoppingCartContainer() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickShoppingCart();



    }



}
