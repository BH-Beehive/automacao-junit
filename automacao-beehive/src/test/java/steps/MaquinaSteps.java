package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import page.MaquinaPage;
import page.SuportePage;

public class MaquinaSteps {

    MaquinaPage maquinaPage = new MaquinaPage();

    @Dado("clique no botao dashboard")
    public void cliqueNoBotaoDashboard() {
        maquinaPage.cliqueBotaoDash();
    }
    @Dado("clique no botao adicionar setor")
    public void cliqueNoBotaoAdicionarSetor() {
        maquinaPage.cliqueBotaoAddSetor();
    }
    @Dado("digite o nome do setor {string}")
    public void digiteONomeDoSetor(String nomeSetor) {
        maquinaPage.inserirNomeSetor(nomeSetor);
    }
    @Dado("clique no botao adicionar maquina")
    public void cliqueNoBotaoAdicionarMaquina() throws InterruptedException {
        maquinaPage.cliqueAddMaquina();
    }
    @Dado("digite o nome da maquina {string}")
    public void digiteONomeDaMaquina(String nomeMaquina) {
        maquinaPage.inserirHostName(nomeMaquina);
    }
    @Dado("escolha o tipo da maquina {string}")
    public void escolhaOTipoDaMaquina(String tipo) {
        maquinaPage.escolherMaquina(tipo);
    }
    @Dado("escolhe o setor {string}")
    public void escolheOSetor(String nomeSetor)  {
        maquinaPage.escolherSetor(nomeSetor);
    }

    @E("clique no botao cadastrar setor")
    public void cliqueNoBotaoCadastrarSetor() {
        maquinaPage.cadastrarSetor();
    }
}
