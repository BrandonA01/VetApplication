package com.softwareinstitute.allen.brandon.vet.cucumber.cat;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/cucumber",
        glue = "StepDefinitions")
public class RunCucumberTest {

}