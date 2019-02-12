package main;

public class Secant {
	    static double f(double x) {  
	        double f = x*x*x+2*x-1;                
	        return f; 
	    }
	    static void secant(double x1,double x2,double E){
			double xm;
			double c;
			double x0; 
	        if (f(x1) * f(x2) < 0)  { 
	            do {
	                x0 = (x1 * f(x2) - x2 * f(x1))/ (f(x2) - f(x1));
	                c = f(x1) * f(x0);
	                x1 = x2; 
	                x2 = x0;
	                if (c == 0) 
	                    break; 
	                xm = (x1 * f(x2) - x2 * f(x1))  
	                            / (f(x2) - f(x1));
	            } while (Math.abs(xm - x0) >= E);             
	            System.out.println("Root of the"+" given equation=" + x0);
	        }
	        else System.out.print("Can not find a"+" root in the given inteval"); 
	    }
	    public static void main(String[] args) { 
	    	double a=0;
	    	double b=0;
	        double E = 0.0001;
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
	        
	        secant(a, b, E);
	    }
	    public static boolean getNumber(double num1,double num2){
			double value1 = num1 * num1 * num1 - num1 - 1;
			double value2 = num2 * num2 * num2 - num2 -1 ;
			if(value1 * value2 < 0)return true;
			return false;
		}
}
