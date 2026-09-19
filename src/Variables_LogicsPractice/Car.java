package Variables_LogicsPractice;

public class Car {
	
	static String companyname = "Volkswagen";
	String carmodel;
	int carNumber;
	double price;
	
	public void calculateDiscount(double discountPercentage) {

	    double discountAmount = price * discountPercentage / 100;
	    double finalPrice = price - discountAmount;

	    System.out.println("Discount Amount: " + discountAmount);
	    System.out.println("Price after Discount: " + finalPrice);
	}
	
	public void cardetails() {
		
		System.out.println("Company name : "+companyname);
		System.out.println("Car model is : "+carmodel);
		System.out.println("Car number is : "+carNumber);
		System.out.println("Car price is : "+price);
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.carmodel = "Virtus";
		c1.carNumber = 12345;
		c1.price = 2500000;
		
		c1.cardetails();
		c1.calculateDiscount(10);
		
		System.out.println("----------------------------------------------");
		
		c2.carmodel = "Taigun";
		c2.carNumber = 54321;
		c2.price = 2000000;
		
		c2.cardetails();
		c2.calculateDiscount(15);	
		
		

	}

}
