package za.co.pvi.question230;

class Test {
	static int ab = 20;
	static int value = 5;
	public static void main(String[] args) {
		int number = abc(9, 0);
		System.out.println("Main: " + ab);
	}

	static int abc(int a, int b) {
		
		try {
			
			System.out.println(value / b);// line n1
			//return a + b; // line n2

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("Finally"); // line n3 
		}
		return a + b;

	}
}