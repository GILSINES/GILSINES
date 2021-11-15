package new26_10_21;

import java.util.Arrays;
import java.util.Scanner;

public class HotTostFunc {
	
/*	
	// גיל
	public static int ageChack() {
		
		int age = 0;
		String  strAge;
		Scanner scan = new Scanner(System.in);
		 System.out.println("plese enter your age ");
		
		while(age==0) {
			
			strAge = scan.next();
			// בלבד מספרים שהוזנו בודק
			if(strAge.matches("^\\d+$")) {
			// כסטרינג אותו קיבלנו כי למספר הגיל את ממיר	
				age = Integer.parseInt(strAge);
			// המשתמש של הגיל טווח את בודק	
	         if (age<5 || age>100) {
	       System.out.println("u have to insert right age between 5 to 100 "); 
	            age = 0;
	            
	         }else {
	        	 break;
	         }
	        		 
			} else {
				System.out.println("u have to insert numbers only "); 
			}
		}
		//הגיל את מחזיר
		return age;
	}

	
	// תוספות
	public static int Additions() {
		int extension = 0; //התוצאה את שיסכום משתנה
		int condition = 0;
		String [] addinfraStructcher = {"bolgarit","tomato","corn","musroms","olivs"};
		String [] arryAdd; // לאברים מחולקות התוספות את שיקבל מערך
		System.out.println("plese choose your topings to your tost and saperate them with - , " );
		System.out.println("the topings are : bolgarit,tomato,corn,musroms,olivs");
		System.out.println("if u dont want topings taip no top");
		Scanner scan = new Scanner(System.in);
		String add = scan.nextLine();// מהמשתמש תוספות קבלת
		while (condition == 0) {
			
			arryAdd = add.split(",");//המערך לתןך פסיקים לפי המשתמש תשובת פיצול
			for (int i = 0; i < arryAdd.length; i++ ) { // המערך על שרצה לולאה
				
				String trimArry = arryAdd[i].trim();// הפסיקים בין רווח שם והמשתמש במידה מיותרים רווחים מחיקת
				if (Arrays.asList(addinfraStructcher).contains(trimArry) ) {
					// שקל 3 יקבל המונה אז האלו מהתוספות אחד הוא הערך אם
					if(trimArry.contains("olivs")|| trimArry.equals("corn") || trimArry.equals("musroms") ) {
						extension = extension + 3;
						condition = 1;
					}
				
					// שקל 4 יקבל המונה אז האלו מהתוספות אחד הוא הערך אם
					else if (trimArry.contains("onion") || trimArry.contains("tomato") || trimArry.contains("bolgarit") ) {
						extension = extension + 4;
						condition = 1;
					}
				}
				else {
					if (trimArry.equals("no top")) {
						System.out.println(" are u sure?");
						add = scan.nextLine();
						if (add.equals("sure") || add.equals("yes")) {
							System.out.println("too bad,your lost");
							// לשנות מבלי מהלולאה לצאת מנת על
							condition = 1;
							break;
						}
						else {
							System.out.println("so what do u like to order?");
							add = scan.nextLine();
							break;
						}
					    }
					    System.out.println(trimArry + "not in the list,plese tape corect topings");
					    condition = 0;
					    add = scan.nextLine();
					    break;
				}
			}
		}
		return extension;
	}


	
	// drink
	public static int drink() {
	int extension_drink = 0;
	int breaker = 0;
	System.out.println("what do u like to drink? cola or orange jucie?");
	System.out.println("if u dont want to drink press send order");
	Scanner scan = new Scanner(System.in);
	String add = scan.nextLine();
	while(breaker==0) {
		if(add.equals("orange") || add.equals("cola")) {
			extension_drink = 8;
			breaker = 1;
		}else if (add.equals("orange") && add.equals("cola")) {
			System.out.println("plese choose one drink");
			add = scan.nextLine();
		}else if(add.equals("send order")) {
			extension_drink = 0;
			breaker = 1;
		}else {
			System.out.println("u have to choose one drink cola/orane");
			add = scan.nextLine();
		}
	}
	
	
		return extension_drink;
	}

	
*/
	
	

}
