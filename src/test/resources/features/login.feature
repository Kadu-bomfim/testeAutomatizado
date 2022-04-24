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
      Entao o sistema apresenta o logo do sino e o usuario logado

    @usuarioObrigatorio
    Cenario: campo username obrigatorio
      Quando o usuario informar login em branco
      E o usuario informar a senha e acionar o botao de login
      Entao o sistema apresenta a mensagem "Username cannot be empty"

    @senhaObrigatorio
    Cenario: campo senha obrigatorio
      Dado o usuario informar o login valido
      Quando o usuario informar senha em branco
      E acionar o botao login
      Entao o sistema apresenta a mensagem "Password cannot be empty"