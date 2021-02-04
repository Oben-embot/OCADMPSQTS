package za.co.pvi.question36;

public class Test {
	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			if (arr[i].equals("C")) {
				// continue;
				break;
			}
			System.out.println("Work done");
			// break;
		}
	}

}