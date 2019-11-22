import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		int rowLength, pyramidBase;
		String name;
		String equalSign = "";
		String row;
		String rowSign = "*";

		Scanner scan = new Scanner(System.in);

		System.out.print("Name of the builder: ");
		name = scan.nextLine();

		Builder myBuilder = new Builder(name);

		System.out.println("The name of builder is: " + myBuilder.getName());

		System.out.print("Enter a positive integer: ");
		rowLength = scan.nextInt();
		row = myBuilder.makeRow(rowLength, rowSign);
		for (int i = 0; i < rowLength; i++)
			equalSign = equalSign + "=";
		System.out.println(equalSign + row + equalSign);

		System.out.print("Enter a positive odd integer, representing number of stars in the base of a pyramid: ");
		pyramidBase = scan.nextInt();
		myBuilder.makePyramid(pyramidBase, rowSign);

		scan.close();
	}

}
