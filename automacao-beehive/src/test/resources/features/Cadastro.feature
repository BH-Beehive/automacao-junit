#language: pt
#encoding: UTF-8
#Autor: Andrew Ferrari
@Cadastro
Funcionalidade: Cadastro

  @CadastroComSucesso @Regressivo
  Esquema do Cenario: Deve ser possivel realizar o cadastro com sucesso
    Quando o usuario escolher seu plano
    Quando o usuário digitar um <email> e <senha>
    E clicar no botao proximo
    E digitar uma <razaoSocial>
    E digitar um <cnpj>
    E digitar um numero de <celular> e de <telefone>
    E clicar no botao proxima etapa
    E o usuario vai digitar o <cep>
    E clicar no botao cadastrar
    Entao deve exiibir uma <mensagem> de cadastrado realizado com sucesso

    Exemplos:
      | email              | senha      | razaoSocial      | cnpj                 | celular          | telefone    | cep        | mensagem |
      | 'hugoz2@gmail.com' | 'Hugo123@' | 'Hugo Solutions' | '89.347.329/4732-92' | '(11)91143-0847' | '2361-8674' | '04831110' | 'Entrar' |

  @CadastroRepetido @Regressivo
  Esquema do Cenario: nao deve conseguir realizar o cadastro novamente depois de ter ja feito o cadastro com as informacoes iguais
    Quando o usuario escolher seu plano
    Quando o usuário digitar um <email> e <senha>
    E clicar no botao proximo
    Entao deve aparecer uma <mensagem> de erro

    Exemplos:
      | email              | senha      | razaoSocial      | mensagem           |
      | 'hugoz2@gmail.com' | 'Hugo123@' | 'Hugo Solutions' | 'Email existente!' |

  @CadastroEmailOuSenhaInvalido @Regressivo
  Esquema do Cenario: nao deve realizar o cadastro com informacoes email e senha invalidos
    Quando o usuario escolher seu plano
    Quando o usuário digitar um <email> e <senha>
    E clicar no botao proximo
    Entao deve aparecer uma <mensagem> de erro

    Exemplos:
      | email              | senha  | mensagem          |
      | 'gustavo@gmail.cm' | 'Gu@1' | 'Email Inválido!' |

  @CadastroEtapa02Invalido @Regressivo
  Esquema do Cenario: nao deve realizar o cadastro com informacoes email e senha invalidos
    Quando o usuario escolher seu plano
    Quando o usuário digitar um <email> e <senha>
    E clicar no botao proximo
    E digitar uma <razaoSocial>
    E digitar um <cnpj>
    E digitar um numero de <celular> e de <telefone>
    E clicar no botao proxima etapa
    Entao deve aparecer uma <mensagem> de erro

    Exemplos:
      | email               | senha      | razaoSocial | cnpj                 | celular          | telefone    | mensagem                      |
      | 'gustavo@gmail.com' | 'Hugo123@' | 'BeeHive'   | ''                   | '(11)96443-0843' | '2665-8270' | 'Preencha os campos'          |
      | 'gustavo@gmail.com' | 'Hugo123@' | 'Sptech'    | 'o5.438.273/00kk-3a' | '(11)96443-0843' | '2665-8270' | 'CNPJ inválido!'              |
      | 'gustavo@gmail.com' | 'Hugo123@' | 'Sptech'    | '05.438.273/0001-31' | '(11)96443-084'  | '2665-8270' | 'Numero de celular inválido!' |
      | 'gustavo@gmail.com' | 'Hugo123@' | 'Sptech'    | '05.438.273/0001-31' | '(11)96443-08##' | '2665-8270' | 'Numero de celular inválido!' |
      | 'gustavo@gmail.com' | 'Hugo123@' | 'Sptech'    | '05.438.273/0001-31' | '(11)96443-0843' | '400#-892%' | 'Telefone inválido!'          |
