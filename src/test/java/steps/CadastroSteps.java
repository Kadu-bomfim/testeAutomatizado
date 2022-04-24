package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.CadastroPage;

public class CadastroSteps {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("acionar a aba Admin e acionar o botao add")
    public void acionarAAbaAdminEAcionarOBotaoAdd() {
        cadastroPage.clicarAbaAdmin();
        cadastroPage.clicarNoBotaoAdd();
    }

    @Quando("preencher formulario com dados validos e salvar")
    public void preencherFormularioComDadosValidosESalvar() throws Exception{
        cadastroPage.escreverNoCampoEmployeeName("Nina Patel");
        cadastroPage.informarUserName();
        cadastroPage.escreverNoCampoPassword();
        cadastroPage.escreverNoConfirmPassword();
        cadastroPage.clicarBotaoEditar();
        Thread.sleep(1000);
    }

    @Entao("o sistema apresenta mensagem de sucesso")
    public void oSistemaApresentaMensagemDeSucesso() {
        cadastroPage.validarMesagemSucessoCadastro();
    }

}
