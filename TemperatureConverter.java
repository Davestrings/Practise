package Practise;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1 for celsius & 2 for fahrenheit: ");
		int choice = scan.nextInt();
		System.out.print("Enter temperature: ");
		double number = scan.nextDouble();
		
		displayTemperature(choice, number);
		
		scan.close();
	}
	
	public static double convertCelsius( double fahrenheit ) {
		double celsius = 5.0 / 9.0 *(fahrenheit - 32);
		return celsius;
	}
	
	public static double convertFahrenheit(double celsius) {
		double fahrenheit = 9.0 / 5.0 * (celsius + 32);
		return fahrenheit;
	}
	
	public static void displayTemperature(int choice, double number ) {
		switch(choice) {
		case 1:
			System.out.printf("Temperature in Celsius is %f",convertCelsius(number));
			break;
		case 2:
			System.out.printf("Temperature in Fahrenheit  is %f",convertFahrenheit(number));
			break;
		}
	}
}