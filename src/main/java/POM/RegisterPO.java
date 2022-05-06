package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPO extends AbstractClass{

    public RegisterPO() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a.login")
    private WebElement signInBtn;

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitBtn;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(name = "passwd")
    private WebElement password;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(name = "address1")
    private WebElement address;

    public void clickOnSignInButton(){
        clickFunction(signInBtn);
    }

    public void typeEmail(String email){
        sendKeysFunction(emailTextBox,email);
    }

    public void clickOnSubmitButton(){
        clickFunction(submitBtn);
    }

    public void clickOnGender(){
        clickFunction(gender);
    }

    public void typeFirstAndLastName(String firstname, String lastname){
        sendKeysFunction(firstName,firstname);
        sendKeysFunction(lastName,lastname);
    }

    public void typePassword(String pass1){
        sendKeysFunction(password,pass1);
    }

    public void typeCompanyName(String companyName){
        sendKeysFunction(company,companyName);
    }

    public void typeAddress(String address1){
        sendKeysFunction(address,address1);
    }
}
