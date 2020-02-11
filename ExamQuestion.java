package Practise;
import java.util.Scanner;
public class ExamQuestion {
	private static  int result = 0;
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		examQuestions();

	}
	public static void examQuestions() {
		int count ;
		char option;
		for(count = 1; count <= 5; count++ ) {
			switch(count) {
			case 1:
				System.out.println("Counter-controlled iteration requires?");
				System.out.println("A. A control variable and initial value \t\t B. A control variable increment(or decrement)");
				System.out.println("C. A condition that tests all the final value of the control variable \t\t D. All of the above.");
				System.out.print("Enter the correct option: ");
				option = scan.next().charAt(0);
				if(option == 'd' || option =='D') {
					++result;
				}
				break;
			case 2:
				System.out.println("The control variable of a counter-controlled loop should be declared as ________to prevent errors");
				System.out.println("A. int \t\t B. float");
				System.out.println("C. double \t\t D. All of the above.");
				System.out.println("Enter the correct option: ");
				option = scan.next().charAt(0);
				if(option == 'a' || option =='A') {
					++result;
				}
				break;
			case 3:
				System.out.println("Which of the following statements about a do…while iteration statement is true?");
				System.out.println("A. The body of a do...while loop executed only if the terminating condition is true \t\t B. The body of a while loop executes only once");
				System.out.println("C. The body of a do...while executes at least once. \t\t D. None of the above.");
				System.out.println("Enter the correct option: ");
				option = scan.next().charAt(0);
				if(option == 'c' || option == 'C') {
					++result;
				}
				break;
			case 4:
				System.out.println("Which formatting flag indicates that the floating-point values should be output with a thousands separator?");
				System.out.println("A. plus(+) \t\t B. minus(-)");
				System.out.println("C. comma(,) \t\t D.period(.).");
				System.out.println("Enter the correct option: ");
				option = scan.next().charAt(0);
				if(option == 'c' || option == 'C') {
					++result;
				}
				break;
			case 5:
				System.out.println("Which of the following will not help prevent infinite loops?");
				System.out.println("A. Include braces around the statement in a do...while statement.  \t\t B. Ensure that the header of a for or while statement is not followed by a semicolon.");
				System.out.println("C. if loop is control-countered, the body of the loop should increment or decrement the counter as needed \t\t D. If the loop is sentinel-controlled, ensure that the sentinel value is input eventually.");
				System.out.println("Enter the correct option: ");
				option = scan.next().charAt(0);
				if(option == 'a' || option =='A') {
					++result;
				}
				break;
			}
		}
		//
		remark();
	}
	public static void remark() {
		switch(result) {
		case 5:
			System.out.println("Excellent");
			System.out.printf("You got %d/5", result);
			break;
		case 4:
			System.out.println("Very Good!");
			System.out.printf("You got %d/5", result);
			break;
		default:
			System.out.println("Time to brush up your knowledge");
			System.out.printf("You got %d/5", result);
		}
	}

}
