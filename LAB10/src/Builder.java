public class Builder {
	private String name;

	public Builder(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public String makeRow(int n, String s) {
		String row = "";
		for (int i = 0; i < n; i++) {
			row = row + s;
		}
		return row;
	}

	public void makePyramid(int n, String s) {
		String space = " ";
		String spacer = "";
		for (int i = 1, j = (n - 1) / 2; i <= n; i = i + 2, j--) {
			for (int k = 0; k < j; k++) {
					spacer = spacer + space;
			}
			System.out.println(spacer + makeRow(i, s));
			spacer = "";
		}
	}

}
