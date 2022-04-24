package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import page.LoginPage;

import static utils.Utils.acessarSistema;
import static utils.Utils.*;

public class Hooks {

    @Before(order = 1)
    public void suitUp(){
        acessarSistema();
    }

    @Before(order = 2, value = "@manterCadastro")
    public void fazerLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.realizarLogin();
    }


    @After()
    public void suitDown() {
        driver.quit();
    }
}
