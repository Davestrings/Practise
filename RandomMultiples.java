package Practise;

import java.security.SecureRandom;
public class RandomMultiples {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		//int number = 1 + rand.nextInt(20);
		int number;
		
		for(int i =1; i<=20; i++) {
			number = 1 + rand.nextInt(20);
			 if(number%3 == 0) {
				 System.out.println(number);
			 }else
				 System.out.println("other numbers" + number);
		}
	}

}
