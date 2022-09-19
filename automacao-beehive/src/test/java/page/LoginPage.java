package page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {
	
	private SelenideElement inputEmail = $(By.id("inputEmailLogin"));
	
	private SelenideElement inputSenha = $(By.id("inputSenhaLogin"));
	
	private SelenideElement btnLogin = $(By.id("btnEntrar"));
	
	private SelenideElement sucessLogin = $(By.xpath("//span[.='Hive']"));
	
	private SelenideElement erroLogin = $(By.xpath("//h2[.='Entrar']"));
	
	public void digitarNosInputs(String email, String senha) {
		inputEmail.sendKeys(email);
		inputSenha.sendKeys(senha);
	}
	
	public void clicarBotaoLogin() {
		btnLogin.click();
	}

	public void validarMensagem(String msg) {
		if(msg.equals("Hive")) {
			sucessLogin.shouldBe(exactText(msg));
		}else {
			erroLogin.shouldBe(exactText(msg));
		}
		
	}

}
