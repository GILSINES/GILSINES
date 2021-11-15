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
import org.openqa.selenium.Point;
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


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.firefox.FirefoxDriver;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class eight_class {

	public static void main(String[] args) throws AWTException, FindFailed, InterruptedException {
		

		
		
		
		
		
		// robot 
		
	//	תרגיל למחלקת Robot
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.il/search?q=hackeru&hl=iw&tbm=isch&source=hp&biw=1280&bih=564&ei=j2-LYcP1Bsmca6jThpgE&iflsig=ALs-wAMAAAAAYYt9n-XY_ESPe5-2rxqJigKo5CAMRFJE&oq=hackeru&gs_lcp=CgNpbWcQDDIFCAAQgAQyBAgAEB4yBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBhQAFgOYPJXaABwAHgAgAFsiAGRA5IBAzEuM5gBAKABAaoBC2d3cy13aXotaW1n&sclient=img&ved=0ahUKEwiD-YX4nY30AhVJzhoKHaipAUMQ4dUDCAY");
		
	   
	    Robot robot = new Robot();
		robot.mouseMove(-35, 685);

		
		//לחיצה ימנית על העכבר
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		robot.delay(3000);

		
		
		
		//ירידת חץ למטה לבחירת  שמירת תמונה בשם
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
			//	robot.keyPress(KeyEvent.VK_DOWN);
			//	robot.keyRelease(KeyEvent.VK_DOWN);
			//	robot.keyPress(KeyEvent.VK_DOWN);
			//	robot.keyRelease(KeyEvent.VK_DOWN);
				robot.delay(2000);

				
				
				//לחיצה על אנטר לכניסה לחלונית השמירה
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(2000);

		
				//הזנת שם הקובץ
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
				
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				
				
				robot.keyPress(KeyEvent.VK_SHIFT);
						
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				
				
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				
				
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				
				
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				
				
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				
				//לחיצה על אנטר לשמירת התמונה
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				
				
				WebElement element = driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[4]/a[1]/div[1]/img"));
			     Point p =  element.getLocation();
			     System.out.println(p);
			     
				*/
	  
	    
	    
	    
		// sikuli
		
		
	//	תרגיל להתנסות בSIKULI
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.jobmaster.co.il/");
		
	    

	    
	    Screen scn=new Screen();
	   
	    scn.click("C:\\Users\\97254\\Desktop\\selenium\\sikuliImages");
	    */
	    

			
		
		
		
		
	//	תרגיל מסכם שלב א
		
		
		
		// targil of all that eo learn
		
		// targil 1
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.supermarker.themarker.com/");
	   
		
		// a
	   
	    driver.findElement(By.id("txtSearch")).sendKeys("מחשבון");
		Thread.sleep(2000);
		//חיפוש ולחיצה על השלמה אוטומטית של מחשבון משכנתא
		WebElement ul = driver.findElement(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content"));
		List<WebElement>  list = ul.findElements(By.tagName("li"));
		list.get(1).click();
        
		
		
		
		// b
	    
	    String activ = driver.findElement(By.xpath("//*[@id=\"rblSelectCalcType\"]/label[1]")).getAttribute("class");
		System.out.println(activ.contains("ui-state-active")?"חשב לפי אקטיבי":"חשב לפי לא אקטיבי");


	   // c
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"mortgageCalculatorType\"]/tbody/tr[3]/td[1]/img")).getAttribute("alt"));

		// d 
		
		driver.findElement(By.xpath("//*[@id=\"rblSelectKeren\"]/label[2]/span")).click();


		// 6
		
		driver.findElement(By.id("txtLoanAmount")).clear();

		driver.findElement(By.id("txtLoanAmount")).sendKeys("500000");

		
		// 7
		
		
		
		

	}

}
