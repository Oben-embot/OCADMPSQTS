package za.co.pvi.question231;

class Test {
	static int ab = 2;
	public static void main(String[] args) {
		int number = abc(9, 0);
		System.out.println("Main: " + ab);
	}

	static int abc(int a, int b) {
		try {
			int value = 12;
			System.out.println(value  / b); // line n1
			return a + b; // line n2

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally");
		}
		return a + b; // line n3

	}
}