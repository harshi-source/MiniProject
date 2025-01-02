package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

//we are avoiding to create objects for the page classes inside the step definition files and we are injecting this class directly in the step defintions

public class Test {
    public WebDriver driver;
    public String landingPageProductName;
    public String  topDealsPageProductName;
    public PageObjectManager pageObjectManager;
    public Base base;
    public GenericUtils genericUtils;
    public Test(){
        Base base=new Base();
         pageObjectManager=new PageObjectManager(base.webDriverManager());
        genericUtils=new GenericUtils(base.webDriverManager());
    }
}
