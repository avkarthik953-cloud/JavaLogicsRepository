package ConditionalStatement;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CodingPractice {

	public static void main(String[] args) {

		/*
		 * int num = -25;
		 * 
		 * if (num > 0) { System.out.println("Given number is Positive"); } else if (num
		 * < 0) { System.out.println("Given number is negative"); } else {
		 * System.out.println("Given number is zero"); }
		 */

		
		
		/*
		 * int num = 5;
		 * 
		 * if(num % 2 == 0) { System.out.println("Given number is an even number"); }
		 * else { System.out.println("Given number is an odd number"); }
		 */
		 
		 

		
		/*
		 * int age = 17;
		 * 
		 * if(age >=18) { System.out.println("Person is eligible for vote"); } else {
		 * System.out.println("Person is not eligible for vote"); }
		 */
		 

		/*
		 * int a = 30, b = 20;
		 * 
		 * if(a>b) {
		 * 
		 * System.out.println("a is largest number"); } else {
		 * System.out.println("b is largest number"); }
		 */

		/*
		 * int a = 25, b = 40, c = 15;
		 * 
		 * if(a>b && a>c) { System.out.println("A is largest number"); } else if(b>a &&
		 * b>c) { System.out.println("B is largest number"); } else {
		 * System.out.println("C is the largest number"); }
		 */

		
		/*
		 * int marks = 60;
		 * 
		 * if(marks >= 90 && marks <=100) { System.out.println("Grade A"); } else
		 * if(marks >=80 && marks <=89) { System.out.println("Grade B"); } else if(marks
		 * >=70 && marks <=79) { System.out.println("Grade C"); } else if(marks >=60 &&
		 * marks <=69) { System.out.println("Grade D"); } else if(marks >=0 && marks <
		 * 60) { System.out.println("Grade F"); } else {
		 * System.out.println("Invalid marks"); }
		 */
		 

		
//		double salary = -65000;
//
//		if (salary >= 100000) {
//			System.out.println("High Salary");
//		} else if (salary >= 50000) {
//			System.out.println("Good Salary");
//		} else if (salary >= 30000) {
//			System.out.println("Average Salary");
//		} else {
//			System.out.println("Low Salary");
//		}
//		 

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Units : ");
//		int units = sc.nextInt();	
//		
//		double bill = 0;
//		
//		if(units> 0) {
//			
//			if(units <= 100) {
//				
//				System.out.println(units*2);
//				
//			} else if(units <= 200) {
//				bill = (100 * 2) + (units - 100) * 3;		
//				
//			} else if(units <= 300) {
//				bill = (100*2) + (100*3) + (units - 200) * 5;
//			} else {
//				
//				bill = (100*2) + (100*3) + (100*5) + (units - 300) * 7;
//			}
//			System.out.println("Total electricity bill : "+bill);
//		} else {
//			System.out.println("Invalid units");
//		}
		 

		
//		int age = 101;
//
//		if (age >= 0 && age <= 12) {
//			System.out.println("Child");
//		} else if (age >= 13 && age <= 19) {
//			System.out.println("Teenager");
//		} else if (age >= 20 && age <= 59) {
//			System.out.println("Adult");
//		} else if (age >= 60) {
//			System.out.println("Senior Citizen");
//		} else {
//			System.out.println("Invalid age");
//		}
		 

		/*
		 * int year = 2032;
		 * 
		 * if(year%400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
		 * System.out.println("Given number is a leap year");
		 * 
		 * } else { System.out.println("Given number is not a leap year"); }
		 */

		
//		int experience = 2;
//		double salary = 50000;
//		int PerformanceRating = 4;
//
//		if (experience >= 3 && salary >= 50000 && PerformanceRating >= 4) {
//			System.out.println("Eligible for promotion");
//		} else {
//			System.out.println("Not eligible for promotion");
//		}

//		
//		String username = "admin";
//		String Password = "Admin@123";
//
//		if (username.equals("admin") && Password.equals("Admin@123")) {
//
//			System.out.println("Login is successful");
//		} else {
//			System.out.println("Invalid credentials, please try with valid credentials");
//		}
//		 

		/*
		 * int actualresult = 500; int expectedresult = 200;
		 * 
		 * if(actualresult == expectedresult) { System.out.println("Test passed"); }
		 * else { System.out.println("Test Failed"); }
		 */

//		String browser = "Safari";
//
//		if (browser.equals("Chrome")) {
//			System.out.println("Chrome Browser is selected");
//		} else if (browser.equals("Firefox")) {
//			System.out.println("FireFox browser is selected");
//		} else if (browser.equals("Edge")) {
//			System.out.println("Edge browser is selected");
//		} else if (browser.equals("Safari")) {
//			System.out.println("Safari browser is selected");
//		} else {
//			System.out.println("Unsupported browser selected");
//		}

		
//		String browser = "Brave";
//
//		switch (browser) {
//
//		case "Safari":
//			System.out.println("Safari browser selected");
//			break;
//		case "Chrome":
//			System.out.println("Chrome browser selected");
//			break;
//		case "Edge":
//			System.out.println("Edge browser selected");
//			break;
//		case "Firefox":
//			System.out.println("Firefox browser selected");
//			break;
//		default:
//			System.out.println("Unsupported browser selected");
//
//		}
		 

		
//		int statuscode = 204;
//
//		switch (statuscode) {
//		case 200:
//			System.out.println("Success");
//			break;
//		case 201:
//			System.out.println("Created");
//			break;
//		case 400:
//			System.out.println("Bad Request");
//			break;
//		case 401:
//			System.out.println("Unauthorized");
//			break;
//		case 403:
//			System.out.println("Forbidden");
//			break;
//		case 404:
//			System.out.println("Not found");
//			break;
//		case 500:
//			System.out.println("Internal Server Error");
//			break;
//		default:
//			System.out.println("Unknown Status");
//		}
		 

		
//		double balance = 50000;
//		double withdrawalamount = 20000;
//
//		if (withdrawalamount > 0) {
//			if (withdrawalamount <= balance) {
//				balance = balance - withdrawalamount;
//				System.out.println("Withdrawal Successful");
//				System.out.println("Remanining amount is : " + balance);
//			} else {
//				System.out.println("Withdrawal not successful");
//			}
//		} else {
//			System.out.println("Invalid withdrawal amount");
//
//		}
		 

//		Scanner sc = new Scanner(System.in);
//		double balance = 50000;
//		System.out.println("Available balance : " + balance);
//		System.out.print("Enter Withdrawal amount : ");
//		double withdrawalamount = sc.nextDouble();
//
//		if (withdrawalamount > 0) {
//			if (withdrawalamount % 100 == 0) {
//				if (withdrawalamount <= balance) {
//					balance = balance - withdrawalamount;
//					System.out.println("Withdrawal successful!!");
//					System.out.println("Withdrawal amount is : " + withdrawalamount);
//					System.out.println("Available Balance : " + balance);
//
//				} else {
//					System.out.println("Insufficient Balance. Please enter valid amount");
//				}
//			} else {
//				System.out.println("Invalid amount. Please enter multiples of 100");
//			}
//		} else {
//			System.out.println("Inavlid amount. Entered amount must be greater than 0");
//		}

//		 Scanner sc = new Scanner(System.in);
//
//	     System.out.println("Enter Age : ");
//	     int age = sc.nextInt();
//
//	     if (age >= 21) {
//
//	        System.out.println("Enter Salary : ");
//	        double salary = sc.nextDouble();
//
//	          if (salary >= 30000) {
//
//	            System.out.println("Enter Credit score : ");
//	            int creditscore = sc.nextInt();
//
//	                if (creditscore >= 700) {
//	                // No need to ask existing customer at all
//	                System.out.println("Loan got approved");
//
//	                } else if (creditscore >= 650 && creditscore <= 699) {
//	                    // Only ask existing customer in this borderline range
//	                    System.out.println("Is existing customer (true/false) : ");
//	                    boolean existingcustomer = sc.nextBoolean();
//
//	                    if (existingcustomer == true) {
//	                        System.out.println("Loan got approved");
//	                    } else {
//	                        System.out.println("Insufficient Credit score. Loan got rejected");
//	                    }
//
//	                } else {
//	                    // creditscore < 650
//	                    System.out.println("Insufficient Credit score. Loan got rejected");
//	                }
//
//	            } else {
//	                System.out.println("Insufficient Salary. Loan got rejected");
//	            }
//
//	        } else {
//	            System.out.println("Age limit is not met. Loan got rejected");
//	        }
//
//	        sc.close();	

//		int a = 27, b = 30, c = 25;
//
//		if ((a > b && a < c) || (a < b && a > c)) {
//			System.out.println("a is middle");
//		} else if ((b > a && b < c) || (b < a && b > c)) {
//			System.out.println("b is middle");
//		} else {
//			System.out.println("c is middle");
//		}

//		int a = 30, b = 30, c = 30;
//		
//		if(a == b && b == c) {
//			System.out.println("All three numbers are equal");
//		} else if(a == b || b == c || c == a) { 
//			System.out.println("Two numbers are equal");
//		} else {
//			System.out.println("All three numbers are different");
//		}

//		Scanner sc = new Scanner(System.in);		
//		
//		System.out.println("Enter the price : ");
//		double price = sc.nextDouble();
//		
//		if(price >= 100000) {
//			
//			double discount = price * 20/100;
//			System.out.println("Original Price is :"+ price);
//			System.out.println("Discount amount : "+ discount);
//			price = price - discount;
//			System.out.println("Final Price after discount : "+price);
//			
//			
//		} else if(price >= 50000) {
//			
//			double discount = price * 10/100;
//			System.out.println("Original Price is :"+ price);
//			System.out.println("Discount amount : "+ discount);
//			price = price - discount;
//			System.out.println("Final Price after discount : "+price);		
//			
//			
//		} else if(price >=20000) {
//			double discount = price * 5/100;
//			System.out.println("Original Price is :"+ price);
//			System.out.println("Discount amount : "+ discount);
//			price = price - discount;
//			System.out.println("Final Price after discount : "+price);	
//			
//			
//		} else if(price > 0 && price < 20000) {		
//			
//			System.out.println("No discount is available");
//		} else {
//			
//			System.out.println("Invalid amount entered");
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the salary : ");
//		double salary = sc.nextDouble();
//		
//		System.out.println("Enter the experience : ");
//		int experience = sc.nextInt();
//		
//		if(experience >= 10) {
//			
//			double bonus = salary * 20/100;
//			System.out.println("Original Salary : "+salary);
//			System.out.println("Bonus Salary : "+bonus);
//			salary = salary + bonus;
//			System.out.println("Final Salary : "+salary);
//			
//		} else if(experience >= 5) {
//			
//			double bonus = salary * 10/100;
//			System.out.println("Original Salary : "+salary);
//			System.out.println("Bonus Salary : "+bonus);
//			salary = salary + bonus;
//			System.out.println("Final Salary : "+salary);	
//			
//			
//		} else if(experience >= 3) {			
//			double bonus = salary * 5/100;
//			System.out.println("Original Salary : "+salary);
//			System.out.println("Bonus Salary : "+bonus);
//			salary = salary + bonus;
//			System.out.println("Final Salary : "+salary);			
//			
//		} else if(experience < 3) {
//			System.out.println("Not eligible for bonus");
//		}

//		String username = "Admin";
//		String password = "Admin@123";
//
//		int attempts = 0;
//		int maxattempts = 3;
//
//		Scanner sc = new Scanner(System.in);
//
//		while (attempts < maxattempts) {
//
//			System.out.println("Enter Username : ");
//			String Enteredusername = sc.next();
//
//			System.out.println("Enter Password : ");
//			String Enteredpassword = sc.next();
//
//			if (Enteredusername.equals(username) && Enteredpassword.equals(password)) {
//				System.out.println("Login successful");
//				break;
//			} else {
//				attempts++;
//				if (attempts == maxattempts) {
//					System.out.println("Account got locked!! Please contact helpdesk");
//
//				} else {
//
//					System.out.println("Invalid credentials. Please enter credentials again " + (maxattempts - attempts));
//				}
//
//			}
//
//		}

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter total tests : ");
//		int totaltests = sc.nextInt();
//
//		System.out.println("Enter Passed Tests : ");
//		int passedtests = sc.nextInt();
//
//		System.out.println("Enter Failed Tests : ");
//		int failedtests = sc.nextInt();
//
//		double passpercentage = (double) passedtests / totaltests * 100;
//
//		System.out.println("Passpercentage : " + passpercentage);
//
//		if (passpercentage >= 95) {
//			System.out.println("Excellent");
//		} else if (passpercentage >= 90) {
//			System.out.println("Good");
//		} else if (passpercentage >= 80) {
//			System.out.println("Average");
//		} else {
//			System.out.println("Poor");
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the Status code : ");
//		int statuscode = sc.nextInt();		
//		
//					
//		
//		if(statuscode == 500) {
//			System.out.println("Internal server error.");
//			
//		} else {
//			
//			System.out.println("Enter the response time : ");
//			int responsetime = sc.nextInt();
//			
//			if(statuscode == 200 && responsetime <=2000) {			
//				
//				System.out.println("API test passed");
//			
//		} else {
//			
//				System.out.println("API test failed");
//		}
//				
//		}

//		boolean usernamevalid = true;
//		boolean passwordvalid = true;
//		boolean accountlocked = true;
//		
//		
//		if(usernamevalid == true && passwordvalid == true && accountlocked != false) {
//			System.out.println("Login successful");
//		} else {
//			System.out.println("Login failed");
//		}

//		 String environment = "QA";
//	        String browser = "chrome";
//
//	        boolean validEnvironment = environment.equals("DEV") || environment.equals("QA")
//	                || environment.equals("UAT") || environment.equals("PROD");
//
//	        boolean validBrowser = browser.equals("chrome") || browser.equals("firefox")
//	                || browser.equals("edge");
//
//	        if (validEnvironment && validBrowser) {
//	            System.out.println("Environment and browser are valid");
//	        } else if (!validEnvironment && !validBrowser) {
//	            System.out.println("Both environment and browser are invalid");
//	        } else if (!validEnvironment) {
//	            System.out.println("Invalid environment");
//	        } else {
//	            System.out.println("Invalid browser");
//	        }

//		        double cartValue = 500;
//		        boolean premiumMember = true;
//		        boolean couponAvailable = false;
//
//		        boolean eligible = (cartValue >= 500) && (premiumMember || couponAvailable);
//
//		        if (eligible) {
//		            System.out.println("Checkout Allowed");
//
//		            double discountPercent = 0;
//
//		            if (premiumMember) {
//		                discountPercent = discountPercent + 10;
//		            }
//		            if (couponAvailable) {
//		                discountPercent = discountPercent + 5;
//		            }
//
//		            double discountAmount = cartValue * (discountPercent / 100);
//		            double finalAmount = cartValue - discountAmount;
//
//		            System.out.println("Cart Value: " + cartValue);
//		            System.out.println("Discount: " + discountPercent + "% (" + discountAmount + ")");
//		            System.out.println("Final Amount: " + finalAmount);
//
//		        } else {
//		            System.out.println("Checkout Not Allowed");
//		        }
		
		
		
		
		
		
		
		
		
	}

}
