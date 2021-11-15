package new26_10_21;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;


public class tavlaot_matrix {

	public static void main(String[] args) {
		
		
		
		// opening of the class
		
		// תרגילי טבלאות
		
		// tables pratice
		
		// targil 1
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/tabls/tables.html");
		
		
		 List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		    List<WebElement> col = driver.findElements(By.xpath("//td"));
		    
		    int rowCount = driver.findElements(By.xpath("//tr")).size();
		    System.out.println("there are " + rowCount + "rows in table" );
		    
		    int colCount = driver.findElements(By.xpath("//tr[1]//td")).size();
		    System.out.println("there are " + colCount + "cols in table" );
		
		
		    driver.quit();
		
		*/
		
		
		
		
		
		
		
		// תרגילי טבלאות
		
				// tables pratice
				
				// targil 2
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/tabls/tables.html");
		
		
		List<WebElement> group = new ArrayList<WebElement>();   
	    group = driver.findElements(By.xpath("//td[2]"));
	    int countA = 0;
	    int countB = 0;
	    int countC = 0;
	    
	    for(int i=0; i<group.size();i++) {
	    	String chars=group.get(i).getText();
	    	
	    	if (chars.equals("A")) 
	    		countA++;
	    	
	    	else if (chars.equals("B")) 
	    		countB++;
	    	
	    	else if (chars.equals("C")) 
	    		countC++;
	    	
	    }
	    
	    System.out.println("there are" + countA +  " from group a");
    	System.out.println("there are" + countB +  " from group b");
    	System.out.println("there are" + countC +  " from group c");
		
    	driver.quit();
		*/
		
		
		
		
		
		
		// תרגילי טבלאות
		
		// tables pratice
		
		// targil 2

       // another way to solve targil 2

		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/tabls/tables.html");

		
		
		try {
			
			System.out.println("----------------   2   -----------------------------");
			
			Thread.sleep(1000);
													
	  	 //   List  <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tab\"]/thead/tr/th"));
	   	// List <WebElement> row = driver.findElements(By.xpath("//*[@id=\"tab\"]/tbody/tr"));
			
			List <WebElement> companyGroups = driver.findElements(By.xpath("//td[2]"));
			int a=0, b=0 ,c=0;
			for (int i = 1; i < companyGroups.size(); i++) {
				
				String group =  companyGroups.get(i).getText();
				
				if (group.equals("A")) {a++;}
				
				if (group.equals("B")) {b++;}
				
				if (group.equals("C")) {c++;}
				
				
			}
			
			System.out.println("group a : " + a + "   group b : " +b +  "   group c : " + c );


		} catch (Exception e) {
			
		}

		
		driver.quit();
		
		*/
		
		
		
		
		
		
		
		// תרגילי טבלאות
		
				// tables pratice
				
				// targil 3

		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/tabls/tables.html");
		
		
		try {
			
			System.out.println("----------------   3   -----------------------------");
			
			Thread.sleep(3000);
													
			List <WebElement> price = driver.findElements(By.xpath("//td[3]"));
			
			
			String max;
			 double m=0,r=0;
			
			  for (int i =1;i<price.size();i++)
		        {    
				 
		            max= price.get(i).getText();
		           
		            
		            if (max.contains(",")) {
		            	max = max.replaceAll("," , "");

		            }
		             m = Double.parseDouble(max);

		            if(m>r)
		             {    
		                r=m;
		             }
		        }
		        System.out.println("Maximum current price is : "+ r);
		} catch (Exception e) {
			
		}
		
		driver.quit();
		*/
		
		
		
		
	
		
		// תרגילי טבלאות
		
		// tables pratice
		
		// targil 4
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/tabls/tables.html");
		
		
		try {
			
			System.out.println("----------------   4   -----------------------------");
		
			Thread.sleep(3000);
			
			List <WebElement> companyNames = driver.findElements(By.xpath("//td[1]"));
			

			  for (int i =1;i<companyNames.size();i++)
		        {    
		            if (companyNames.get(i).getText().toLowerCase().startsWith("a"))
		            {	
					System.out.println(companyNames.get(i).getText());
					}
		        }
		            
		} catch (Exception e) {
			
		}
		driver.quit();
		*/	
		
		
	
		
		
		// תרגילי טבלאות
		
				// tables pratice
				
				// targil 5
				
			/*	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://danielauto.net/practice/tabls/tables.html");
		
		
				try {
					
					System.out.println("----------------  5   -----------------------------");
					
					Thread.sleep(3000);
																				
					List <WebElement> companyNames = driver.findElements(By.xpath("//td[1]"));
					List <WebElement> companyGroups = driver.findElements(By.xpath("//td[2]"));
					
					  for (int i =1;i<companyNames.size();i++)
				        {    
						
				          //max = toUpperCase();
				            if (companyNames.get(i).getText().toLowerCase().startsWith("a")) {
				            	if (companyGroups.get(i).getText().equalsIgnoreCase("c")) {
				            		System.out.println(companyNames.get(i).getText());
								}
								
							}				            
				          
				        }
				} catch (Exception e) {
				
				}
		
				driver.quit();
		
		*/
		
				
				
		
		
		
		
		// תרגילי טבלאות
		
		// tables pratice
		
		// targil 6
		
		/*
     	System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://danielauto.net/practice/tabls/tables.html");

		
	    try {
	    	
	    	System.out.println("----------------   6   -----------------------------");
	    	
	    	Thread.sleep(3000);
	    												    	
	    	List <WebElement> change = driver.findElements(By.xpath("//td[5]"));
	    		    	
	    	String max;
	    	
	    	 double m=0;
	    	 
	    	 double sum=0;
	    	 
	    	  for (int i =1;i<change.size();i++)
	            {    
	    		  
	                max= change.get(i).getText().replaceAll(" +", "");          
	                 m = Double.parseDouble(max);
	                
	             sum=sum+m;
	            }
	    	
	            System.out.println("Total profit in percentages "+ new DecimalFormat("##.##").format(sum) );

	    } catch (Exception e) {
	    	
	    }

		driver.quit();
		*/
		
		
		
		// תרגילי טבלאות
		
				// tables pratice
				
				// targil 7
				
				/*
		     	System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("http://danielauto.net/practice/tabls/tableDynamic.html");
		
		
		
			    try {
			    	
			    	System.out.println("----------------   7   -----------------------------");
			    	
			    	Thread.sleep(3000);
			    	
			    	
			    	List<WebElement> row_num = driver.findElements(By.tagName("tr"));

			    	for (int i = 0; i < row_num.size(); i++) {

			    		List<WebElement> call_num = row_num.get(i).findElements(By.tagName("td"));


			    			int call_sise = call_num.size(); 
			    						    		

			    			System.out.println(driver.findElement(By.xpath("//tr["+(i+1)+"]/td[last()]")).getText());
			    	}
			    		
			    } 
			    catch (Exception e) {
			    	System.err.println("תרגיל 7 נפל");
			    }
			    driver.quit();
		*/
		
		
		
		
		
		
		// תרגילי טבלאות
		
		// tables pratice
		
		// targil 8
		
	/*	
     	System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://danielauto.net/practice/tabls/tableDynamic.html");
	

try {
	
	System.out.println("----------------   8   -----------------------------");
	
	Thread.sleep(3000);
	
		WebElement table = driver.findElement(By.xpath("/html/body/div[3]/table/tbody"));
	
	List<WebElement> row_num = table.findElements(By.tagName("tr"));
	int rows_count = row_num.size();
	
	
	for (int i = 0; i < row_num.size(); i++) {

		List<WebElement> colums = row_num.get(i).findElements(By.tagName("td"));
		int colums_cuont = colums.size();
		
		for (int j = 0; j < colums_cuont; j++) {
			System.out.println("in the row " + (i+1) + " colum " + (j+1) + " have number " + colums.get(j).getText());
			
		}
	}
} catch (Exception e) {
	
}
	
							
driver.quit();
	*/	
		
		
		
		
		

	}

}
