package Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\VALI\\eclipse-workspace NEW\\com.BDD\\src\\main\\java\\Features\\Login.Feature",
				glue= {"Runner"},
				format= {"pretty","html:test_outout","json:json_outout/cucumber.json"},
				monochrome=true
                 )

public class LoginSteps {

}
