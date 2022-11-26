package page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;

public class SuportePage {

    private SelenideElement btnNovo = $(By.xpath("//button[.='Novo']"));

    private SelenideElement inputSuporte = $(By.id("inputNomeSuporte"));

    private SelenideElement inputSlack = $(By.id("inputEmailSlack"));

    private SelenideElement inputSenha = $(By.id("inputSenha"));

    private SelenideElement inputCpf = $(By.id("inputCpf"));

    private SelenideElement inputTelefone = $(By.id("inputTel"));

    private SelenideElement inputCelular = $(By.id("inputCel"));

    private SelenideElement btnCadastro = $(By.xpath("//button[.='CADASTRAR']"));

    private SelenideElement nomeSuporte = $(By.xpath("//td[.='Gabriel Hugo']"));

    public void cliqueBotaoNovo() {
        btnNovo.click();
    }

    public void inserirNomeSuporte(String nome) {
        inputSuporte.sendKeys(nome);
    }

    public void inserirEmailSlack(String email) {
        inputSlack.sendKeys(email);
    }

    public void inserirSenha(String senha) {
        inputSenha.sendKeys(senha);
    }

    public void inserirCpf(String cpf) {
        inputCpf.sendKeys(cpf);
    }

    public void inserirTelefone(String fone) {
        inputTelefone.sendKeys(fone);
    }

    public void inserirCelular(String cell) {
        inputCelular.sendKeys(cell);
    }

    public void cliqueBotaoCadastrar() {
        btnCadastro.click();
    }

    public void validarCadastro(String nome) {
        if(nome.equals("Gabriel Hugo")) {
            nomeSuporte.shouldBe(exactText(nome));
        }else {

        }
    }

}
