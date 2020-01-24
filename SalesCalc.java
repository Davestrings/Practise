package Practise;
import java.util.Scanner;
public class SalesCalc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float price;
		float payment = 0;
		int code;
		int counter = 0;
		
		do {
			System.out.print("Enter product code number: ");
			code = in.nextInt();
			System.out.print("Enter quantity bought: ");
			int quantity = in.nextInt();
			
			
			switch(code) {
			case 1:
				price = (float) 2.98;
				payment = price * quantity;
				break;
			case 2:
				price = (float) 4.50;
				payment = price * quantity;
				break;
			case 3:
				price = (float) 9.98;
				payment = price * quantity;
				break;
			case 4:
				price = (float) 4.49;
				payment = price * quantity;
				break;
			case 5:
				price = (float) 6.87;
				payment = price * quantity;
				break;
				
			}


			counter++;
			
			System.out.printf("Total amount payable is : %f%n", payment);
		}while(code != -1);
	}

}
