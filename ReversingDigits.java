package Practise;
import java.util.Scanner;
public class ReversingDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number");
		int digit = scan.nextInt();
		
		Reverse(digit);
		scan.close();
	}
	
	public static void Reverse(int number) {
		int value =0;
		int reverse = 0;
		while(number!=0) {
			value = number % 10;
			reverse = reverse * 10 + value;
			number/=10;
//			System.out.println(reverse); This output can be used to print a triangle of numbers entered. 
		}
		System.out.println(reverse);
		
	}

}
