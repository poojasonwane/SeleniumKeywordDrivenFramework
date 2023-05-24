package executionEngine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import excelUtility.ReadExcelSheet;
import keywordDriven.ActionKeywords;

public class ExecutionTest 
{
	public static void main(String[] args) throws IOException, Exception, IllegalArgumentException, InvocationTargetException 
	{ 
	  ReadExcelSheet rs = new ReadExcelSheet(); 
	   rs.readExcelData(4); 
	  
	ActionKeywords ak = new ActionKeywords(); 
	   ak.openBrowser(); 
	   ak.navigate(); 
	   ak.enterEmail(); 
	   
	   ak.enterPassword(); 
	   ak.clickSignIn(); 
	   ak.profileImage(); 
	   ak.logout(); 
	   
	   ak.closeBrowser();
	   System.out.println("Test executed successfully"); 
	  } 

}
