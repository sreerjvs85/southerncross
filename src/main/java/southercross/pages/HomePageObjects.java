package southercross.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.IOException;

public class HomePageObjects {
    public final WebDriver driver;

    public HomePageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    @FindBy (how = How.LINK_TEXT, using = "Register")
    WebElement btnRegister;

    public RegisterPageObjects clickBtnRegister() throws IOException {
        btnRegister.click();
        return new RegisterPageObjects(driver);
    }

}
