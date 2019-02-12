package test;

import java.util.Scanner;

public class NewtonForwardInterpolation {
	
	public static int i;
	public static int n;
	public static int t = 0;
	public static double value;
	public static double p;
	public static double result = 0.0;
	
	public static double[][] findDell(double[][] dell) {
		for(i=0; i<dell[t-1].length-1; i++)
		dell[t][i] = dell[t-1][i+1]-dell[t-1][i];
		t++;
		if(t<n)findDell(dell);
		return dell;
	}
	
	public static double pPart(double p, int i){
		if(i<1)return 1.0;
		if(i<2)return p;
		return (p+i-1)*pPart(p, i-1);
	}
	
	public static int factorial(int x){
		if(x==1 || i == 0)return 1;
		return x*factorial(x-1);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Points: ");
		n = in.nextInt();
		double x[] = new double[n];
		double y[] = new double[n];
		double dell[][] = new double[n][n];
		System.out.println("Enter The Points:");
		for(i=0; i<n; i++) {
			x[i] = in.nextDouble();
			y[i] = in.nextDouble();
			dell[t][i] = y[i];
		}
		t++;
		dell = findDell(dell);
		System.out.println("Enter The Value of x: ");
		value = in.nextDouble();
		p = (value - dell[0][0])/(x[1]-x[0]);
		for(i=0; i<n; i++) {
			result = result + dell[i][0]*pPart(p, i)/factorial(i);
		}
		System.out.println("The Value of f(x) is: " + result);
	}

}
