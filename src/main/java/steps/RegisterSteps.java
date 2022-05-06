package steps;

import POM.RegisterPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class RegisterSteps {

    private WebDriver driver;
    RegisterPO registerPO=new RegisterPO();

    @Given("navigate to website")
    public void navigateToWebsite() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
    }

    @And("click on Sign in button")
    public void clickOnSignInButton() {
        registerPO.clickOnSignInButton();
    }

    @Then("type an {string}")
    public void typeAn(String email) {
        registerPO.typeEmail(email);
    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        registerPO.clickOnSubmitButton();
    }

    @And("choose a title")
    public void chooseATitle() {
        registerPO.clickOnGender();
    }

    @Then("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        registerPO.typeFirstAndLastName(firstname,lastname);
    }

    @And("type a password {string}")
    public void typeAPassword(String sifre) {
        registerPO.typePassword(sifre);
    }

    @And("type a company {string}")
    public void typeACompany(String company) {
        registerPO.typeCompanyName(company);
    }

    @And("type an address{string}")
    public void typeAnAddress(String address) {
        registerPO.typeAddress(address);
    }

    @After
    public void quitDriver(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Driver.quitDriver();
    }
}
