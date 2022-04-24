$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/cadastro.feature");
formatter.feature({
  "name": "Cadastro",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@manterCadastro"
    }
  ]
});
formatter.scenario({
  "name": "Cadastrar Usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@manterCadastro"
    },
    {
      "name": "@cadastrarUsuario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "acionar a aba Admin e acionar o botao add",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.CadastroSteps.acionarAAbaAdminEAcionarOBotaoAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher formulario com dados validos e salvar",
  "keyword": "E "
});
formatter.match({
  "location": "steps.CadastroSteps.preencherFormularioComDadosValidosESalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.CadastroSteps.oSistemaApresentaMensagemDeSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Ralizar login invalido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginInvalido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o login invalido",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarOLoginInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a senha e acionar o botao de login",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarASenhaEAcionarOBotaoDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a mensagem de credenciais invalidas",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LoginSteps.oSistemaApresentaAMensagemDeCredenciaisInvalidas()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Ralizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginValido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o login valido",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarOLoginValido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a senha e acionar o botao de login",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarASenhaEAcionarOBotaoDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta o logo do sino e o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LoginSteps.oSistemaApresentaOLogoDoSinoEOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "campo username obrigatorio",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@usuarioObrigatorio"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar login em branco",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarLoginEmBranco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar a senha e acionar o botao de login",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarASenhaEAcionarOBotaoDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a mensagem \"Username cannot be empty\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LoginSteps.oSistemaApresentaAMensagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "campo senha obrigatorio",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@senhaObrigatorio"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o login valido",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarOLoginValido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar senha em branco",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LoginSteps.oUsuarioInformarSenhaEmBranco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao login",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LoginSteps.acionarOBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a mensagem \"Password cannot be empty\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LoginSteps.oSistemaApresentaAMensagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});