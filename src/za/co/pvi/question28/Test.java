package za.co.pvi.question28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf((String s) -> { System.out.print(s); return s.length() <= 2;})) {
			System.out.println( " removed");
			}
		}
	}
