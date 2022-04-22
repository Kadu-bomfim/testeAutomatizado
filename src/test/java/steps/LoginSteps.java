package steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import converter.DataConverter;
import dao.DatabaseReader;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Usuario;
import page.LoginPage;
import utils.Utils;

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
    public void oUsuarioInformarASenhaEAcionarOBotaoDeLogin() throws JsonProcessingException {
        String dados = databaseReader.getData("loginInvalido");
        Usuario dadosTest = (Usuario) dataConverter.getDataConverter(Usuario.class, dados);
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


    @Entao("o sistema apresenta o logo do sino e o usuario logado {string}")
    public void oSistemaApresentaOLogoDoSinoEOUsuarioLogado(String usuarioLogado) {
        page.validarIconeSino();
        page.validarUsuarioLogado(usuarioLogado);
    }




}
