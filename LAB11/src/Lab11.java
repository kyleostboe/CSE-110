import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {

		// local variables
		String firstname, lastname, studentmajor, fullname;
		int studentcredits;

		// scanner
		Scanner scan = new Scanner(System.in);

		// first student
		System.out.println("ENTER FIRST STUDENT'S INFORMATION");
		System.out.print(" Enter first name: ");
		firstname = scan.nextLine();
		System.out.print(" Enter last name: ");
		lastname = scan.nextLine();
		System.out.print(" Enter your major: ");
		studentmajor = scan.nextLine();
		System.out.print(" Enter your total credits: ");
		studentcredits = scan.nextInt();
		scan.nextLine();
		System.out.println("");

		Student student1 = new Student(firstname, lastname, studentmajor, studentcredits);

		// second student
		System.out.println("ENTER SECOND STUDENT'S INFORMATION");
		System.out.print(" Enter first name: ");
		firstname = scan.nextLine();
		System.out.print(" Enter last name: ");
		lastname = scan.nextLine();
		System.out.println("");

		Student student2 = new Student(firstname, lastname);

		// display students
		System.out.println("FIRST STUDENT'S INFORMATION");
		studentmajor = student1.getMajor();
		studentcredits = student1.getCredits();
		fullname = student1.getFullName();
		System.out.println(" The name of the student is: " + fullname);
		System.out.println(" Major is: " + studentmajor);
		System.out.println(" Number of earned credits is: " + studentcredits);
		System.out.println("");

		System.out.println("SECOND STUDENT'S INFORMATION");
		studentmajor = student2.getMajor();
		studentcredits = student2.getCredits();
		fullname = student2.getFullName();
		System.out.println(" The name of the student is: " + fullname);
		System.out.println(" Major is: " + studentmajor);
		System.out.println(" Number of earned credits is: " + studentcredits);
		System.out.println("");

		student1.changeMajor("International Affairs");

	}

}
