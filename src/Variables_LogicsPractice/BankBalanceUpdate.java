package Variables_LogicsPractice;

public class BankBalanceUpdate {
	
	int balance = 5000;
	
	public void balance() {
		
		System.out.println("Initial Balance : "+ balance);
	}
	
	public void deposit(int amount) {
		
		balance = balance + amount;
		
		System.out.println("After deposit : " + balance);		
		
	}
	
	public void withdraw(int amount) {
		
		balance = balance - amount;
		
		System.out.println("After withdraw : "+ balance);
	}
	
	

	public static void main(String[] args) {		
		
		BankBalanceUpdate BV = new BankBalanceUpdate();
		
		BV.balance();
		BV.deposit(2000);
		BV.withdraw(1500);
		BV.withdraw(2000);

	}

}
