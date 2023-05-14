package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChartPage {

    public static WebDriver driver;

    public ChartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement RemoveTshirtRed;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement Checkout;

    public void clickRemoveTshirtRed() {
        RemoveTshirtRed.click();
    }

    public void clickCheckout(){
        Checkout.click();
    }
}
