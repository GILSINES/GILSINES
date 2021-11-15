package new26_10_21;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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

import com.paulhammant.ngwebdriver.ByAngular;






public class JUNIT_SUPER_MARKET {
	
	static WebDriver driver ;
	static double Shufersal = 0.0;
	static double priceRami = 0.0;
	static double quick = 0.0;
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\97254\\Desktop\\selenium jars//chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	
	
	
	
	@Test
	public void test1 () throws InterruptedException {
		driver.get("https://www.shufersal.co.il/online/he/");
		driver.findElement(By.id("js-site-search-input")).sendKeys("שניצל תירס טבעול");
		driver.findElement(By.xpath("//button[@class='btnSubmit js_search_button']")).click();
		Thread.sleep(1000);
		String price = driver.findElement(By.xpath("//*[@id=\"mainProductGrid\"]//li[1]//span[@class='number'][1]")).getText();
		price = price.replace("₪", "");
		price = price.trim();
	//	System.out.println(price);
		Shufersal = Double.parseDouble(price);
		System.out.println("The price in Shufersal is " + Shufersal);

		/*
		driver.get("https://www.shufersal.co.il/online/he/");
		Thread.sleep(2000);
		driver.findElement(By.id("js-site-search-input")).sendKeys("שניצל תירס טבעול");
		Thread.sleep(2000);
		driver.findElement(By.className("icon icon-search")).click();
*/
	}

	
	
	@Test
	public void test2() throws InterruptedException {
		
		driver.get("https://www.rami-levy.co.il/he/shop");
		Thread.sleep(3000);
		try {
			driver.findElement(By.id("destination")).sendKeys("שניצל תירס טבעול");
			Thread.sleep(3000);
		String	price = driver.findElement(By.xpath("//*[@id=\"dropdownItem0\"]/div/div[4]/div/span/span/span[contains(.,'')]")).getText().replace("₪", "").trim();
			
		priceRami = Double.parseDouble(price);
		
		

			System.out.println("The price in Rami Levy is " + priceRami);
		} catch (Exception e) {
			System.out.println(e);
		}		
		
	}
	
	
	
	
	@Test
	public void test3() throws InterruptedException {
		
		driver.get("https://quik.co.il/");
		driver.findElement(By.className("searchInput_2RR")).sendKeys("שניצל תירס טבעול");
		Thread.sleep(5000);
		
		String shekel = driver.findElement(By.xpath("//div[@id='product-7290109358284']//strong")).getText();
		String agora = driver.findElement(By.xpath("//div[@id='product-7290109358284']//small[2]")).getText();
		double shekell = Double.parseDouble(shekel);
		double agoraa = Double.parseDouble(agora);
		quick = shekell + (agoraa/100);		
		System.out.println("The price in quick is " + quick);

	}
	
	
	
	
	
	@Test
	public void test4() {
		
		if(Shufersal < priceRami && Shufersal < quick) {
			System.out.println("Shufersal is the cheepest!");
		}
		
		else if(priceRami < Shufersal && priceRami < quick) {
			System.out.println("Rami Levy is the cheepest!");
		}
		
		else if(quick < priceRami && quick < Shufersal) {
			System.out.println("Bitan Wines is the cheepest!");
		}
		
		else if (Shufersal ==priceRami) {
			if (Shufersal<quick) {
				System.out.println("Shufersal and Rami Levy cheepest ");
			}
		}else if (Shufersal ==quick) {
			if (Shufersal<priceRami) {
					System.out.println("Shufersal and quick cheepest ");
				}
			
		} else if (quick== priceRami) {
			if (quick<Shufersal) {
				System.out.println("quick  and Rami Levy cheepest ");
			}
		}
			
		if (quick== priceRami && Shufersal ==quick ) {
			System.out.println("Everything is super pricy!");
		}
	}

		
	
	
}
