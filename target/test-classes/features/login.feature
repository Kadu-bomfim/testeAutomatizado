#language: pt
#enconding: UTF-8

  @login
  Funcionalidade: Login


    @loginInvalido
    Cenario: Ralizar login invalido
      Quando o usuario informar o login invalido
      E o usuario informar a senha e acionar o botao de login
      Entao o sistema apresenta a mensagem de credenciais invalidas

    @loginValido
    Cenario: Ralizar login
      Quando o usuario informar o login valido
      E o usuario informar a senha e acionar o botao de login
      Entao o sistema apresenta o logo do sino e o usuario logado "Welcome Paul"