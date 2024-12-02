package hust.soict.ite6.aims.media;

public abstract class Media {

	public Media() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Media)
		{
			return this.title == ((Media) obj).title;
		}
		return(false);
	}

}
