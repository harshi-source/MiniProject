package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.LandingPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public WebDriver driver;
//whenever we call this webDriverManager() method in our tests, it should not create multiple drivers it should only create one driver.Driver should only initialize once.below code takes care of initializing the driver only once in the beginning and whenever we call the webDriverManager() method, it will simply return the driver if it is already initialized.
    public WebDriver webDriverManager() throws IOException {
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
        Properties prop =new Properties();
        prop.load(fis);
        String url= prop.getProperty("QAUrl");
        if(driver==null) {

            //driver = new ChromeDriver();
            //driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
                driver= new ChromeDriver();
                driver.manage().window().maximize();


            }
//            else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
//                //driver= new FirefoxDriver();
//                //driver.manage().window().maximize();
//
//
//            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(url);

        }

        return driver;
    }
}
