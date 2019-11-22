/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab8.java
// SPECIFICATION: Reads and prints 12 strings from a text file. 
// FOR: CSE 110- Lab #8
// TIME SPENT: 15 minutes
//-----------------------------------------------------------------------*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Lab8 {

	public static void main(String[] args) {
		String line;
		
		String[][] myArray = new String[4][3];
		
		try {
			FileReader fr = new FileReader("Fruit.txt");
			BufferedReader inFile = new BufferedReader(fr);
			
			for (int i = 0; i < 4; i++) {
				 for (int j = 0; j < 3; j++) {
				 line = inFile.readLine();
				 myArray[i][j] = line;
				 }
			}
			inFile.close();
		}
		catch (IOException ioe) {
			 System.out.println("Something went wrong.");
		}
		for (int i = 0; i < 4; i++) {
			 for (int j = 0; j < 3; j++) {
			 System.out.printf("%-20s", myArray[i][j]);
			 }
			 System.out.println();
			}
	}
}