package com.five.saravana;

import java.util.*;

public class LoopDay5Demo {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=7;j++) {
				if(i+j==9) {
					System.out.print("*");
				}
				else if(i!=1 && i+j==(2*i)-1) {
					System.out.print("*");
				}
				else if(i==1&&(i+j>=3&&i+j<=7)&&i+j!=5) {
					System.out.print("*");
				}
				else if(i==2&&i+j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
