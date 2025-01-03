package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
//we add cucumber adaptor plugin for generating extent reports, taken reference from https://extentreports.com/docs/versions/4/java/cucumber4.html
@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true,tags="@placeOrder",
plugin={"html:target/report.html","json:target/report.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
//when we run parallel,using TestNG, it will open multiple browsers at a time and executes all the test simultaneously
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
