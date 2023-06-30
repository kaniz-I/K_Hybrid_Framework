package st.ny.myrunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//plugin = {""},
		features = {".//Features/"}, 
		glue = {"st.ny.stepDefintion"}
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
