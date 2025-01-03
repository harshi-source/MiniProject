package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

//we are avoiding to create objects for the page classes inside the step definition files and we are injecting this class directly in the step defintions
// this Test class is the heart of the framework
public class Test {
    public WebDriver driver;
    public String landingPageProductName;
    public String  topDealsPageProductName;
    public PageObjectManager pageObjectManager;
    public Base base;
    public GenericUtils genericUtils;
    public Test() throws IOException {
         base=new Base();
         pageObjectManager=new PageObjectManager(base.webDriverManager());
        genericUtils=new GenericUtils(base.webDriverManager());
    }
}
