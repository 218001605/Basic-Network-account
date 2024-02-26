package Account;
/*Author : @218001605
 * msstudymail@gmail.com.
 * */

public class Address {
	private int houseNo;
	private String street;
	private String  city;
	private String postalCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
		houseNo=0;
		street=null;
	    city=null;
		postalCode=null;
	}
	public Address(int houseNo, String street, String city, String postalCode) {
		// TODO Auto-generated constructor stub
		this.houseNo=houseNo;
		if(street.length()<5) {
			throw new IllegalArgumentException("street name must contain atleast 5 characters");
		}else {
			this.street=street;
		}
	    if(city.length()<5) {
	    	throw new IllegalArgumentException("city name must contain atleast 5 characters");
	    }
	    else {
	    	this.city=city;
	    }
		this.postalCode=postalCode;
	}
	public void setStreet(String street) {
		if(street.length()<5) {
			throw new IllegalArgumentException("street name must contain atleast 5 characters");
		}else {
			this.street=street;
		}
	}
	public void setCity() {
		 if(city.length()<5) {
		    	throw new IllegalArgumentException("city name must contain atleast 5 characters");
		 }
		 else {
		    this.city=city;
		 }
	}
	public String toString()
	{
		return houseNo+", "+street+", "+city+", "+postalCode;
	}
}
