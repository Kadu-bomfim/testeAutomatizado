#language: pt
#enconding: UTF-8

@manterCadastro
Funcionalidade: Cadastro

  @cadastrarUsuario
  Cenario: Cadastrar Usuario
    Quando acionar a aba Admin e acionar o botao add
    E preencher formulario com dados validos e salvar
    Entao o sistema apresenta mensagem de sucesso
