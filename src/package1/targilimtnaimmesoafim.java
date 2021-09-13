package package1;

import java.util.Scanner;

public class targilimtnaimmesoafim {

	public static void main(String[] args) {
		
	//	targil 1
		
//	Scanner	in = new Scanner(System.in);
//	System.out.print("input number: ");	
//	int day = in.nextInt();	
//		
//	String dayName = ""	;
//	switch (day)	{
//	case 1 : dayName = "monday";break ;
//	case 2 : dayName = "tuesday";break ;
//	case 3 : dayName = "wednesday";break ;
//	case 4 : dayName = "thursday";break ;
//	case 5 : dayName = "friday";break ;
//	case 6 : dayName = "saturdat";break ;
//	case 7 : dayName = "sunday";break ;
//	default:dayName = "invalid day range";
//	}
//	System.out.println(dayName)	;
//		
		
	// targil 2
		
//		Scanner in = new Scanner(System.in);
//		int number_Of_DaysInMonth = 0; 
//        String MonthOfName = "Unknown";
//        
//        System.out.print("Input a month number: ");
//        int month = in.nextInt();
//		
//        System.out.print("Input a year: ");
//        int year = in.nextInt();
//		
//        switch (month) {
//        case 1:
//            MonthOfName = "January";
//            number_Of_DaysInMonth = 31;
//            break;
//        case 2:
//            MonthOfName = "February";
//            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//                number_Of_DaysInMonth = 29;
//            } else {
//                number_Of_DaysInMonth = 28;
//            }
//            break;
//        case 3:
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
//    }
//    System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
        
        
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
//		else if((avg<=50) && (avg>=30)) System.out.println("Your grade F.");
//		else System.out.println("Invalid");
//        
        
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
//		
	
		
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
		
		
		// targil 7
		
		
			
		
		
		

	}

}
