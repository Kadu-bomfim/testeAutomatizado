package page;

import maps.CadastroMaps;
import utils.Utils;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class CadastroPage {

    private String password;

    CadastroMaps cadastroMaps = new CadastroMaps();

    public void informarUserName() {
        escreverNoCampo(cadastroMaps.campoUsername, Utils.fake.name().firstName() +1);

    }

    public void escreverNoCampoEmployeeName(String employeeName) {
        cadastroMaps.campoEmplyeeName.sendKeys(employeeName);
    }

    public void clicarAbaAdmin() {
        cadastroMaps.abaAdmin.click();
    }

    public void clicarNoBotaoAdd() {
        cadastroMaps.botaoAdd.click();

    }

    public void escreverNoCampoPassword() {
        this.password = String.valueOf(Utils.fake.internet().password(8, 10, true));
        escreverNoCampo(cadastroMaps.campoPassword, this.password);
    }

    public void escreverNoConfirmPassword() {
        escreverNoCampo(cadastroMaps.campoConfirmPassword, this.password);
    }

    public void clicarBotaoEditar() {
        cadastroMaps.botaoEditarESalvar.click();

    }

    public boolean validarMesagemSucessoCadastro() {
        aguardarElemento(cadastroMaps.mensagemSucesso);
        assertTrue(cadastroMaps.mensagemSucesso.isDisplayed());
        return cadastroMaps.mensagemSucesso.isDisplayed();
    }




}
