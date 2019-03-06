package CucumberJava;
 
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.*;


@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = "Feature",
		glue = {"CucumberJava"}
		) 

public class TestRunner { }