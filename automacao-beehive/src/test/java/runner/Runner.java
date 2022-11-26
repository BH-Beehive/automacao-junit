package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/cadastro-reports.html"},
				 features = "classpath:features",
				 glue = "steps",
				 tags = "@Suporte",
				 snippets = SnippetType.CAMELCASE,
				 monochrome = true,
				 dryRun = false
		)

public class Runner {
	
}
