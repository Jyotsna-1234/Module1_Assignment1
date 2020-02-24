package lab2;


public class CD extends MedialItem {
	private String artist;
	private String genre;
	

	public CD(int uid, String title, int copies, int runtime, String artist, String genre ) {
		super(uid, title, copies, runtime);
		this.artist=artist;
		this.genre=genre;
		
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
	}}