package steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import converter.DataConverter;
import dao.DatabaseReader;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Usuario;
import page.LoginPage;

public class LoginSteps {

    LoginPage page = new LoginPage();
    DatabaseReader databaseReader = new DatabaseReader();
    DataConverter dataConverter = new DataConverter();


    @Quando("o usuario informar o login invalido")
    public void oUsuarioInformarOLoginInvalido() throws JsonProcessingException {
        String dados = databaseReader.getData("loginInvalido");
        Usuario dadosTest = (Usuario) dataConverter.getDataConverter(Usuario.class, dados);
        page.informarLogin(dadosTest.getLogin());
    }

    @Quando("o usuario informar a senha e acionar o botao de login")
    public void oUsuarioInformarASenhaEAcionarOBotaoDeLogin() throws Exception, JsonProcessingException {
        String dados = databaseReader.getData("loginInvalido");
        Usuario dadosTest = (Usuario) dataConverter.getDataConverter(Usuario.class, dados);
        Thread.sleep(5000);
        page.informarSenhaELogar(dadosTest.getSenha());
    }

    @Entao("o sistema apresenta a mensagem de credenciais invalidas")
    public void oSistemaApresentaAMensagemDeCredenciaisInvalidas() {
        page.validarMsgErro();
    }

    @Quando("o usuario informar o login valido")
    public void oUsuarioInformarOLoginValido() throws JsonProcessingException {
        String dados = databaseReader.getData("loginValido");
        Usuario dadosTest = (Usuario) dataConverter.getDataConverter(Usuario.class, dados);
        page.informarLogin(dadosTest.getLogin());
    }


    @Entao("o sistema apresenta o logo do sino e o usuario logado")
    public void oSistemaApresentaOLogoDoSinoEOUsuarioLogado() {
        page.validarIconeSino();
        page.validarUsuarioLogado();
    }

    @Quando("o usuario informar login em branco")
    public void oUsuarioInformarLoginEmBranco() throws JsonProcessingException {
        String dados = databaseReader.getData("loginSemNome");
        Usuario dadosTest = (Usuario) dataConverter.getDataConverter(Usuario.class, dados);
        page.informarLogin(dadosTest.getLogin());
    }

    @Entao("o sistema apresenta a mensagem {string}")
    public void oSistemaApresentaAMensagem(String string) {
        page.msgLoginEmBranco(string);
    }

    @Quando("o usuario informar senha em branco")
    public void oUsuarioInformarSenhaEmBranco() throws JsonProcessingException{
        String dados = databaseReader.getData("loginSemSenha");
        Usuario dadosTest = (Usuario) dataConverter.getDataConverter(Usuario.class, dados);
        page.informarSenhaELogar(dadosTest.getSenha());
    }

    @Quando("acionar o botao login")
    public void acionarOBotaoLogin() {
        page.acionarBotaoLogin();
    }

}
