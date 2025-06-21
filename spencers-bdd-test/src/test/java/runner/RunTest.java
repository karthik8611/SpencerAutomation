package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="./features",
                 glue = "stepdefinitions",
				          dryRun=false,
				 tags="testcase1 or testcase2 or testcase3"
				)

public class RunTest {
	
}	