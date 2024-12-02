package hust.soict.ite6.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Media;

public class Store {
	public static final int MAX_ITEMS_IN_STORE = 1000;
	//private String authenticate;
	private List<Media> itemsInStore = new ArrayList<Media>();
	private int nbStoreManager;
	private int idStoreManager;
	public void setAuth()
	{
		//this.authenticate="Store Manager";
		this.nbStoreManager++;
		this.idStoreManager=this.nbStoreManager;
	}
	
	public int getNbStoreManager() {
		return nbStoreManager;
	}

	public int getIdStoreManager() {
		return idStoreManager;
	}
	
	public int addMedia(Media... discs)
	{
		int totalAdded = 0; // Biến để đếm số lượng DVD đã thêm thành công
	    for (Media disc : discs) {
	        if (itemsInStore.size() == MAX_ITEMS_IN_STORE) {
	            System.out.println("The cart is full");
	            break;
	        }
	        
	        // Kiểm tra trùng lặp DVD
	        boolean isDuplicate = false;
	        for (int index = 0; index < itemsInStore.size(); index++) {
	            if (itemsInStore.get(index).getTitle().equals(disc.getTitle())) {
	                System.out.println("The disc " + disc.getTitle() + " has been added already");
	                isDuplicate = true;
	                break;
	            }
	        }
	        
	        if (!isDuplicate) {
	            itemsInStore.add(disc);
	            totalAdded += 1;
	        }
	    }
	    
	    return totalAdded > 0 ? totalAdded : -1; // Trả về số lượng DVD đã thêm hoặc -1 nếu không có DVD nào được thêm
	}
	
	public int removeMedia(Media... discs)
	{
		int totalRemoved = 0; // Biến để đếm số lượng DVD đã thêm thành công
	    for (Media disc : discs) {
	        if (itemsInStore.size() == 0) {
	            System.out.println("The cart is empty");
	            break;
	        }
	        
	        // Kiểm tra trùng lặp DVD
	        boolean isDuplicate = false;
	        for (int index = 0; index < itemsInStore.size(); index++) {
	            if (itemsInStore.get(index).getTitle().equals(disc.getTitle())) {
	                //System.out.println("The disc " + disc.getTitle() + " has been added already");
	                isDuplicate = true;
	                break;
	            }
	            else System.out.println("The disc " + disc.getTitle() + " is not in the list");
	        }
	        
	        if (isDuplicate) {
	            itemsInStore.remove(disc);
	            totalRemoved += 1;
	        }
	    }
	    
	    return totalRemoved > 0 ? totalRemoved : -1; // Trả về số lượng DVD đã thêm hoặc -1 nếu không có DVD nào được thêm
	}
}
