package Practise;
import java.util.Scanner;
public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		
			while(studentCounter <= 10) {
				System.out.print("Enter result(1 = pass, 2 = fail): ");
				int result = input.nextInt();
				
				while(result >=3) {
					System.out.print("Enter result again(1 = pass, 2 = fail): ");
					result = input.nextInt();
				}
				
				if (result == 1)
					passes +=1;
				else 
					failures += 1;
				
				studentCounter += 1;
				
			}
			
			System.out.printf("pased: %d%n Failed: %d%n", passes, failures);
			
			if (passes > 8)
				System.out.println("Bonus to instructor!");
		
	}

}
