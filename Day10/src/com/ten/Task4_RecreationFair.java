package com.ten;

import java.util.Scanner;

public class Task4_RecreationFair {
	public static int findInt(int a, int b)
	{
		if(b == 0){
            return a;
        }
        return findInt(b, a%b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(findInt(a, b));

	}

}
