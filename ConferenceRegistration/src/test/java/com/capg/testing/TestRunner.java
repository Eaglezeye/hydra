package com.capg.testing;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"features"},
glue= {"com.capg.testing.stepdef"})
public class TestRunner {

}
