$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SauceDemo.feature");
formatter.feature({
  "line": 2,
  "name": "Sauce Demo",
  "description": "As a User I Want to Login to SauceDemo Website",
  "id": "sauce-demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SauceDemo"
    }
  ]
});
formatter.before({
  "duration": 13825595661,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Sauce Demo",
  "description": "",
  "id": "sauce-demo;sauce-demo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User already on website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product Name Z to A",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User add item on cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Click cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Remove chart Tshirt Red",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User already on checkout information page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User input \"antika\" as firstName and input \"sarii\" as lastName and input \"0000\" as postalCode",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User already on Checkout Overview page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User already check Total Price",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click Finish Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 580875604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 729008741,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 223013708,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.sorting()"
});
formatter.result({
  "duration": 522130126,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.addBarang()"
});
formatter.result({
  "duration": 177870620,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.ShoppingCartContainer()"
});
formatter.result({
  "duration": 120667187,
  "status": "passed"
});
formatter.match({
  "location": "ChartSteps.RemoveChartTshirtRed()"
});
formatter.result({
  "duration": 98878091,
  "status": "passed"
});
formatter.match({
  "location": "ChartSteps.Checkout()"
});
formatter.result({
  "duration": 119161722,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCheckoutPage()"
});
formatter.result({
  "duration": 68760432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "antika",
      "offset": 12
    },
    {
      "val": "sarii",
      "offset": 44
    },
    {
      "val": "0000",
      "offset": 74
    }
  ],
  "location": "CheckoutSteps.inputInformation(String,String,String)"
});
formatter.result({
  "duration": 602971138,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.CheckoutOverviewPage()"
});
formatter.result({
  "duration": 67458476,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.verifyTotalPrice()"
});
formatter.result({
  "duration": 79463987,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.clickFinishButton()"
});
formatter.result({
  "duration": 100408999,
  "status": "passed"
});
formatter.after({
  "duration": 351151745,
  "status": "passed"
});
});