package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;
//import utils.Base;
import utils.Test;

public class LandingPageStepDefinitions {
    public WebDriver driver;
    public String landingPageProductName;
    Test test;

    public LandingPageStepDefinitions(Test test){
        this.test=test;
    }

    @Given("user is on the GreenKart Landing page")
    public void user_is_on_the_green_kart_landing_page() {
//         test.driver = new ChromeDriver();
//       test.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

   }
    @When("user searched with short name {string} and extracted actual name of the product")
   public void user_searched_with_short_name_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException {
        //LandingPage landingPage = new LandingPage(test.driver);
        LandingPage landingPage= test.pageObjectManager.getLandingPage();
        landingPage.searchItem(shortName);
       //test.driver.findElement(By.cssSelector("input.search-keyword")).sendKeys(shortName);
      //test.landingPageProductName= test.driver.findElement(By.xpath("//h4[contains(text(),'Tomato')]")).getText().split("-")[0].trim();
        Thread.sleep(2000);
        test.landingPageProductName= landingPage.getProductName().split("-")[0].trim();
      Thread.sleep(2000);
       System.out.println(test.landingPageProductName);
   }
}
