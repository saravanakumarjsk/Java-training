package com.twelve;

import java.util.*;

class Posistion {
	public static int findPos(int a) {
		if(a == 1)
		{
			return 1;
		}
		else
			return 2*findPos(a/2);
	}
}

public class Task3_Auditions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k=Posistion.findPos(n);
		System.out.println(k);
	}

}
