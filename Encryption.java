package Practise;

import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a four digits number: ");
		int number = input.nextInt();
		
		int counter = 0;
		
		int num1 = number/1000;
		int num2 = (number%1000)/100;
		int num3 = (number%100)/10;
		int num4 = (number%10);
		
		//System.out.printf("%d %d %d %d%n", num1,num2,num3, num4);
		
		num1 = ((num1 + 7)%10)*3;
		num2 = ((num2 + 7)%10)*3;
		num3 = ((num3 + 7)%10)*3;
		num4 = ((num4 + 7)%10)*3;
		
		int fig1 = num3;
		int fig2 = num4;
		int fig3 = num1;
		int fig4 = num2;
		
		System.out.printf("%d%d%d%d", fig1,fig2,fig3,fig4);
			
		input.close();

	}

}
