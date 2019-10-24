
/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab6.java
// SPECIFICATION: has user create array then sort, shifts, and removes an
 * element of the user's choice. 
// FOR: CSE 110- Lab #6
// TIME SPENT: 45 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numElements, element, searchElement;

		System.out.print("How Many Elements in the Array? ");
		numElements = scan.nextInt();

		int[] intArray = new int[numElements];

		for (int i = 0; i < numElements; i++) {
			System.out.print("Please Enter the Next Value: ");
			element = scan.nextInt();
			intArray[i] = element;
		}

		for (int i = 0; i < numElements; i++) {
			for (int j = i + 1; j < numElements; j++) {
				if (intArray[i] > intArray[j]) {
					int exchange = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = exchange;
				}
			}
		}

		System.out.println("The Array After Sorting");
		for (int k = 0; k < numElements; k++) {
			System.out.print(intArray[k] + ", ");
		}
		System.out.print("\n");

		for (int i = 0; i < intArray.length - 1; i++) {
			intArray[i] = intArray[i + 1];
		}
		intArray[intArray.length - 1] = 0;

		System.out.println("The Array After Shifting to the Left");
		for (int k = 0; k < numElements; k++) {
			System.out.print(intArray[k] + ", ");
		}
		System.out.print("\n");

		System.out.print("Enter the Element to Search in the Array: ");
		searchElement = scan.nextInt();
		boolean found = false;

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == searchElement) {
				found = true;
			}
			if (found && i < intArray.length - 1) {
				intArray[i] = intArray[i + 1];
			}
		}
		
		if (found) {
			intArray[intArray.length - 1] = 0;
			System.out.println("Search Element Found");
		}

		System.out.print("Final Array: ");
		for (int k = 0; k < numElements; k++) {
			System.out.print(intArray[k] + ", ");
		}

		scan.close();
	}

}
