package lab2;

public class Book extends WrittenItem {
	
	public Book(int uid, String title, int copies, String author) {
		super(uid, title, copies, author);
		// TODO Auto-generated constructor stub


	}
	
	
	
	public void print() {
		System.out.println("Items Printed");
	}
	public void addItem() {
		
		System.out.println("New Item added");
	}
	public void checkIn() {
		System.out.println("Checkd In");
	}
	public void checkOut() {
		System.out.println("Items bought. Checked out");
	}
	

}


