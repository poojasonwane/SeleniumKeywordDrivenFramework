package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"id_username\"]")
	private WebElement emailField;
	
	@FindBy(xpath="//*[@id=\"id_password\"]")
	private WebElement passField;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		passField.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}
