
/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab7.java
// SPECIFICATION: Creates two dimensional array, populates the array with
 * user input, then sums up the rows. Displays everything.
// FOR: CSE 110- Lab #7
// TIME SPENT: 30 minutes
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rows, columns, sum;

		System.out.print("Enter the number of rows in the array: ");
		rows = scan.nextInt();

		System.out.print("Enter the number of columns in the array: ");
		columns = scan.nextInt();

		int[][] intArray = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Please Enter a value: ");
				intArray[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(intArray[i][j] + "    ");
			}
			System.out.print("\n");
		}

		for (int i = 0; i < rows; i++) {
			sum = 0;
			for (int j = 0; j < columns; j++) {
				sum = sum + intArray[i][j];
			}
			System.out.print("Sum of Element row " + i + " is: " + sum + "\n");
		}
		scan.close();
	}

}
