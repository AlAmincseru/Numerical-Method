package test;

import java.util.Scanner;

public class Secant {
	
	public static double x00;
	public static double x0;
	public static int i =0;
	public static double x;
	
	public static double f(double x) {
		return x*x*x-2*x-5;
	}
	
	public static double xi(double a, double b) {
		return (a*f(b)-b*f(a))/(f(b)-f(a));
	}
	
	@SuppressWarnings({ "resource" })
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Two Initial Guess: ");
		x00 = in.nextDouble();
		x0 = in.nextDouble();
		while(i<5) {
			x = xi(x00, x0);
			x00 = x0;
			x0 = x;
			i++;
		}
		System.out.println("Approximation Root is: " + x);
	}

}
