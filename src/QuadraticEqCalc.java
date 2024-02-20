import java.util.Scanner;
public class QuadraticEqCalc {

//1.1
public static boolean hasRealRoots(
		double a, double b, double c) {
	return (b*b - 4*a*c) >= 0;

}
	
//1.2
public static double getRoot1(
		double a, double b, double c) {
	return(-b - Math.sqrt(b*b - 4*a*c))/(2*a);
	
}
//1.3
public static double getRoot2(
		double a, double b, double c) {
	return(-b + Math.sqrt(b*b - 4*a*c))/(2*a);
	}


	
//1.4

//If the roots are imaginary, the getRoot methods can return NaN
	

	
	

}


