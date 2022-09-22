package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "/Cucumber-Task/src/test/resources/Features/MobileValidation.feature", 
glue = "com.flipkart.stepdefinition",
monochrome=true,
plugin="html:target",
dryRun=false)

public class TestRunner {

}
