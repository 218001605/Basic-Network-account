package Account;
/* Author : 218001605
 * msstudymail@gmail.com
 * 
 *  Instance variables: identification number, name, age, gender (F/M), address
 * Constructors: default and overloaded/parameterised constructors
 * Setters for name, age and gender. Do not code the getters.
 * toString() method to return the details of a customer in the form “identification
 *  number, name, age, gender, @ (house number, street, city, postal code)”.
 *   Throw an exception if name is less than 3 characters, the age is negative or
 *   the gender is different from F/M.
 * */
public class Customer {
	private String id;
	private String name;
	private int age;
	private String gender;
	Address address;
	public Customer() {
		// TODO Auto-generated constructor stub
		id=null;
		name=null;
		age=0;
		//gender=
		address=null;
	}
	public Customer(String id, String name,int age,String gender, Address address) {
		// TODO Auto-generated constructor stub
		if(age<0) {
			throw new IllegalArgumentException("the age is negative");
		}else {
			this.id=id;
		}
		if(name.length()>=3) {
			this.name=name;
		}else {
			throw new IllegalArgumentException("name should alteast contain 3 charactors");
		}
		if(gender.equals("F")|| gender.equals("M")) {
			this.gender=gender;
		}else {
			throw new IllegalArgumentException("Invalid gender,should be==> gender (F/M");
		}
		this.address=address;
	}
	public void setName(String name) {
		if(name.length()>=3) {
			this.name=name;
		}else {
			throw new IllegalArgumentException("name should alteast contain 3 charactors");
		}
	}
	public void setAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("the age is negative");
		}else {
			this.id=id;
		}
	}
	public void setGender(String gender) {
		if(gender.equals("F") || gender.equals("M")) {
			this.gender=gender;
		}else {
			throw new IllegalArgumentException("Invalid gender,should be==> gender (F/M");
		}
	}
	public String toString() {
		return id+", "+name+", "+age+", "+gender+", @ ("+address.toString()+")";
	}
}
