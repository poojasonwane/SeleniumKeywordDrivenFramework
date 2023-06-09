package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utility.Constants;

public class ReadExcelSheet 
{
	public ArrayList readExcelData(int colNo) throws IOException 
	{ 
	// Call filePath variable using class name. 
	     String filePath = Constants.filePath; 

	// Create an object of file class and pass filePath as an input parameter to its constructor. 
	     File file = new File(filePath); 

	// Create an object of FileInputStream class and pass file as parameter to its constructor. 
	     FileInputStream fis = new FileInputStream(file); 

	// Create an object of XSSFWorkbook class and pass fis as parameter to its. 
	    XSSFWorkbook wb = new XSSFWorkbook(fis); 
	    XSSFSheet sheet = wb.getSheet("Sheet1"); 
	   
	  Iterator row = sheet.rowIterator(); 
	     row.next(); 

	// Create an ArrayList object of String type. It will accept String value only. 
	     ArrayList ar = new ArrayList(); 

	// Checking the next element availability using reference variable row. 
	   while(row.hasNext()) 
	   { 
	// Moving cursor to next Row using reference variable row. 
	     Row r = (Row) row.next(); 

	// Moving cursor to the cell by getting cell number. 
	     Cell c = r.getCell(colNo); 

	// Read the value of the cell using getStringCellValue() method. 
	     String data = c.getStringCellValue(); 

	// Adding the value of the cells in the Arraylist by passing 'data'. 
	     ar.add(data); 
	// Or, one line code: 
	      ar.add(((Row) row.next()).getCell(colNo).getStringCellValue()); 
	  } 
	    System.out.println("List: " +ar); 
	// Return the data to the Arraylist method. 
	      return ar; 
	  } 

}
