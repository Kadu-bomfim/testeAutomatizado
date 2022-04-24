package utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static ChromeDriver driver;
    public static Faker fake = new Faker();

    public static void acessarSistema() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    public static void aguardarElemento(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    public boolean isActive(WebElement aba) {
        return aba.isDisplayed();
    }

    public boolean validaErros(WebElement aba) {
        if (aba.isDisplayed()) {
            Integer erros = Integer.valueOf(aba.getText());
            return erros == 0;
        } else {
            return Boolean.FALSE;

        }
    }

    protected void selecionarOptionAleatorio(WebElement campo) {
        Select select = new Select(campo);
        select.selectByIndex(Utils.fake.number().numberBetween(1, select.getOptions().size() - 1));
    }

    protected void selecionarOptionInvalid(WebElement campo) {
        Select select = new Select(campo);
        select.selectByIndex(0);
    }

    public static void escreverNoCampo(WebElement campo, String texto) {
        campo.clear();
        campo.sendKeys(texto);
    }

    public static void clicarRadio(WebElement option) {
        clicarBotao(option);
    }
    public static void clicarBotao(WebElement campo){
        campo.click();
    }
}
