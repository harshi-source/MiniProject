package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
//we add cucumber adaptor plugin for generating extent reports, taken reference from https://extentreports.com/docs/versions/4/java/cucumber4.html
@CucumberOptions(features = "@target/failed_scenarios.txt",glue = "stepDefinitions",monochrome = true,
        plugin={"html:target/report.html","json:target/report.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//This class is used to only trigger the failed scenarios
public class FailedTestRunner extends AbstractTestNGCucumberTests {
    //when we run parallel,using TestNG, it will open multiple browsers at a time and executes all the test simultaneously
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
