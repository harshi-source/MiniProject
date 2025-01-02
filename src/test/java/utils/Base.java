package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;

public class Base {
    public WebDriver driver;
//whenever we call this webDriverManager() method in our tests, it should not create multiple drivers it should only create one driver.Driver should only initialize once.below code takes care of initializing the driver only once in the beginning and whenever we call the webDriverManager() method, it will simply return the driver if it is already initialized.
    public WebDriver webDriverManager(){
        if(driver==null) {

            driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            driver.manage().window().maximize();
        }

        return driver;
    }
}
