package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {

	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public CompactDisc(String artist, List<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(String artist) {
		super();
		this.artist = artist;
	}
	public CompactDisc(List<Track> tracks) {
		super();
		this.tracks = tracks;
	}
	
	public boolean addTrack(Track inpTrack)
	{
		StringBuffer stringBuffer = new StringBuffer();
		if(tracks.contains(inpTrack)==false)
		{
			tracks.add(inpTrack);
			stringBuffer.append("The track ").append(inpTrack.getTitle()).append("has been added successfully");
			System.out.println(stringBuffer.toString());
			return(true);
		}
		else {
			stringBuffer.append("The track ").append(inpTrack.getTitle()).append("has already been added");
			return(false);
		}
	}
	
	public boolean removeTrack(Track inpTrack)
	{
		StringBuffer stringBuffer = new StringBuffer();
		if(tracks.contains(inpTrack)==true)
		{
			tracks.remove(inpTrack);
			stringBuffer.append("The track ").append(inpTrack.getTitle()).append("has been removed successfully");
			System.out.println(stringBuffer.toString());
			return(true);
		}
		else {
			stringBuffer.append("The track ").append(inpTrack.getTitle()).append("is not in the list");
			return(false);
		}
	}
	
	@Override
	public int getLength()
	{
		int length=0;
		for(int i=0; i<tracks.size(); i++)
		{
			length+=tracks.get(i).getLength();
		}
		return(length);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD category: " + this.getCategory());
		System.out.println("Artist: " + this.artist);
		System.out.println("Director: " + this.getDirector());
		System.out.println("DVD length: " + this.getLength());
		System.out.println("Cost: " + this.getCost());
		
		for(int i=0; i<tracks.size(); i++) {
			tracks.get(i).play();
			System.out.println();
		}
	}
	
	
}
