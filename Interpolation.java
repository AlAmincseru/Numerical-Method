package main;

import java.util.Scanner;

public class Interpolation {
	private static int i;
	public static double dell[];
	public static double[] interpolate(double start, double end, int count) {
	    if (count < 2) {
	        throw new IllegalArgumentException("Cannot make a straight line");
	    }
	    double[] array = new double[count + 1];
	    for (i = 1; i <= count; i++) {
	        array[i-1] = start + i * (end - start) / count;
	    }
	    return array;
	}
	
	public static double dell(double array[],int size) {
		if(size==1)return array[0];
		for(i=1;i<size;i++) {
			array[i-1]=array[i]-array[i-1];
		}
		return dell(array,size-1);
	}
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner in = new Scanner( System.in );
		int count;
		System.out.println("Number of given values:");
		count = in.nextInt();
		double start=0;
		double end=1;
		double array[];
		double result = 0.0;
		array = interpolate(start,end,count);
		result = dell(array, count);
		System.out.println(result);
	}
}