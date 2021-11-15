package new26_10_21;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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


public class seven_class {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException, ATUTestRecorderException {
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		
		
	
		// switch tabs //
		// every tab has a name
		
		 driver.findElement(By.id("NewTab")).click();
		 
		    // סטרינגים של רשימה //השני לטאב פונה
		    //אצלי שפתוחים הטאבים של השמות כל
		    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    //החדש לטאב הפוקוס את מעביר
		    driver.switchTo().window(tabs2.get(1));
		    
		    System.out.println(driver.getCurrentUrl());
		    
		    Thread.sleep (5000);
		    //הטאב את  סוגר
		    driver.close();
		   //הקודם לטאב הפוקוס את מחזיר
	        driver.switchTo().window(tabs2.get(0));
		    
	        */
	        
		
		
		
		
		
		/*
	        // i frame
	        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		
		//i frame ה לתוך אותו שולח
		    driver.switchTo().frame(driver.findElement(By.id("frame")));
		    driver.findElement(By.id("uaertName")).sendKeys("my name");
		    //i frame מה יוצא
		    driver.switchTo().defaultContent();
		    
		  */  
		    
		
		
		
		
		
		    
		//alert 
		//קופצות הודעות
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		
		// כדי ללחוץ על כפתור ביטול נעשה כך
		driver.switchTo().alert().dismiss() ;
		
		//כדי ללחוץ על אישור כך
		driver.switchTo().alert().accept();
		
		//כדי לשלוף את הטקסט מתוך האלרט
		driver.switchTo().alert().getText();
		
		// not working in chorme //כדי להקליד טקסט באלרט
		driver.switchTo().alert().getText();
		*/
		
		
		
		
		
		// מסך צילום 
		
		
	//	יתרון : מצלם את המסך בבדיקה גם אם בפועל על המסך מוצג משהו אחר

	//	חיסרון : לא מצלם את url
		
	/*	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://danielauto.net/practice/usefull/useful1.html");
		
		
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File("C:\\Users\\97254\\Desktop\\java_pic\\b.png");
    FileUtils.copyFile(SrcFile, DestFile);
	*/	
       
	
	
		
		
		
		
		
		// מסך צילום 
        //ScreenShoot button
		
		//יתרון : מצלם את כל המסך כולו
		
		//חיסרון : אם עברתי בזמן הבדיקות למסך אחר יצלם את מה שאני נמצא בו
		//ולא את הדף הנבדק
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");	
		
		Robot robot = new Robot();
		BufferedImage screenShot = robot.createScreenCapture(newRectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(screenShot,"jpg",newfile("C:\\Users\\\\97254\\Desktop\\java_pic\\b.png"));
		*/

		
		
		
		
		
	
		
		// מסך צילום
		
		// Ashoot
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		
		
		Screenshot entirePageScreenShot = new AShot().
		shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(entirePageScreenShot.getImage(),"png",new File("C:\\\\Users\\\\97254\\\\Desktop\\\\java_pic\\\\h.png"));
		*/
		
		
		
		
		
		
		
		
		// video
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		driver.manage().window().maximize();
		
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\97254\\Desktop\\java_pic","TestVideo2-",false);
		
		recorder.start();
	    Thread.sleep(3000);
	    driver.findElement(By.id("alert2")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
	    recorder.stop();
        */
		
		
		
		
		
		
		// האם מילים מסוימות נמצאות בדף או לא
		// if certion words do find in the pae
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		driver.manage().window().maximize();
		
		boolean a = driver.getPageSource().contains("QA");
	    if (a) {
	    System.out.println("yes");
	    }
	    else {
	    System.out.println("no");
	    }
	    
	    driver.quit();
	    */
		
		
		
		
		
		
		// לבדוק האם צ'ק בוקס כבר לחוץ
		//to check if box is pressd
		 /*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		driver.manage().window().maximize();
		
		
		boolean isSelect;
	    isSelect = driver.findElement(By.name("notChecked")).isSelected();
	    if (isSelect) {
			
		}else {
			driver.findElement(By.name("notChecked")).click();
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		*/
		
		
		
		
		
		
		
		// זמני טעינה של פעולה )סטופר(
		// StopWatch.
		
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://danielauto.net/practice/usefull/useful1.html");
		driver.manage().window().maximize();
		
		
		StopWatch watch = new StopWatch();
	    watch.start();
	    boolean isSelect;
	    isSelect = driver.findElement(By.name("notChecked")).isSelected();
	    if (!isSelect) {
	    	driver.findElement(By.name("notChecked")).click();
	    	 Thread.sleep(2000);
	    	driver.findElement(By.name("notChecked")).click();
	    	 Thread.sleep(2000);
	    	driver.findElement(By.name("notChecked")).click();
	    	 Thread.sleep(2000);
	    	driver.findElement(By.name("notChecked")).click();
	    	 Thread.sleep(2000);
	    	driver.findElement(By.name("notChecked")).click();
	    	
	    }
	    Thread.sleep(3000);
	    watch.stop();
	    double time = watch.getTime()/1000.0;
	    System.out.println(time);
	    driver.quit();
		
		*/
		
		
		
		
		
		
		// SELENIUM ACTION //

	//	תרגילים למחלקת action
		
		// targil 1 dragAndDrop
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		//Actions action = new Actions(driver);
	    
		//שנזרק אלמנט
	    WebElement draggable = driver.findElement(By.className("document"));
	    
	    //שמקבל אלמנט		
	    WebElement droppable = driver.findElement(By.className("trash"));
	    		
	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
	    
	    draggable = driver.findElement(By.className("document"));		
	    
	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
	    
	    draggable = driver.findElement(By.className("document"));
	    
	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
	    
	    draggable = driver.findElement(By.className("document"));
	    
	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
	    
	    
	    driver.quit();
		*/
		
		
		
		
		
		

		// SELENIUM ACTION //

		//	תרגילים למחלקת action
			
			// targil 1 dragAndDrop
		
		// another way with Actions action = new Actions(driver);
			
			/*
			System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://marcojakob.github.io/dart-dnd/basic/");
			driver.manage().window().maximize();
			
			Actions action = new Actions(driver);
		    
			//שנזרק אלמנט
		    WebElement draggable = driver.findElement(By.className("document"));
		    
		    //שמקבל אלמנט		
		    WebElement droppable = driver.findElement(By.className("trash"));
		    
		    		
		    action.dragAndDrop(draggable,droppable).perform();
		       draggable = driver.findElement(By.className("document"));		
		    
		       
		       action.dragAndDrop(draggable,droppable).perform();
		       draggable = driver.findElement(By.className("document"));
		    
		       
		       action.dragAndDrop(draggable,droppable).perform();
		       draggable = driver.findElement(By.className("document"));
		    
		       new Actions(driver).dragAndDrop(draggable,droppable).perform();
		    
		    
		    driver.quit();
			
	    */
	    
	    
	    
		
		
		
		// SELENIUM ACTION //

				//	תרגילים למחלקת action
					
					// targil 1 dragAndDrop with loop
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		

		    
		    List<WebElement> list = driver.findElements(By.className("document"));
		    
		    for(int i = 0; i < list.size(); i++) {
		    	WebElement draggable = list.get(i);
		    	 WebElement droppable = driver.findElement(By.className("trash"));
		    	 new Actions(driver).dragAndDrop(draggable,droppable).perform();
		    }
		
		    driver.quit();
		
		*/
		
		
		
		
		
		
		
		// SELENIUM ACTION //

		//	תרגילים למחלקת action
		
		// tagil 2
		 
		// בחירה מרובה של אלמנטים )ברצף(
		
		// with continuum - SHIFT
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://danielauto.net/practice/action/multipick.html");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//select//option"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys. SHIFT).click(list.get(0)).click(list.get(2)).keyUp(Keys. SHIFT).perform();
		*/
		
		
		
		
		
		
		
		// SELENIUM ACTION //

		//	תרגילים למחלקת action
		
		// tagil 2
		 
		// בחירה מרובה של אלמנטים )עם רווח(
		
		// with space between - CONTROL
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://danielauto.net/practice/action/multipick.html");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//select//option"));
		Actions action = new Actions(driver);
		
		new Actions(driver).keyDown(Keys.CONTROL) .click(list.get(0)).click(list.get(4)).keyUp(Keys.CONTROL).perform(); 
		*/
		
		
		
		
		
		
		
		// SELENIUM ACTION //

				//	תרגילים למחלקת action
				
				// tagil 2
		
		// anoter way to solve trgil 2
	
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.get("https://danielauto.net/practice/action/multipick.html");
		driver.manage().window().maximize();
		
     List<WebElement> list = driver.findElements(By.xpath("//select//option"));
		
		Actions action = new Actions(driver);
		
		
		action.keyDown(Keys. SHIFT).click(list.get(0)).click(list.get(2)).keyUp(Keys. SHIFT).perform();
		Thread.sleep(3000);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\\\Users\\\\97254\\\\Desktop\\\\java_pic\\\\fish1.png"));
		
		
		
		action.keyDown(Keys.CONTROL) .click(list.get(0)).click(list.get(4)).keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("C:\\\\Users\\\\97254\\\\Desktop\\\\java_pic\\\\fish2.png"));
		
		    System.out.println("targil 2 pass");
		}
		catch (Exception e) {
			System.out.println("targil 2 fail");
		}
		
		
		 driver.quit();
		
		*/
		 
		 
		
		
		
		
		 
		// SELENIUM ACTION //

		//	תרגילים למחלקת action
		
		// tagil 3
		
		// double click with mouse
		 
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		try {
			  
			  driver.get("http://danielauto.net/practice/action/multipick.html ");
			  WebElement doubleClickElement = driver.findElement(By.id("dbl_click"));
			  Thread.sleep(4000); 
			  
			  Actions action = new Actions(driver); 
			  
			  action.doubleClick(doubleClickElement);
			  
			  action.perform(); 
			  
			  if(driver.findElement(By.id("demo")).getText().equals("הלחיצה על התמונה עברה בהצלחה"))
			  {
			  System.out.println("התמונה נלחצה בהצלחה"); 
			  } 
			  else {
			  System.err.println("התמונה לא נלחצה"); 
			  } 
			  System.out.println("targil 3 pass");
			  }
		catch (Exception e) {
				  System.out.println("targil 3 fail"); 
				  }
		
		 driver.quit();
		
		*/
		
		 
		
		
		
		
		
		
		// SELENIUM ACTION //

				//	תרגילים למחלקת action
				
				// targil 4
		
		// standing with mouse on object
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		try {
			  
			  
		 driver.get("http://danielauto.net/practice/action/multipick.html");
		 
		  Actions builder = new Actions(driver);
		  
		  WebElement element = driver.findElement(By.id("over"));
		  builder.moveToElement(element).build().perform();
		  
		  Thread.sleep(3000);
		  
		  WebElement element1 = driver.findElement(By.id("dbl_click"));
		  builder.moveToElement(element1).perform(); 
		  
		  Thread.sleep(3000);
		  
		  builder.moveToElement(element).moveToElement(driver.findElement(By.id("over"))).build().perform();
		  
		  
		  String number =driver.findElement(By.id("demo2")).getText();
		  
		  if (number.equals("2")) {
		  System.out.println("המספר 2 מופיע"); 
		  } 
		  else {
		  System.err.println("המספר 2 אינו מופיע");
		  }
		  
		  System.out.println("targil 4 pass"); 
		  
		  } 
		catch (Exception e) {
		  System.out.println("targil 4 fail"); 
		  }
		 
		 driver.quit();
		*/
		
		
		
		
		
		
		
		// SELENIUM ACTION //

		//	תרגילים למחלקת action
		
		// targil 5
		
		// בחירת נושא בתפריט שנפתח ב Mouseover
		
		
		// choosing an object in a windowe
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 
		  try {
		  
		driver.get("http://danielauto.net/practice/action/multipick.html ");
		
		 Thread.sleep(3000); 
		 
		 WebElement menu = driver.findElement(By.xpath("//*[@id='mouseover']/button")); 
		 Actions actions = new Actions(driver); 
		 actions.moveToElement(menu).perform();
		 
		  Thread.sleep(4000);
		  
		  WebElement submenu = driver.findElement(By.linkText("google"));
		  actions.click(submenu);
		  actions.perform();
		  
		  Thread.sleep(4000);
		  
		  System.out.println(driver.getTitle());
		  System.out.println("targil 5 pass"); 
		  }
		  catch (Exception e) { 
			System.out.println("targil 5 fail"); 
			}
		
		
		  driver.quit();
		
		*/
		
		
		
		
		
		// SELENIUM ACTION //

				//	תרגילים למחלקת action
				
				// targil 6
		
		
		// rooling up/down the window 
		
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		try {
			  
			  driver.get("http://danielauto.net/practice/action/multipick.html ");
			  
			  WebElement element = driver.findElement(By.id("baby")); 
			  ((JavascriptExecutor)
			  driver).executeScript("arguments[0].scrollIntoView(true);", element);
			  
			  Thread.sleep(2000);
			  
			  File scrFile2 =
			  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(scrFile2, new File("C:\\Users\\97254\\Desktop\\java_pic\\baby.png"));
			  
			  System.out.println("targil 6 pass"); 
			  } 
		      catch (Exception e) 
	       	{
			  System.out.println("targil 6 fail");
			  }
		
		 driver.quit();
		
		*/
		
		
		
		
	}

}
