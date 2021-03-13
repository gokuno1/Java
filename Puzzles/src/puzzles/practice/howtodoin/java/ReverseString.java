package puzzles.practice.howtodoin.java;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input = "ertcepS yevraH fo saw ssoR ekiM ekil eetneM sih em redisnoc lliw uhaS lupiV epoh I";
		
		StringBuilder outputStringReverse = new StringBuilder(input).reverse();
		
		System.out.println(outputStringReverse);
		
		StringBuilder outputString = new StringBuilder();
		
		Stack<String> stringStack = new Stack<>();
		
		StringTokenizer tokenizer = new StringTokenizer(input, " ");
		
		while(tokenizer.hasMoreElements())// check tokenizer
		{
			stringStack.push(tokenizer.nextToken());
		}
		
		while(!stringStack.empty())
		{
			outputString.append(stringStack.pop()+" ");
		}
		
		System.out.println(outputString);
	}

}
