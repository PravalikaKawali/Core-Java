package stores;

public class Store {

	private String storeName;
	private int storeID;
	private String phoneNumber;
	private String street;
	private String city;
	private String state;
	private int zipCode;

	public Store(String storeName, int storeID, String phoneNumber, String street, String city, String state,
			int zipCode) {
		this.storeName = storeName;
		this.storeID = storeID;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Store() {

	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getFormattedAddress() {

		return getStreet() + "\n" + getCity() + "," + getState() + "-" + getZipCode();

	}

	public String getFormattedPhoneNumber() {
		return "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-"
				+ phoneNumber.substring(6, phoneNumber.length());
	}

	public void replaceStoreName(String oldName, String newName) {
		storeName = storeName.replaceAll(oldName, newName);

	}
	
	public String getFirstWordOfStoreName() {
		return storeName.substring(0, storeName.indexOf(" "));
	}
	
	public String getMiddleWordOfStoreName() {
		return storeName.substring(storeName.indexOf(" ")+1, storeName.lastIndexOf(" "));
	}
	
	public String getLastWordOfStoreName() {
		return storeName.substring(storeName.lastIndexOf(" "), storeName.length());
	}

	@Override
	public String toString() {
		return storeName+ " "+"("+ storeID+")" +"\n"+ getFormattedAddress() +"\n"+ getFormattedPhoneNumber();
	}
	
	

}
