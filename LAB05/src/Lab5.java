/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab5.java
// SPECIFICATION: Populates array with user input, prints array's
 * elements backwards, then prints sum of array elements.
// FOR: CSE 110- Lab #5
// TIME SPENT: 30 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int aLength;
		double element, sum = 0;

		System.out.print("How many elements in the array? ");
		aLength = scan.nextInt();

		double[] array = new double[aLength];

		for (int i = 0; i < aLength; i++) {
			System.out.print("Please enter the next value: ");
			element = scan.nextDouble();

			array[i] = element;
		}

		for (int i = aLength - 1; i >= 0; i--) {
			System.out.printf("%.3f  ", array[i]);

			if (i == aLength - 8)
				System.out.print("\n");

			sum = sum + array[i];
		}

		System.out.printf("\nThe sum of the array's elements is: %.3f\n", sum);

		scan.close();
	}
}
