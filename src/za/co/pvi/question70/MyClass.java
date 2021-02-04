package za.co.pvi.question70;

public class MyClass {

	public static void main(String[] args) {
          int x= 10;
          int y = ++x;
          int z = 0;
          if(y >= 10 || y <= ++x) {
        	  z = x;
        	  System.out.println(z);
        	  }else {
        		z = x++;
        		  System.out.println(z);
        	  }
		
	}

}
