package main;

import java.util.Scanner;

public class NewtonDividedInterpolation {
	
	static Scanner input = new Scanner(System.in);
	
	private static double f;
	private static int k;
	private static int n;
	private static int i;
	private static int j=1;
	private static int f1=1;
	private static int f2=0;

	public static void main(String[] args) {
		System.out.print("Number of Observations: ");
		n = input.nextInt();
		double xi[] = new double[n+1];
		double yi[] = new double[n+1];
		double p[] = new double[n+1];
		

		System.out.println("Enter value of x:");
		for(i=1;i<=n;i++){
			xi[i] = input.nextDouble();
		}
		System.out.println("Enter value of y:");
		for(i=1;i<=n;i++){
			yi[i] = input.nextDouble();
		}
		
		f = yi[1];
		System.out.print("Enter value of k to find f(k):");
		k = input.nextInt();
		
		do
	    {
	        for (i=1;i<=n-1;i++)
	        {
	            p[i] = ((yi[i+1]-yi[i])/(xi[i+j]-xi[i]));
	            yi[i]=p[i];
	        }
	        f1=1;
	        for(i=1;i<=j;i++)
	            {
	                f1*=(k-xi[i]);
	            }
	        f2+=(yi[1]*f1);
	        n--;
	        j++;
	    }
	 
	    while(n!=1);
		f = f + f2;
		
		System.out.println("f(" + k + ") = " + f);
	}
}