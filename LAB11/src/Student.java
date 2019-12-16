
public class Student {

	// instance variables
	private String studentMajor;
	private String firstName;
	private String lastName;
	private int studentCredits;

	// constructors
	public Student(String fName, String lName, String major, int credits) {
		firstName = fName;
		lastName = lName;
		studentMajor = major;
		studentCredits = credits;
	}

	public Student(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		this.studentMajor = "General Studies";
		this.studentCredits = 0;
	}

	// methods
	public String getMajor() {
		return studentMajor;
	}

	public int getCredits() {
		return studentCredits;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public void changeMajor(String newMajor) {
		studentMajor = newMajor;
		System.out.println(firstName + " " + lastName + " has changed majors to " + studentMajor);
	}

}
