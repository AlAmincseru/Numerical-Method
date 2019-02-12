package test;

import java.util.Scanner;

public class NewtonRaphson {
	
	public static double x;
	public static int i = 0;
	public static final double TOLLERANCE = 0.00001;
	
	public static double f(double x) {
		return x*x*x-2*x-5;
	}
	
	public static double df(double x) {
		return 3*x*x-2;
	}
	
	public static double xi(double x) {
		return x-f(x)/df(x);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Initial Guess: ");
		x = in.nextDouble();
		while(i<5){
			x = xi(x);
			i++;
		}
		System.out.println("Approximate Root is: " + x);
	}

}
