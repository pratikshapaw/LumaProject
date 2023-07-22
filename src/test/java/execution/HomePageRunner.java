package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\Feature\\HomePage.feature"},
		glue= {"execution"},
		plugin= {"pretty"}
		
		)

public class HomePageRunner extends AbstractTestNGCucumberTests{

}
