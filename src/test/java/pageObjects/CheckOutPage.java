package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    public WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
    By cartBag = By.cssSelector("img[alt='Cart']");
    By checkOutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
    By applyButton = By.cssSelector(".promoBtn");
    By placeOrder = By.xpath("//button[text()='Place Order']");



    public void checkOutItems() {
        driver.findElement(cartBag).click();
        driver.findElement(checkOutButton).click();
    }

    public Boolean verifyPromoButton() {
        return driver.findElement(applyButton).isDisplayed();

    }

    public Boolean verifyPlaceOrder() {
        return driver.findElement(placeOrder).isDisplayed();

    }
}
