package POM;

import org.testng.annotations.Test;

public class TestClass extends BaseClass_pom
{
     @Test    
     public void init() throws Exception 
     {    
    	 	HomeClass_pom  HomeP = new HomeClass_pom (driver);    
    	 	lmsLoginPage LoginP =  HomeP.clickSignInButton();    
          
          
    	 	LoginP.enterEmail("poojasonwane00@gmail.com");    
    	     
    	 	LoginP.enterPassword("S0H7XEX"); 
    	 	
    	 	LoginP.clickNextButton();   
         
     }    

}
