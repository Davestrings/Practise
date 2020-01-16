package Practise;

import java.util.Scanner;
public class MeanMode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student score or -1 to terminate");
		int score = input.nextInt();
		int counter = 0;
		int sum = 0;
		
		
		while(score > 50) {
			System.out.print("Enter Student score or -1 to terminate");
			score = input.nextInt();
		} 
		if (score <= 50) {
			while(score != -1) {
				sum += score;
				++counter;
				System.out.print("Enter Student score or -1 to terminate");
				score = input.nextInt();
				if(score > 50) {
					sum -=score;
					--counter;
				}
			}
		  }
		double mean = (double)sum / counter;
		System.out.printf("Mean score is : %.3f%nFrequency of score below 50 is %d%n", mean, counter);
		
	}

}
 