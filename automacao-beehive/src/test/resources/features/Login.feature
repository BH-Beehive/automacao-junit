#language: pt
#encoding: UTF-8
#Autor: Andrew Ferrari
@Login
Funcionalidade: Login

  @LoginComSucesso
  Esquema do Cenario: Deve ser possivel logar com sucesso
    Dado que o usuário digite um <email> e <senha> validos
    E exibir a <mensagem> de logado com sucesso

    Exemplos: 
      | email              | senha       | mensagem              |
      | 'andrew@gmail.com' | 'Teste123@' | 'Logado com sucesso!' |

  @LoginInvalido
  Esquema do Cenario: Nao deve ser possivel realizar o login
    Dado que o usuário digite um <email> e <senha> invalidos
    E exibir a <mensagem> de login nao realizado

    Exemplos: 
      | email              | senha       | mensagem                     |
      | 'andrew@gmail.com' | 'Teste123@' | 'Email e/ou senha inválidos' |
      | ''                 | ''          | 'Email e/ou senha inválidos' |
      | ''                 | 'Teste123@' | 'Email e/ou senha inválidos' |
      | 'andrew@gmail.com' | ''          | 'Email e/ou senha inválidos' |
