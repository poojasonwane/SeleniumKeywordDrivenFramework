package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClass_pom 
{
     WebDriver driver;  
      
     @FindBy(xpath="//b[text()=\" Student Login\"]")  
     WebElement studLogin;  
    
     public HomeClass_pom(WebDriver driver) 
     {  
          this.driver = driver;  
          PageFactory.initElements(driver, this);  
     }  
   
     // This function is to click on signIn button  
     public lmsLoginPage clickSignInButton() 
     {  
    	 studLogin.click(); 
    	 
    	  java.util.ArrayList<String> tabs = new java.util.ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
 		
          return new lmsLoginPage(driver);  
     }


}
