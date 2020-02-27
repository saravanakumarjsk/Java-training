package com.second.saravana;
import java.util.*;


public class InstanceDay2 {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.a = 90;
		int v = (int)t2.f;
		System.out.println(t1.a);
		System.out.println(t2.c);
		System.out.println(t2.f);
		System.out.println(t2.b);
		System.out.println(v);
		
	}
}

class Test{
	int a;
	static int b = 20;
	int c = 20;
	static float f = 7860.456f;
}

//class Make{
//	int a = 10;
//	float g = 97845.3453f;
//	char n = 'N';
//	Scanner input = new Scanner(System.in);
//	String name = input.nextLine();
//}


