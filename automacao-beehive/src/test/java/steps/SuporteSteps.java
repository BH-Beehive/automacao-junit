package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import page.SuportePage;

public class SuporteSteps {

    SuportePage suportePage = new SuportePage();

    @E("clique no botão")
    public void cliqueNoBotão() {
        suportePage.cliqueBotaoNovo();
    }

    @Dado("digite no campo nome {string}")
    public void digiteNoCampoNome(String nome) {
        suportePage.inserirNomeSuporte(nome);
    }
    @Dado("digite no campo email {string}")
    public void digiteNoCampoEmail(String email) {
        suportePage.inserirEmailSlack(email);
    }
    @Dado("digite no campo senha {string}")
    public void digiteNoCampoSenha(String senha) {
        suportePage.inserirSenha(senha);
    }
    @Dado("digite no campo cpf {string}")
    public void digiteNoCampoCpf(String cpf) {
        suportePage.inserirCpf(cpf);
    }

    @Dado("digite no campo telefone {string}")
    public void digiteNoCampoTelefone(String fone) {
        suportePage.inserirTelefone(fone);
    }

    @Dado("digite no campo celular {string}")
    public void digiteNoCampoCelular(String cell) {
        suportePage.inserirCelular(cell);
    }
    @Dado("clique no botao cadastrar")
    public void cliqueNoBotaoCadastrar() {
        suportePage.cliqueBotaoCadastrar();
    }
    @Entao("o cadastro sera realizado com sucesso {string}")
    public void oCadastroSeraRealizadoComSucesso(String nome) {

    }


    @E("clique no botao salvar")
    public void cliqueNoBotaoSalvar() {
        suportePage.cliqueBotaoSalavar();
    }

    @E("clique no botão deletar")
    public void cliqueNoBotãoDeletar() {

    }

    @E("clique no botao confirme")
    public void cliqueNoBotaoConfirme() {
        suportePage.botaoConfirmar();
    }
}
