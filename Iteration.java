package main;

import java.util.Scanner;

public class Iteration {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args){

		final double Tollerance = 0.000001;
//		double a[]=null;
		double Difference=1.0;
	    double value;
	    double x=0;
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter initial guess: ");
	    value=in.nextDouble();
	    while(Difference>Tollerance)
	    {
	        x=Phai(value);
	        Difference=x-value;
	        value= x;
	    }
	    System.out.print("The root of the given function is: ");
	    System.out.println(x);
	}
	public static double Phai(double x)
	{
	    double y;
	    y=1/Math.sqrt(1+x);;
	    return y;
	}
}
