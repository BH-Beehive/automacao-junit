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

    private SelenideElement btnSalvar = $(By.xpath("//button[.='SALVAR']"));

    private SelenideElement btnComfirm = $(By.xpath("//button[.='Sim, excluir!']"));

    private SelenideElement btnExcluir = $(By.xpath("//button[@class='button-table excluir']"));

    private SelenideElement btnEdit = $(By.xpath("//button[@class='button-table editar']"));

    private SelenideElement inputNomeSuporteEdit = $(By.id("inputNomeSuporteEditar"));

    private SelenideElement inputEmailSlackEdit = $(By.id("inputEmailSuporteEditar"));

    private SelenideElement inputSenhaEdit = $(By.id("inputSenhaSuporteEditar"));

    private SelenideElement inputCpfEdit = $(By.id("inputCpfEditar"));

    private SelenideElement inputTelEdit = $(By.id("inputTelSuporteEditar"));

    private SelenideElement inputCelEdit = $(By.id("inputCelSuporteEditar"));

    public void cliqueBotaoNovo() {
        btnNovo.click();
    }

    public void inserirNomeSuporte(String nome, Boolean isEdit) {
        if(isEdit) {
            inputNomeSuporteEdit.sendKeys(nome);
        }else {
            inputSuporte.sendKeys(nome);
        }

    }

    public void inserirEmailSlack(String email, Boolean isEdit) {
        if(isEdit) {
            inputEmailSlackEdit.sendKeys(email);
        }else {
            inputSlack.sendKeys(email);
        }

    }

    public void inserirSenha(String senha, Boolean isEdit) {
        if(isEdit) {
            inputSenhaEdit.sendKeys(senha);
        }else {
            inputSenha.sendKeys(senha);
        }

    }

    public void inserirCpf(String cpf, Boolean isEdit) {
        if(isEdit) {
            inputCpfEdit.sendKeys(cpf);
        }else {
            inputCpf.sendKeys(cpf);
        }

    }

    public void inserirTelefone(String fone, Boolean isEdit) {
        if(isEdit) {
            inputTelEdit.sendKeys(fone);
        }else {
            inputTelefone.sendKeys(fone);
        }

    }

    public void inserirCelular(String cell, Boolean isEdit) {
        if(isEdit) {
            inputCelEdit.sendKeys(cell);
        }else {
            inputCelular.sendKeys(cell);
        }

    }

    public void cliqueBotaoCadastrar() {
        btnCadastro.click();
    }

    public void cliqueBotaoSalavar() {
        btnSalvar.click();
    }

    public void botaoConfirmar() {
        btnComfirm.click();
    }

    public void botaoEdit() {
        btnEdit.click();
    }

    public void botaoExcluir() {
        btnExcluir.click();
    }

    public void validarCadastro(String nome) {
        if(nome.equals("Gabriel Hugo")) {
            nomeSuporte.shouldBe(exactText(nome));
        }else {

        }
    }

}
