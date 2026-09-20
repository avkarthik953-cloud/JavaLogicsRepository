package LoopsPractice;

public class Loops {

	public static void main(String[] args) {
		
		// Print numbers 1 to 10
		
//		int num = 1;
//		
//		while (num <= 10) {
//			
//			System.out.println(num);
//			
//			num++;
//		}
		
		// Print numbers 10 to 1
		
//		int num = 10;
//		
//		while(num >= 1) {
//			
//			System.out.println(num);
//			num--;
//		}
		
		// Print even numbers from 1 to 20
		
//		int num = 20;
//		
//		for(int i = 1; i <= num; i++) {
//			
//			if(i%2 == 0) {
//				System.out.println(i);
//				i++;
//			}
//		}
		
		// Sum of numbers from to 100
		
//		int num = 100, sum = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			
//			sum = sum + i;			
//		}
//		
//		System.out.println(sum);
		
		// Sum of even numbers from 1 to 100
		
//		int num = 100, sum = 0;
//		
//		for(int i = 0; i <= num; i+=2) {
//			
//			sum = sum + i;	
//			
//		}
//		
//		System.out.println(sum);
		
		// Count postive, negative and zero values in an array
		
//		int [] numbers = {10, -5, 0, 20, -8, 15, 0, -3};
//		
//		int positivecount = 0, negativecount = 0, zerocount = 0;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			
//			if(numbers[i] > 0) {
//				
//				positivecount++;			
//				
//			} else if(numbers[i] < 0) {
//				negativecount++;
//			} else {
//				zerocount++;
//			}
//		}
//		
//		System.out.println("Positive count : "+positivecount);
//		System.out.println("Negative count : "+negativecount);
//		System.out.println("Zero count : "+zerocount);		
		
		
		// Mutliplication Table		
		
//		int number = 7;
//		
//		for(int i = 1; i <=10; i++) {
//			
//			System.out.println(number + " * " + i + " = " + number*i);
//		}
		
		// Count digits
		
//		int number = 563521, count = 0;
//		
//		while(number != 0) {
//			
//			number = number / 10;
//			count++;
//		}
//		
//		System.out.println(count);
		
		// Reverse a Number
		
//		int number = 12345, reverse = 0;
//		
//		while(number != 0) {
//			
//			int digit = number % 10;
//			
//			reverse = reverse * 10 + digit;
//			
//			number = number / 10;
//		}
//		
//		System.out.println(reverse);
		
		// Palindrome Number
		
//		int num = 123, reverse = 0;
//		
//		int original = num;
//		
//		while(num != 0) {
//			
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//			
//		}
//		
//		if(original == reverse) {
//			System.out.println("Given number is a palindrome number : "+reverse);
//		} else {
//			System.out.println("Given number is not a palindrome number : "+reverse);
//		}
		
//		int num = 123456;
//		int sum = 0;
//		
//		while(num != 0) {
//			
//			int digit = num % 10;
//			
//			sum = sum + digit;
//			
//			num = num / 10;
//		}
//		
//		System.out.println("Sum of all values are : "+sum);
		
		
		// Largest Digit
		
//		int number = 58921;
//		
//		int largest = 0;
//		
//		//int temp = number;
//		
//		while(number != 0) {
//			
//			int digit = number % 10;
//			
//			if(digit > largest) {
//				largest = digit;
//			}
//			
//			number = number / 10;			
//			
//		}
//		
//		System.out.println("Largest number = "+largest);
		
		
//		int maxattempts = 5;		
//		int attempt = 1;
//		boolean apisuccessful = true;
//		
//		while(attempt <= maxattempts) {
//			
//			System.out.println("Attempt " + attempt + " : Calling API...");
//			
////			if(attempt == 5) {
////				apisuccessful = false;
////			} else {
////				apisuccessful = false;
////			}
//			
//			if(apisuccessful) {				
//				System.out.println("API Passed");
//				break;
//			} else {
//				
//				System.out.println("API Failed... " + (maxattempts-attempt) + " attempts left");
//				
//			}
//			
//			attempt++;
//		}
//		
//		if(!apisuccessful) {
//			System.out.println("API Failed after "+ maxattempts + " attempts");
//		}
		
		
//		String correctUsername = "admin";
//		String correctPassword = "Admin@123";
//		int maxattempts = 3;
//		int attempts = 1;
//		
//		String EnteredUsername = "Admin";
//		String EnteredPassword = "Admin@123";
//		
//		boolean loginsuccess = false;
//		
//		while(attempts <= maxattempts) {
//			
//			if(EnteredUsername.equals(correctUsername) && EnteredPassword.equals(correctPassword)) {
//				System.out.println("Login successfull");
//				loginsuccess = true;
//				break;
//			} else {
//				
//				System.out.println("Login failed........"+(maxattempts - attempts) + " attempts left");
//			}
//			
//			attempts++;
//			
//		}
//		
//		if(!loginsuccess) {			
//			System.out.println("Login Failed after "+ maxattempts + " attempts");
//			
//		}	
	
//		int [] testResults = {1, 0, 1, 1, 0, 0, 1};
//		
//		int passedtestcases = 0, failedtestcases = 0;
//		
//		for(int i = 0; i<testResults.length; i++) {
//			
//			if(testResults[i] == 1) {
//				
//				passedtestcases++;
//				
//			} else {
//				
//				failedtestcases++;
//			}
//		}
//		
//		System.out.println("PassedTestcases : "+ passedtestcases);
//		System.out.println("FailedTestcases : "+ failedtestcases);
//		
//		for(int i = 0; i< testResults.length; i++) {
//			
//			if(testResults[i] == 0) {
//				
//				System.out.println("Test "+ (i+1) + " failed");
//			}
//		}
		
//		int[] testResults = {1, 1, 1, 1, 0, 1, 0, 1};
//		
//		for(int i = 0; i < testResults.length; i++) {
//			
//			if(testResults[i] == 0) {				
//				System.out.println("First Failed Test case = Test "+(i+1));
//				break;
//			}
//		}
		
		
//		int [] numbers = {10, 20, 30, 20, 40, 40};
//		
//		boolean duplicatefound = false;		
//		outer:
//		
//		for(int i = 0; i < numbers.length; i++) {
//			
//			for(int j = i+1; j< numbers.length; j++) {
//				
//				if(numbers[i] == numbers [j]) {					
//					System.out.println("Duplicate found : "+numbers[i]);
//					duplicatefound = true;
//					break outer;
//				}
//				
//			}		
//			
//		}
//		
//		if(!duplicatefound) {
//			System.out.println("No duplicate found");
//			}	
		
//		int num = 4;
//		
//		boolean isprime = true;
//		
//		
//		if(num == 1) {
//			
//			System.out.println("Given number is not a prime number : "+num);
//		} else {
//		
//		for(int i = 2; i < num; i++) {
//			
//			if(num%i == 0) {
//				isprime = false;
//				break;
//			}
//		}
//		if(isprime) {
//			System.out.println("Given number is a prime number : "+num);
//		} else { 
//			System.out.println("Given number is not a prime number : "+num);
//		}
//		
//		}

	}

}
