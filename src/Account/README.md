A Mobile operator awards points to customers based on their monthly consumption of 
airtimes. A customer gain ½ point for each R5 airtime bought. Some examples of point 
calculation are provided below.

	R5 airtime gains ½ point
	R10 airtime gains 1 point
	R15 airtime gains 1½ point
	R20 airtime gains 2 points
	Etc.

In light of the above, the formula for computing the points gained given an amount of 
airtime bought by a customer is as follows: 

	points = amount of airtime bought / 10
To monitor the allocation of points, each customer has an account with his/her personal 
details as well as his/her address. At month-end, the number of points obtained by each 
customer is converted into free/bonus airtimes and automatically credited into the 
customer phone for utilisation. For each 5 points balance, the customer is given a bonus 
airtime of R10. The formula for calculating the bonus airtime gained given the points 
balance is as follow. 

	bonus airtime = points balance of the account * 2
You are hired to develop a Java application with three classes, namely, Address, 
Customer and Account with the following specifications:

Address
	 Instance variables: house number, street, city and postal code
	 Constructors: default and overloaded/parameterised constructors
	 Setters for street and city. Do not code the getters.
	 toString() method to return the string value of instance variables in the form
	“(house number, street, city, postal code)”.
	Throw an exception if street or city is less than 5 characters.
Customer
	 Instance variables: identification number, name, age, gender (F/M), address
	 Constructors: default and overloaded/parameterised constructors
	 Setters for name, age and gender. Do not code the getters.
	 toString() method to return the details of a customer in the form “identification	
		number, name, age, gender, @ (house number, street, city, postal code)”.
		Throw an exception if name is less than 3 characters, the age is negative or
		the gender is different from F/M.

Account
	 Instance variables: phone number, points balance, customer
	 Constructors: Account () and Account (phone number, customer). Note that
		the points balance should be initialized to zero in both constructors.
	 Getter for phone number. Do not code the setters.
	 updatePointsBalance() method that receives as parameter the amount of
		airtime bought by the customer holding the account, computes the points gained
		and update the points balance, i.e., add the points gained to the points balance.
		The points gained are computed with the formula given above (first formula).
	 getBonusAirtimes() method that receives no parameters, computes and return
		the bonus airtime of the customer at month-end based on the formula given
		above (second formula).
	 toString() method to display the account details in the form “phone number,
		points balance, [identification number, name, age, gender, @ (house number,
		street, city, postal code)]”
 
Code a Java class AccountTester (the application) with the following specifications to 
test the Account class. 

	 A static array list accountList to keep the list of accounts
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
	 If the user enters -1, the application must stop.