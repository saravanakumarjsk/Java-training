package com.First.saravana;
import java.text.*;
import java.util.*;


public class ThirdDemo1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		DecimalFormat df2 = new DecimalFormat("#.00");
		
		double num1 = 1234.89057;
		double num2 = 34895.643;
		double num3 = 63484.7657;
		
		System.out.println(num1+" "+num2+" "+num3+"\n");
		
		System.out.println(df.format(num1));
		System.out.println(df.format(num2));
		System.out.println(df.format(num3));
		System.out.println(df2.format(num3));
		
	}

}
