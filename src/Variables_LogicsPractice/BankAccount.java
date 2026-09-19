package Variables_LogicsPractice;

public class BankAccount {
	
	
	// static variables
	static String Bankname = "HDFC Bank";
	static int totalAccounts = 0;
	
	// Instance variables
	String accountholdername;
	int accountnumber;
	double balance;
	
	// Constructor
	public BankAccount(String name, int number, double initialbalance) {
		
		accountholdername = name;
		accountnumber = number;
		balance = initialbalance;
		
		totalAccounts++;
		
	}
	
	// DepositMethod
	
	public void deposit() {
		
		// local variable		
		double depositedamount = 5000;		
		balance = balance + depositedamount;
		
		System.out.println("Deposited Amount : "+depositedamount);
		System.out.println("Balance Amount : "+ balance);		
		
	}
	
	public void withdraw() {
		
		// local variable
		double withdrawamount = 2000;
		balance = balance - withdrawamount;
		
		System.out.println("Withdraws amount : "+withdrawamount);
		System.out.println("Balance Amount : "+balance);
	}
	
	// Display account details
	
	public void displayaccountdetails() {
		
		System.out.println("Account Holder: "+ accountholdername);
		System.out.println("Account number: "+ accountnumber);
		System.out.println("Balance: "+ balance);
		System.out.println("Bank name: "+ Bankname);
	}	

	public static void main(String[] args) {
		
		BankAccount B1 = new BankAccount("Karthik", 101, 10000);
		BankAccount B2 = new BankAccount("Venkat", 102, 20000);
		BankAccount B3 = new BankAccount("Virat", 103, 30000);
		
		B1.displayaccountdetails();
		B1.deposit();
		B1.withdraw();
		
		System.out.println("-------------------------------");
		
		B2.displayaccountdetails();
		B2.deposit();
		B2.withdraw();
		
		System.out.println("----------------------------------");
		
		B3.displayaccountdetails();
		B3.deposit();
		B3.withdraw();
		
		System.out.println("------------------------------------");
		
		System.out.println("Bank Name: "+ BankAccount.Bankname);
		System.out.println("Total Accounts: "+ BankAccount.totalAccounts);
	}

}
