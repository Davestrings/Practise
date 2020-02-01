package Practise;

import java.util.Scanner;
public class EvenOddMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to be examined: ");
		int num = scan.nextInt();
		
		System.out.print(isEven(num));
		scan.close();
	}
	public static boolean isEven(int number) {
		boolean isEven;
		if(number % 2==0) {
			isEven = true;
		}else {
			isEven = false;
		}
		
		return isEven;
	}

}
