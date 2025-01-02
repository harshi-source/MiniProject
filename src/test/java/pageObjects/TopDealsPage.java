package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopDealsPage {
    public WebDriver driver;
    public TopDealsPage(WebDriver driver){
        this.driver=driver;
    }
    By search = By.xpath("//input[@id='search-field']"); // Replace with the correct selector.

    By productName=By.xpath("//td[text()='Tomato']");
    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);
    }
    public void getSearchText(){
        driver.findElement(search).getText();
    }
    public String getProductName(){
        return  driver.findElement(productName).getText();
    }
}
