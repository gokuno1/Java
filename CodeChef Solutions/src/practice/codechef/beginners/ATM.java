package practice.codechef.beginners;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountBalance = 15000;
		System.out.println("Enter Amount for withdrawal: "+accountBalance);
		int withdrawalAmount = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount for withdrawal: ");
		withdrawalAmount = scan.nextInt();
		if(withdrawalAmount > 0 && withdrawalAmount % 5==0)
		{
			accountBalance = accountBalance - withdrawalAmount;
			System.out.println("Successful Transaction. Account Balance is "+accountBalance);
		}
		else
		{
			System.out.println("Please Enter Valid amount");
		}
		scan.close();
	}

}
