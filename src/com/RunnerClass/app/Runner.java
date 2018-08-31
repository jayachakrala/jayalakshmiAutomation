package com.RunnerClass.app;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue={"com.stepdefinitions"},
				monochrome=true,
				plugin={"html:reports.html","json:tc.json"},
		tags={"@smoketest"}
		
		)

public class Runner {

}
