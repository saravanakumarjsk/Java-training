package com;
import java.util.*;

abstract class Shape{
	public abstract double calculatePerimeter();
}

class Circle extends Shape{
	float radius;
	public Circle(float radius)
	{
		this.radius = radius;
	}
	
	public double calculatePerimeter()
	{
		return (double)3.14*2*radius;
	}
}

class Rectangle extends Shape{
	float l;
	float b;
	
	public Rectangle(float l, float b)
	{
		this.l = l;
		this.b = b;
	}
	public double calculatePerimeter()
	{
		return(double) 2*(l+b);
	}
}

class Square extends Shape{
	float side;
	public Square(float side)
	{
		this.side = side;
	}
	
	public double calculatePerimeter()
	{
		return (double)4*side;
	}
}


public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Shape s = null;
		
		System.out.println("List of shapes:");
		System.out.println("1.circle");
		System.out.println("2.Rectange");
		System.out.println("3.Square");
		
		System.out.println("Enter your choice");
		int n = input.nextInt();
		
		switch(n) 
		{
		case 1:
			System.out.println("Enter the radius of circle");
			s = new Circle(input.nextFloat());
			System.out.printf("The perimeter is %.2f", s.calculatePerimeter());
			break;
		case 2:
			System.out.println("Enter the length and breadth");
			s = new Rectangle(input.nextFloat(), input.nextFloat());
			System.out.printf("The perimeter is %.2f", s.calculatePerimeter());
			break;
		case 3:
			System.out.println("Enter the side of square");
			s = new Square(input.nextFloat());
			System.out.printf("The perimeter is %.2f", s.calculatePerimeter());
			break;
		}
	}

}
