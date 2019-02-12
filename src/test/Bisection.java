package test;

public class Bisection {
	public final static double TOLLERANCE = 0.00001;
	static double a = 0.0;
	static double b = 0.0;
	static double mid;

	private static double f(double x) {
		return x*x*x-x-1;
	}

	public static void main(String[] args) {
		while(f(a)*f(b)>0) {
			a--;
			b++;
		}
		while(Math.abs(a-b)>TOLLERANCE) {
			mid = (a+b)/2;
			if(f(a)*f(mid)<=0) {
				b = mid;
			}
			else if(f(b)*f(mid)<=0) {
				a = mid;
			}
		}
		System.out.println("Approximate Root is: " + mid);
	}
}
