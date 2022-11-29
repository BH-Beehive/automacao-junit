package page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;

public class MaquinaPage {

    private SelenideElement btnDashboard = $(By.xpath("//h2[.='Dashboard']"));

    private SelenideElement btnAdicionarSetor = $(By.xpath("//p[.='Adicionar setor']"));

    private SelenideElement inputNomeSetor = $(By.id("inputNomeSetor"));

    private SelenideElement btnAddMaquina = $(By.xpath("//p[.='Adicionar máquina']"));

    private SelenideElement inputHostName = $(By.id("inputHostName"));

    private SelenideElement selectTipo = $(By.id("selectTipo"));
    private SelenideElement selectSetores = $(By.id("selectSetores"));

    private SelenideElement btnCadastroSetor = $(By.xpath("//button[@class='cadastrar-Setor']"));

    public void cliqueBotaoDash() {
        btnDashboard.click();
    }

    public void cliqueBotaoAddSetor() {
        btnAdicionarSetor.click();
    }

    public void inserirNomeSetor(String nome) {
        inputNomeSetor.sendKeys(nome);
    }

    public void cliqueAddMaquina() throws InterruptedException {
        Thread.sleep(3000);
        btnAddMaquina.click();
    }

    public void inserirHostName(String hostname) {
        inputHostName.sendKeys(hostname);
    }

    public void escolherMaquina(String tipo) {
        selectTipo.selectOption(tipo);
    }

    public void escolherSetor(String nome) {
        selectSetores.selectOption(nome);
    }

    public void cadastrarSetor() {
        btnCadastroSetor.click();
    }

}
