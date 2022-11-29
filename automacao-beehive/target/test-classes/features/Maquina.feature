#language: pt
#encoding: UTF-8
#Autor: Andrew Ferrari
@Maquina
Funcionalidade: Cadastrar Maquina e setor

  @CadastrarMaquina @Regressivo
  Esquema do Cenario: Deve ser possivel cadastrar uma maquina
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    E clique no botao dashboard
    E clique no botao adicionar setor
    E digite o nome do setor <nomeSetor>
    E clique no botao cadastrar setor
    E clique no botao adicionar maquina
    E digite o nome da maquina <hostname>
    E escolha o tipo da maquina <tipo>
    E escolhe o setor <nomeSetor>
    E clique no botao cadastrar
    Entao o cadastro sera realizado com sucesso <hostname>

    Exemplos:
      | email                       | senha        | nomeSetor      | hostname    | tipo      |
      | 'albert_einstein@gmail.com' | 'albert@114' | 'Ambulatorios' | 'maqAmbula' | 'Maquina' |
