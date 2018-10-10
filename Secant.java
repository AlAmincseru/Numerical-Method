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
	        double x1 = 0, x2 = 1, E = 0.0001; 
	        secant(x1, x2, E); 
	    }
}
