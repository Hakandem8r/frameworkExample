package steps;

import POM.ContactUsPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.awt.*;
import java.time.Duration;

public class ContactUsSteps {

    private WebDriver driver;
    ContactUsPO contactUsPO=new ContactUsPO();

    @Given("I navigate to website")
    public void iNavigateToWebsite() {
        driver= Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
    }

    @Then("I click on contact us button")
    public void iClickOnContactUsButton() {
        contactUsPO.clickContactUsBtn();
    }

    @And("I select Subject Heading")
    public void iSelectSubjectHeading() {
        contactUsPO.selectFromDropdown();
    }

    @Then("I type an Email {string}")
    public void iTypeAnEmail(String email) {
        contactUsPO.typeEmail(email);
    }

    @And("I type an order reference")
    public void iTypeAnOrderReference() {
        contactUsPO.typeOrderReference();
    }

    @And("I type a message")
    public void iTypeAMessage() {
        contactUsPO.typeMessageInArea();
    }

    @When("I attach a file")
    public void iAttachAFile() throws InterruptedException, AWTException {
        contactUsPO.chooseFileFromComputer();
        contactUsPO.closeTheWindow();
    }

    @And("I click on send it button")
    public void iClickOnSendItButton() {
        contactUsPO.clickOnSendButton();
    }

    @Then("I verify success message")
    public void iVerifySuccessMessage() {
        contactUsPO.assertMyMessage();
    }

    @After
    public void quitDriver(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Driver.quitDriver();
    }
}
