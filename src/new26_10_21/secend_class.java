package new26_10_21;

import java.util.Scanner;

public class secend_class {

	public static void main(String[] args) {

		
		// מסועפים תנאים שני שיעור

		// targil 1
		
//		Scanner in = new Scanner(System.in);
//	    System.out.println("enter number");
//		int num1 = in.nextInt();
//		String day = ""; 
//		switch (num1) {
//		case 1: day = "Sunday";
//		break;
//		case 2: day = "monday";
//		break;
//		case 3: day = "Tuesday";
//		break;
//		case 4: day = "Wednesday";
//		break;
//		case 5: day = "Thursday";
//		break;
//		case 6: day = "friday";
//		break;
//		case 7: day = "Saturday";
//		default: day = "Invalid day range";
//		
//		}
//		
//		System.out.println(day);
		
//		String[] arr = {"Sunday","monday","Tuesday","Wednesday","Thursday","friday","Saturday"};
//		Scanner in = new Scanner(System.in);
//	    System.out.println(arr. length);
//	    System.out.println("enter number");
//	    int x = in.nextInt();
//		if(x==0) { 
//			System.out.println(arr[0]);
//		}
//		 if (x==1) {
//			System.out.println(arr[1]);
//		}
//		 if (x==2) {
//			System.out.println(arr[2]);
//		} 

		
	   // targil 2
	    
//	    Scanner input = new Scanner(System.in);
//	    
//	    int number_Of_DaysInMonth = 0;
//	    String MonthOfName = "Unknown";
//	    
//	    System.out.print("Input a month number: ");
//	    int month = input.nextInt();
//		
//	    System.out.print("Input a year: ");
//	    int year = input.nextInt();
//	    
//	    switch (month) {
//	    
//	    case 1 : 
//	    	
//	    	MonthOfName = "January";
//            number_Of_DaysInMonth = 31;
//            break;
//	    	
//	    case 2:
//            MonthOfName = "February";
//            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//                number_Of_DaysInMonth = 29;
//            } else {
//                number_Of_DaysInMonth = 28;
//            }
//            break;
//	    case 3:
//            MonthOfName = "March";
//            number_Of_DaysInMonth = 31;
//            break;
//        case 4:
//            MonthOfName = "April";
//            number_Of_DaysInMonth = 30;
//            break;
//        case 5:
//            MonthOfName = "May";
//            number_Of_DaysInMonth = 31;
//            break;
//        case 6:
//            MonthOfName = "June";
//            number_Of_DaysInMonth = 30;
//            break;
//        case 7:
//            MonthOfName = "July";
//            number_Of_DaysInMonth = 31;
//            break;
//        case 8:
//            MonthOfName = "August";
//            number_Of_DaysInMonth = 31;
//            break;
//        case 9:
//            MonthOfName = "September";
//            number_Of_DaysInMonth = 30;
//            break;
//        case 10:
//            MonthOfName = "October";
//            number_Of_DaysInMonth = 31;
//            break;
//        case 11:
//            MonthOfName = "November";
//            number_Of_DaysInMonth = 30;
//            break;
//        case 12:
//            MonthOfName = "December";
//            number_Of_DaysInMonth = 31;
//	    }
//		
//	    System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
		
		
		// targil 3
		
//		Scanner	in = new Scanner(System.in);
//		System.out.print("input number 1: ");	
//		double grade_a = in.nextInt();	
//		System.out.print("input number 2: ");	
//		double grade_b = in.nextInt();	
//		System.out.print("input number 3: ");	
//		double grade_c = in.nextInt();	
//		double avg = (grade_a  + grade_b  + grade_c )/3;
//		System.out.println(avg);
//		
//		if(avg>=90) System.out.println("Your grade A.");
//		else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
//		else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
//		else if(avg<50) System.out.println("Your grade F.");
//		else System.out.println("Invalid");
		
		
		// targil 4
		
		
//		int numPrudact;
//		int pricePrudact;
//		
//		Scanner cons = new Scanner(System.in);
//		System.out.println("enter number of prudact");
//		numPrudact = cons.nextInt();
//		
//		System.out.println("enter price of prudact");
//		pricePrudact = cons.nextInt();
//		
//		int sum = numPrudact * pricePrudact;
//		
//		if (sum<100) {
//			System.out.println("you need to pey : " + sum);
//		}else if (sum>200) {
//			System.out.println("you need to pey : " + (sum - ((sum*25)/100)));
//		}else if (sum>=100 && sum<120 ) {
//			System.out.println("you need to pey : " +(sum - ((sum*10)/100)));
//		}else if (sum >120 && sum<=200) {
//			System.out.println("you need to pey : " + (sum - ((sum*20)/100)));
//		}
		
		
		
		
		// targil 5
		
//		try {
//			System.out.println("select a month");
//			Scanner c = new Scanner(System.in);			
//			 int month = c.nextInt();
//		        String monthString;
//		        switch (month) {
//		            case 1:  monthString = "January";
//		            month = 1;
//		                     break;
//		            case 2:  monthString = "February";
//		                     break;
//		            case 3:  monthString = "March";
//		                     break;
//		            case 4:  monthString = "April";
//		                     break;
//		            case 5:  monthString = "May";
//		                     break;
//		            case 6:  monthString = "June";
//		                     break;
//		            case 7:  monthString = "July";
//		                     break;
//		            case 8:  monthString = "August";
//		                     break;
//		            case 9:  monthString = "September";
//		                     break;
//		            case 10: monthString = "October";
//		                     break;
//		            case 11: monthString = "November";
//		                     break;
//		            case 12: monthString = "December";
//		                     break;
//		            default: monthString = "Invalid month";
//		                     break;
//		        }
//
//				
//				if (month>=1 && month<=12) {
//					if (month>=1 && month<=4) {
//						System.out.println("very cold in " + monthString);
//					}
//			        if (month>=5 && month<=7) {
//						System.out.println("Quite comfortable in " + monthString);
//					}
//			        if (month>=8 && month<=12) {
//						System.out.println("very hot in " + monthString);
//					}
//					}
//					else {
//						System.out.println( monthString);
//					}
//		} catch (Exception e) {
//			System.out.println("There is a problem in the program");
//		}
		
	
		
		// targil 6
		
//		Scanner in = new Scanner(System.in);
//
//        System.out.print("Input first number: ");
//        int x = in.nextInt();
//        System.out.print("Input second number: ");
//        int y = in.nextInt();
//        System.out.print("Input third number: ");
//        int z = in.nextInt();
//
//        if (x == y && x == z)
//        {
//            System.out.println("All numbers are equal");
//        }
//        else if ((x == y) || (x == z) || (z == y))
//        {
//            System.out.println("Neither all are equal or different");
//        }
//        else
//        {
//            System.out.println("All numbers are different");
//        }
//		
		
	    
     // לולאות תרגילי
		
		
// targil 1
		
		
//		int x = 1;
//		while(x<=10) {
//			x++;
//			if (x!=4){
//			System.out.println(x);
//			}
//		}
		
		
// targil 2
		
//		int x = 0;
//
//		while (x<=100) {
//			x++;
//			if (x%3==0 && x%7==0) {
//				System.out.println(x);	
//				}
//			}
		
		
// targil 3
		
//		int sum = 0;
//		for (int i = 0; i <=20; i++) 
//			sum+= i;
//	System.out.println(sum);
		
		
		
	// targil 4
		
		
//		double x = 0;
//		double sum = 0;
//		double i = 0;
//		
//		
//        while ( i <5 ) {
//		Scanner scanner = new Scanner(System.in);
//				System.out.println("enter a number");
//				x = scanner.nextInt();
//				sum = sum+x;
//				i++;
//					}
//			System.out.println(sum);
		
		
		// targil 5
//
//		int count =0;
//		int userNumber;
//		int sum = 0 ;
//		
//		Scanner cons = new Scanner(System.in);
//		
//		while (count<5 ) {
//			System.out.println("enter a number");
//			userNumber = cons.nextInt();
//			if (userNumber==0) {
//				break;
//			}
//			sum = sum + userNumber;
//			count++;
//		}
//
//		System.out.println("the couunt on the numbers that entered" + " " + count);
//			System.out.println("the sum of the numbers is" + " " + sum);
//			if (count!=0) {
//				System.out.println("the average of the numbers is" + " " + sum/count);
//			}else {
//				System.out.println(" the average of the numbers is   0");
//			}
		
				
		
	// taril 6
		
//		int x = 1;
//		int y = 1;
//
//		while (y<=10) {
//			x=1;
//			while (x<=10) {
//				System.out.print(x*y + " " );
//				x++;
//			}
//			y++;
//			System.out.println();
//			}
				
				
// targil 7
		
		
//		int x =1;
//		int y = 1;
//
//		while (y<=10) {
//			x=1;
//			while (x<=10) {
//				if ((x*y)/10<1) {
//					System.out.print("0" + x*y + " ");
//				}
//				else {
//					System.out.print(x*y + " ");
//				}
//			
//				x++;
//			}
//			y++;
//			System.out.println();
//			
//		}
		
		
	// targil 8
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int x =  (int)(Math.random()*10)+1; 
//		int counter = 1;
//		int first = 1;
//		
//		
//		while (counter<=5) {
//			if (first==1) {
//			System.out.println("plese enter a number between 1 - 10 ,and try to guess the number");
//			first=2;
//			}
//			else {
//				System.out.println("try to guess again");
//			}
//			int y = scanner.nextInt();
//			if (x==y){
//				System.out.println("u did it !");
//				
//				break;
//			}
//			if (y>x) {
//				System.out.println("your number is to high");
//			}
//			else {
//				System.out.println("your number is to looooo");
//			}
//			counter++;
//		}
//		
//		if (counter==6){
//			System.out.println("u lost");
//		}


		// targil 9
		
//		int[] numbers  = {
//				 544 ,547 ,725 ,507 ,980 ,485 ,601 ,319 ,408 ,69 ,360 ,651 ,984 ,402 ,951
//				,942 ,105 ,236 ,592 ,984 ,390 ,219 ,575 ,865 ,617 ,263 ,501 ,141 ,165 ,83 ,615,941
//				,345 ,953 ,615 ,328 ,978 ,597 ,566 ,823 ,375 ,236 ,344 ,907 ,418 ,47 ,462 ,386
//				,217 ,687 ,949 ,626 ,950 ,866 ,248 ,826 ,566 ,412 ,237 ,918 ,219 ,758 ,162 ,399
//				,717 ,742 ,445 ,831 ,843 ,379 ,81 ,553 ,767 ,894 ,892 ,24 ,512 ,58 ,104 ,67 ,815
//				,753 ,328 ,721 ,126 ,380 ,440 ,857 ,93 ,685 ,854 ,753 ,688 ,451 ,842 ,609 ,958,470	
//		};
//		
//		for (int i = 0 ; i<numbers.length; i++) {
//            if (numbers[i]<=237) {
//                System.out.print(numbers[i]+" , ");
//            }
//		}


 // targil 10
		
		
// Scanner console = new Scanner(System.in);
//        
//        int number,          
//            countPositive = 0, 
//            countNegative = 0,
//            countZero = 0;
//
//        char choice;
//	
//        do
//        {
//            System.out.print("Enter the number ");
//            number = console.nextInt();
//        
//            if(number > 0)
//            {
//                countPositive++;
//            }
//            else if(number < 0)
//            {
//                countNegative++;
//            }
//            else
//            {
//                countZero++;
//            }
//        
//            System.out.print("Do you want to continue y/n? ");
//            choice = console.next().charAt(0);
//            
//        }
//        while(choice=='y' || choice == 'Y');
//        
//        System.out.println("Positive numbers: " + countPositive);
//        System.out.println("Negative numbers: " + countNegative);
//        System.out.println("Zero numbers: " + countZero);

		
		// targil 11
		
		
//		Scanner console = new Scanner(System.in);
//	     
//        int base;
//        int power;
//        int result = 1;
//        
//        System.out.print("Enter the base number ");
//        base = console.nextInt();
//        
//        System.out.print("Enter the power ");
//        power = console.nextInt();
//
//        for(int i = 1; i <= power; i++)
//        {
//	    result *= base;
//        }
//
//        System.out.println("Result: "+ result);


		
	//	פתרונות תרגילים למתקדמים


	//	1
		
		
//		Scanner console = new Scanner(System.in);
//
//	
//		int number;
//		int max = Integer.MIN_VALUE; // Intialize max with minimum value = -2147483648;
//		
//		int min = Integer.MAX_VALUE; // Intialize min with maximum value = 2147483647;
//		
//		 System.out.println(max + " " +min);
//
//		char choice;
//
//		do
//		{
//		System.out.print("Enter the number ");
//		number = console.nextInt();
//
//		if(number > max)
//		{
//		max = number;
//		}
//
//		if(number < min)
//		{
//		min = number;
//		}
//
//		System.out.print("Do you want to continue y/n? ");
//		choice = console.next().charAt(0);
//
//		}while(choice=='y' || choice == 'y');
//
//		System.out.println("Largest number: " + max);
//		System.out.println("Smallest number: " + min);
		
	

		// 2
		
//		for (int i = 0; i <=8; i++) {
//			
//			for (int j = 8-i; j >=1; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

		
		
		// 3
		
		
//		for (int i = 1; i <= 7; i++) {
//
//			for (int j = 1; j <=i; j++) {
//			System.out.print(j);
//			}
//			for (int k = 7-i; k >=1; k--) {
//			System.out.print("*");
//
//			}
//			System.out.println();
//		}
		
		
		
		// 4
		
		
	//	int r = 5;
	//	לולאה שרצה חמש פעמים מהנמוך לגבוה
	//	for(int i=1;i<=r;i++)
	//	{
	//	לולאה שרצה מחמש פחות קצב ההתקדמות של הלולאה הגדולה ורצב כל פעם פעם //
	//	אחת פחות
	//	for(int j=r-i;j>=1;j--) {
	//	System.out.print(" ");
	//	}

	//	לולאה שרצה בפעם הראשונה פעם אחת וכל פעם רצה מספר פעמים כפול מקצב //
	//	ההתקדמות של הלולאה הגדולה
	//	for(int j=1;j<=2*i-1;j++) {
	//	System.out.print("*");
	//	}
	//	System.out.println();
	//	}
		//----------------

	//	לולאה שרצה חמש פעמים מהגבוה לנמוך//
	//	for(int i=r-1;i>=1;i--)
	//	{
	//	לולאה שרצה חמש פעמים כאשר בפעם הראשונה היא רצה חמש פחות קצב התתקדמות //
	//	של הלולאה הגדולה וכל פעם סיבוב אחד פחות

		
	//	for(int j=1;j<=r-i;j++) {
	//	System.out.print(" ");
	//	}
	//	לולאה שרצה בפעם הראשונה פעם אחת וכל פעם רצה מספר פעמים כפול מקצב //
	//	ההתקדמות של הלולאה הגדולה
	//	for(int j=1;j<=2*i-1;j++) {
	//	System.out.print("*");
	//	}
	//	System.out.print("\n");
	//	}
		
		
		
		// 5
		
		
	//	Scanner scan = new Scanner(System.in);

	//	System.out.println("enter numner");
	//	int num = scan.nextInt();

	//	int count = 0;

	//	כל חלוקה בעשר בהכרח מפחיתה מספר ולכן כל עוד אני מעל 0 אוכל לספור כמה פעמים חילקתי בעשר על  מנת להגיע למספר הקטן מ1
		
	//	while(num > 0) {
	//	num /= 10;
	//	count++;

	//	}

	//	System.out.printf("NUMBER OF DIGITS IS %d", count);
		

	}

}
