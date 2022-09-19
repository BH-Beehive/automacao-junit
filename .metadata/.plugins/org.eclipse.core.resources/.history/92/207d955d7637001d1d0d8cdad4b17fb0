package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/automations-reports/automations-reports.html"},
				 features = "classpath:features",
				 glue = "",
				 tags = "",
				 snippets = SnippetType.CAMELCASE,
				 monochrome = true,
				 publish = true,
				 dryRun = true
		)

public class Runner {
	
}
