package Account;
/*Author : 218001605
 * msstudymail@gmail.com
 * 
 * 
 * 
 * Code a Java class AccountTester (the application) with the following specifications to 
test the Account class. 

* A static array list accountList to keep the list of accounts
 A static method getAddress() that accepts as parameter, the Scanner object,
	receives from the user the details of the address of a customer, instantiates and
	returns an address object.
 A static method getCustomer() that accepts as parameter, the Scanner object,
	receives the details of a customer from the user, instantiates and returns a
	customer object. Hint: call the getAddress() method to get the address of a
	customer.
 A static method openAccount() that accepts as parameter, the Scanner object,
	receives the details of an account from the user, instantiates and returns an
	account object. Hint: call the getCustomer() method to get the details of the
	customer, i.e., the account holder.
 A static method searchAccount() that accepts as parameter, the phone number
	of a customer, searches the accountList array list and returns the position of the
	account if it exists in the array list or -1 otherwise.
	
Your application should provide the following functionalities: (1) open a customer 
account, (2) compute the points gained by a customer for buying a certain amount of 
airtime, (3) compute the amount of airtime corresponding to the points balance in the 
account of a customer and (4) display the details of an account. 
Initially, your application should prompt the user with the following menu. Thereafter, 
the menu should be displayed repetitively to enable the user to enter several choices 
without ending the program. The menu should be displayed until the user enters a valid 
choice number. The application should stop when the user enter -1 as choice of menu 
option. 

Enter a number (1, 2, 3 or 4) to indicate your choice
	1-Open an account
	2-Get points
	3-Get bonus airtime
	4-Display account details
	-1 To stop
 If the user enters 1, invoke the openAccount() method to get and account object
	and add it into the accountList array list.
 If the user enters 2, get the customer phone number from the user. Invoke the
	searchAccount() method to get eventually the position of the corresponding
	account in the accountList array list. If the account exists in the array list, get
	the amount of airtime bought by the customer and update his/her points balance
	in the array list, otherwise, display the error message “Unregistered phone
	number”.
 If the user enters 3, get the customer phone number from the user. Invoke the
	searchAccount() method to get eventually the position of the corresponding
	account in the accountList array list. If the account exists in the array list, invoke
	the appropriate method to display the amount of bonus airtime gained by the
	customer as on the sample program execution below, otherwise, display the
	error message “Unregistered phone number”.

 If the user enters 4, get the customer phone number from the user. Invoke the
	searchAccount() method to get eventually the position of the corresponding
	account in the accountList array list. If the account exists in the array list,
	display the details of the account, otherwise, display the error message
	“Unregistered phone number”.
 If the user enters -1, the application must stop
 * */
import java.util.*;
public class AccountTester {
	public static ArrayList<Account> accountList= new ArrayList<Account>();
	public AccountTester() {
		// TODO Auto-generated constructor stub
	}
	private static Address getAddress(Scanner scan){
		System.out.println("-------------------Address details---------------");
		System.out.print("House No.:"); int hNum=scan.nextInt();
		System.out.print("Street: ");String street=scan.next();
		System.out.print("City: "); String city=scan.next();
		System.out.print("Postal code: "); String pCode=scan.next();

		return new Address(hNum,street,city,pCode);
	}
	private static Customer getCustomer(Scanner scan) {
		System.out.println("-------------------Custonmer details--------------");
		System.out.print("ID number: "); String id=scan.next();
		System.out.print("Name: ");String name=scan.next();
		System.out.print("Age: "); int age=scan.nextInt();
		System.out.print("Gender (F/M): "); String gender=scan.next().toUpperCase();
		//Address address=getAddress(scan);

		return new Customer(id,name,age,gender,getAddress(scan));
	}
	private static Account openAccount(Scanner scan) {
		System.out.println("-------------New Account details------------------");
		System.out.print("Phone number: "); String phoneNo= scan.next();
		return new Account(phoneNo,getCustomer(scan));
	}
	private static int searchAccount(String phoneNo) {
		int pos=-1;
		for(int i=0;i<accountList.size();i++) {
			if(accountList.get(i).getPhoneNo().equals(phoneNo)) {
				pos=i;
			}
		}
		return pos;
	}
	public static void main(String [] args){
		Scanner scan= new Scanner(System.in);
		int n;
		do {
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter a number (1, 2, 3 or 4) to indicate your choice");
			System.out.println("1-Open an account");
			System.out.println("2-Get points");
			System.out.println("3-Get bonus airtime");
			System.out.println("4-Display account details");
			System.out.println("-1 To stop");
			n=scan.nextInt();
			if(n==1) {
				accountList.add(openAccount(scan));
			}if(n==2) {
				System.out.print("Phone number: "); String phoneNo= scan.next();
				if(searchAccount(phoneNo)!=-1) {
					System.out.print("amount: "); double amount= scan.nextDouble();
					accountList.get(searchAccount(phoneNo)).updatePointsBalance(amount);
				}else{
					System.out.println("Unregistered phone number");
				}
			}if(n==3) {
				System.out.print("Phone number: "); String phoneNo= scan.next();
				if(searchAccount(phoneNo)!=-1) {
					System.out.println(accountList.get(searchAccount(phoneNo)).getBonusAirtimes());
				}else {
					System.out.println("Unregistered phone number");
				}

			}
			if(n==4) {
				System.out.print("Phone number: "); String phoneNo= scan.next();
				if(searchAccount(phoneNo)!=-1) {
					System.out.println(accountList.get(searchAccount(phoneNo)).toString());
				}else {
					System.out.println("Unregistered phone number");
				}

			}
		} while(n!=-1);
	}
}
