package Variables_LogicsPractice;

public class Mobile {
	
	static String brand = "Iphone";
	String model;
	double price;
	
	public void buymobile() {
		int quantity = 2;
		System.out.println("Price of two mobile : "+ price * quantity);	
		
	}
	
	public void displaymobiledata() {
		
		System.out.println("Mobile brand : "+ brand);
		System.out.println("Mobile model : "+model);
		System.out.println("Mobile Price : "+price);
	}
	

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		
		m1.model = "17 Pro Max";
		m1.price = 75000;
		m1.displaymobiledata();
		m1.buymobile();
		
		System.out.println("-------------------------------------------");
		
		
		m2.model = "16 Pro Max";
		m2.price = 65000;
		m2.displaymobiledata();
		m2.buymobile();
		

	}

}
