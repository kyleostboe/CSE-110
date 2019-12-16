
public class PokerDice {

	public static void main(String[] args) {
		
		// header
		System.out.println("Poker Dice Probability Calculator - K. Ostboe");
		
		// variables and arrays
		final int MAX_ROLLS = 100;
		int[] tally = { 0, 0, 0, 0, 0, 0, 0, 0 }; // tally[0] not used
		String[] handNames = { "N/A", "None alike", "One Pair", "Two Pairs", "Three of a Kind", "Full House",
				"Four of a Kind", "Five of a Kind" };
		
		// creates dice
		Die[] dice = createDice(); // creates an array of five dice
		
		// rolls dice MAX_ROLLS amount of times and adds hand to tally array
		for (int roll = 0; roll < MAX_ROLLS; roll++) {
			rollDice(dice);
			int hand = determineHand(dice);
			tally[hand]++;
		}
		
		// prints the amount of trails and probabilities of each hand
		printHeading(MAX_ROLLS);
		for (int i = 1; i < tally.length; i++) {
			System.out.printf("Case %d, %15s, is %.6f\n", i, handNames[i], (double) tally[i] / MAX_ROLLS);
		}
	}
	
	// creates five die objects and adds them to an array r of die objects
	public static Die[] createDice() {
		Die[] r = new Die[5];
		for (int i = 0; i < 5; i++)
			r[i] = new Die(6);
		return r;
	}
	
	// rolls each of the 5 die objects in an array of type die[]
	public static void rollDice(Die[] dice) {
		for (int i = 0; i < 5; i++)
			dice[i].roll();
	}
	
	// compares the value each die to the value of the die objects in front of it, 
	//	counts each time values match, 
	//  determines hand based on # of matches
	public static int determineHand(Die[] dice) {
		int k = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (dice[i].getValue() == dice[j].getValue())
					k++;
			}
		}

		switch (k) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4:
			return 5;
		case 6:
			return 6;
		case 10:
			return 7;
		default:
			return 0;
		}
	}
	
	// prints # of trials program runs based on value of MAX_ROLLS
	public static void printHeading(final int maxRolls) {
		System.out.printf("Running %,d trials\n\n", maxRolls);
	}

}
