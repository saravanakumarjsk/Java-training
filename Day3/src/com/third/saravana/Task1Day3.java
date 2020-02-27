package com.third.saravana;
import java.util.*;

public class Task1Day3 {

	public static void main(String[] args) {
		//		Gain = Sp - Cp
		// Gain% = (Gain / CP) * 100
		Scanner input = new Scanner(System.in);
		
		System.out.println("Price of old scooter:");
		double a = input.nextInt();
		
		System.out.println("Price of repair:");
		double b = input.nextInt();
		
		System.out.println("Selling price:");
		double c = input.nextInt();
		
		double cp = a + b;

		double gain = c - cp;
		System.out.println("cp:"+cp);
		System.out.println("Selling price:"+gain);
		double gp = (gain/cp)*100;
		
		System.out.printf("gain percentage is: %.2f",gp);
		
		
	}

}
