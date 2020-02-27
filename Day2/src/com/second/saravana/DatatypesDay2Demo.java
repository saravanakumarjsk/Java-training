package com.second.saravana;

public class DatatypesDay2Demo {

	public static void main(String[] args) {
		int i = 100;
		float f = 23.43f;
		short s = 12538;
		byte b = 15;
		double d = 1454.54765354;
		char c = 'D';
		long l = 12347867;
		char cc = (char)s;
		System.out.println(cc);
		System.out.println(Byte.SIZE/8);
		
		float ff = l;
		System.out.println(ff);
		
		s = (short)(s+b);
		System.out.println(s);
		
		float fg = (float) (d+i);
		System.out.println(fg);

		byte bb = (byte) (d+i);
		System.out.println("(byte)(long + int) -> byte = "+bb);
		System.out.println(i+c);
		System.out.println((char)(168));
		char ed = (char)(i+c);
		System.out.println("(char)(long + char) -> char = "+ed);
	}
}


