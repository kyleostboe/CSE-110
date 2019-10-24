
/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab2.java
// SPECIFICATION: Takes users first and last name (regardless of case) and 
             places them on one line (in lower case) using strings. Also 
             proves "==" cannot be used to compare strings.
// FOR: CSE 110- Lab #2
// TIME SPENT: 30 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		String firstName;
		String lastName;
		String fullName;
		int nameLength = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first name: ");
		firstName = scan.nextLine();
		System.out.println("Please enter last name: ");
		lastName = scan.nextLine();

		fullName = firstName + " " + lastName;
		fullName = fullName.toUpperCase();
		nameLength = fullName.length();

		System.out.println("Full name (in capitals): " + fullName);
		System.out.println("Length of full name: " + nameLength);

//Define two String variables, title1 and title2 using
//String constructor to initialize them
		String title1 = new String("cse110");
		String title2 = "cse110";
//Compare the two strings and print which one of the two ways works
//follow code below:
		if (title1 == title2) {
			System.out.println("String comparison using \"==\" sign works.");
		} else {
			System.out.println("String comparison using \"==\" sign does NOT work.");
		}
		if (title1.equals(title2)) {
			System.out.println("String comparison using \"equals\" method works.");
		} else {
			System.out.println("String comparison using \"equals\" method does NOT work.");
		}

		scan.close();
	}
}
