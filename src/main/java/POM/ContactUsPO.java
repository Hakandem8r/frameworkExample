package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ContactUsPO extends AbstractClass{

    public ContactUsPO() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsBtn;

    public void clickContactUsBtn(){
        clickFunction(contactUsBtn);
    }


    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown(){
        selectAnyElementFromDropdown(subjectHeadingDropdown,"Webmaster");
    }


    @FindBy(css = "input[data-validate='isEmail']")
    private WebElement inputEmail;

    public void typeEmail( String Email){
        sendKeysFunction(inputEmail,Email);
    }


    @FindBy(name = "id_order")
    private WebElement orderReference;

    public void typeOrderReference(){
        sendKeysFunction(orderReference,"Order 123");
    }


    @FindBy(id = "message")
    private WebElement messageArea;

    public void typeMessageInArea(){
        sendKeysFunction(messageArea,"I want to change the product.");
    }

    @FindBy(id = "uniform-fileUpload")
    private WebElement clickUploadFile;

    public void chooseFileFromComputer(){
        clickFunction(clickUploadFile);
    }

    @FindBy(id = "fileUpload")
    private WebElement attachFile;

    public void closeTheWindow() throws AWTException, InterruptedException {
        StringSelection stringRbt=new StringSelection("C:\\Users\\hakan.demir\\OneDrive - CGM\\Desktop\\Screenshot_5.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringRbt,null);
        Robot rbt=new Robot();
        rbt.waitForIdle(); //Kendisinden önceki isin bitmesini bekler, zaman da girilebilir
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_ENTER);
        //sendKeysFunction(attachFile,"C:\\Users\\hakan.demir\\OneDrive - CGM\\Desktop\\Screenshot_5.png");
    }



    @FindBy(id = "submitMessage")
    private WebElement sendBtn;

    public void clickOnSendButton(){
        clickFunction(sendBtn);
    }


    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage(){
        Assertion(successMessage,"Your message has been successfully sent to our team.");
    }




  /*  public void uploadaFile(){
        getDriver().findElement(By.name("[MAX_FILE_SIZE] input")).sendKeys(uploadAnyPhotoFromTheComputer.getAbsolutePath());
    }
*/
}
