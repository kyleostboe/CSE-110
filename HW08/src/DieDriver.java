public class DieDriver {

	public static void main(String[] args) {
		System.out.println("Die Driver - K. Ostboe\n");

		// Creates Die
		System.out.println("1. Creation of Die\n");
		Die d1 = new Die();
		Die d2 = new Die(4);
		Die d3 = new Die(10);
		System.out.print("   a) ");
		d1.print();
		System.out.print("\n   b) ");
		d2.print();
		System.out.print("\n   c) ");
		d3.print();
		System.out.println("");

		// Sets value of Die
		System.out.println("\n2. Setting Value of Die\n");
		d1.setValue(3);
		d2.setValue(5);
		d3.setValue(0);
		System.out.print("   a) ");
		d1.print();
		System.out.print("\n   b) ");
		d2.print();
		System.out.print("\n   c) ");
		d3.print();
		System.out.println("");

		// Freezes a Die
		System.out.println("\n3. Freezing a Die\n");
		d1.freeze();
		d1.setValue(5);
		System.out.print("   a) ");
		d1.print();
		d1.unfreeze();
		d1.setValue(5);
		System.out.print("\n   b) ");
		d1.print();
		System.out.println("");

		// Draws Die
		System.out.println("\n4. Drawing a Die\n");
		System.out.print("   a) \n");
		d1.draw();
		System.out.println("");
		System.out.print("   b) \n");
		d2.draw();
		System.out.println("");
		System.out.print("   c) \n");
		d3.draw();
		System.out.println("");

		// Rolls Die
		System.out.println("\n5. Rolling a Die\n");
		System.out.print("   a) ");
		for (int i = 0; i < 10; i++) {
			d1.roll();
			d1.print();
			System.out.print(" ");
		}

		System.out.print("\n   b) ");
		for (int j = 0; j < 3; j++) {
			d2.roll();
			d2.print();
			System.out.print(" ");
		}

		System.out.print("\n   c) ");
		for (int k = 0; k < 10; k++) {
			d3.roll();
			d3.print();
			System.out.print(" ");
		}
	}
}
