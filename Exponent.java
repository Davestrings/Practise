package Practise;
import java.util.Scanner;
public class Exponent {
	
	private static final Scanner scan = new Scanner(System.in);
	static int product;
	public static void main(String[] args) {
		System.out.println(integerPower(3, 4));
		System.out.println(doublePower(3.5,4));

	}
	
	public static int integerPower(int base, int exponent) {
		product = 1;
		for(int count = 1; count <= exponent; count++) {
			product *= base;
		}
		return product;
	}
	public static double doublePower(double base, double exponent) {
		product = 1;
		for(int count = 1; count <= exponent; count++) {
			product *= base; 
		}
		return product;
	}

}
