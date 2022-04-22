$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
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
  "name": "o sistema apresenta o logo do sino e o usuario logado \"Welcome Paul\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LoginSteps.oSistemaApresentaOLogoDoSinoEOUsuarioLogado(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});