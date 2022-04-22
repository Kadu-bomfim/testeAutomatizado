package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Utils.driver;

public class LoginMaps {

    public LoginMaps() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(id = "txtPassword")
    public WebElement inputPassword;

    @FindBy(css = "#btnLogin")
    public WebElement btnLogin;

    @FindBy(id = "spanMessage")
    public WebElement msgLoginInvalido;

    @FindBy(xpath = "//span[@id='notification']/.")
    public WebElement iconeSino;

}
