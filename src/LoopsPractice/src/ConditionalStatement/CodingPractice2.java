package ConditionalStatement;

import java.util.Scanner;

public class CodingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the number : ");
//		int number = sc.nextInt();
//		
//		if(number > 0) {
//			
//			System.out.println("Given number is positive");
//		} else if(number < 0) {
//			System.out.println("Given number is negative");
//		} else {
//			System.out.println("Given number is zero");
//		}
		
//		System.out.println("Enter the age : ");
//		int age = sc.nextInt();
//		
//		if(age >=18) {
//			System.out.println("Eligible for vote");
//		} else {
//			System.out.println("Not eligible for vote");
//		}
		
//		System.out.println("Enter the experience : ");
//		int experience = sc.nextInt();
//		
//		if(experience >0 && experience < 2) {
//			System.out.println("Fresher");
//		} else if(experience >=2 && experience <= 4) {
//			System.out.println("Junior");
//		} else if(experience >=5 && experience <=7) {
//			System.out.println("Senior");
//		} else {
//			System.out.println("Lead");
//		}
		
//		String username = "admin";
//		String password = "Admin@123";
//		
//		System.out.println("Enter the username : ");
//		String enteredusername = sc.next();
//		
//		System.out.println("Enter the password : ");
//		String enteredpassword = sc.next();
//		
//		if(username.equals(enteredusername)) {			
//			
//			if(password.equals(enteredpassword)) {			
//				
//				System.out.println("Login Successful");
//			} else {
//				System.out.println("Incorrect password entered");
//			}
//		} else {
//			System.out.println("Incorrect username entered");
//		}
		
//		System.out.println("Specify is account Active or not : ");
//		boolean isAccountActive = sc.nextBoolean();
//
//		if (isAccountActive == true) {
//
//			System.out.println("Verify the balance amount in account : ");
//			double balance = sc.nextDouble();
//
//			if (balance > 0) {
//
//				System.out.println("Enter the withdrawal amount : ");
//				int withdrawalamount = sc.nextInt();
//
//				if (withdrawalamount <= balance) {
//
//					if (withdrawalamount % 100 == 0) {
//
//						System.out.println("Withdrawal successful");
//
//						double finalbalance = balance - withdrawalamount;
//
//						System.out.println("Final balance : " + finalbalance);
//					} else {
//						System.out.println("Withdrawal amount must be multiples of 100");
//					}
//
//				} else {
//					System.out.println("Entered amount must be less than available balance");
//				}
//			} else {
//				System.out.println("Account Balance must be sufficient to withdraw amount");
//			}
//		} else {
//			System.out.println("Account is Inactive. Unable to withdraw amount");
//		}
		
//		System.out.println("Enter the status code : ");
//		int statuscode = sc.nextInt();
//		
//		System.out.println("Response time : " );
//		long responsetime = sc.nextLong();
//		
//		if(statuscode == 200 && responsetime <=2000) {
//			
//			System.out.println("Test Passed");
//			
//		} else {
//			System.out.println("Test Failed");
//		}
		
//		System.out.println("Enter the experience : ");
//		int experience = sc.nextInt();
//		
//		System.out.println("Enter the performance rating : ");
//		int performanceRating = sc.nextInt();
//		
//		if(experience >=5 && performanceRating >=4) {
//			
//			System.out.println("Eligible for Promotion");
//		} else {
//			System.out.println("Not eligible for promotion");
//		}
		
//		int age = 21;
//		double salary = 50000;
//		int creditScore = 701;
//		
//		if(age >=21 && salary >=30000 && creditScore >=700) {
//			System.out.println("Eligible for loan");
//		} else {
//			System.out.println("Not eligible for loan");
//		}
		
	//	-------------------------------------------------------------------
		
//		System.out.println("Enter the units : ");
//		int units = sc.nextInt();
//
//		double bill;
//
//		if (units <= 0) {
//			System.out.println("Invalid units");
//		} else if (units <= 100) {
//
//			bill = units * 2;
//
//			System.out.println("Total bill : " + bill);
//
//		} else if (units <= 200) {
//
//			bill = (100 * 2) + (units - 100) * 3;
//
//			System.out.println("Total bill : " + bill);
//		} else {
//
//			bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
//
//			System.out.println("Total bill : " + bill);		
//		}
		
		
//	System.out.println("Enter the percentage : ");
//	int percentage = sc.nextInt();
//
//	if (percentage < 0 || percentage > 100) {
//		System.out.println("Invalid percentage entered");
//	} else if (percentage < 50) {
//		System.out.println("Fail");
//	} else if (percentage <= 59) {
//		System.out.println("Average");
//	} else if (percentage <= 74) {
//		System.out.println("Good");
//	} else if (percentage <= 89) {
//		System.out.println("Very good");
//	} else {
//		System.out.println("Excellent");
//	}

//		System.out.println("Enter the status code : ");
//		int statusCode = sc.nextInt();
//		
//		System.out.println("Enter the responseTime : ");
//		int responseTime = sc.nextInt();
//		
//		if(statusCode == 200 && responseTime <= 2000) {			
//			System.out.println("API passed");
//		} else if(statusCode == 200 && responseTime > 2000) {
//			System.out.println("API passed but slow");
//		} else {
//			System.out.println("API failed");
//		}
		
		
//	String correctUsername = "admin";
//	String correctPassword = "Admin@123";
//
//	int attempts = 0;
//	int maxattempts = 3;
//
//	while (attempts < maxattempts) {
//
//		System.out.println("Enter the username : ");
//		String EnteredUsername = sc.next();
//
//		System.out.println("Enter the password : ");
//		String EnteredPassword = sc.next();
//
//		if (EnteredUsername.equals(correctUsername) && EnteredPassword.equals(correctPassword)) {
//			System.out.println("Login Successful");
//			break;
//		} else {
//			attempts++;
//			if (attempts >= maxattempts) {
//				System.out.println("Account got locked");
//			} else {
//
//				System.out.println("Invalid credentials. Please enter credentials again, " + (maxattempts - attempts)
//						+ " attempts left");
//			}
//		}
//			
//		}
		
		
//		System.out.println("Enter the number : ");
//		int number = sc.nextInt();
//		
//		if(number % 3 == 0 && number % 5 == 0) {
//			System.out.println(number + " is divisible by both 3 and 5");
//		} else {
//			System.out.println(number+" is not divisible by both 3 and 5");
//		}
		
		
//		System.out.println("Enter the browser name : ");
//		String enteredBrowser = sc.next();
//		
//		System.out.println("Enter the environment : ");
//		String enteredEnvironment = sc.next();
//		
//		boolean isbrowser = enteredBrowser.equals("chrome") || enteredBrowser.equals("edge") || enteredBrowser.equals("firefox") || enteredBrowser.equals("safari");
//		boolean isenvironment = enteredEnvironment.equals("QA") || enteredEnvironment.equals("DEV") || enteredEnvironment.equals("UAT") || enteredEnvironment.equals("PROD");
//		if(isbrowser && isenvironment) {
//			System.out.println("Both browser and environment are correct");
//		} else if (!isbrowser && isenvironment) {
//			System.out.println("Only environment is correct");
//		} else if(isbrowser && !isenvironment) {
//			System.out.println("Only browser is correct");
//		} else {
//			System.out.println("Both environment and browser are not correct");
//		}
		
		
//		System.out.println("Enter the browser name : ");
//		String browsername = sc.next();
//		
//		switch (browsername) {
//		
//		case "chrome" :
//			System.out.println("Chrome browser is selected");
//			break;
//		case "firefox" :
//			System.out.println("Firefox browser is selected");
//			 break;
//		case "edge" :
//			System.out.println("edge browser is selected");
//			break;
//		case "safari":
//			System.out.println("Safari browser is selected");
//			break;
//		default:
//			System.out.println("Invalid browser selected");
//		}  
		
//		String correctusername = "admin";
//		String correctpassword = "Admin@123";
//		
//		System.out.println("Enter the username : ");
//		String enteredUsername = sc.next();
//		
//		if(enteredUsername.equals(correctusername)) {
//			
//			System.out.println("Enter the password : ");
//			String enteredPassword = sc.next();
//			
//			if(enteredPassword.equals(correctpassword)) {
//				
//				System.out.println("Login Successful");
//			} else {
//				System.out.println("Invalid credentials. Login failed");
//			}			
//			
//		} else {
//			System.out.println("Incorrect username entered");
//		}
		
		
//		System.out.println("Enter salary : ");
//		double salary = sc.nextDouble();
//		
//		System.out.println("Enter experience : ");
//		int experience = sc.nextInt();
//		
//		if(experience > 20) {
//			
//			double bonus = salary * 20/100;
//			double finalSalary = salary + bonus;
//			System.out.println("Bonus amount is : "+bonus);
//			System.out.println("Final Amount is : "+finalSalary);
//		} else if(experience > 15) {
//			
//			double bonus = salary * 15/100;
//			double finalSalary = salary + bonus;
//			System.out.println("Bonus amount is : "+bonus);
//			System.out.println("Final Amount is : "+finalSalary);
//		} else if(experience > 10) {
//			
//			double bonus = salary * 10/100;
//			double finalSalary = salary + bonus;
//			System.out.println("Bonus amount is : "+bonus);
//			System.out.println("Final Amount is : "+finalSalary);
//		} else if(experience > 5) {
//			
//			double bonus = salary * 5/100;
//			double finalSalary = salary + bonus;
//			System.out.println("Bonus amount is : "+bonus);
//			System.out.println("Final Amount is : "+finalSalary);
//		} else {
//			System.out.println("Not eligible for bonus");
//		}
		
//		int age = 21;
//		double salary = 20000;
//		int creditScore = 655;
//		boolean isexistingCustomer = true;
//		
//		if(age>=21 && salary >= 30000 && creditScore >=700) {
//			System.out.println("Eligible for loan");
//		} else {
//			if(age>=21 && salary >= 30000 && creditScore >=650 && creditScore<=699 && isexistingCustomer) {
//				System.out.println("Existing Customer. Eligible for loan");
//			} else {
//				System.out.println("Not eligible for loan");
//			}
//		}
		
//		System.out.println("Enter the age : ");
//		int age = sc.nextInt();
//		
//		if(age >=21) {
//			
//			System.out.println("Enter the salary : ");
//			double salary = sc.nextDouble();
//			
//			if(salary >= 30000) {
//				
//				System.out.println("Enter the creditScore : ");
//				int creditScore = sc.nextInt();				
//				
//				if(creditScore >=700) {
//					System.out.println("Loan got approved");
//					
//				} else {
//					System.out.println("Is customer already exists relation with Bank (true/false) : ");
//					boolean isexistingcustomer = sc.nextBoolean();
//					
//					if(creditScore >=650 && creditScore <=699 && isexistingcustomer) {
//						System.out.println("Existing Customer. Loan got approved");
//					} else {
//						System.out.println("Requirement didn't get match. Loan got rejected");
//					}
//				}				
//				
//			} else {
//				System.out.println("Salary didn't not match. Not eligible for loan");
//			}			
//			
//		} else {
//			System.out.println("Under Age. Not eligible for loan");
//		}
		
//	int number = -39;
//
//	if (number % 2 == 0 && number > 0) {
//		System.out.println("Positive even number");
//	} else if (number % 2 == 0 && number < 0) {
//		System.out.println("Negative even number");
//	} else if (number % 2 != 0 && number > 0) {
//		System.out.println("Positive odd number");
//	} else if (number % 2 != 0 && number < 0) {
//		System.out.println("Negative odd number");
//	} else {
//		System.out.println("Number is zero");
//	}
		
		
//		int a = 30, b = 25, c = 30;
//		
//		if (a == b && b == c) {
//		    System.out.println("All numbers are equal");
//		} else if (a == b && a > c) {
//		    System.out.println(a + " is largest (two numbers are equal)");
//		} else if (a == c && a > b) {
//		    System.out.println(a + " is largest (two numbers are equal)");
//		} else if (b == c && b > a) {
//		    System.out.println(b + " is largest (two numbers are equal)");
//		} else if (a >= b && a >= c) {
//		    System.out.println(a + " is largest");
//		} else if (b >= a && b >= c) {
//		    System.out.println(b + " is largest");
//		} else {
//		    System.out.println(c + " is largest");
//		}
		
		
//		String correctUsername = "admin";
//		String correctPassword = "Admin@123";
//		
//		System.out.println("Enter the account status : ");
//		boolean accountlocked = sc.nextBoolean();
//		
//		if(!accountlocked) {
//			
//			System.out.println("Enter the username : ");
//			String enteredUsername = sc.next();
//			
//			if(correctUsername.equals(enteredUsername)) {
//				
//				System.out.println("Enter the password : ");
//				String enteredPassword = sc.next();
//				
//				if(correctPassword.equals(enteredPassword)) {
//					
//					System.out.println("Login Successful");
//				} else {
//					System.out.println("Invalid credentials. Cannot login");
//				}
//				
//				
//			} else {
//				System.out.println("Invalid Username.");
//			}
//			
//			
//		} else {
//			System.out.println("Account Locked. Cannot login into application");
//		}
		
//		System.out.println("Enter the Salary : ");
//		double Salary = sc.nextDouble();
//		
//		System.out.println("Enter the experience : ");
//		int experience = sc.nextInt();
//		
//		System.out.println("Enter the performance rating : ");
//		int rating = sc.nextInt();
//		
//		
//		if(experience >= 10 && rating >=4) {
//			
//			double bonus = Salary * 20/100;
//			double finalamount = Salary + bonus;
//			System.out.println("Bonus amount : "+ bonus);
//			System.out.println("Final Salary : "+ finalamount);
//			
//		} else if(experience >= 5 && rating >=4) {
//			
//			double bonus = Salary * 10/100;
//			double finalamount = Salary + bonus;
//			System.out.println("Bonus amount : "+ bonus);
//			System.out.println("Final Salary : "+ finalamount);
//			
//		} else if(experience >= 3 && rating >=3) {
//			
//			double bonus = Salary * 5/100;
//			double finalamount = Salary + bonus;
//			System.out.println("Bonus amount : "+ bonus);
//			System.out.println("Final Salary : "+ finalamount);
//			
//		}  else {
//			System.out.println("Not eligible for Bonus");
//		}
		
//	     System.out.println("Enter the cart value : ");
//	     double cartValue = sc.nextDouble();	     
//	     
//	     if(cartValue < 2000) {
//	    	 System.out.println("Discount is not applicable");
//	     } else {
//	    	 
//	    	 System.out.println("Is Premium membership available : ");
//		     boolean PremiumMember = sc.nextBoolean();
//		     
//		     System.out.println("Is coupon available : ");
//		     boolean couponAvailable = sc.nextBoolean();
//		     
//		     double discount = 0;  
//		    
//		     
//		     if(cartValue >=5000) {
//		    	 
//		    	 discount = 20;
//		     } else if(cartValue >=2000) {
//		    	 discount = 10;
//		    	 
//		     } 
//		     if(PremiumMember) {
//		    	 discount = discount + 5;
//		     } 
//		     if(couponAvailable) {
//		    	 discount = discount + 5;
//		     }
//		     
//		     if(discount > 25) {
//		    	 discount = 25;
//		     }
//		     
//		     double discountAmount = cartValue * discount/100;
//		     double finalPrize = cartValue - discountAmount;
//		     
//		     System.out.println("Total discount applied "+discount+"%");
//		     System.out.println("Discount amount : "+discountAmount);
//		     System.out.println("Final Prize is : "+finalPrize);
//	    	 
//	    	 
//	     }
		
//		int statusCode = 200;
//		int responseTime = 2000;
//		boolean responsevalid = false;
//		
//		if (statusCode != 200) {
//
//		    System.out.println("Failed - Invalid Status");
//
//		} else if (responseTime > 2000) {
//
//		    System.out.println("Failed - Slow Response");
//
//		} else if (!responsevalid) {
//
//		    System.out.println("Failed - Invalid Response");
//
//		} else {
//
//		    System.out.println("API Passed");
//		}
		
		
//		System.out.println("Veriy the account is active : ");
//		boolean isaccountActive = sc.nextBoolean();		
//		
//		if(isaccountActive) {
//			
//			System.out.println("Enter the balance amount : ");
//			double balance = sc.nextDouble();
//			
//			if(balance > 0) {
//			
//			     System.out.println("Enter the withdrawal amount : ");
//			     double withdrawalAmount = sc.nextDouble();
//			     
//			     if(withdrawalAmount <= 0) {
//		    		  System.out.println("Invalid withdrawal Amount");
//		    	  }
//			     
//			     else if(withdrawalAmount % 100 == 0) {
//			     
//			      if(withdrawalAmount <= balance) {   			    	  
//			    	  
//			    	  System.out.println("Withdrawal Amount : "+withdrawalAmount);			    	  
//			    	  System.out.println("Withdrawal Successful ");
//			    	  
//			    	  double finalbalance = balance - withdrawalAmount;
//			    	  System.out.println("Final Balance is : "+finalbalance);	   	  
//			    	  
//			    	  
//			      } else {
//			    	  System.out.println("Insufficient balance. Please enter valid amount");
//			      } 			
//			
//			     } else {
//			    	 System.out.println("Invalid amount entered. Amount entered must be multiples of 100");
//			     }				
//				
//			} else {
//				System.out.println("Incorrect balance amount entered. Cannot proceed transaction");
//			}			
//			
//		} else {
//			System.out.println("Account is Inactive. Couldn't initiate withdraw process");
//		}		
		
		
//		boolean isEmployeeActive = true;
//		boolean hasValidCredentials = true;
//		boolean hasRequiredRole = true;
//		
//		if(!isEmployeeActive) {
//			System.out.println("Account Inactive");
//		} else if(!hasValidCredentials) {
//			System.out.println("Invalid Credentials");
//		} else if(!hasRequiredRole) {
//			System.out.println("Access Denied");
//		} else {
//			System.out.println("Access granted");
//		}
		
//		int statusCode = 200;
//		int responsetime = 2000;
//		boolean isresponseValid = true;
//		
//		if(statusCode != 200) {
//			System.out.println("Fail - Invalid Status");			
//		} else if(responsetime > 2000) {
//			System.out.println("Fail - Slow Response");
//		} else if(!isresponseValid) {
//			System.out.println("Fail - Invalid Response");
//		} else {
//			System.out.println("Pass");
//		}
		
//		double cartValue = 2001;
//		boolean premiumMember = true;
//		boolean coupon = false;
//		
//		double discount = 0;
//		
//		if(cartValue < 2000) {
//			
//			System.out.println("Discount is not applicable");
//			
//		} else {
//			
//			if(cartValue <= 4999) {
//				
//				discount = 10;
//				
//			}
//			else  {
//				
//				discount = 20;				
//			}
//			
//			if(premiumMember) {
//				discount = discount + 5;
//			}
//			
//			if(coupon) {
//				
//				discount = discount + 5;
//			}
//			
//			if(discount > 25) {
//				
//				discount = 25;
//			}
//			
//			double finaldiscount = cartValue * discount/100;
//			double finalbalance = cartValue - finaldiscount;
//			
//			System.out.println("Final discount price is : "+finaldiscount);
//			System.out.println("Final balance is : "+finalbalance);	
//			
//			
//		}			
		
//		 int number = 153;
//		 
//		 if(number > 0) {
//			 System.out.println("Given number is positive");
//		 } else if(number < 0) {
//			 System.out.println("Given number is negative");
//		 } else {
//			 System.out.println("Give number is zero");
//		 }
//		 
//		 if(number % 2 == 0) {
//			 System.out.println("Given number is even number");
//		 } else {
//			 System.out.println("Given number is odd number");
//		 }
//		 
//		 if(number % 3 == 0) {
//			 System.out.println("Given number is divisible by 3");
//		 } 
//		 
//		 if(number % 5 == 0) {
//			 System.out.println("Given number is divisible by 5");
//		 }
//		 
//		 if(number % 3 == 0 && number % 5 == 0) {
//			 System.out.println("Given number is divisible by both 3 and 5");
//		 }
		
//	         int day = 30, month = 2, year = 2024;
//	         
//	         if(month < 1 || month > 12) {
//	        	 System.out.println("Invalid Month");
//	         } else if(month == 4 || month == 6 || month == 9 || month == 11) {
//	        	 if(day >=1 && day <=30) {
//	        		 System.out.println("Valid Days");
//	        		 
//	        	 } else {
//	        		 System.out.println("Invalid Days");
//	        	 }
//	         } else if(month == 2) {
//	        	 
//	        	 boolean isleapyear = false;
//	        	 
//	        	 if(year % 400 == 0) {
//	        		 isleapyear = true;
//	        	 } else if(year % 4 == 0 && year % 100 != 0) {
//	        		 isleapyear = true;
//	        	 }
//	        	 
//	        	 if(isleapyear) {
//	        		 
//	        		 if(day >=1 && day <=29) {
//	        			 System.out.println("valid days");
//	        		 } else {
//	        			 System.out.println("Invalid Days");
//	        		 }
//	        		 
//	        	 } else {
//	        		 if(day>=1 && day <=28) {
//	        			 System.out.println("Valid Days");
//	        		 } else {
//	        			 System.out.println("Invalid days");
//	        		 }
//	        	 }
//	        	 
//	         } else {
//	        	 if(day >=1 && day <= 31) {
//	        		 System.out.println("Valid days");
//	        	 } else {
//	        		 System.out.println("Invalid days");
//	        	 }
//	         }
		
//		int a = 5, b = 5, c = 8;
//		
//		if(a + b > c && a + c > b && b + c > a) {
//			
//			if(a == b && b == c) {
//				System.out.println("All three sides are equal. It is Equivalent Triangle");
//			} else if(a == b || b == c || c == a) {
//				System.out.println("Two sides are equal. It is Isosceles triange ");
//			} else {
//				System.out.println("scalene triangle");
//			}
//		} else {
//			System.out.println("Invalid triangle");
//		}
	         
//		 char ch = '&';
//		 
//		 if(ch >= 'A' && ch <= 'Z') {
//			 System.out.println(ch + " is uppercase letter");
//		 } else if(ch >= 'a' && ch <= 'z') {
//			 System.out.println(ch + " is lowercase letter");
//		 } else if(ch >= '0' && ch <='9') {
//			 System.out.println(ch + " is a numerical letter");
//		 } else {
//			 System.out.println(ch + " is a special character");
//		 }
		
//		String player1 = "Rock";
//		String player2 = "Paper";
//		
//		boolean isvalid1 = player1.equals("Rock") || player1.equals("Paper") || player1.equals("Scissors");
//		boolean isvalid2 = player2.equals("Rock") || player2.equals("Paper") || player2.equals("Scissors");
//		
//		if(!isvalid1 || !isvalid2) {
//			System.out.println("Invalid choice");
//		} else if(player1.equals(player2)) {
//			System.out.println("Game draw");
//		} else if (player1.equals("Rock") && player2.equals("Scissors") ||  
//			       player1.equals("Scissors") && player2.equals("Paper") || 
//			       player1.equals("Paper") && player2.equals("Rock")) {
//			
//			System.out.println("Player 1 wins");
//			    	   
//		} else {
//			System.out.println("Player 2 wins");
//		}
		
//		int units = 2100;
//		boolean seniorCitizen = false;
//		
//		double basebill = 0;
//		
//		if(units <= 100) {
//			basebill = units * 2;
//			
//		} else if(units <= 200) {
//			
//			basebill = (100 * 2) + (units - 100) * 3;
//		} else {
//			basebill = (100 * 2) + (100 * 3) + (units - 200) * 5;
//		}
//		
//		double discount = 0;
//		 
//		if(seniorCitizen) {
//			
//			discount = basebill * 10/100;
//			
//		}
//		
//		double billafterdiscount = basebill - discount;
//		
//		double surcharge = 0;
//		
//		if(billafterdiscount > 2000) {
//			
//			surcharge = 100;
//			
//		}
//		
//		double finalbill = billafterdiscount + surcharge;
//		 
//		System.out.println("Base bill : "+basebill);
//		System.out.println("Discount : "+discount);
//		System.out.println("Surcharge : "+surcharge);
//		System.out.println("final bill : "+finalbill);
		

//		String environment = "Production";
//		String issueType = "Payment";
//
//		if (environment.equals("Production")) {
//
//		    if (issueType.equals("Payment")) {
//		        System.out.println("Issue is Critical severity");
//
//		    } else if (issueType.equals("Login")) {
//		        System.out.println("Issue is High severity");
//
//		    } else {
//		        System.out.println("Issue is Medium severity");
//		    }
//
//		} else {
//		    System.out.println("Issue is Low severity");
//		}
		
//		String browser = "chrome";
//		boolean headless = true;
//		
//		switch (browser.toLowerCase()) {
//		
//		case "chrome":
//			if(headless) {
//				System.out.println("Chrome headless");
//			} else {
//				System.out.println("Chrome Normal");
//			}
//			break;
//		
//		case "firefox":
//			if(headless) {
//				System.out.println("FireFox headless");
//			} else {
//				System.out.println("Firefox normal");
//			}
//			break;
//			
//		case "edge":
//			if(headless) {
//				System.out.println("Edge headless");
//			} else {
//				System.out.println("Edge normal");
//			}
//			break;
//			
//		default :
//			System.out.println("Unsupported browser");		
//		
//		}
		
		
//		int units = 1;
//
//		double bill;
//
//		if (units < 0) {
//		    System.out.println("Invalid units entered");
//		} else if (units == 0) {
//		    bill = 100;
//		    System.out.println("Electricity bill is : " + bill);
//		} else if (units <= 100) {
//		    bill = units * 2;
//		    System.out.println("Electricity bill is : " + bill);
//		} else if (units <= 200) {
//		    bill = (100 * 2) + (units - 100) * 3;
//		    System.out.println("Electricity bill is : " + bill);
//		} else {
//		    bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
//		    System.out.println("Electricity bill is : " + bill);
//		}		
		
		
//		int units = 200;		
//		boolean isseniorCitizen = true;		
//
//		double bill = 0;
//		double surcharge = 0;
//		
//		double discount =0;
//		double finalbill = 0;
//
//		if (units < 0) {
//		    System.out.println("Invalid units entered");
//		} else if (units == 0) {
//		    bill = 100;
//		    System.out.println("Electricity bill is : " + bill);
//		} else if (units <= 100) {
//		    bill = units * 2;
//		    System.out.println("Electricity bill is : " + bill);
//		} else if (units <= 200) {
//		    bill = (100 * 2) + (units - 100) * 3;
//		    System.out.println("Electricity bill is : " + bill);
//		} else {
//		    bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
//		    System.out.println("Electricity bill is : " + bill);
//		}		
//		
//		if(isseniorCitizen) {			
//			discount = bill * 10/100;
//			
//		}
//		
//		finalbill = bill - discount;		
//		System.out.println("Final Bill is :" + finalbill);
//		
//		if(bill > 2000) {			
//			surcharge = 100;
//		}
//		
//		double surchargebill = surcharge + finalbill;		
//		System.out.println("Surcharge bill is : "+surchargebill);
		
		
		
		
		
	}

}
