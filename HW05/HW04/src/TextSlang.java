import java.util.Scanner; //imports scanner class

public class TextSlang {

	public static void main(String[] args) {
		String choice; //declares string choice
		Scanner scan = new Scanner(System.in); //creates scanner
		System.out.println("TextSlang - K. Ostboe\n"); //output header
		do { //does program until user types in stop command
			System.out.print("Enter a text slang term, TTFN to stop: "); //prompts user
			choice = scan.nextLine(); //updates choice to user input
			choice = choice.toUpperCase(); //converts user input to upper case

			switch (choice) { // begins switch statement to translate slang terms 
			case "BRB": //
				System.out.println(choice + " means Be Right Back");
				break;
			case "FOMO":
				System.out.println(choice + " means Fear Of Missing Out");
				break;
			case "IDK":
				System.out.println(choice + " means I Don't Know");
				break;
			case "IRL":
				System.out.println(choice + " means In Real Life");
				break;
			case "J/K":
				System.out.println(choice + " means Just Kidding");
				break;
			case "JK":
				System.out.println(choice + " means Just Kidding");
				break;
			case "LOL":
				System.out.println(choice + " means Laughing Out Loud");
				break;
			case "TTFN":
				System.out.println(choice + " means Ta-Ta For Now");
				break;
			case "TTYL":
				System.out.println(choice + " means Talk To You Later");
				break;
			case "YOLO":
				System.out.println(choice + " means You Only Live Once");
				break;
			default: //in case user gives unrecognized slang term
				System.out.println(choice + " means something I don't know");
			}
		} while (choice.equals("TTFN") == false); //ends program if user types TTFN  

		scan.close(); //closes scanner
	}

}
