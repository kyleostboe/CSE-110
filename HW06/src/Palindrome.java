import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String phrase; //string to hold user input
		
		System.out.println("Palindrome Checker - K. Ostboe\n"); //header

		do {
			System.out.print("Enter a phrase: ");
			phrase = scan.nextLine();
			
			if(phrase.equals("done") == false) { 
				if(isPalindrome(phrase) == true) //checks if user input is a palindrome
					System.out.println("That is a Palindrome.\n");
				else
					System.out.println("That is NOT a Palindrome.\n");
			}
		} while(phrase.equals("done") == false); //terminates loop when user types "done"
		scan.close();
	} //main

	public static boolean isPalindrome(String s) {
		boolean res;
		s = s.replaceAll("[^A-Za-z]+", ""); //removes all spaces and punctuation
		s = s.toUpperCase(); //converts string to upper case
		String reverse = reverseString(s); //passes string into reverseString method and assigns it to new string
		res = s.equals(reverse); //evaluates whether argument string matches reversed string (is or isn't palindrome)
		return res; //returns evaluation
	}

	public static String reverseString(String s) {
		//creates array and copies string s's values to it (for manipulation purposes)
		char[] sArray = new char[s.length()];  
		for (int i = 0; i < sArray.length; i++)
			sArray[i] = s.charAt(i);
		//variables
		int i = 0, j = sArray.length - 1;
		char holder; //holds element so not lost in swap
		//swaps array elements (reverse action)
		for (i = 0; i < j; i++, j--) {
			holder = sArray[i];
			sArray[i] = sArray[j];
			sArray[j] = holder;
		}
		String reverse = String.valueOf(sArray).toUpperCase(); //copies reversed array to string
		return reverse;
	}
} //class