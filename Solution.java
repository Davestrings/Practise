package Practise;

import java.util.Scanner;
public class Solution{
    public static void main(String []args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter number of even numbers to sum: ");
    	int number = input.nextInt();
    	
    	int counter = 1;
    	int total = 0;
    	number *= 2;
    	
    		while(counter <=number) {
    			
    			if(counter%2 == 0) {
    				total += counter;
    				//System.out.printf("%d. %d%n", counter, total);
    			}
    		counter += 1;
    		}
    		System.out.print(total);
    }
}

