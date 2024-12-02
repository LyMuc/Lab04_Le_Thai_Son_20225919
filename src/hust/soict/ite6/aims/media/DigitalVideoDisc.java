package hust.soict.ite6.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	private static int nbDigitalVideoDiscs =0;
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
