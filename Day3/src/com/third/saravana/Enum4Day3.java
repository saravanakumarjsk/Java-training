package com.third.saravana;

public class Enum4Day3 {

	public static void main(String[] args) {
		Planets p = Planets.earth;
		for (int i = 0; i < Planets.values().length; i++) {
			System.out.println(Planets.values()[i]);
		}
	}
}

enum Planets{
	
	mercury("grey", 1), venus("orange", 2), earth("blue", 1), mars("Red", 4), jupyter("brown", 20), satrun("yellow", 10), neptune("green", 14);
	
	private final String colour;
	private final int moon;
	
	Planets(String x, int y){
		this.colour = x;
		this.moon = y;
	}
}
