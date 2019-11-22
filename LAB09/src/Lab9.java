/*-------------------------------------------------------------------------
// AUTHOR: Kyle Ostboe
// FILENAME: Lab9.java
// SPECIFICATION: Uses class methods and object to take user's name
 * and birth year and calculate their age. 
// FOR: CSE 110- Lab #9
// TIME SPENT: 10 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		String firstname, lastname;
		int birthyear;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first name: ");
		firstname = scan.nextLine();
		System.out.print("Enter last name: ");
		lastname = scan.nextLine();
		System.out.print("Enter birth year: ");
		birthyear = scan.nextInt();
		Person person = new Person(firstname, lastname, birthyear);
		System.out.println(person.getFirstName() + " " + person.getLastName() + " is " + person.getAge(2019)
				+ " years old in 2019 and will be " + person.getAge(2029) + " years old in ten years.");
		scan.close();
	}

}
