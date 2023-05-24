package keywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Constants;

public class ActionKeywords 
{
	public static WebDriver driver; 
	public void openBrowser() 
	{ 
	  driver = new ChromeDriver(); 
	  driver.manage().window().maximize(); 
	 } 
	public void navigate() 
	{ 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.get(Constants.URL); 
	 } 
	public void enterEmail() 
	{ 
	  driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(Constants.username); 
	 } 
	public void enterPassword() 
	{ 
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Constants.password); 
	 } 
	public void clickSignIn() 
	{ 
	  driver.findElement(By.xpath("//button[text() = 'Sign in']")).click(); 
	 } 
	public void profileImage() 
	{ 
	  driver.findElement(By.xpath("//*[@id=\"ember15\"]/span")).click(); 
	 } 
	public void logout() 
	{ 
		
	  driver.findElement(By.xpath("//*[@id=\"ember17\"]")).click(); 
	} 
	public void closeBrowser() 
	{ 
	  driver.quit(); 
	 } 

}
