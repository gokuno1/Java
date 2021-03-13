package puzzles.practice.howtodoin.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMissingNumber {
	
	private static int[] numbers = {1,3,4,5,6,7,8,9,10,11,12}; // if value needs to assigned to static array variable then 
															   //	it should be assigned during initialization.
	private static int sumOfNumbers;
	
	public static void main(String[] args) {
		
		int n=13;
		int idealSum = IntStream.range(0, n).sum(); //IntStream.range(0, n) takes number from range 1 to n-1
		
		sumOfNumbers = Arrays.stream(numbers).sum();
		
		int missingNumber = idealSum-sumOfNumbers;
		
		System.out.println("Missing number is : " + missingNumber);
		
		int[] numbersTwo = {3,4,5,6,7,8,9,11,12};
	
	//	int[] idealArray = (IntStream.range(numbersTwo[0], numbersTwo[n]);
		
		for(int i=0;i<numbersTwo.length;i++)
		{
			
			if(numbers[i]!=numbersTwo[i])
			{
				System.out.println(numbers[i]);
			}
		}
		
		
	}

}
