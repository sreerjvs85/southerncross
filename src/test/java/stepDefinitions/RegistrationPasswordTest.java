package stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import southercross.browserLibrary.BrowserFunctions;
import southercross.commonLibrary.WebElementFunctions;
import southercross.pages.HomePageObjects;
import southercross.pages.RegisterPageObjects;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.Date;

public class RegistrationPasswordTest {
    WebDriver driver;

    String actualMessage;

    RegisterPageObjects registerPageObjects;

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed())
        {
            WebElementFunctions.takesScreenshot(driver);
        }
        BrowserFunctions.quitDriver();
        System.out.println("TC Stop: " + new Date());
    }
    @Given("I'm on home screen of Buggy app using {string} and clicked on Register button")
    public void iMOnHomeScreenOfBuggyAppUsingAndClickedOnRegisterButton(String browser) throws IOException {
        System.out.println("TC Start: " + new Date());
        driver = BrowserFunctions.getDriver(browser, "https://buggy.justtestit.org/");
        registerPageObjects = new HomePageObjects(driver).clickBtnRegister();
    }


    @When("I enter username {string}, firstname {string}, lastname {string}, password {string}, confirm password {string} and click submit")
    public void iEnterUsernameFirstnameLastnamePasswordConfirmPasswordAndClickSubmit(String username, String fname, String lname, String pass, String cpass) {
        registerPageObjects.setTxtUsername(username);
        registerPageObjects.setTxtFirstname(fname);
        registerPageObjects.setTxtLastname(lname);
        registerPageObjects.setTxtPassword(pass);
        registerPageObjects.setTxtConfirmPassword(cpass);
        registerPageObjects.clickBtnRegister();
        actualMessage = registerPageObjects.getMessage();
    }

    @Then("If i get error message, capture and validate the {string}.")
    public void ifIGetErrorMessageCaptureAndValidateThe(String expectedMessage) {
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
