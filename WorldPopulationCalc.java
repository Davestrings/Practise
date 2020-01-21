package Practise;

import java.util.Scanner;
public class WorldPopulationCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the current world population: ");
		double worldPopulationNow = scan.nextDouble();
		
		System.out.print("Enter the world population growth rate: ");
		float populationGrowthRate = scan.nextFloat();
		
		int counter = 1;
		double populationIncrease;
		double estimatedPopulation;
		
		System.out.printf("%-9s %20s %20s%n","Year", "Estimated Population", "Population Increase");
		while(counter <= 75) {
			estimatedPopulation = worldPopulationNow * populationGrowthRate;
			
			populationIncrease = estimatedPopulation - worldPopulationNow;
			
			
			if(estimatedPopulation == estimatedPopulation * 2) {
				System.out.printf("World population doubles after %d years ", counter);
			}else {
				System.out.printf("%d %,25.3f %,20.3f%n", counter, estimatedPopulation, populationIncrease);
			}
			
			counter += 1;
		}

	}

}
