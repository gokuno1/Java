package practice.codechef.beginners;

import java.util.Arrays;

public class VarargsOperations {
	
	public static int operationAdd(int... numbers)
	{
		
//		for(int i=0;i<numbers.length;i++)
//		{
//			sum=sum+numbers[i];
//		}
		int sum = 0;
		sum = Arrays.stream(numbers).sum();
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int sumOfVarargs = operationAdd(54,22,12);
		int sumOfVarargsOne = operationAdd(22,12);
		int sumOfVarargsTwo = operationAdd(22,12,97);
		int sumOfVarargsThree = operationAdd(25,10,79);
		
		System.out.println("sumOfVarargs: "+sumOfVarargs+" sumOfVarargsOne: "+sumOfVarargsOne+" sumOfVarargsTwo: "+sumOfVarargsTwo+" sumOfVarargsThree: "+sumOfVarargsThree);
		
	}
}
