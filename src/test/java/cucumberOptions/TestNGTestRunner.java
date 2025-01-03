package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
    //parallel execution using TestNG triggers each scenarios in different tabs but it triggers scenarios in different windows when it runs in sequentially
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
