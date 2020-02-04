


package com.app.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"
				
		},
		tags = "@smoke",
		features = "src/test/resources/features/", 
		glue = "com/app/step_definitions",
		dryRun = false
		
		)


public class SmokeTestRunner  extends AbstractTestNGCucumberTests{

}
