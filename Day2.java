// Control Flow
//	Interatives - do something repeatedly
//	conditionals - check against
//

public class Day2{
	public static void main(String[] args){
		boolean condition = false;

		int x = 7;
		int y = 5;

		// ==
		// .equals()

		// <
		// >
		// <=
		// >=

		// && AND with short circuiting (stops when a false if reached)
		// || OR  with short circuiting (stops when one is true)
		// &  AND (looks at all conditions even if a false is already reached)
		// |  OR  (looks at all conditions even if you already hit a true)

		// Conditionals
		if(x > y || y < x){
			System.out.println("less or greater");
		}
		else if(x == y){
			// execute if the condition is ture
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}

		// switch will receive a value and then execute a matching
		// Looks to see if x = case then executes the rest of the cases unless it reaches a break
		switch(x){
			case 0: System.out.println("Zero");
				break;
			case 1: System.out.println("One");
				break;
			case 2: System.out.println("Two");
				break;
			case 7: System.out.println("Seven");
				break;
			case 8: System.out.println("Eight");
				break;
			// case "Brandon"
		}

		switch("Hello"){
			case "Hello": System.out.println("Welcome to the program");
				break;
			case "Goodbye": System.out.println("Leave!");
				break;
			default: Systen.out.println("Something went wrong...");
				break;
		}
	}
}
