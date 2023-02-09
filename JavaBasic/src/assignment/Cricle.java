package assignment;

public class Cricle {
	public static double findPerimeter(double a) {
		return (double)Math.round(Math.PI * a * 2 * 100) / 100;
	}
	
	public static double findArea(double a) {
		
		return (double)Math.round(Math.PI * Math.pow(a, 2) * 100) / 100;
	}
}
