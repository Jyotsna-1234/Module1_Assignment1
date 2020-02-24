package lab2;



public class MedialItem extends Item {
	private int runtime;
	public MedialItem(int uid, String title, int copies , int runtime) {
		super(uid, title, copies);
		this.runtime=runtime;
		// TODO Auto-generated constructor stub
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + runtime;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedialItem other = (MedialItem) obj;
		if (runtime != other.runtime)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MedialItem [runtime=" + runtime + "]";
	}
	
	

}