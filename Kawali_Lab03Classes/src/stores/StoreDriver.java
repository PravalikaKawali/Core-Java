package stores;

import java.util.Scanner;

public class StoreDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing the Store Class");

		Store store1 = new Store("Timmy Tommy Enterprises", 1000, "3124564652", "311 Jarvis Square", "Chicago",
				"Illinois", 60018);
		System.out.println("********************************************************************************");
		System.out.println("Testing the Getter methods or Accessors of store class");
		System.out.println("********************************************************************************");

		System.out.println("Store ID:" + store1.getStoreID());
		System.out.println("Store Name:" + store1.getStoreName());
		System.out.println("Street of store:" + store1.getStreet());
		System.out.println("City of store:" + store1.getCity());
		System.out.println("State of store:" + store1.getState());
		System.out.println("Zipcod of store:" + store1.getZipCode());
		System.out.println("phone number of store:" + store1.getPhoneNumber());
		System.out.println("********************************************************************************");

		System.out.println("Testing the user defined methods");
		System.out.println("********************************************************************************");

		System.out.println("First word of storename: " + store1.getFirstWordOfStoreName());
		System.out.println("Middle word of storename: " + store1.getMiddleWordOfStoreName());
		System.out.println("Last word of storename: " + store1.getLastWordOfStoreName());

		store1.replaceStoreName("Timmy Tommy Enterprises", "JC Penny Store");
		System.out.println("\n");
		System.out.println("Printing the store1 object after invoking the replace method");
		System.out.println(store1.toString());

		Store store2 = new Store();
		System.out.println("********************************************************************************");
		System.out.println("Testing the getter methods or accessors of store class with no-arg constructor");
		System.out.println("********************************************************************************");
		System.out.println("Store ID:" + store2.getStoreID());
		System.out.println("Store Name:" + store2.getStoreName());
		System.out.println("Street of store:" + store2.getStreet());
		System.out.println("City of store:" + store2.getCity());
		System.out.println("State of store:" + store2.getState());
		System.out.println("Zipcod of store:" + store2.getZipCode());
		System.out.println("phone number of store:" + store2.getPhoneNumber());

		store2.setStoreName("KC Indian Mart");
		store2.setStoreID(1002);
		store2.setPhoneNumber("9136818080");
		store2.setStreet("8542 w 133 Street.");
		store2.setCity("Overland Park");
		store2.setState("Kansas");
		store2.setZipCode(66213);
		System.out.println("********************************************************************************");
		System.out.println("Testing the store class using toString after invoking the setter methods or mutators");
		System.out.println("********************************************************************************");
		System.out.println(store2.toString());
		System.out.println("********************************************************************************");
		System.out.println("Testing the Scanner class to take input from console");
		System.out.println("********************************************************************************");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the store details");
		System.out.println("Enter the store name");
		String storeName = scannerObject.nextLine();
		System.out.println("Enter the store ID");
		int storeId = scannerObject.nextInt();
		System.out.println("Enter the phonenumber");
		
		String phoneNumber = scannerObject.next();
				scannerObject.nextLine();
		System.out.println("Enter the street name of the store");
		String street = scannerObject.nextLine();
		System.out.println("Enter the city name, state name, zip code of the store in  one line:");
		String city = scannerObject.next();
		String state = scannerObject.next();
		int zipcode = scannerObject.nextInt();

		Store store3 = new Store(storeName, storeId, phoneNumber, street, city, state, zipcode);
		System.out.println("********************************************************************************");
		System.out.println("Testing the toString method without invoking the method");
		System.out.println("********************************************************************************");
		System.out.println(store3);

	}

}
