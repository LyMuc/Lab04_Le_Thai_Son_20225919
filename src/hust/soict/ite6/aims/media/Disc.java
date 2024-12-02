package hust.soict.ite6.aims.media;

public class Disc extends Media{

	public Disc() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Disc(String director) {
		super();
		this.director = director;
	}

	public Disc(int length) {
		super();
		this.length = length;
	}
	
	
	public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}


	protected int length;
	protected String director;
	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	

}
