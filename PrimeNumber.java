package Practise;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int numb = scan.nextInt();
		boolean number = true;
		
		for(int num = 1; num < numb; num++) {
			if(num > 1) {
				if(numb%num == 0) {
					number = false;
				}		
			}
		}
		if(number == false) {
			System.out.printf("%d is not a prime number", numb);
		}else {
			System.out.printf("%d is a prime number", numb);
		}
	}
}
