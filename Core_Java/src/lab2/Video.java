package lab2;


public class Video extends MedialItem{
	private String director;
	private String genre;
	private int year_published;

	public Video(int uid, String title, int copies, int runtime, String director, String genre, int year_published) {
		super(uid, title, copies, runtime);
		this.director=director;
		this.genre=genre;
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