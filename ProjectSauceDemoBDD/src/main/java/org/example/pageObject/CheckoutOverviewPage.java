package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

    public static WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//span[@class='title']")
    private WebElement verifyCheckoutOverviewPage;
    public boolean verifyCheckoutOverviewPage() {
        return verifyCheckoutOverviewPage.isDisplayed();
    }

    @FindBy (xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement verifyTotalPrice;
        public String verifyTotalPrice() {
            return verifyTotalPrice.getText().replace("Total: ", " ");
        }
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement FinishButton;
        public void clickFinishButton(){
            FinishButton.click();
    }

}
