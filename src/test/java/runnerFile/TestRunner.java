package runnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features= {"C:\\Users\\hp\\eclipse-workspace\\com.bdd.framework\\src\\test\\java\\featureFiles\\login.feature"},
glue= {"stepDefinitions"},
dryRun=false,
monochrome=true

//plugin= {"pretty","json:Report/Cucumber.json",
//		"junit:Report/XMLCucucumber.xml",
//		"html:Report/cucumber-html-reports"
//		}
//strict=true
)
public class TestRunner {

}
