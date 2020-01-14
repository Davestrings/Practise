package Practise;
import java.util.Scanner;
public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number less than 20: ");
		int number = input.nextInt();
		
		for(int counter = 1; counter <= number; counter++) {
			for(int counter2 = 1; counter2 <= counter; counter2++) {
				System.out.print("* ");
			}
		System.out.println();
		}

	}

}
