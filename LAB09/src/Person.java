
public class Person {
	String firstName, lastName;
	int birthYear;

	public Person(String fname, String lname, int year) {
		firstName = fname;
		lastName = lname;
		birthYear = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge(int currentYear) {
		return currentYear - birthYear;
	}

}
