package ArraysPractice;

public class CountNumberGreaterThanAverage {

	public static void main(String[] args) {		
		
		int [] numbers = {10, 60, 20, 30, 40, 50};
		
		int sum = 0, average = 0, count = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			sum = sum + numbers[i];
		}
		
		average = sum/numbers.length;
		
		System.out.println("Average : "+average);
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] > average) {
				
				count++;
			}
		}
		
		System.out.println("Numbers greater than average : "+ count);
	}

}
