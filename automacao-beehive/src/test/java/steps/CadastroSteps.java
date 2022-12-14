package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.CadastroPage;

public class CadastroSteps {
	
	CadastroPage cadastroPage = new CadastroPage();
	
	@Quando("o usuário digitar um {string} e {string}")
	public void oUsuárioDigitarUmE(String email, String senha) {
		cadastroPage.digitarCamposEtapaUm(email, senha);
	}
	@Quando("clicar no botao proximo")
	public void clicarNoBotaoProximo() throws Exception {
	    cadastroPage.clicarBtnProximo();
	}
	@Quando("digitar uma {string}")
	public void digitarUma(String razaoSocial) {
		cadastroPage.digitarRazaoSocial(razaoSocial);
	}
	@Quando("digitar um {string}")
	public void digitarUm(String cnpj) {
		cadastroPage.digitarCnpj(cnpj);
	}
	@Quando("digitar um numero de {string} e de {string}")
	public void digitarUmNumeroDeEDe(String celular, String telefone) {
		cadastroPage.digitarNumeroCelularTelefone(celular, telefone);
	}
	
	@Quando("clicar no botao proxima etapa")
	public void clicarNoBotaoProximaEtapa() {
		cadastroPage.clicarProximoEtapaDois();
	}
	
	@Quando("o usuario vai digitar o {string}")
	public void oUsuarioVaiDigitarO(String cep) throws Exception {
		cadastroPage.digitarCep(cep);
	}
	@Quando("clicar no botao cadastrar")
	public void clicarNoBotaoCadastrar() {
		cadastroPage.clicarBtnCadastro();
	}
	@Entao("deve exiibir uma {string} de cadastrado realizado com sucesso")
	public void deveExiibirUmaDeCadastradoRealizadoComSucesso(String msg) {
		cadastroPage.validarCadastro(msg);
	}
	
	@Entao("deve aparecer uma {string} de erro")
	public void deveAparecerUmaDeErro(String msg) {
	    cadastroPage.validarCadastro(msg);
	}


	@Quando("o usuario escolher seu plano")
	public void oUsuarioEscolherSeuPlano() {
		cadastroPage.escolherPlano();
	}

}
