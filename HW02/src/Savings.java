import java.util.Scanner;

public class Savings {

	public static void main(String[] args) {
		System.out.println("Simple Interest - K. Ostboe\n"); // header
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the initial savings amount? "); // asks user for initial savings amount
		double initialSavings = keyboard.nextDouble(); // saves user input to variable: initialSavings

		System.out.print("What is the number of months to save? "); // asks user for # of months to save
		int months = keyboard.nextInt(); // saves user input to variable: months

		System.out.print("What is the annual interest rate? "); // asks user for interest rate
		double annualInterestRate = keyboard.nextDouble(); // saves user input to variable: annualInterestRate

		double monthlyInterestRate = (annualInterestRate / 100) / 12; // calculates monthly interest rate
		double finalValue = initialSavings * Math.pow(1 + monthlyInterestRate, months); // calculates new savings value

		System.out.printf("$%,.2f, saved for %,d months at %.2f%% will be valued at $%,.2f", initialSavings, months,
				annualInterestRate, finalValue); // prints new savings value

		keyboard.close();
	}
}
