package puzzles.practice.hackerrank.java;

import java.util.Scanner;

public class ExceptionDay16 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int input = Integer.parseInt(S);
            System.out.println(input); 
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    in.close();
	}	
	

}
