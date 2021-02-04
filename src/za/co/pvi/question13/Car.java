package za.co.pvi.question13;

public class Car extends Vehicle{
 int y;
 
	 Car() {
          super(10);  //line n2 	        
	}

	Car(int y){
		super(y);
		this.y = y;
	}
	public String toSting() {
		return super.x + ":" + this.y;
	}
	public static void main(String[] args) {
		 Vehicle y = new Car(20);
		 System.out.println(y);
	 }
}
