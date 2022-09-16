#language: pt
#encoding: UTF-8
#Autor: Andrew Ferrari
@Cadastro
Funcionalidade: Login

  @CadastroComSucesso
  Esquema do Cenario: Deve ser possivel realizar o cadastro com sucesso
    Quando o usuario clicar no botao cadastro
    E que o usuário digite um <email> e <senha> validos
    E clicar no botao proximo
    E digitar uma <razaoSocial>
    E digitar um <cnpj>
    E digitar um numero de <celular> e de <telefone>
    E clicar no botao proximo
    E o usuario vai digitar o <cep>
    E clicar no botao cadastrar
    Entao deve exiibir uma <mensagem> de cadastrado realizado com sucesso

    Exemplos: 
      | email            | senha      | razaoSocial      | cnpj                 | celular           | telefone        | cep        | mensagem                 |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Hugo Solutions' | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | '08490090' | 'Cadastro bem-sucedido!' |

  @CadastroRepetido
  Esquema do Cenario: nao deve conseguir realizar o cadastro novamente depois de ter ja feito o cadastro com as informacoes iguais
    Quando o usuario clicar no botao cadastro
    E que o usuário digite um <email> e <senha> validos
    E clicar no botao proximo
    E digitar uma <razaoSocial>
    E digitar um <cnpj>
    E digitar um numero de <celular> e de <telefone>
    E clicar no botao proximo
    E o usuario vai digitar o <cep>
    E clicar no botao cadastrar
    Entao deve exiibir uma <mensagem> de cadastrado realizado com sucesso

    Exemplos: 
      | email            | senha      | razaoSocial      | cnpj                 | celular           | telefone        | cep        | mensagem            |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Hugo Solutions' | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | '08490090' | 'Erro no cadastro!' |

  @CadastroEmailOuSenhaInvalido
  Esquema do Cenario: nao deve realizar o cadastro com informacoes email e senha invalidos
    Quando o usuario clicar no botao cadastro
    E inserir <email> ou <senha> invalidos
    Entao deve aparecer uma <mensagem> de erro

    Exemplos: 
      | email                     | senha         | mensagem          |
      | 'gustavo@gmail.cm'        | 'Gu@1'        | 'Email Inválido!' |
      | '.....@gmail.com'         | 'Gustavo123@' | 'Email Inválido!' |
      | 'g@gmail.com'             | 'Gustavo123@' | 'Email Inválido!' |
      | 'gustavo@@@@@@gmail.com'  | 'Gustavo123@' | 'Email Inválido!' |
      | 'gustavo@gmail.commmmmmm' | 'Gustavo123@' | 'Email Inválido!' |
      | 'gustavo@.com'            | 'Gustavo123@' | 'Email Inválido!' |
      | 'gustavo@gmail.com'       | 'Gust..@'     | 'Senha inválida!' |
      | 'gustavo@gmail.com'       | '@1An'        | 'Senha inválida!' |
      | 'gustavo@gmail.com'       | '12a'         | 'Senha inválida!' |
      | 'gustavo@gmail.com'       | '%gu gu%1 24' | 'Senha inválida!' |

  @CadastroEtapa02Invalido
  Esquema do Cenario: nao deve realizar o cadastro com informacoes email e senha invalidos
    Quando o usuario clicar no botao cadastro
    E que o usuário digite um <email> e <senha> validos
    E clicar no botao proximo
    E digitar uma <razaoSocial>
    E digitar um <cnpj>
    E digitar um numero de <celular> e de <telefone>
    E clicar no botao proximo
    Entao deve aparecer uma <mensagem> de erro

    Exemplos: 
      | email            | senha      | razaoSocial  | cnpj                 | celular           | telefone        | mensagem                            |
      | 'hugo@gmail.com' | 'Hugo123@' | '.......'    | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | 'Preencha os campos'                |
      | 'hugo@gmail.com' | 'Hugo123@' | '@@@@..+'    | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | 'Preencha os campos'                |
      | 'hugo@gmail.com' | 'Hugo123@' | '++=.....'   | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | 'Preencha os campos'                |
      | 'hugo@gmail.com' | 'Hugo123@' | '$$$**&&&&!' | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | 'Preencha os campos'                |
      | 'hugo@gmail.com' | 'Hugo123@' | 'BeeHive'    | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-8273' | 'Preencha os campos'                |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '05.438.273/0001-3'  | '(11) 96443-0846' | '(11)2665-8273' | 'CNPJ inválido!'                    |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '........../....-..' | '(11) 96443-0846' | '(11)2665-8273' | 'CNPJ inválido!'                    |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | 'o5.438.273/00kk-3a' | '(11) 96443-0846' | '(11)2665-8273' | 'CNPJ inválido!'                    |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '01.236.374/3822-42' | '(11) 96443-0846' | '(11)2665-8273' | 'CNPJ já cadastrado!'               |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '05.438.273/0001-36' | '(11) 96443-084.' | '(11)2665-8273' | 'Numero de celular inválido!'       |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '05.438.273/0001-36' | '(11) 96443-08'   | '(11)2665-8273' | 'Numero de celular inválido!'       |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665-..'   | 'Telefone inválido!'                |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '05.438.273/0001-36' | '(11) 96443-0846' | '(11)2665'      | 'Telefone inválido!'                |
      | 'hugo@gmail.com' | 'Hugo123@' | 'Sptech'     | '05.438.273/0001-36' | '(11) 96443-0846' | '4002-8922'     | 'Numero de telefone já cadastrado!' |