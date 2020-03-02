package com.ten;

class Test
{
	public void changeNumber(Demo2FunctionsAndObjects obj)
	{
		obj.a += 10;
	}
}

public class Demo2FunctionsAndObjects {
	
	int a;
	int b=20;

	public static void main(String[] args) 
	{
		int num=10;
		Test t = new Test();
		Demo2FunctionsAndObjects obj = new Demo2FunctionsAndObjects();
		
		System.out.println(obj.a);
		System.out.println(obj.toString());
		t.changeNumber(obj);
		System.out.println(obj.a);
	}
}
