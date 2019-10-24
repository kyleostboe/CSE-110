/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab4.java
// SPECIFICATION: Allows user choice and ability to construct a triangle or 
             list integers between two integers.
// FOR: CSE 110- Lab #4
// TIME SPENT: 15 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int choice;

		do {
			System.out.println("Please choose your choice from following menu:\r\n"
					+ "1) Print through all integer numbers between two given integers.\r\n"
					+ "2) Display a right triangular pattern of stars.\r\n" + "3) Quit.");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				int start, end;
				System.out.print("Enter the start number: ");
				start = scan.nextInt();
				System.out.print("Enter the end number: ");
				end = scan.nextInt();
				for (int i = start; i <= end; i++) {
					System.out.print(i + " ");
				}
				System.out.println("\n");
				break;
			case 2:
				int height;
				System.out.print("Enter the height: ");
				height = scan.nextInt();
				for (int i = 1; i <= height; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case 3:
				System.out.println("Byebye!:)");
				break;
			default:
				System.out.println("Invalid Input\n");
				break;
			}
		} while (choice != 3);

		scan.close();
	}

}
