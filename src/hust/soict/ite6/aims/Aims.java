package hust.soict.ite6.aims;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.store.Store;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
}
	
	public static int InputFromUser()
	{
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		//scanner.close();
		return(input);
	}
	
	public static String TitleFromUser()
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		//scanner.close();
		return(input);
	}


	public static void main(String[] args) {
		
		Store store = new Store();
		Cart cart= new Cart();
		showMenu();
		int input=InputFromUser();
		if(input==1)
		{
			store.displayItems();
			storeMenu();
			input=InputFromUser();
			if(input ==1)
			{
				String titleString = TitleFromUser();
				store.displayItems(titleString);
				mediaDetailsMenu();
			}
			else if (input==2)
			{
				String titleString = TitleFromUser();
				cart.addMedia(store.isMatch(titleString));
			}
		}
	}
	
}

