package com.eleven;
import java.util.*;

class Fib{
	public static int fiboLastDigit(int a) {
		int t1=1,t2=1,sum=0;
		
		for(int i=1; i<a-1; i++) {
			sum = t1+t2;
			t1=t2;
			t2=sum;
		}
		return sum%10;
	}
}

public class Day11Demo{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = Fib.fiboLastDigit(a);
		System.out.println(b);

		}
}

