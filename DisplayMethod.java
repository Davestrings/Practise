package Practise;
import java.util.Scanner;
public class DisplayMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of square: ");
		int number = scan.nextInt();
		System.out.print("Enter your char: ");
		char character =scan.next().charAt(0);
		
		displaySquare(number, character);

	}
	public static void displaySquare(int number, char character) {
		for(int count = 1; count<=number;count++) {
			for(int count2 =1; count2<= number; count2++) {
				System.out.print(character);
			}
			System.out.println();
		}
	}

}
