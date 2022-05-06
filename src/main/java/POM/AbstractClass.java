package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.time.Duration;

public abstract class AbstractClass {

    protected WebDriver driver = Driver.getDriver();

    WebDriverWait wait;

    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void Assertion(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        System.out.println("My message is: " + actual.getText());
    }

    public void selectAnyElementFromDropdown(WebElement dropdown, String element) {
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",element);
    }


}

