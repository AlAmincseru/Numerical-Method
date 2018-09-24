package main;
//import java.util.Scanner;
public class Bisection {
	public static void main(String []args){
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Enter the degree of the equation: ");
//		int n = reader.nextInt();
//		int Coef[] = null;
//		for(int i=0;i<n;i++) {
//			Coef[i] = reader.nextInt();
//			System.out.println(Coef[i]);
//		}
//		reader.close();
//		System.out.println(n);
		Bisection obj = new Bisection();
		System.out.println("Approximate Value Of Root is : ");
		System.out.println(obj.test());
	}
	public double test(){
		final double tollerence = 0.0001;
		double a = 0;
		double b = 0;
		boolean limit = true; 
		while(limit){
			 if(getNumber(a,b))break;
			 else if(getNumber(-a,b)){
				 a = -a;
				 break; 
			 }
			 else if(getNumber(a,-b)){
				 b = -b;
				 break;	 
			 }
			 else if(getNumber(-a,-b)){
				 a = -a;
				 b = -b;
				 break;	 
			 }
			 else{
				 a = a + 1;
				 b = b + 1;
			 }
		}
		while((b-a)>tollerence)
		{
			double mid = (a + b)/2;
			double fmid = mid*mid*mid - mid -1;
			double fnum1  = a * a * a - a -1;
			if ( (fmid>0 && fnum1<0) || (fmid<0 && fnum1>0) ){  
		   	       b = mid;
		   	    }
		   	else{   
		   	       a = mid;
		   	}
		}
		return (a + b)/2;
	}
	
	public boolean getNumber(double num1,double num2){
		double value1 = num1 * num1 * num1 - num1 - 1;
		double value2 = num2 * num2 * num2 - num2 -1 ;
		if(value1 * value2 < 0)return true;
		return false;
	}
}
