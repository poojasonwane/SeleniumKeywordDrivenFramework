package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lmsLoginPage 
{

    private WebDriver driver;

    // Using @FindBy to locate elements on the page
    @FindBy(xpath = "//*[@id=\"id_username\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"id_password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/form/input[2]")
    private WebElement loginButton;

    // Constructor to initialize the driver and instantiate elements using PageFactory
    public lmsLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickNextButton() {
        loginButton.click();
    }


}
