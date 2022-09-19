package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import page.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	@Dado("que o usuário digite um {string} e {string}")
	public void queOUsuárioDigiteUmE(String email, String senha) {
		loginPage.digitarNosInputs(email, senha);
	}
	
	@Dado("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    loginPage.clicarBotaoLogin();
	}
	
	@Entao("exibir a {string}")
	public void exibirA(String msg) {
		loginPage.validarMensagem(msg);
	}

}
