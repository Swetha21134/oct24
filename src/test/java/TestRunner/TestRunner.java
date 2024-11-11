package TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\swetha.yanala\\eclipse-workspace\\sw\\oct2024\\src\\test\\java\\Features\\login.feature"},
        glue= {"StepDenition"},
        plugin={"pretty"},
        		monochrome=true
        		)
        


public class TestRunner {

}
