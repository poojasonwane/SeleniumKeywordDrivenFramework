package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\POOJA SONWANE\\automation testing jar files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://lms.fortunecloudindia.com/");
		
		d1.manage().window().maximize();
		
		LoginPage lms = new LoginPage(d1);
		
		lms.enterEmail("poojasonwane00@gmail.com");
		
		lms.enterPassword("S0H7XEX");
		
		lms.clickLoginButton();

	}

}
