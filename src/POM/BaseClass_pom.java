package POM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass_pom {

     public static WebDriver driver;  
    
     @BeforeSuite  
     public void initializeWebDriver() throws IOException 
     {  
          System.setProperty("webdriver.chrome.driver","D:\\POOJA SONWANE\\automation testing jar files\\chromedriver_win32\\chromedriver.exe");  
          driver = new ChromeDriver();  
      
          // To maximize browser  
          driver.manage().window().maximize();  
      
          // Implicit wait  
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
      
          // To open Gmail site  
          driver.get("https://fortunecloudindia.com/");  
     }  
    
     @AfterSuite  
     public void quitDriver() {  
          driver.quit();  
     }  

}
