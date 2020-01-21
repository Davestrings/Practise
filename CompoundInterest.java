package Practise;

import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter principal: ");
		int principal = scan.nextInt();
		System.out.print("Enter number of years: ");
		int year =scan.nextInt();
		System.out.print("Enter interest rate: ");
		float rate = scan.nextFloat();
		
		int count;
		double amount;
		
		rate = rate/100;
		
		System.out.printf("%s   %20s%n", "Year", "Amount on deposit");
		
		for(count =1;count<=year; count++) {
			amount = principal * Math.pow(1+rate, year);
			System.out.printf("%-20d %,-5.2f%n", count, amount);
		}
		

	}

}
