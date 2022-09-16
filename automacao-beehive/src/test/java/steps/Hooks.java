package steps;

import static com.codeborne.selenide.Selenide.*;
import static utils.Utils.*;

import commons.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	Browser browser = new Browser();
	
	@Before
	public void setUpIndex() {
		browser.openPage();
	}
	
	@After
	public void tearDwon(Scenario scenario) {
		capturarScreenshot(scenario);
		closeWindow();
	}
	
}