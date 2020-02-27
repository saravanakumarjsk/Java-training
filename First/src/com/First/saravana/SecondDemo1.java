package com.First.saravana;
import java.util.*;

public class SecondDemo1 {

	public static void main(String[] args) {
		Date today = new Date();
		
		int a = 10000;
		boolean b = true;
		float f = 12364.8957f;
		String s1 = "C++ Python";
		
		
		System.out.printf("Integer Value: "+ a +"\n");
		System.out.printf("%2$, 2.3f%n", b, f);
		System.out.printf("%2$.2f, %7.2f%n", 1256.4398, 897234.493456);
		System.out.printf("%+d%n", 74834);
		System.out.printf("%+d%n", -74834);
		System.out.printf("%-10s%n", 74834);
		System.out.printf("%10s%n", -74834);
		System.out.printf("%10s%n", 74834);
		System.out.printf("\n%d%n", 12345);

		System.out.printf("%-20s%20s%n", "Name = ", "Ram");
		System.out.printf("%-20s%20.2f%n", "Name = ", 24.8945);
		System.out.printf("%16.2f%n", 748.5734);
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass());
		
		System.out.println(today);
		System.out.printf("%1$td - %1$tm - %1$tY %n", today);
		System.out.printf("%1$tH - %1$tM - %1$tS %n", today);
	}

}
