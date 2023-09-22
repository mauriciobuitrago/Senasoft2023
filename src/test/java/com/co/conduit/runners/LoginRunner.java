package com.co.conduit.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.co.conduit.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class LoginRunner {
}
