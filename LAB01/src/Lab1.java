
/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab1.java
// SPECIFICATION: Calculates the average of 3 test scores.
// FOR: CSE 110- Lab #1
// TIME SPENT: 25 minutes
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		int test1, test2, test3;
		double average;
		final int NUM_TESTS = 3;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the score on the first test: ");
		test1 = in.nextInt();

		System.out.print("Enter the score on the second test: ");
		test2 = in.nextInt();

		System.out.print("Enter the score on the third test: ");
		test3 = in.nextInt();

		average = (test1 + test2 + test3) / (double) NUM_TESTS;

		System.out.println("Your average score is: " + average);
	}// main block

}// class block
