import java.util.Scanner;

public class BrandNamer {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Brand Name Generator - K. Ostboe\n"); //header
		
		String brandName; //main brand name string that our function's return value is assigned to
		int numNames; //# of names generated (initialize to <100 for ideal formatting)
		int min, max; //declares constraints on name size
		
		System.out.println("How many brand names?");
		numNames = scan.nextInt();
		System.out.println("Between which two values should the # of letters be randomely generated? (low value last)");
		min = scan.nextInt(); max = scan.nextInt();
		
		System.out.print("\n");
		
		int randMultiplier = max - min + 1; //automates math used for the random method
		
		for (int i = 1; i <= numNames; i++) { //main loop that prints names
			int nameSize = (int) Math.floor(Math.random() * randMultiplier) + min;
			brandName = generateName(nameSize);
			if (i < 10)
				System.out.println(" " + i + ") " + brandName);
			else
				System.out.println(i + ") " + brandName);
		}
		
		scan.close();
	}

	public static String generateName(int size) {
		String _name = "";
		
		char[] aName = new char[size];
		
		char[] vow = { 'a', 'e', 'i', 'o', 'u' }; //vowels name can use
		char[] cons = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'x', 'z' }; //consonants name can use
		
		for (int i = 1; i < aName.length; i += 2) //generates random vowels and sets them to even letter positions in the brand name 
			aName[i] = vow[(int) Math.floor(Math.random() * 5)];
		for (int i = 0; i < aName.length; i += 2) //generates random vowels and sets them to odd letter positions in the brand name
			aName[i] = cons[(int) Math.floor(Math.random() * 19)];
		
		for (int i = 0; i < size; i++) //converts array or character (aName) to string (_name)
			_name = _name + aName[i];
		
		String name = _name.substring(0, 1).toUpperCase() + _name.substring(1); //converts first character of string (_name) to upper case in new string (name) 
		
		return name; //returns name to be assigned to brandName in main
	}
}
