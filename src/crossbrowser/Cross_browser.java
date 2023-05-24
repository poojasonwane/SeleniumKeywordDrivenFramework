package crossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser 
{
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	 public void create(String browser) throws Exception
	 {
		//Checking for 'firefox' parameters
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("FirefoxBrowser Test Done");
		}
		//Checking for 'chrome' parameters
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("ChromeBrowser Test Done");
		}
		else
		{
			
			throw new Exception("Invalid browser");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	 }
	
	  @Test
	  public void testParameterWithXMl() throws InterruptedException 
	  {
		  driver.get("http://lms.fortunecloudindia.com/");
		  Thread.sleep(4000);
		  
		  WebElement uname = driver.findElement(By.name("username"));
		  //Fill user name
		  uname.sendKeys("poojasonwane00@gmail.com");
		  
		  Thread.sleep(4000);
		  WebElement pwd = driver.findElement(By.name("password"));
		  //Fill password
		  pwd.sendKeys("S0H7XEX");
		  Thread.sleep(6000); 
		  
		  WebElement  login = driver.findElement(By.name("login"));
		  //Hit search button
		  login.click();
		  
	  }
	  
	  @AfterTest
	  public void close()
	  {
		  driver.close();
	  }
}
