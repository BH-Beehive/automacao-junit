package page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;

public class CadastroPage {
	
	//Elementos
	
	private SelenideElement inputEmail = $(By.id("inputEmail"));
	
	private SelenideElement inputSenha = $(By.id("inputSenha"));
	
	private SelenideElement inputConfirmarSenha = $(By.id("inputConfirmarSenha"));
	
	private SelenideElement btnProximo = $(By.id("botaoProximaEtapa"));
	
	private SelenideElement btnProximoEtapaDois = $(By.id("botaoProximaEtapa2"));
	
	private SelenideElement inputRazaoSocial = $(By.id("inputRazaoSocial"));
	
	private SelenideElement inputCnpj = $(By.id("inputCnpj"));
	
	private SelenideElement inputCelular = $(By.id("inputCelular"));
	
	private SelenideElement inputTelefone = $(By.id("inputTelefone"));
	
	private SelenideElement inputCep = $(By.id("inputCep"));
	
	private SelenideElement btnCadastrar = $(By.id("botaoCadastrar"));
	
	private SelenideElement msgLogin = $(By.xpath("//h2[.='Entrar']"));
	
	private SelenideElement msgErro = $(By.xpath("//h2[@class='swal2-title']"));
	
	private SelenideElement textoTelaCadastro = $(By.xpath("//p[@class='form-title-cadastro']"));

	private SelenideElement escolherPlanoCadastro = $(By.xpath("//button[.='Adquirir Plano']"));
	
	
	//Métodos
	
	public void digitarCamposEtapaUm(String email, String senha) {
		inputEmail.sendKeys(email);
		inputSenha.sendKeys(senha);
		inputConfirmarSenha.sendKeys(senha);
	}
	
	public void clicarBtnProximo() throws Exception {
		btnProximo.click();
	}
	
	public void clicarProximoEtapaDois() {
		btnProximoEtapaDois.click();
	}
	
	public void digitarRazaoSocial(String razaoSocial) {
		inputRazaoSocial.sendKeys(razaoSocial);
	}
	
	public void digitarCnpj(String cnpj) {
		inputCnpj.sendKeys(cnpj);
	}
	
	public void digitarNumeroCelularTelefone(String celular, String telefone) {
		inputCelular.sendKeys(celular);
		inputTelefone.sendKeys(telefone);
	}
	
	public void digitarCep(String cep) throws Exception {
		inputCep.sendKeys(cep);
		textoTelaCadastro.click();
		Thread.sleep(4000);
	}
	
	public void clicarBtnCadastro() {
		btnCadastrar.click();
	}

	public void escolherPlano() {
		escolherPlanoCadastro.click();
	}
	
	public void validarCadastro(String msg) {
		
		if(msg.equals("Entrar")) {
			msgLogin.shouldBe(exactText(msg));
		}else if(msg.equals("Email existente!")) {
			msgErro.shouldBe(exactText(msg));
		}else if(msg.equals("Email Inválido!")) {
			msgErro.shouldBe(exactText(msg));
		}else if(msg.equals("Senha inválida!")) {
			msgErro.shouldBe(exactText(msg));
		}else if(msg.equals("Preencha os campos")) {
			msgErro.shouldBe(exactText(msg));
		}else if(msg.equals("CNPJ inválido!")) {
			msgErro.shouldBe(exactText(msg));
		}else if(msg.equals("Numero de celular inválido!")) {
			msgErro.shouldBe(exactText(msg));
		}else {
			msgErro.shouldBe(exactText(msg));
		}
		
	}
}
