package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeatureFiles/formFill.feature",
		glue="stepDefinations",
		dryRun=false,
		plugin={"pretty","html:target/report/cucumber.html","json:target/report/cucumber.json","junit:target/report/cucumber.xml"}
		
		
		
		
		)

public class FuneralTest {

}
