package Practise;

import java.util.Scanner;
public class OddProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int counter = 1;
		int product = 1;
		
			
		while(counter <= 15){
			product = product * counter;
			counter +=2;
			
		}
		System.out.print("Product of odd numbers is " + product);
	}

}
