package Variables_LogicsPractice;

public class Product {
	
	// static variables
	static String storename = "Bookstore";
	
	String productname;
	double productprice;
	
	public void updateprice(double percentage) {
		
			
		double incrementamount = productprice * percentage/100;		
		double newprice = productprice + incrementamount;
		
		System.out.println("Storename : "+storename);
		System.out.println("productname : "+productname);
		System.out.println("Original Product price before hike : "+productprice);
		System.out.println("Increment price value of Product : "+ incrementamount);
		System.out.println("Product Price after updating : "+newprice);		
		
		//System.out.println(productprice);
		
	}	

	public static void main(String[] args) {
		
		Product P1 = new Product();
		Product P2 = new Product();
		
		
		P1.productname = "Amarachitra Katha";
		P1.productprice = 500;
		P1.updateprice(10);
		
		System.out.println("-----------------------------------------");
		
		
		P2.productname = "FairyTales";
		P2.productprice = 200;
		P2.updateprice(20);
		
		//System.out.println(storename);
	
		
		
	}

}
