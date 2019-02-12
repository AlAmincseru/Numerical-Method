package test;

public class FalsePosition {
	public final static double TOLLERANCE = 0.01;
	static double a = 0.0;
	static double b = 0.0;
	static double mid;

	private static double f(double x) {
		return x*x*x-2*x-6;
	}

	public static void main(String[] args) {
		while(f(a)*f(b)>0) {
			a--;
			b++;
		}
		while(Math.abs(a-b)>TOLLERANCE) {
			mid = (a*f(b)-b*f(a))/(f(b)-f(a));
			if(f(a)*f(mid)<0) {
				b = mid;
			}
			else if(f(b)*f(mid)<0) {
				a = mid;
			}
			if(f(mid)==0)break;
			if(f(a)==0) {
				mid=a;
				break;
			}
			if(f(b)==0) {
				mid=b;
				break;
			}
		}
		System.out.println("Approximate Root is: " + mid);
	}
}
