
//  סלניום


package new26_10_21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifth_class {

	public static void main(String[] args) throws InterruptedException {
		
	/*	
		// דפדפנים

		// הדרייבר של ההגדרה
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		
		// הדפדפן פתיחת
		WebDriver driver = new ChromeDriver();
		
		//get פקודת  ידי על  מסויים  לדף  ניווט
		driver.get("https://www.d.co.il/");
		
		// המתנה
		Thread.sleep(3000);
		
		//שזיהיתי האלמנט על פעולה וביצוע אלמנט של  זיהוי
		driver.findElement(By.id("query")).sendKeys("חשמלאים");
		
		//anoter way
		
	//	WebElement text = driver.findElement(By.id("query"));
	//	text.sendKeys("חשמלאים");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"homepage-search-input\"]/span/input[2]")).click();
		
		// כאשר נרצה לוודא הגעה לדף הנכון על ידי השוואה של ה- url
		Thread.sleep(3000);
		
		// בדיקה צעד
	    String url = driver.getCurrentUrl();
	    //צפויה תוצאה
	    String url2 ="https://www.d.co.il/SearchResults?query=%D7%97%D7%A9%D7%9E%D7%9C%D7%90%D7%99%D7%9D";
	    //
	    if (url.equals(url2)) {
	    	System.out.println("yes");
		} else {
			System.out.println("no");
		}
	    System.out.println(url);
		 
	    
	    // כאשר נרצה לוודא הגעה לדף הנכון על ידי השוואה של ה- title
	    String title = driver. getTitle();
	    System.out.println(title);
	 */   
		
		
		// targil 1 - with daniel
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		
		driver.findElement(By.id("myText")).sendKeys("some text");
		driver.findElement(By.id("btn")).click();
		
		String text1 = "some text";
			
		String text2 = driver.findElement(By.id("myText2")).getText();
		
		if (text1.equals(text2)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		*/
		
		
		// targil 1 - with daniel= anoter way
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		Scanner cons = new Scanner(System.in);
		System.out.println("enter some text");
		String word = cons.nextLine();
		
		driver.findElement(By.id("myText")).sendKeys(word);
		driver.findElement(By.id("btn")).click();
		
			
		String text2 = driver.findElement(By.id("myText2")).getText();
		
		if (word.equals(text2)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		*/
		
		
		// targil 2
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		driver.findElement(By.name("by_Name")).click();
		*/
		
		
		// anoter way to solve targil 2
		/*
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://danielauto.net/practice/newLocator/locator.html");
		    
		    Thread.sleep(3000);
		    
		    String xString = driver.findElement(By.name("by_Name")).getAttribute("src");
		    System.out.println(xString);
		    
		    driver.findElement(By.id("aa")).click();
		    
		    String yString = driver.findElement(By.name("by_Name")).getAttribute("src");
		    System.out.println(yString);
	    
		    if (xString.equals(yString)) {
				System.out.println("the text is equals");
			}else {
				System.out.println("the text is  not equals");
			}
		*/
		
		
		// targil 3 - with daniel
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		String word1 = driver.findElement(By.tagName("h3")).getText();
		String word2 = driver.findElement(By.className("c_name")).getText();
		
		System.out.println(word1 + " " + word2);
		*/
		
		
		// targil 4
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
	    String z =	driver.findElement(By.xpath("/html/body/p[5]")).getText();
		
		System.out.println( z);
		*/
		
		
		// targil 5
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		driver.findElement(By.linkText("Click me to check link text")).click();
		
		String z =	driver.findElement(By.id("link_text")).getText();
		
		System.out.println(z);
		*/
		
		
		// targil 6
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		driver.findElements(By.partialLinkText("Click me to")).get(1).click();
		
		String z =	driver.findElement(By.id("p_link_text")).getText();
		
		System.out.println(z);
		*/
		
		
		// targil 7
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/newLocator/locator.html");
		
		driver.findElement(By.cssSelector("input[type='button']")).click();
		
		String z = driver.findElement(By.id("btn")).getText();
		
		System.out.println(z);
		
		*/
		
		
		
		
		
		
		
	}
	

}
