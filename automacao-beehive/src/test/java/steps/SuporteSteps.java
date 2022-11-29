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
        suportePage.inserirNomeSuporte(nome, false);
    }
    @Dado("digite no campo email {string}")
    public void digiteNoCampoEmail(String email) {
        suportePage.inserirEmailSlack(email, false);
    }
    @Dado("digite no campo senha {string}")
    public void digiteNoCampoSenha(String senha) {
        suportePage.inserirSenha(senha, false);
    }
    @Dado("digite no campo cpf {string}")
    public void digiteNoCampoCpf(String cpf) {
        suportePage.inserirCpf(cpf, false);
    }

    @Dado("digite no campo telefone {string}")
    public void digiteNoCampoTelefone(String fone) {
        suportePage.inserirTelefone(fone, false);
    }

    @Dado("digite no campo celular {string}")
    public void digiteNoCampoCelular(String cell) {
        suportePage.inserirCelular(cell, false);
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
        suportePage.botaoExcluir();
    }

    @E("clique no botao confirme")
    public void cliqueNoBotaoConfirme() {
        suportePage.botaoConfirmar();
    }

    @E("clique no botão editar")
    public void cliqueNoBotãoEditar() {
        suportePage.botaoEdit();
    }

    @E("digite no campo nome editar {string}")
    public void digiteNoCampoNomeEditarNomeSuporte(String nome) {
        suportePage.inserirNomeSuporte(nome, true);
    }

    @E("digite no campo email editar {string}")
    public void digiteNoCampoEmailEditarEmailSuporte(String email) {
        suportePage.inserirEmailSlack(email, true);
    }


    @E("digite no campo senha editar {string}")
    public void digiteNoCampoSenhaEditarSenhaSuporte(String senha) {
        suportePage.inserirSenha(senha, true);
    }

    @E("digite no campo cpf editar {string}")
    public void digiteNoCampoCpfEditarCpfSuporte(String cpf) {
        suportePage.inserirCpf(cpf, true);
    }

    @E("digite no campo telefone editar {string}")
    public void digiteNoCampoTelefoneEditarTelefoneSuporte(String tell) {
        suportePage.inserirTelefone(tell, true);
    }

    @E("digite no campo celular editar {string}")
    public void digiteNoCampoCelularEditarCelularSuporte(String cell) {
        suportePage.inserirCelular(cell, true);
    }
}
