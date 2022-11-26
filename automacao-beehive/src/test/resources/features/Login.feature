#language: pt
#encoding: UTF-8
#Autor: Andrew Ferrari
@Login
Funcionalidade: Login

  @LoginComSucesso
  Esquema do Cenario: Deve ser possivel logar com sucesso
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    Entao exibir a <mensagem>

    Exemplos:
      | email                       | senha        | mensagem |
      | 'albert_einstein@gmail.com' | 'albert@114' | 'Hive'   |

  @LoginInvalido
  Esquema do Cenario: Nao deve ser possivel realizar o login
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    E exibir a <mensagem>

    Exemplos:
      | email              | senha       | mensagem |
      | ''                 | ''          | 'Entrar' |
      | ''                 | 'Teste123@' | 'Entrar' |
      | 'andrew@gmail.com' | ''          | 'Entrar' |
