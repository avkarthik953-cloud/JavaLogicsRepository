package Variables_LogicsPractice;

public class Shopping {
	
	static String websitename = "Myntra";
	String productname;
	double productprice;
	
	
	public void calculateTotalPrice(int quantity, double discount) {
		
		
		System.out.println("Website : "+websitename);
		System.out.println("Product name is : "+productname);
		System.out.println("Product price is : "+productprice);
		System.out.println("Quantity of the product is : "+quantity);
		System.out.println("Discount of the product is : "+discount);
		
		double totalprice = productprice * quantity;
		discount = totalprice * discount/100;
		double finalprice = totalprice - discount;		
		
		System.out.println("Discount is : "+discount);
		System.out.println("Final Price is : "+finalprice);		
		
	}

	public static void main(String[] args) {
		
		Shopping S1 = new Shopping();
		Shopping S2 = new Shopping();
		
		S1.productname = "Mobile";
		S1.productprice = 20000;
		S1.calculateTotalPrice(2, 10);
		
		System.out.println("---------------------------------------------");
		
		
		S2.productname = "Slippers";
		S2.productprice = 1500;
		S2.calculateTotalPrice(4, 20);
		
		
		

	}

}
