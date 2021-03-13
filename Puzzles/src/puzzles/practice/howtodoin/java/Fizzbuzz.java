package puzzles.practice.howtodoin.java;

import java.util.stream.IntStream;

public class Fizzbuzz {
	
	private static int number=100;
	
	public static void main(String[] args) {
		
		final int numberTwo=number;
		IntStream.range(1, number).mapToObj(i->i%5==0 ? (i%7==0 ? "FizzBuzz": "Fizz"):(i%7==0 ? "Buzz": i)).forEach(System.out::println);
		IntStream.range(1, numberTwo).mapToObj(i->i%5==0 ? (i%7==0 ? "FizzBuzz": "Fizz"):(i%7==0 ? "Buzz": i)).forEach(System.out::println);
	}
	

}
