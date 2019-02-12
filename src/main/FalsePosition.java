package main;
public class FalsePosition {
	public static void main(String []args){
		FalsePosition obj = new FalsePosition();
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
			double mid =(a-((b-a)*(a*a*a-a-1)/((b*b*b-b-1)-(a*a*a-a-1))));
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
