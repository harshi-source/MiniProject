package stepDefinitions;

import io.cucumber.java.After;
import utils.Test;

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
}
