package test;

import java.util.Scanner;

public class LagrangeInterpolation {
	
	public static int i;
	public static int n;
	public static int t;
	public static double value;
	public static double result = 0.0;
	
	public static double li(double[] x, int i){
		double l = 1.0;
		for(t=0; t<n; t++) {
			if(t!=i) l = l*(value-x[t])/(x[i]-x[t]);
		}
		return l;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Points: ");
		n = in.nextInt();
		double x[] = new double[n];
		double y[] = new double[n];
		System.out.println("Enter The Points:");
		for(i=0; i<n; i++) {
			x[i] = in.nextDouble();
			y[i] = in.nextDouble();
		}
		System.out.println("Enter The Value of x: ");
		value = in.nextDouble();
		for(i=0; i<n; i++) {
			result = result + li(x, i)*y[i];
		}
		System.out.println("The Value of f(x) is: " + result);
	}

}
