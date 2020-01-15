package Practise;

public class MultipleExclusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =1;
		int number = 50;
		int sum = 0;
		
		while(counter <= number) {
			sum += counter;
			if(sum%6 ==0) {
				sum -= counter;
			}
			
			counter +=1;
		}
		System.out.print(sum);

	}

}
