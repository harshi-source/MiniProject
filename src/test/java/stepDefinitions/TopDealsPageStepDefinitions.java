package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.LandingPage;
//import pageObjects.PageObjectManager;
import pageObjects.TopDealsPage;
import utils.Test;

import java.util.Iterator;
import java.util.Set;

public class TopDealsPageStepDefinitions {
    public WebDriver driver;
    public String topDealsPageProductName;
    public String landingPageProductName;
    Test test;
    //PageObjectManager pageObjectManager;
    //Single Responsibility Principle
    //loosely coupled
    public TopDealsPageStepDefinitions(Test test) {

        this.test = test;
    }
       @Then("user searched for {string} short name in Top Deals page")
   public void user_searched_for_same_short_name_in_offers_page(String shortName) throws InterruptedException {
           switchToTopDealsPage();
           //TopDealsPage topDealsPage=new TopDealsPage(test.driver);
           TopDealsPage topDealsPage= test.pageObjectManager.topDealsPage();
           topDealsPage.searchItem(shortName);
           Thread.sleep(2000);
           topDealsPageProductName=topDealsPage.getProductName();
       //WebElement topDealsSearchBox= test.driver.findElement(By.xpath("//input[@id='search-field']"));
        //topDealsSearchBox.sendKeys(shortName);
        //topDealsPageProductName= test.driver.findElement(By.xpath("//td[text()='Tomato']")).getText();
        System.out.println(topDealsPageProductName);

   }

    public void switchToTopDealsPage() {
       // test.driver.findElement(By.linkText("Top Deals")).click();
        //LandingPage landingPage=new LandingPage(test.driver);
        LandingPage landingPage= test.pageObjectManager.getLandingPage();
       landingPage.selectTopDeals();
//        Set<String> windowHandles = test.driver.getWindowHandles();
//        Iterator<String> it = windowHandles.iterator();
//        String parentWindow = it.next();
//        String childWindow = it.next();
//        test.driver.switchTo().window(childWindow);
        test.genericUtils.switchWindow();
    }


    @And("validate product name in the Top Deals page matches with the Landing page")
    public void validateProductNameInTheOffersPageMatchesWithTheLandingPage() {

        Assert.assertEquals(test.landingPageProductName,topDealsPageProductName);
        System.out.println("Landing page product name is matched with the Top Deals page product name");
    }
}


