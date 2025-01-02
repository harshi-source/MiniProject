package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {
    //we put all the generic code i.e, reusable code in this class such as handling a child windows, to handle waits etc.,
    public WebDriver driver;
    public GenericUtils(WebDriver driver){
        this.driver=driver;
    }
    public void switchWindow(){
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
    }
}
