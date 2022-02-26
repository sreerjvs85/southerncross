package southercross.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegisterPageObjects {
    final WebDriver driver;

    public RegisterPageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,15),this);
    }

    @FindBy(how = How.ID, using = "username")
    WebElement txtUsername;

    @FindBy(how = How.ID, using = "firstName")
    WebElement txtFirstname;

    @FindBy(how = How.ID, using = "lastName")
    WebElement txtLastname;

    @FindBy(how = How.ID, using = "password")
    WebElement txtPassword;

    @FindBy(how = How.ID, using = "confirmPassword")
    WebElement txtConfirmPassword;

    @FindBy(how = How.XPATH, using = "//button[text()='Register']")
    WebElement btnRegister;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@class,'result')]")
    WebElement txtMessage;

    public void setTxtUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void setTxtFirstname(String fname) {
        txtFirstname.sendKeys(fname);
    }

    public void setTxtLastname(String lname) {
        txtLastname.sendKeys(lname);
    }

    public void setTxtPassword(String pass) {
        txtPassword.sendKeys(pass);
    }

    public void setTxtConfirmPassword(String cpass) {
        txtConfirmPassword.sendKeys(cpass);
    }

    public void clickBtnRegister() {
        btnRegister.click();
    }

    public String getMessage() {
        return txtMessage.getText();
    }

}
