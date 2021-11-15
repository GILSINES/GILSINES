

//https://www.steimatzky.co.il/

package new26_10_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class six_class {

	public static void main(String[] args) throws InterruptedException {
		
/*
		// targil steimatzky
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.steimatzky.co.il/");
		
		driver.findElement(By.id("header-search-input")).sendKeys("הלבן הטיגריס");
		driver.findElement(By.id("submit_search")).click();
		driver.findElement(By.className("product-image-photo")).click();
		
		String text1 = driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[1]/div[3]/div[3]/h2")).getText();
		System.out.println(text1);
		
		String text2 = driver.findElement(By.className("price")).getText();
		System.out.println(text2);
	*/	
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.steimatzky.co.il/");
		
		
		 WebElement search = driver.findElement(By.id("header-search-input"));
		 search.sendKeys("הלבן הטיגריס");
		 Thread.sleep(1000);
		 search.getText();
		 System.out.println(search);
		// Thread.sleep(1000);
		// search.clear();
		// search.sendKeys("הלבן הטיגריס");
		*/
		
		
		
		// targil 1 תרגיל ריצה על אלמנטים
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://stackoverflow.com/tags");
		
		// option 1
		
		/*
		 List<WebElement> list = new ArrayList<WebElement>();
		
	    list =	driver.findElements(By.xpath("//a[@class='post-tag']"));
		
		System.out.println( list.size());
		  for (int i = 0; i < list.size(); i++) {
	        	System.out.println(list.get(i).getText());
	        }
		
		  list = driver.findElements(By.xpath("//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']"));
		
		  for (int i = 0; i < list.size(); i++) {
	        	System.out.println(list.get(i).getText());
	        }
		*/
		  
		  
		  // option 2
		  
		/*
		  List<WebElement> questions = driver.findElements(By.xpath("//a[@class='post-tag']"));
		    List<WebElement> tag = driver.findElements(By.xpath("//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']"));
		    
		    for (int i = 0; i < tag.size(); i++) {
		    	System.out.println("in " +questions.get(i).getText() + " we have " + tag.get(i).getText() );	
		    }
		  */
		  
		
		
		// targil 2  תרגיל ריצה על אלמנטים

		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calauto.co.il/heb/wantbuy/searchresults/");
		
        List <WebElement>list = new ArrayList<WebElement>();
		
		list = driver.findElements(By.xpath("//tr[@class='group']//td[@class='year ng-binding']"));
		
		System.out.println( list.size());
		
		
		int num;
		int count =0;
		String snum;
		String [] arr;
		
		
		for (int i = 0; i <list.size(); i++) {
			snum = list.get(i).getText();
			if (snum.contains("-")) {
			arr=snum.split("-");
			
			for(String b : arr ) {
				
				num = Integer.parseInt(b.trim());
				if (num>=2014) {
					System.out.println( num +" : yes");
				} else {
					System.out.println(num +" : no");
					count++;
				}
			}
				
			}
			
			if (!snum.contains("-")) {
				num = Integer.parseInt(snum);
				if (num>=2014) {
					System.out.println( num +" : yes");
				} else {
					System.out.println(num +" : no");
					count++;
				}
			}
			
			
		}
		System.out.println(" i have " + count + " under 2014" );
		System.out.println(" i test " + list.size() + " cars" );
		driver.quit();
	
		*/
		
		
		
		
		
		
		
		
		  
	}

}
