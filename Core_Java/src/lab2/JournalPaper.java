package lab2;


public class JournalPaper extends WrittenItem{
	private int year_published;
	
	public JournalPaper(int uid, String title, int copies, String author,int year_published) {
		super(uid, title, copies, author);
		this.year_published=year_published;
		// TODO Auto-generated constructor stub


	}
	
	
	@Override
	public void print() {
		System.out.println("Items Printed");
	}
	@Override
	public void addItem() {
		
		System.out.println("New Item added");
	}
	@Override
	public void checkIn() {
		System.out.println("Checkd In");
	}
	@Override
	public void checkOut() {
		System.out.println("Items bought. Checked out");
	}
	

}