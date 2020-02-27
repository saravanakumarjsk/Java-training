package com.seven;
import java.util.*;

public class Task3Day7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int n = input.nextInt();
		
		int count=0, streak=0,k;
		
		for(int i=2; i<=n; i++) {
			k=i;
			int j = 1;
			count = 0;
			while(i%j == 0) {
				i = i + 1;
				j = j + 1;
				count++;
			}
			if(count == a) {
				streak++;
			}
			i=k;
		
		}
		System.out.println(streak);

	}

}
