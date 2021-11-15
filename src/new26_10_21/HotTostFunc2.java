package new26_10_21;
import java.util.Scanner;

/*

public class HotTostFunc2 {

	public static int age () {
		int cost = 15;
		Scanner cons = new Scanner(System.in);
		try {
			System.out.println("plese enter your age (maybe you are eligible to recieve a discount)");
			int age = cons.nextInt();
			if (age<=18 && age>=15) {
				cost-=5;
				System.out.println("you got a discount of 5 ILS");
			}
			if(age<5 || age>100) {
				System.out.println("is this really your age? enter an age in the range of 5-100.lets try again");
				return age();
			}
		} catch (Exception e) {
			System.out.println("you should enter only numbers");
			return age();
		}
		return cost;
	}
	
	
	public static int additions() {
		int cost=0;
		Scanner cons = new Scanner(System.in);
		System.out.println("do u want to add topings to your tost? enter yes/no.");
		String answer = cons.nextLine();
		if(answer.equals("yes")) {
			
			System.out.println("choose from the list: olives, corn, mushrooms - 3 ILS.");
			System.out.println("tomatos, fish, cheese - 4 ILS.");
			System.out.println("ytpe in yoyr topings and use ',' between them .");
			String additions =cons.nextLine();
			String [] additions1 = additions.split(",");
			for(int i = 0; i<additions1.length; i++) {
				String addition = additions1[i].trim();
				
				
				switch (addition)
				{
				case "olives": cost+=3;
				break;
				case "corn": cost+=3;
				break;
				case "mushrooms": cost+=3;
				break;
				case "fish": cost+=4;
				break;
				case "tomato": cost+=4;
				break;
				case "cheese": cost+=4;
				break;
				default:
					System.out.println("you can chose only from existing list.make sure to use ','");
					return additions();
				}
			}
			System.out.println("Registred! :)");
		}
		else if(answer.equals("no")) {
			System.out.println("are you sure? type in yes/no.");
			String answer2 = cons.nextLine();
			if(answer2.equals("no")) {
				return additions();
			}
		}
		return cost;
		
	}
	
	
	public static int drink () {
		int cost = 0;
		Scanner cons = new Scanner(System.in);
		System.out.println("do you want to order a drink? press y/n");
		String ans = cons.nextLine();
		
		if (!ans.equals("y") && !ans.equals("n")) {
			System.out.println("didnt get that. press y/n");
			return drink();
		}
		else if (ans.equals("y")) {
			System.out.println("what would you like to drink? orange or cola?");
			String choice = cons.nextLine();
			if(choice.equals("cola,orange")||choice.equals("orange,cola")) {
				System.out.println("you can only choose one drink. lets try again");
			}
			else if (choice.equals("cola") || choice.equals ("orange") || choice.equals ("Cola")|| choice.equals ("Orange")) {
				cost+=8;
				System.out.println("Registered");	
			}
			else {
				System.out.println("plese choose between 2 options: cola or orange.");
				return drink();
			}
			System.out.println("to finish the order type in : send order");
			String exit = cons.nextLine();
			if(exit.equals("send order")) {
				System.out.println();
			}
			else {
				System.out.println("your order is registered even if you didnt type 'send order'");
			}
			
			
		}
		System.out.println("thank you for ordering from the 'HOT TOAST'");
		return cost;
		
		
	}
	
	
}

*/