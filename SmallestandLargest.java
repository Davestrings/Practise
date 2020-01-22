package Practise;
import java.util.Scanner;
public class SmallestandLargest {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of iteration: ");
		int num1 = scan.nextInt();
		int num2 = 2147483647;
		int smallestNumber = num2;
		int largest = 0;
		
		for(int count = 1; count<=num1; count++) {
			System.out.print("Enter number: ");
			num2 = scan.nextInt();
			
			if(num2 < smallestNumber) {
				smallestNumber = num2;
			}
			if(num2 > largest) {
				largest = num2;
			}
			
		}
		System.out.printf("Smallest number is %d%n", smallestNumber);
		System.out.printf("Largest number is %d", largest);

	}

}
