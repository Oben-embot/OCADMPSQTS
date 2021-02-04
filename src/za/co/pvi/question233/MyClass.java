package za.co.pvi.question233;

public class MyClass {
	
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int x : numbers) {
			if (x == 30 || x == 60 || x == 90 || x == 120) {
				//continue;
				break;
			}
			if (x % 2 == 0) {
				//break;
				//continue;
			}
			System.out.print(x + " ");
		}
	}
}