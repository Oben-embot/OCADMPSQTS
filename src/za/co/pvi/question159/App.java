package za.co.pvi.question159;


public class App {
	int count;

	public void method(Book x, int k) {
		x.pages = 100;
		k = 200;

	}

	public static void main(String[] args) {
		App obj = new App();
		Book objBook = new Book();
		System.out.println(objBook.pages + ":" + obj.count);
		obj.method(objBook, obj.count);
		System.out.println(objBook.pages + ":" + obj.count);

	}

}
