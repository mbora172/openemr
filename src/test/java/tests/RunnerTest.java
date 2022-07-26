package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "stepDefinitions",
tags="@Smoke",
plugin = {"pretty","json:target/cucumber.json",
        "html:target/cucumber.html",
"rerun:target/rerun.txt"})
public class RunnerTest {
}
