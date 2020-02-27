package com.six;
import java.util.*;


public class Task4Day6 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		
		switch(num) {
        
		case 1:
        for(int row = 1; row <= 9; row++) {
            for(int col=1; col <= 9; col++) {
                if(row==col || col+row == 10) {
                    System.out.print("+");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        break;
        
		case 2:
        for(int row = 1; row <= 9; row++) {
            for(int col=1; col <= 9; col++) {
                if(row==5 || col==5) {
                    System.out.print("+");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        break;
		case 3:
        
        for(int row = 1; row <= 9; row++) {
            for(int col=1; col <= 9; col++) {
                if((row==1||row==5||row==9)&&(col==2||col==3||col==4)) {
                    System.out.print("*");
                }
                else if((row==2||row==3||row==4||row==6||row==7||row==8)&&(col==1||col==5)) {
                	System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        break;
		default:
			System.out.println("Invalid number");
			System.exit(0);
        
    }
   }
}

