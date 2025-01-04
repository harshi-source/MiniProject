package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.Test;

import java.io.File;
import java.io.IOException;

public class Hooks {
    public Test test;

    public Hooks(Test test) {
        this.test = test;
    }
//After each scenario, the driver will get quit by using @After annotation provided by Cucumber
    @After
    public void tearDown() throws IOException {
       System.out.println("Hooks method is called");
        test.base.webDriverManager().quit();


    }
//   @AfterStep
//    public void AddScreenshot(Scenario scenario) throws IOException{
//        WebDriver driver= test.base.webDriverManager();
//        if(scenario.isFailed()) {
//            //screenshot
//            File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
//            //scenario.attach(data,media type,name);
//            scenario.attach(fileContent, "img/png", "image");
//
//        }
//   }

@AfterStep
public void addScreenshot(Scenario scenario) throws IOException {
    WebDriver driver = test.base.webDriverManager();

    if (scenario.isFailed()) {
        // Capture the screenshot
        File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define the path for the screenshot
        String screenshotPath = "test-output/SparkReport/screenshots/" + System.currentTimeMillis() + ".png";
        File destinationPath = new File(screenshotPath);

        // Save the screenshot to the specified location
        FileUtils.copyFile(sourcePath, destinationPath);

        // Attach the screenshot to the scenario (relative path for Spark report)
        scenario.attach(FileUtils.readFileToByteArray(destinationPath), "image/png", "Failed Step Screenshot");
    }
}


}
