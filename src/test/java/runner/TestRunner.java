package runner;

import org.junit.runner.RunWith;

import base.Base;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features = "src/test/java/bddproject/features/LoginTest3.feature", glue = {"stepdefinitions", "hooks"}, monochrome = true, publish = true, tags = "@smoke and @sanity", snippets = SnippetType.CAMELCASE)
public class TestRunner extends Base {

}
