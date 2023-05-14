package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCheckoutPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement ContinueButton;

    public boolean verifyCheckoutPage() {
       return verifyCheckoutPage.isDisplayed();
    }

    public void setFirstName(String first){
        firstName.sendKeys(first);
    }
    public void setLastName(String Last){
        lastName.sendKeys(Last);
    }

    public void setPostalCode(String Code){
        postalCode.sendKeys(Code);
    }

    public void clickContinueButton(){
        ContinueButton.click();
    }
}
