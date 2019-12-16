
public class Die {

	private int numSides;
	private int dieVal;
	private boolean isFrozen;

	// Constructors
	public Die(int nSides) {
		isFrozen = false;
		numSides = nSides;
		dieVal = 1;

		// prints error message if die is created with 1 or less sides
		if (nSides <= 1) {
			System.out.println("*** Attempted to set sides to " + numSides + ", assumed 6");
			numSides = 6;
		}
	}

	public Die() {
		isFrozen = false;
		numSides = 6;
		dieVal = 1;
	}

	// Accessors/Mutators
	public void setValue(int v) {
		// does nothing if die is frozen
		if (isFrozen)
			return;
		// sets die value to parameter passed if parameter is greater than 0 and less than or equal to sides
		else if ((0 < v) && (v <= numSides))
			dieVal = v;
		// if value is outside range above value is set to 1
		else {
			dieVal = 1;
			System.out.println("*** Attempted to set value to " + v + ", assumed 1");
		}
	}

	public int getValue() {
		return dieVal;
	}

	// Functions
	public void roll() {
		// does nothing if die is frozen
		if (isFrozen)
			return;
		// sets value of die to random number between 1 and # of sides
		else
			dieVal = (int) (numSides * Math.random()) + 1;
	}
	
	public void print() {
		// prints value and number of sides
		System.out.print("[" + dieVal + ":" + numSides + "]");
	}

	public void draw() {
		// draws each die for user if sides are less than or equal to 6
		if (numSides <= 6) {
			if (dieVal == 1)
				System.out.print(".......\r\n" + ".     .\r\n" + ".     .\r\n" + ".  *  .\r\n" + ".     .\r\n"
						+ ".     .\r\n" + ".......\r\n" + "");
			if (dieVal == 2)
				System.out.print(".......\r\n" + ".     .\r\n" + ".   * .\r\n" + ".     .\r\n" + ". *   .\r\n"
						+ ".     .\r\n" + ".......\r\n" + "");
			if (dieVal == 3)
				System.out.print(".......\r\n" + ".     .\r\n" + ".   * .\r\n" + ".  *  .\r\n" + ". *   .\r\n"
						+ ".     .\r\n" + ".......\r\n" + "");
			if (dieVal == 4)
				System.out.print(".......\r\n" + ".     .\r\n" + ". * * .\r\n" + ".     .\r\n" + ". * * .\r\n"
						+ ".     .\r\n" + ".......\r\n" + "");
			if (dieVal == 5)
				System.out.print(".......\r\n" + ".     .\r\n" + ". * * .\r\n" + ".  *  .\r\n" + ". * * .\r\n"
						+ ".     .\r\n" + ".......\r\n" + "");
			if (dieVal == 6)
				System.out.print(".......\r\n" + ".     .\r\n" + ". * * .\r\n" + ". * * .\r\n" + ". * * .\r\n"
						+ ".     .\r\n" + ".......\r\n" + "");
		}

		else
			print();
	}

		// freezes and unfreezes die
	public void freeze() {
		isFrozen = true;
	}

	public void unfreeze() {
		isFrozen = false;
	}

}