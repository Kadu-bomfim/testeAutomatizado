package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Utils.driver;

public class CadastroMaps {

    public CadastroMaps() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = " //div[@class='message success fadable']")
    public WebElement mensagemSucesso;

    @FindBy(id = "systemUser_userType")
    public WebElement userRole;

    @FindBy(id = "systemUser_status")
    public WebElement status;

    @FindBy(name = "btnSave")
    public WebElement botaoEditarESalvar;

    @FindBy(name = "systemUser[userName]")
    public WebElement campoUsername;

    @FindBy(name = "systemUser[employeeName][empName]")
    public WebElement campoEmplyeeName;

    @FindBy(id = "systemUser_password")
    public WebElement campoPassword;

    @FindBy(id = "systemUser_confirmPassword")
    public WebElement campoConfirmPassword;

    @FindBy(linkText = "Admin")
    public WebElement abaAdmin;

    @FindBy(id = "btnAdd")
    public WebElement botaoAdd;


}
