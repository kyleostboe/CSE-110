
/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab3.java
// SPECIFICATION: Calculates final grade and corresponding Pass/Fail letter grade.
// FOR: CSE 110- Lab #3
// TIME SPENT: 25 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double finalExamGrade, midtermGrade, homeworkGrade, finalGrade;
		char letterGrade = ' ';

		System.out.print("Enter homework grade: ");
		homeworkGrade = scan.nextDouble();

		System.out.print("Enter midterm grade: ");
		midtermGrade = scan.nextDouble();

		System.out.print("Enter final exam grade: ");
		finalExamGrade = scan.nextDouble();

		finalGrade = ((finalExamGrade / 200) * 50) + ((midtermGrade / 100) * 25) + ((homeworkGrade / 100) * 25);

		if ((homeworkGrade >= 0 && homeworkGrade <= 100) && (midtermGrade >= 0 && midtermGrade <= 100)
				&& (finalExamGrade >= 0 && finalExamGrade <= 200)) {
			if (finalGrade >= 50) {
				letterGrade = 'P';
				System.out.println("Student Passed the class");
			} else {
				letterGrade = 'F';
				System.out.println("Student Failed the class");
			}

		} else
			System.out.println(
					"Invalid input. Homework and midterm grades should be between 0 and 100 and the final grade should be between 0 and 200");
		scan.close();
	}

}
