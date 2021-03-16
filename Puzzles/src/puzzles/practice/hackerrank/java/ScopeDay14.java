package puzzles.practice.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

public class ScopeDay14 {
	
	private int[] elements;
  	public int maximumDifference;
    
    public ScopeDay14(int[] elements){
        this.elements = elements;
    }
	// Add your code here

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        ScopeDay14 difference = new ScopeDay14(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

	}

}
