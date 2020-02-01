package Practise;
import java.util.Scanner;
public class FindMultipleMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num =scan.nextInt();
		System.out.print("Enter a number to check if it's a multiple of the previous number: ");
		int num2 = scan.nextInt();
		
		System.out.print(isMultiple(num, num2));
		//System.out.print(isMultiple(4, 16));
		scan.close();

	}
	public static boolean isMultiple(int number, int multiple) {
		boolean findMultiple = false;
		if (multiple % number == 0) {
			findMultiple = true;
		}else {
			findMultiple = false;
		}
		return findMultiple;
	}
	

}