//package pageObjects;
//
//import org.openqa.selenium.WebDriver;
////in this class we are going to create objects for all page object files and assign the driver to all the individual page object files
////This class takes the driver from webDriverManager() method of Base class and deligates it to all the page object files
////PageObjectmanager is getting initialised in Test class
//public class PageObjectManager {
//    public LandingPage landingPage;
//    public WebDriver driver;
//    public TopDealsPage topDealsPage;
//    public PageObjectManager(WebDriver driver){
//        this.driver=driver;
//    }
//    public LandingPage getLandingPage(){
//        landingPage=new LandingPage(driver);
//        return landingPage;
//    }
//    public TopDealsPage topDealsPage(){
//        topDealsPage=new TopDealsPage(driver);
//        return topDealsPage;
//    }
//}
