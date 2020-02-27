package com.four.saravana;
import java.util.*;

public class Task3Day4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hurl = input.nextInt();
		int spin = input.nextInt();
		int speed = input.nextInt();
		
		if(hurl>50 && spin>60 && speed>100) {
			System.out.println("Grade is 10");
		}
		else if(hurl>50 && spin>60 && speed<=100) {
			System.out.println("Grade is 9");
		}
		else if(hurl<=50 && spin>60 && speed>100) {
			System.out.println("Grade is 8");
		}
		else if(hurl>50 && spin<=60 && speed>100) {
			System.out.println("Grade is 7");
		}
		else if(hurl>50 || spin>60 || speed>100) {
			System.out.println("Grade is 6");
		}
		else {
			System.out.println("Grade is 5");
		}

	}

}
