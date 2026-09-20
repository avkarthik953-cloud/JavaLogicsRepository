package Variables_LogicsPractice;

public class LogicsPractice {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int num = 29;
	 * 
	 * boolean isprime = true;
	 * 
	 * for(int i = 2; i < num; i++) { if(num % i == 0) { isprime = false; break;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * if(isprime) { System.out.println("Given number is a prime number"); } else {
	 * 
	 * System.out.println("Given number is not a prime number");
	 * 
	 * }
	 * 
	 */

	// Print your name, age, City, Profession

	public static void main(String[] args) {

		/*
		 * System.out.println("My name is Karthik and I am 28 year old. "); System.out.
		 * println("I lives in Bengaluru city and I am working as a software engineer");
		 * 
		 * 
		 * 
		 * 
		 * int a = 10; int b = 20;
		 * 
		 * int c = a+b;
		 * 
		 * System.out.println(c);
		 * 
		 * 
		 * 
		 * int a = 20, b = 6;
		 * 
		 * System.out.println(a+b); System.out.println(a-b); System.out.println(a*b);
		 * System.out.println(a/b); System.out.println(a%b);
		 * 
		 * 
		 * 
		 * int length = 10; int width = 5;
		 * 
		 * int area = length * width;
		 * 
		 * System.out.println(area);
		 * 
		 * 
		 * 
		 * int a = 25;
		 * 
		 * if(a%2 ==0) {
		 * 
		 * System.out.println("Given number is an even number"); } else {
		 * System.out.println("Given number is an odd number"); }
		 * 
		 * 
		 * 
		 * 
		 * int a = 0;
		 * 
		 * if(a > 0) {
		 * 
		 * System.out.println("Given number is a positive number"); } else if(a<0) {
		 * System.out.println("Given number is negative number"); } else {
		 * System.out.println("given number is zero"); }
		 * 
		 * 
		 * 
		 * int age = 19;
		 * 
		 * if(age >= 18) {
		 * 
		 * System.out.println("You are eligible to cast vote"); } else {
		 * 
		 * System.out.println("You are not eligible to cast vote"); }
		 * 
		 * 
		 * 
		 * int a = 25, b = 40;
		 * 
		 * if (a>b) { System.out.println(a + " is greater"); } else
		 * 
		 * System.out.println(b + " is greater");
		 * 
		 * 
		 * int a = 25, b = 40, c = 15;
		 * 
		 * if(a>b && a>c) {
		 * 
		 * System.out.println(a + " is largest"); } else if(b>c && b>a) {
		 * System.out.println(b + " is largest");
		 * 
		 * } else { System.out.println(c + " is largest"); }
		 */

		/*
		 * int principle = 10000;
		 * 
		 * int rate = 6;
		 * 
		 * int time = 5;
		 * 
		 * System.out.println(principle * rate * time /100);
		 */

		/*
		 * int a = 10;
		 * 
		 * for(int i = 1; i<=a; i++) {
		 * 
		 * System.out.println(i); }
		 */

		/*
		 * int a = 1;
		 * 
		 * while(a<=10) {
		 * 
		 * System.out.println(a);
		 * 
		 * a = a+1; }
		 */

		/*
		 * int a = 1;
		 * 
		 * for(int i = 10; i>=a; i--) { System.out.println(i); }
		 */

		/*
		 * int a = 10;
		 * 
		 * while (a>=1) { System.out.println(a);
		 * 
		 * a = a-1; }
		 */

		/*
		 * int a = 20;
		 * 
		 * for(int i = 1; i<=a; i++) { if(i%2 == 0) { System.out.println(i); } }
		 */

		/*
		 * int a = 1;
		 * 
		 * while(a<=20) {
		 * 
		 * if(a%2 == 0) { System.out.println(a); } a = a+1; }
		 */

		/*
		 * int a = 20;
		 * 
		 * for(int i = 1; i<=a; i++) {
		 * 
		 * if(i%2 !=0) { System.out.println(i); }
		 * 
		 * }
		 */

		/*
		 * int a = 1;
		 * 
		 * while (a<=20) {
		 * 
		 * if(a%2 !=0) { System.out.println(a); } a= a+1; }
		 */

		/*
		 * int a = 5;
		 * 
		 * for(int i = 5; i<=a; i++) {
		 * 
		 * for(int j = 1; j<=10; j++) {
		 * 
		 * System.out.println(i + "*" + j + "=" + (i*j)); } }
		 */

		/*
		 * int a = 0;
		 * 
		 * 
		 * for(int i = 1; i<=100; i++) {
		 * 
		 * a = a+i; }
		 * 
		 * System.out.println("Sum from 1 to 100 :" + a);
		 */

		/*
		 * int num = 1;
		 * 
		 * for(int i = 1; i<=10; i++) {
		 * 
		 * System.out.println(i*i);
		 * 
		 * }
		 */

		// Reverse a number

		/*
		 * int num = 12345;
		 * 
		 * int sum = 0;
		 * 
		 * while(num !=0) {
		 * 
		 * int digit = num%10;
		 * 
		 * sum = sum * 10 + digit;
		 * 
		 * num = num/10;
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 */

		// count digits in a number

		/*
		 * int num = 1234578;
		 * 
		 * int count = 0;
		 * 
		 * while(num !=0) {
		 * 
		 * num = num/10;
		 * 
		 * count++;
		 * 
		 * }
		 * 
		 * System.out.println(count);
		 */

		// sum of digits in a number

		/*
		 * int num = 123456;
		 * 
		 * int count = 0;
		 * 
		 * while(num !=0) {
		 * 
		 * int digit = num%10;
		 * 
		 * count = count + digit;
		 * 
		 * num = num/10;
		 * 
		 * }
		 * 
		 * System.out.println(count);
		 */

		// check palindrome number

		// int num = 121;

		// Find Factorial

		/*
		 * int fact = 1;
		 * 
		 * int num = 5;
		 * 
		 * for(int i = 1; i<=num; i++) {
		 * 
		 * fact = fact * i; }
		 * 
		 * System.out.println(fact);
		 */

		// check whether a number is prime or not

		/*
		 * int num = 29;
		 * 
		 * boolean isprime = true;
		 * 
		 * for(int i = 2; i<num; i++) {
		 * 
		 * if(num%i == 0) { isprime = false; break; } } if(isprime) {
		 * System.out.println("Given number is a prime number"); } else {
		 * System.out.println("Given number is not a prime number"); }
		 */

		// Palindrome number

		/*
		 * int num = 57475;
		 * 
		 * int original = num;
		 * 
		 * int reversed = 0;
		 * 
		 * while(num !=0) {
		 * 
		 * int digit = num %10;
		 * 
		 * reversed = reversed * 10 + digit;
		 * 
		 * num = num/10;
		 * 
		 * 
		 * }
		 * 
		 * if(original == reversed) {
		 * 
		 * System.out.println("Given number is a palindrome "+reversed); } else {
		 * 
		 * System.out.println("Given number is not a palindrome " + reversed); }
		 */

		// Reverse a string

		/*
		 * String str = "Karthik";
		 * 
		 * String str1="";
		 * 
		 * for(int i = str.length()-1; i>=0; i--) {
		 * 
		 * str1 = str1 + str.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println(str1);
		 */

		/*
		 * int a [] = {21, 36, 07, 23, 47, 35, 04};
		 * 
		 * int largest = a[0];
		 * 
		 * for(int i = 0; i<=a.length-1;i++) {
		 * 
		 * if(a[i] > largest) {
		 * 
		 * largest = a[i]; }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("Largest number is : "+largest);
		 */
		/*
		 * int a [] = {21, 36, 02, 23, 47, 35, 04};
		 * 
		 * int smallest = a[0];
		 * 
		 * for(int i = 0; i<=a.length-1; i++) {
		 * 
		 * if(a[i] < smallest) {
		 * 
		 * smallest = a[i]; } }
		 * 
		 * System.out.println("Smallest number is : "+smallest);
		 */

		// Second largest number in an array

		/*
		 * int arr[] = {23, 46, 06, 53, 21, 35,};
		 * 
		 * int largestnum = 0, secondlargestnum = 0;
		 * 
		 * for(int i = 0; i<=arr.length-1;i++) {
		 * 
		 * if(arr[i] > largestnum) {
		 * 
		 * secondlargestnum = largestnum;
		 * 
		 * largestnum = arr[i];
		 * 
		 * } else if (arr[i] > secondlargestnum) {
		 * 
		 * secondlargestnum = arr[i]; } }
		 * 
		 * System.out.println("First largest number is : "+largestnum);
		 * System.out.println("Second largest number is : "+secondlargestnum);
		 */

		// Create an integer array and print all elements

		/*
		 * int arr[] = {01, 02, 03, 04, 05};
		 * 
		 * for(int i = 0; i<=arr.length-1; i++) {
		 * 
		 * System.out.print(arr[i]+"  "); }
		 */

		// Calculate the sum of all array elements

		/*
		 * int arr[] = {1, 2, 3, 4, 5, 15};
		 * 
		 * int sum = 0;
		 * 
		 * for(int i = 0; i<=arr.length-1; i++) {
		 * 
		 * sum = sum + arr[i];
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 */

		// count how many even numbers in an array

		/*
		 * int arr[] = {22, 1, 2, 3, 4, 5, 6, 7, 8};
		 * 
		 * int even = 0;
		 * 
		 * for(int i = 0; i<=arr.length-1; i++) {
		 * 
		 * if(arr[i]%2 == 0) {
		 * 
		 * even++; } }
		 * 
		 * System.out.println(even);
		 */

		// Reverse an array

		/*
		 * int arr[] = {1, 2, 3, 4, 5};
		 * 
		 * for(int i = arr.length-1; i>=0; i--) {
		 * 
		 * System.out.print(arr[i]+ " "); }
		 */

		// Find a particular number in an array

		/*
		 * int arr[] = {1, 2, 3, 4, 5, 6, 7};
		 * 
		 * int key = 7;
		 * 
		 * int index = -1;
		 * 
		 * for(int i = 0; i<=arr.length-1; i++) {
		 * 
		 * if(arr[i] == key) { index = i; break; } }
		 * 
		 * if(index != -1) { System.out.println(key + " Found at the index position "+
		 * index); } else System.out.println(key + " is not found in given array");
		 */

		// Print length of the string

		/*
		 * String str = "Karthik";
		 * 
		 * System.out.println(str.length());
		 */

		/*
		 * String str = "Karthik";
		 * 
		 * System.out.println(str.toLowerCase()); System.out.println(str.toUpperCase());
		 */

		/*
		 * String str = "Karthik is a good boy";
		 * 
		 * String str1 = "Karthik";
		 * 
		 * System.out.println(str.contains(str1));
		 */

		// Reverse a String

		/*
		 * String str = "Indian Railways";
		 * 
		 * String str1 = "";
		 * 
		 * for(int i = str.length()-1; i>=0; i--) {
		 * 
		 * str1 = str1 + str.charAt(i); }
		 * 
		 * System.out.println(str1);
		 */

		// Check whether string is a palindrome or not

		/*
		 * String str = "madam";
		 * 
		 * int x = 0, y = str.length()-1;
		 * 
		 * boolean ispalindrome = true;
		 * 
		 * while(x<y) {
		 * 
		 * if(str.charAt(x) != str.charAt(y)) {
		 * 
		 * ispalindrome = false; break;
		 * 
		 * } x++; y--;
		 * 
		 * } if(ispalindrome) {
		 * 
		 * System.out.println("Given string is a palindrome : " + str); } else
		 * 
		 * System.out.println("Given string is not a palindrome : " + str);
		 */

		// count the number of vowels in a string

		/*
		 * String str = "Karthikaaaaaaaa";
		 * 
		 * String str1 = str.toLowerCase();
		 * 
		 * int count = 0;
		 * 
		 * for(int i = 0; i<=str.length()-1; i++) {
		 * 
		 * if(str1.charAt(i) == 'a' || str1.charAt(i) =='e' || str1.charAt(i) == 'o' ||
		 * str1.charAt(i) == 'i' || str1.charAt(i) == 'u') {
		 * 
		 * count++; }
		 * 
		 * } System.out.println(count);
		 * 
		 */
		/*
		 * // Star pattern
		 * 
		 * int a = 5;
		 * 
		 * for(int i = 1; i<=a; i++) {
		 * 
		 * for(int j = 1; j<=a-i; j++) {
		 * 
		 * System.out.print(" "); } for(int k = 1; k<=i; k++) {
		 * 
		 * System.out.print("* ");
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * 
		 * }
		 */
		
	// fibonacci series
		
	/*
	 * int f = 0, s = 1, th;
	 * 
	 * int limit = 10;
	 * 
	 * for(int i = 1; i<=limit; i++) {
	 * 
	 * System.out.print(f+" "); //System.out.print(s+" "); th = f+s; f = s; s = th;
	 * 
	 * 
	 * }
	 */	
		
		// number double triangle
		
	/*
	 * int a = 2;
	 * 
	 * int limit = 5;
	 * 
	 * for(int i = 1; i<=limit; i++) {
	 * 
	 * for(int j = 1; j<=i; j++) {
	 * 
	 * System.out.print(a);
	 * 
	 * } System.out.println();
	 * 
	 * a = a*2;
	 * 
	 * 
	 * }
	 */
		
		
		  

	}

}
