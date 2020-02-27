package com.five.saravana;

public class Day5Demo2 {
	public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=5;j++) {
			if((i==2||i==3||i==5||i==6)&&((i+j==i+1)||(i+j==i+5))) {
				System.out.print("*");
		}
			else if((i==1||i==4)&&(i+j>=3)) {
				if(i==1&&i+j==6) {
					System.out.print(" ");
				}
				else if(i==4&&(i+j==5||i+j==9)){
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			else {
				System.out.print(" ");
			}
	}
		System.out.println("");
		}
	}
}

