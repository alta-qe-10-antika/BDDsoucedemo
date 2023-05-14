package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {

    public static WebDriver driver;

    public SalesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortContainer;

    @FindBy(xpath = "//option[.='Name (Z to A)']")
    private WebElement sort;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addCart1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addCart2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement shoppingCart;



    public boolean verifySalesPage() {
        return verifySalesPage.isDisplayed();

    }

    public void clickSortContainer() {
        sortContainer.click();
    }

    public void clickSort() {
        sort.click();
    }

    public void clickAddCart1() {
        addCart1.click();

    }

    public void clickAddCart2() {
        addCart2.click();

    }

    public void clickShoppingCart() {
        shoppingCart.click();
    }



}
