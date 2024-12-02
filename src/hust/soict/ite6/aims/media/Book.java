package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private List<String> authors = new ArrayList<String>();
	
	
	public boolean addAuthor(String authorName)
	{
		StringBuffer stringBuffer = new StringBuffer();
		if(authors.contains(authorName)==false)
		{
			authors.add(authorName);
			stringBuffer.append("The author ").append(authorName).append("has been added successfully");
			System.out.println(stringBuffer.toString());
			return(true);
		}
		else {
			stringBuffer.append("The author ").append(authorName).append("has already been added");
			return(false);
		}
	}
	
	public boolean removeAuthor(String authorName)
	{
		StringBuffer stringBuffer = new StringBuffer();
		if(authors.contains(authorName)==true)
		{
			authors.remove(authorName);
			stringBuffer.append("The author ").append(authorName).append("has been removed successfully");
			System.out.println(stringBuffer.toString());
			return(true);
		}
		else {
			stringBuffer.append("The author ").append(authorName).append("is not in the list");
			return(false);
		}
	}
	
}
