package steps;

import static com.codeborne.selenide.Selenide.*;
import static utils.Utils.*;

import commons.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	Browser browser = new Browser();
	
	
	
	@Before(order = 0, value = "@Login")
	public void setUpLogin() {
		browser.openPage("Login.html");
	}
	
	@Before(order = 0, value = "@Cadastro")
	public void setUpCadastro() {
		browser.openPage("Planos.html");
	}

	@Before(order = 0, value = "@Suporte")
	public void setUpSuporte() {
		browser.openPage("Login.html");
	}

	@Before(order = 0, value = "@Maquina")
	public void setUpMaquina() {
		browser.openPage("Login.html");
	}
	
	@After
	public void tearDwon(Scenario scenario) {
		capturarScreenshot(scenario);
		closeWindow();
	}
	
}
