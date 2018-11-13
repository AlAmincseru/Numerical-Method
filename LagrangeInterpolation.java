package main;

import java.util.Scanner;

public class LagrangeInterpolation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    int n;
	    int i, j;
	    int a;
	    System.out.println("Enter number of point: ");
	    n = input.nextInt();
	    int x[] = new int[n];
	    int f[] = new int[n];
	    int sum = 0;
	    int mult;
	    
	    System.out.println("Enter value x for calculation: ");
	    a = input.nextInt();
	    
	    System.out.println("Enter all values of x and corresponding functional vale: ");
	    System.out.println("xi yi");
	    for (i = 0; i < n; i++) {
	        x[i] = input.nextInt();
	        f[i] = input.nextInt();
	    }

	    for (i = 0; i < n; i++) {
	        mult = 1;
	        for (j = 0; j < n; j++) {

	            if (j != i) {
	                mult *= (a - x[j]) / (x[i] - x[j]);

	            }
	            sum += mult * f[i];
	        }

	    }
	    System.out.println("The estimated value of f(x)= " + sum);

	}
}