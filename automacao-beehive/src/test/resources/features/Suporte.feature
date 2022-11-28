#language: pt
#encoding: UTF-8
#Autor: Andrew Ferrari
@Suporte
Funcionalidade: Cadastrar Suporte

  @CadastrarSuporteComSucesso @Regressivo
  Esquema do Cenario: Deve ser possivel cadastrar um suporte
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    E clique no botão
    E digite no campo nome <nomeSuporte>
    E digite no campo email <emailSuporte>
    E digite no campo senha <senhaSuporte>
    E digite no campo cpf <cpfSuporte>
    E digite no campo telefone <telefoneSuporte>
    E digite no campo celular <celularSuporte>
    E clique no botao cadastrar
    Entao o cadastro sera realizado com sucesso <nomeSuporte>

    Exemplos:
      | email                       | senha        | nomeSuporte    | emailSuporte           | senhaSuporte  | cpfSuporte       | telefoneSuporte | celularSuporte   |
      | 'albert_einstein@gmail.com' | 'albert@114' | 'Gabriel Hugo' | 'gabriel@slack.com.br' | 'Gabriel123#' | '229.058.493-21' | '4004-8999'     | '(11)96738-2716' |

  @CadastroSuporteInvalido @Regressivo
  Esquema do Cenario: Nao deve ser possivel realizar o cadastro
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    E clique no botão
    E clique no botao cadastrar
    Entao deve aparecer uma <mensagem> de erro

    Exemplos:
      | email                       | senha        | mensagem              |
      | 'albert_einstein@gmail.com' | 'albert@114' | 'Preencha os campos!' |

  @EditarSuporteComSucesso @Regressivo
  Esquema do Cenario: Deve ser possivel editar um suporte
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    E clique no botão editar
    E digite no campo nome <nomeSuporte>
    E digite no campo email <emailSuporte>
    E digite no campo senha <senhaSuporte>
    E digite no campo cpf <cpfSuporte>
    E digite no campo telefone <telefoneSuporte>
    E digite no campo celular <celularSuporte>
    E clique no botao salvar
    Entao deve aparecer uma <mensagem> de erro

    Exemplos:
      | email                       | senha        | nomeSuporte    | emailSuporte           | senhaSuporte  | cpfSuporte       | telefoneSuporte | celularSuporte   | mensagem                      |
      | 'albert_einstein@gmail.com' | 'albert@114' | 'Gabriel Hugo' | 'gabriel@slack.com.br' | 'Gabriel123#' | '229.058.493-21' | '4004-8999'     | '(11)96738-2716' | 'Perfil editado com sucesso!' |

  @DeletarSuporte @Regressivo
  Esquema do Cenario: Deve ser possivel deletar um suporte
    Dado que o usuário digite um <email> e <senha>
    E clicar no botao login
    E clique no botão deletar
    E clique no botao confirme
    Entao deve aparecer uma <mensagem> de erro

    Exemplos:
      | email                       | senha        | mensagem                        |
      | 'albert_einstein@gmail.com' | 'albert@114' | 'Suporte excluido com sucesso!' |