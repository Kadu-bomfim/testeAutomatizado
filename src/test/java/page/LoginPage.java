package page;

import maps.LoginMaps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

public class LoginPage {

    LoginMaps maps = new LoginMaps();

    public void informarLogin(String login) {
        maps.userName.sendKeys(login);

    }

    public void informarSenhaELogar(String senha) {
        maps.inputPassword.sendKeys(senha);
        maps.btnLogin.click();
    }

    public void validarIconeSino() {
        Assert.assertTrue(maps.iconeSino.isDisplayed());
    }

    public void validarMsgErro() {
        Assert.assertTrue(maps.msgLoginInvalido.isDisplayed());
    }

    public void validarUsuarioLogado(String nomeUsuario) {
        WebElement usuario = driver.findElement(By.xpath("//a[.='" + nomeUsuario + "']"));
        assertTrue(usuario.isDisplayed());

    }


}
