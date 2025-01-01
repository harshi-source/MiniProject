//package stepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import java.util.Iterator;
//import java.util.Set;
//
//public class GreenKartStepDefinitions {
//    public WebDriver driver;
//    public String landingPageProductName;
//    public String topDealsPageProductName;
//    @Given("user is on the GreenKart Landing page")
//    public void user_is_on_the_green_kart_landing_page() {
//         driver = new ChromeDriver();
//         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//    }
//    @When("user searched with short name {string} and extracted actual name of the product")
//    public void user_searched_with_short_name_and_extracted_actual_name_of_the_product(String shortName) {
//       driver.findElement(By.cssSelector("input.search-keyword")).sendKeys(shortName);
//       landingPageProductName= driver.findElement(By.xpath("//h4[contains(text(),'Tomato')]")).getText().split("-")[0].trim();
//       System.out.println(landingPageProductName);
//    }
//    @Then("user searched for {string} short name in Top Deals page")
//    public void user_searched_for_same_short_name_in_offers_page(String shortName) {
//        driver.findElement(By.linkText("Top Deals")).click();
//        Set<String> windowHandles = driver.getWindowHandles();
//        Iterator<String> it = windowHandles.iterator();
//        String parentWindow = it.next();
//        String childWindow = it.next();
//        driver.switchTo().window(childWindow);
//        WebElement topDealsSearchBox= driver.findElement(By.xpath("//input[@id='search-field']"));
//        topDealsSearchBox.sendKeys(shortName);
//        topDealsPageProductName= driver.findElement(By.xpath("//td[text()='Tomato']")).getText();
//        System.out.println(topDealsPageProductName);
//
//    }
//
//
//    @And("validate product name in the Top Deals page matches with the Landing page")
//    public void validateProductNameInTheOffersPageMatchesWithTheLandingPage() {
//        Assert.assertEquals(landingPageProductName,topDealsPageProductName);
//        System.out.println("Landing page product name is matched with the Top Deals page product name");
//    }
//}
