package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver=driver;
    }
    private By search = By.xpath("//input[@type='search']");// Replace with the correct selector.

    private By productName=By.cssSelector("h4.product-name");
    private By topDeals= By.linkText("Top Deals");
    private By incrementCartItem=By.cssSelector("a.increment");
    private By addTocart= By.cssSelector(".product-action button");//parent is .product-action and child is button
    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);
    }
public void getSearchText(){
        driver.findElement(search).getText();
}
public String getProductName(){
       return  driver.findElement(productName).getText();
}
public void selectTopDeals(){
        driver.findElement(topDeals).click();
}
    public String getTitleOfLandingPage(){
        return driver.getTitle();
    }
    public void incrementQuantity(int quantity){
        int i = quantity-1;
        while(i>0){
            driver.findElement(incrementCartItem).click();
            i--;
        }
    }
    public void addToCart(){
        driver.findElement(addTocart).click();
    }
}

