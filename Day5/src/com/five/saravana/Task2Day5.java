package com.five.saravana;

import java.util.*;

public class Task2Day5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c,d=0,diff;
        
        a = input.nextInt();
        
        if(a<10) {
        	System.out.println("Invalid number");
        }
        else {
        	b = a%10;
        	while(a!=0) {
        		c = a%10;
        		if (a<10) {
        			d=a;
        			break;
        		}
        		else {
        			a/=10;
        		}
        	}
        diff = Math.abs(b-d);
        }
        
        
        
    }
}
