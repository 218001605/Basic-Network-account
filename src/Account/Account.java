package Account;
/*Author : @218001605
 * msstudymail@gmail.com
 * 
 *Instance variables: phone number, points balance, customer
 * Constructors: Account () and Account (phone number, customer). Note that
        the points balance should be initialized to zero in both constructors.
 * Getter for phone number. Do not code the setters.
 * updatePointsBalance() method that receives as parameter the amount of
      airtime bought by the customer holding the account, computes the points gained
      and update the points balance, i.e., add the points gained to the points balance.
       The points gained are computed with the formula given above (first formula).
 * getBonusAirtimes() method that receives no parameters, computes and return
     the bonus airtime of the customer at month-end based on the formula given
     above (second formula).
 * toString() method to display the account details in the form “phone number,
    points balance, [identification number, name, age, gender, @ (house number,
    street, city, postal code)
 * */
public class Account {
	private String phoneNo;
	public double points;
	Customer customer;
	public Account() {
		// TODO Auto-generated constructor stub
		points=0;
		phoneNo=null;
		customer=null;
	}
	public Account(String phoneNo, Customer customer) {
		points=0;
		this.phoneNo=phoneNo;
		this.customer=customer;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void updatePointsBalance(double amount) {
		points+=(points = amount/10);
		 
	}
	public double getBonusAirtimes() {
		double bonus= points* 2;
		return bonus;
	}
	public String toString() {
		return phoneNo+", "+points+", ["+customer.toString()+"]";
	}
}
