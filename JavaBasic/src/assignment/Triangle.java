package assignment;

public class Triangle {
	public static double findPerimeter(double a, double b, double c) {
		return a + b + c;
	}
	
	public static double findArea(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p -c));
	}
}
