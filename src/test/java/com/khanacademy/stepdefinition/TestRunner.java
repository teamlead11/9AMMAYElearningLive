package com.khanacademy.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/math/Counting.feature", tags = {}, monochrome = true, glue = "com.khanacademy.stepdefinition", dryRun = false, plugin = {
		"html:target" })

public class TestRunner {

}
