package runners;

import io.cucumber.testng.*;

@CucumberOptions(features = "./src/test/resources/features/punkApi",
		glue = "stepDefinitions",
		tags = {"@test"},
		plugin = { "json:target/punkApi.json", "rerun:target/rerun.txt", "html:target/punkApiReports" }, strict = false
		)



public class PunkApiRunner extends AbstractTestNGCucumberTests {

}
