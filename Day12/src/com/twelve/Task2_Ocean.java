package com.twelve;
import java.util.*;

public class Task2_Ocean {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		EnrollNumbers.printNumbers(n);

	}

}
class EnrollNumbers{
	public static void printNumbers(int a)
	{
		 if(a > 0)
		 {
			 printNumbers(a - 1);
			 System.out.print(a+" ");
		 }
		 return;
		 	
	}
}
