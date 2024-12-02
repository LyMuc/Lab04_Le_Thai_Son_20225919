package hust.soict.ite6.aims.media;

public class Track implements Playable{

	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public Track(String title) {
		super();
		this.title = title;
	}
	public Track(int length) {
		super();
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	

}
