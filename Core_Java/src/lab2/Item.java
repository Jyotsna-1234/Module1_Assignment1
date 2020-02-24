package lab2;

public class Item {
	private int uid;
	private String title;
	private int copies;
	public Item(int uid, String title, int copies) {
		super();
		this.uid = uid;
		this.title = title;
		this.copies = copies;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [uid=" + uid + ", title=" + title + ", copies=" + copies + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
	 	int result = 1;
		result = prime * result + copies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + uid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (copies != other.copies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	public void print() {
		
	}
	public void addItem() {
		
	}
	public void checkIn() {
		
	}
	public void checkOut() {
		
	}

}
