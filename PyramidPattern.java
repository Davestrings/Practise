package Practise;
import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 3 and 20: ");
		int number = input.nextInt();
		
		for(int counter = 1; counter <= number; counter++) {
			
			for(int counter2 = counter; counter2 <= number - 1; counter2++) {
				System.out.print(" ");
			}
			for(int counter3 =1; counter3 <= counter; counter3++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
