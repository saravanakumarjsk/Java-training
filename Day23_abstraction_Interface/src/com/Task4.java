package com;

import java.util.*;

abstract class Instruments{
	private String s;

	abstract String  play(String s);
	
	public Instruments()
	{
		
	}
}

class ElectricGuitar extends Instruments{
	
	public ElectricGuitar()
	{
		super();
	}

	@Override
	public String play(String s) {
		return "Zing zing";
	}
	
}

class ElectronicKeybord extends Instruments{
	
	public ElectronicKeybord()
	{
		super();
	}

	@Override
	String play(String s) {
		return "Tin tin";
	}
	
}

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Instruments ins = null;
		
		System.out.println("Enter the instruments to be played");
		System.out.println("Electric Guitar");
		System.out.println("Electronic Keybord");
		
		String s = input.nextLine().toLowerCase();
		
		if(s.equals("electric guitar"))
		{
			ins = new ElectricGuitar();
			System.out.println(ins.play(s));
		}
		else if(s.equals("electronic keybord"))
		{
			ins = new ElectronicKeybord();
			System.out.println(ins.play(s));
		}
		else
		{
			System.out.println("Instrument not in the list");
		}
	}

}
