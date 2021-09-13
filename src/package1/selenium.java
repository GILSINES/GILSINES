package package1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.StopWatch;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.paulhammant.ngwebdriver.ByAngular;









public class selenium {

	@SuppressWarnings({ "deprecation", "null" })
	public static void main(String[] args) throws InterruptedException, IOException, ATUTestRecorderException, AWTException  {
		
		// 		הגדרה של הדרבייר
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\jj//chromedriver.exe");
		//פתיחת הדפדפן
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
//	    driver.get("http://danielauto.net/practice/usefull/useful1.html");
	    
	    
		
//		//ניווט לדף מסויי�? על ידי פקודת get
//		driver.get("https://www.d.co.il/");
//		Thread.sleep(0);
//		//זיהוי של �?למנט+ביצוע פעולה על ה�?למנט שזיהיתי
////		driver.findElement(By.id("query")).sendKeys("חשמל�?י�?");
//		WebElement text = driver.findElement(By.id("query"));
//		text.sendKeys("חשמל�?י�?");
//		Thread.sleep(1000);
	    //מחיקה וכתיבה מחדש
////		WebElement element = driver.findElement(By.id("חשמל�?י�?"));
////		element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"חשמל�?י�?");
//		Thread.sleep(2);
//        driver.findElement(By.xpath("//*[@id=\"homepage-search-input\"]/span/input[2]")).click();
//        Thread.sleep(3000);
//        
//        String url1 = driver.getCurrentUrl();
//        String url2 = "https://www.d.co.il/SearchResults?query=%D7%97%D7%A9%D7%9E%D7%9C%D7%90%D7%99%D7%9D";
//        
//        if (url1.equals(url2)) {
//        	System.out.println("yes");
//        }
//        else {
//        	System.err.println("no");
//        }
        
	    
	    // targil 1
	    
//	    driver.get("http://danielauto.net/practice/newLocator/locator.html");
//	    
//	    Thread.sleep(3000);
//	    
//	    driver.findElement(By.id("myText")).sendKeys("some text");
//	    Thread.sleep(3000);
//	    driver.findElement(By.id("btn")).click();
//	    String text1 = "some text";
//	    String text2 = driver.findElement(By.id("myText2")).getText();
//	    
//	    
//	    if (text1.equals(text2)) {
//			System.out.println("the text is equals ");
//		}else {
//			System.err.println("the text is not equals ");
//		}
	    
	    
	    // another way to solve targil 1
	    
	    
//	    driver.get("http://danielauto.net/practice/newLocator/locator.html");
//	    
//	    Thread.sleep(3000);
//	    
//	    Scanner coScanner = new Scanner(System.in);
//	    System.out.println("enter some text");
//	    String word = coScanner.nextLine();
//	    
//	    driver.findElement(By.id("myText")).sendKeys(word);
//	    driver.findElement(By.id("btn")).click();
//	    
//	    String text2 = driver.findElement(By.id("myText2")).getText();
//	    
//	    if (word.equals(text2)) {
//			System.out.println("the text is equals");
//		}else {
//			System.out.println("the text is  not equals");
//		}
	    
	    
	    // targil 2
//	    
//	    driver.get("http://danielauto.net/practice/newLocator/locator.html");
//	    
//	    Thread.sleep(3000);
//	    
//	    String xString = driver.findElement(By.name("by_Name")).getAttribute("src");
//	    System.out.println(xString);
//	    
//	    driver.findElement(By.id("aa")).click();
//	    
//	    String yString = driver.findElement(By.name("by_Name")).getAttribute("src");
//	    System.out.println(yString);
//    
//	    if (xString.equals(yString)) {
//			System.out.println("the text is equals");
//		}else {
//			System.out.println("the text is  not equals");
//		}
	    
	    
	    
//        targil 3
//	    driver.get("http://danielauto.net/practice/newLocator/locator.html");
//        
//	    Thread.sleep(3000);
//	    
//	    String word1 = driver.findElement(By.tagName("h3")).getText();
//	    String word2 = driver.findElement(By.className("c_name")).getText(); 
//	    
//	    System.out.println(word1 + " " + word2);
	    
	    
	    // targil https://www.steimatzky.co.il/
	    
//	    driver.get("https://www.steimatzky.co.il/");
//	    driver.findElement(By.id("search")).sendKeys("הלבן הטיגריס");
//	    
//	    driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/input[2]")).click();
//	    
//	    String word1 = driver.findElement(By.className("authorTitle")).getText();
//	    String word2 = driver.findElement(By.className("price")).getText(); 
//	    String word3 = driver.findElement(By.xpath("//*[@id=\"product-info\"]/div[1]/div[1]/a[1]")).getText();
//
//	    String word4 = driver.findElement(By.className("name")).getText();
//	    String word5 = driver.findElement(By.xpath("//*[@id=\"customer-reviews\"]/ul/li[2]/div[1]/span[1]")).getText();
//	    String word6 = driver.findElement(By.xpath("//*[@id=\"customer-reviews\"]/ul/li[3]/div[1]/span[1]")).getText();
//
//	    
//	    System.out.print(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6);
	    
	    
//	    driver.get("https://www.steimatzky.co.il/%D7%90%D7%A8%D7%95%D7%95%D7%99%D7%A0%D7%93-%D7%90%D7%93%D7%99%D7%92%D7%94/%D7%94%D7%98%D7%99%D7%92%D7%A8%D7%99%D7%A1-%D7%94%D7%9C%D7%91%D7%9F.html");
   
//	    only the first result (�?ביטל מ.) Element not Elements
//	    System.out.println(driver.findElement(By.xpath("//span[@class='name']")).getText());
	    
	   
//	    List<WebElement> list = new ArrayList<WebElement>();
	    
     //   list = driver.findElements(By.xpath("//span[@class='name']"));
//        list = driver.findElements(By.className("name"));
//        System.out.println("mispar hamegivim ho : " + list.size());
//        
//        for (int i = 0; i < list.size(); i++) {
//        	System.out.println(list.get(i).getText());
//        }
        
	   
//	    ככה ג�? �?פשר
//	    driver.findElement(By.id("search")).sendKeys("גג");
//	    WebElement search = driver.findElement(By.id("search"));
//	    search.sendKeys("הטיגריס הלבן");
	    

//       targil תרגיל ריצה על �?למנטי�?	    
	    
//	    driver.get("https://stackoverflow.com/tags");
//	    
//	    List<WebElement> questions = driver.findElements(By.xpath("//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']"));
//	    List<WebElement> tag = driver.findElements(By.xpath("//a[@rel='tag']"));
//	    
//	    for (int i = 0; i < tag.size(); i++) {
//	    	System.out.println("in " +tag.get(i).getText() + " we have " + questions.get(i).getText() );	
//	    	
//	    }
	    
	   
//	    driver.findElement(By.id("NewTab")).click();
	    
//	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs2.get(1));
//	    
//	    System.out.println(driver.getCurrentUrl());
//	    
//	    Thread.sleep (5000);
//	    driver.close();
//	   
//        driver.switchTo().window(tabs2.get(0));
//	    
//	    driver.switchTo().frame(driver.findElement(By.id("frame")));
//	    driver.findElement(By.id("uaertName")).sendKeys("my name");
//	    driver.switchTo().defaultContent();
	    
	    
//	    TakesScreenshot scrShot =((TakesScreenshot)driver);
//	    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//	    File DestFile=new File("C:\\Users\\97254\\Desktop\\java_pic\\a.png");
//	    FileUtils.copyFile(SrcFile, DestFile);
	    
	    
//        Screenshot entirePageScreenShot = new AShot().
// 		shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//	   	ImageIO.write(entirePageScreenShot.getImage(),"png",new File("C:\\\\Users\\\\97254\\\\Desktop\\\\java_pic//nameFile.png"));
	    
	    
//	    ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\97254\\Desktop\\java_pic","TestVideo-",false);
//	    
//	    recorder.start();
//	    Thread.sleep(3000);
//	    driver.findElement(By.id("alert2")).click();
//	    Thread.sleep(3000);
//	    driver.switchTo().alert().dismiss();
//	    recorder.stop();
	    
	    
//	    boolean a = driver.getPageSource().contains("fish");
//	    if (a) {
//	    System.out.println("yes");
//	    }
//	    else {
//	    System.out.println("no");}
//	    
//	    driver.quit();
	    
	    
//	    boolean isSelect;
//	    isSelect = driver.findElement(By.name("notChecked")).isSelected();
//	    if (isSelect) {
//			
//		}else {
//			driver.findElement(By.name("notChecked")).click();
//		}
//	    
	    
	  
//	    StopWatch watch = new StopWatch();
//	    watch.start();
//	    boolean isSelect;
//	    isSelect = driver.findElement(By.name("notChecked")).isSelected();
//	    if (!isSelect) {
//	    	driver.findElement(By.name("notChecked")).click();
//	    	 Thread.sleep(2000);
//	    	driver.findElement(By.name("notChecked")).click();
//	    	 Thread.sleep(2000);
//	    	driver.findElement(By.name("notChecked")).click();
//	    	 Thread.sleep(2000);
//	    	driver.findElement(By.name("notChecked")).click();
//	    	 Thread.sleep(2000);
//	    	driver.findElement(By.name("notChecked")).click();
//	    	
//	    }
//	    Thread.sleep(3000);
//	    watch.stop();
//	    double time = watch.getTime()/1000.0;
//	    System.out.println(time);
//	    driver.quit();
	    
	    
	    // 7 boom! //
	    
//	    for(int i = 0; i < 200; i++) {
//	       String  num =  String.valueOf(i);
//	       if(i%7==0 || num.contains("7")) {
//	    	   System.out.println("boom");
//	       }
//	       else {
//	    	   System.out.println(i);
//		}
//	    }
	    	   
	    // anoter 7 boom
	    
//	    for(int i = 0; i < 200; i++) {
//	    	String num = String.valueOf(i);
//	    	if(i % 7 == 0 || i / 10 == 7 || i % 10 == 7){
//	    		System.out.println("boom");
//	    	}
//	    	else {
//	    		System.out.println(i);
//			}		
//	    }
	   
	    
	    // targil ----- dragAndDrop
	    
	    
//	    driver.get("http://marcojakob.github.io/dart-dnd/basic/");
//	   
//	    Actions action = new Actions(driver);
//	    
//	    WebElement draggable = driver.findElement(By.className("document"));
//	    		
//	    WebElement droppable = driver.findElement(By.className("trash"));
//	    		
//	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
//	    
//	    draggable = driver.findElement(By.className("document"));		
//	    
//	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
//	    
//	    draggable = driver.findElement(By.className("document"));
//	    
//	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
//	    
//	    draggable = driver.findElement(By.className("document"));
//	    
//	    new Actions(driver).dragAndDrop(draggable,droppable).perform();
//	    
//	    
//	    driver.quit();
	    
	    
	 // targil ----- dragAndDrop with  לול�?ה
	    
	    
//	    driver.get("http://marcojakob.github.io/dart-dnd/basic/");
//	    
//	    Actions action = new Actions(driver);
//	    
//	    List<WebElement> list = driver.findElements(By.className("document"));
//	    
//	    for(int i = 0; i < list.size(); i++) {
//	    	WebElement draggable = list.get(i);
//	    	 WebElement droppable = driver.findElement(By.className("trash"));
//	    	 new Actions(driver).dragAndDrop(draggable,droppable).perform();
//	    }
	    
	   
//	    driver.get("http://danielauto.net/practice/tabls/tables.html");
	    
	    
		  //  targil 1 טבל�?ות תרגילי

	    
//	    List<WebElement> rows = driver.findElements(By.xpath("//tr"));
//	    List<WebElement> col = driver.findElements(By.xpath("//td"));
//	    
//	    int rowCount = driver.findElements(By.xpath("//tr")).size();
//	    System.out.println("there are " + rowCount + "rows in table" );
//	    int colCount = driver.findElements(By.xpath("//tr[1]//td")).size();
//	    System.out.println("there are " + colCount + "cols in table" );

	    
	    
	  //  targil 2 טבל�?ות תרגילי
	/*    
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
	    	
	    	else if (group.get(i).getText().equals("C")) 
	    		countC++;
	    	
	    }
	    
	    System.out.println("there are" + countA +  " from group a");
    	System.out.println("there are" + countB +  " from group b");
    	System.out.println("there are" + countC +  " from group c");
    
*/	    
	    
	//  targil 3 טבל�?ות תרגילי

	    
//	    driver.get("http://danielauto.net/practice/tabls/tables.html");
//	    
//	    List <WebElement> price = driver.findElements(By.xpath("//td[3]"));
//	    
//	    String max;
//	    double m=0,r=0;
//	    		
//	    for (int i =1;i<price.size();i++)
//        {    
//		 
//            max= price.get(i).getText();
//           
//            
//            if (max.contains(",")) {
//            	max = max.replaceAll("," , "");
//
//            }
//             m = Double.parseDouble(max);
//
//            if(m>r)
//             {    
//                r=m;
//             }
//        }
//        System.out.println("Maximum current price is : "+ r);

	    
	    
	    // robot
	 /*  
	    driver.get("https://www.google.com/search?q=hackeru&sxsrf=ALeKk01W0Gd5EQSr-6e3dti2OrfbAzu7Ow:1629625752741&source=lnms&tbm=isch&sa=X&ved=2ahUKEwioiO-ArcTyAhWZBGMBHcttDJEQ_AUoAXoECAEQAw&biw=1280&bih=577");
	    Robot robot = new Robot();
	    robot.mouseMove(1076, 950);
	    
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
       
	      
	     WebElement element = driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[14]/a[1]/div[1]/img"));
	     Point p =  element.getLocation();
	     System.out.println(p);
*/	    
	    
	    
	    
	    // sikuli
	    
//	    Screen scn=new Screen();
	    
	    
	    
	    
	 //   Angular
	    
	 /*  
	    driver.get("https://myhealth.stanfordhealthcare.org/");
	    driver.findElement(ByAngular.model("id")).sendKeys("aaaaaaaaaa");
	    driver.findElement(ByAngular.model("password")).sendKeys("aaa");
	    driver.findElement(ByAngular.buttonText("Sign In")).click();
	*/  
	    
	    
	    
	//    JUNIT
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
