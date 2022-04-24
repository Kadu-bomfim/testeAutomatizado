package page;

import maps.LoginMaps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

public class LoginPage {

    LoginMaps maps = new LoginMaps();

    public void realizarLogin() {
        informarLogin("Admin");
        informarSenhaELogar("admin123");

    }

    public void informarLogin(String login) {
        maps.userName.sendKeys(login);
    }

    public void informarSenhaELogar(String senha) {
        maps.inputPassword.sendKeys(senha);
        maps.btnLogin.click();
    }

    public void validarIconeSino() {
        WebDriverWait espera = new WebDriverWait(driver, 5);
        espera.until(ExpectedConditions.presenceOfElementLocated(By.id("notification")));
        Assert.assertTrue(maps.iconeSino.isDisplayed());
    }

    public void validarMsgErro() {
        Assert.assertTrue(maps.msgLoginInvalido.isDisplayed());
    }

    public void validarUsuarioLogado() {
        WebElement usuario = driver.findElement(By.id("welcome"));
        assertTrue(usuario.isDisplayed());
    }

    public void acionarBotaoLogin() {
        maps.btnLogin.click();
    }

    public void msgLoginEmBranco(String msg) {
        Assert.assertEquals(msg, maps.msgLogin.getText());
    }


}
