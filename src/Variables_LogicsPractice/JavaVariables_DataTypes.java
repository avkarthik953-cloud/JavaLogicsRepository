package Variables_LogicsPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class JavaVariables_DataTypes {
	
	/*
	 * String name; static String village = "Kalikiri"; int age;
	 * 
	 * public void message() {
	 * 
	 * System.out.println(age); }
	 * 
	 * 
	 * 
	 * int a=10, b=20;
	 * 
	 * public int add() {
	 * 
	 * int c = a+b;
	 * 
	 * return c;
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * int a = 10;
	 * 
	 * System.out.println("Hello World!!"); System.out.println(a);
	 * 
	 * JavaVariables_DataTypes JV = new JavaVariables_DataTypes();
	 * 
	 * System.out.println(JV.name = "Karthik"); System.out.println(JV.age = 23);
	 * System.out.println(village);
	 * 
	 * JavaVariables_DataTypes JV2 = new JavaVariables_DataTypes();
	 * 
	 * System.out.println(JV2.name = "Girisha"); System.out.println(JV2.age = 22);
	 * System.out.println(village);
	 * 
	 * JV.message();
	 * 
	 * }
	 */

	      public static void main(String[] args) {
	    	  
	    	 String name = "Karthik";
	    	 int age = 25;
	    	 double salary = 25000;
	    	 String gender = "Male";
	    	 boolean ismarried = false;
	    	 
	    	 System.out.println(name);
	    	 System.out.println(age);
	    	 System.out.println(salary);
	    	 System.out.println(gender);
	    	 System.out.println(ismarried);
	    	 
	    	 
	    	 int a = 10;
	    	 int b = 20;
	    	 
	    	 System.out.println(a+b);
	    	 System.out.println(a-b);
	    	 System.out.println(a*b);
	    	 System.out.println(a%b);
	    	 
	    	 
	    	 int length = 30;
	    	 int width = 20;
	    	 
	    	 System.out.println(length * width);
	    	 
	    	 int radius = 50;	    	 
	    	 System.out.println(3.14 * radius * radius);
	    	 
	    	 
	    	 double salary1 = 25000;
	    	 
	    	 System.out.println(salary1 * 12);
	    	 
	    	 int age1 = 30;
	    	 
	    	 age1++;
	    	 
	    	 System.out.println(age1);
	    	 
	    	 int productprice = 100;	
	    	 double increasedprice = productprice + (productprice*10/100.0);
	    	 System.out.println(increasedprice);
	    	 
	    	 
	    	 int c = 10, d = 20;
	    	 
	    	 c = c+d; // 30 
	    	 d = c-d; // 10
	    	 c = c-d; // 20
	    	 
	    	 System.out.println(c);
	    	 System.out.println(d);
	    	 
	    	 int test = 100;
	    	 
	        System.out.println(test +=50); 
	    	System.out.println(test -=20);
	    	System.out.println(test *=2);
	    	System.out.println(test /=5);
	    	 
	    	int cd = 50;
	    	
	    	cd++;
	    	System.out.println(cd);
	    	cd--;
	    	System.out.println(cd);
	    	
	   
	    	
	   
	    	 
	    	 
			
		}
	

}
