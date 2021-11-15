
// junit

//main פונקציית אין 
//בודדים לטסטים ומחלק main-ה פונקציית את  לוקח junit 
//פונקצייה בעצם הוא Test כל
// @BeforeClass של  פונקצייה
//@AfterClass של פונקציה
//


package new26_10_21;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class nine_class_junit {

	
	//ראשונה שרצה פונקצייה
	//setUpBeforeClass  - הפונקצייה  של השם את  לשנות  אפשר
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("5555");
	}

	
	
	
	
	//אחרונה שרצה פונקצייה
	//tearDownAfterClass  - הפונקצייה  של השם את  לשנות  אפשר
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("000000000");
	}

	
	
	//כזאת פונקצייה בתוך תיכתב בדיקה כל
    //	
	
	@Test
	public void test() {
		System.out.println("1");
	}

	@Test
	public void test1() {
		System.out.println("2");
	}
	
	@Test
	public void test2() {
		System.out.println("3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
