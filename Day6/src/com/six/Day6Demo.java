package com.six;

public class Day6Demo {

	public static void main(String[] args) {
		int a = 12345;
		int save = a, digit, k = 0, even = 0, odd = 0, prime = 0, i = 0, sum = 0;
		while(a>0) {
			i++;
			digit = a%10;
			if(digit%2==0) {
				odd++;
			}
			else {even++;}
			for(int j =1; j<digit; j++) {
				if(digit%j == 0) {
					k++;
				}
				else {
					k= k;
				}
			}
			
			if(k==2) {
				sum = sum*10+digit;
				prime++;
				k=0;
			}
			a=a/10;
		}
		System.out.println(sum);
		System.out.println(i);
		System.out.println(even);
		System.out.println(odd);
		System.out.println(prime);

	}

}
