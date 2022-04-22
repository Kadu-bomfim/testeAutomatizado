package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.Utils.acessarSistema;
import static utils.Utils.*;

public class Hooks {

    @Before(order = 1)
    public void suitUp(){
        acessarSistema();
    }


    @After()
    public void suitDown() {
        driver.quit();
    }
}
