@SauceDemo
Feature: Sauce Demo
  As a User I Want to Login to SauceDemo Website

  Scenario: Sauce Demo
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page
    Then User sort product Name Z to A
    Then User add item on cart
    And User Click cart
    Then User Remove chart Tshirt Red
    Then User Checkout
    Then User already on checkout information page
    When User input "antika" as firstName and input "sarii" as lastName and input "0000" as postalCode
    Then User already on Checkout Overview page
    And User already check Total Price
    Then User click Finish Button
