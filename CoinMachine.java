import java.util.Scanner;

public class CoinMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float owed, recieved, change, holder;
		int dollars, quarters = 0, dimes = 0, nickels = 0, cents = 0;

		System.out.println("Coin Machine - K. Ostboe");

		System.out.print("Enter the amount owed: ");
		owed = scan.nextFloat();

		System.out.print("Enter the amount recieved: ");
		recieved = scan.nextFloat(); 

		System.out.print("\n");
		change = recieved - owed;
		dollars = (int) change;
		holder = change - dollars;
		holder = Math.round(holder * 100);

		if (holder >= 25) {
			quarters = (int) (holder / 25);
			holder = holder % 25;
		}
		if (holder < 25 && holder >= 10) {
			dimes = (int) (holder / 10);
			holder = holder % 10;
		}
		if (holder < 10 && holder >= 5) {
			nickels = (int) (holder / 5);
			holder = holder % 5;
		}
		if (holder < 5 && holder >= 1) {
			cents = (int) (holder / 1);
		}
		if (change < 0) {
			float short_ = owed - recieved;
			System.out.printf("*** You did not provide enough money. You are $%.2f short. ***", short_);
		}

		if (change > 0) {
			System.out.printf("Your change today is $%.2f\n\n", change);

			System.out.println("Dollars :" + dollars);
			System.out.println("Quarters:" + quarters);
			System.out.println("Dimes   :" + dimes);
			System.out.println("Nickels :" + nickels);
			System.out.println("Cents   :" + cents);
		}
		scan.close();
	}

}
