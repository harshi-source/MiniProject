package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true,tags="@placeOrder or @searchItem",
plugin={"html:target/report.html","json:target/report.json"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
//when we run parallel,using TestNG, it will open multiple browsers at a time and executes all the test simultaneously
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
