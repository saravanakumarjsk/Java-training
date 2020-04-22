package com;

//import java.io.PrintStream;
import java.util.Scanner;

abstract class Match{
	private int curscore;
	private float curover;
	private int target;
	
	public Match(int curscore, float curover, int target)
	{
		this.curscore = curscore;
		this.curover = curover;
		this.target = target;
	}
	
	
	public int getCurscore() {
		return curscore;
	}
	public void setCurscore(int curscore) {
		this.curscore = curscore;
	}
	public float getCurover() {
		return curover;
	}
	public void setCurover(float curover) {
		this.curover = curover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
//	abstract void display();
	abstract void RunRate();
	abstract void calBalls();
}

class ODI extends Match{
	
	public ODI(int curscore, float curover, int target)
	{
		super(curscore, curover, target);
	}

	@Override
	void RunRate() {
		System.out.printf("Required run rate: %.2f", 6.0*(getTarget() - getCurscore())/(50*6 - ((int)getCurover()*6 + (int)((getCurover()- (int)getCurover())*10))));
		
	}

	@Override
	void calBalls() {
		System.out.printf("Need %d runs in %d balls", (getTarget() - getCurscore()), (50*6 - ((int)getCurover()*6 + (int)((getCurover()- (int)getCurover())*10))));
		System.out.println();
	}
	
}

class T20 extends Match{
	
	public T20(int curscore, float curover, int target)
	{
		super(curscore, curover, target);
	}

	@Override
	void RunRate() {
		System.out.printf("Required run rate: %.2f", 6.0*(getTarget() - getCurscore())/(20*6 - ((int)getCurover()*6 + (int)((getCurover()- (int)getCurover())*10))));
	}

	@Override
	void calBalls() {
		System.out.printf("Need %d runs in %d balls", (getTarget() - getCurscore()), (20*6 - ((int)getCurover()*6 + (int)((getCurover()- (int)getCurover())*10))));
		System.out.println();
	}
	
}

class Test extends Match{
	
	public Test(int curscore, float curover, int target)
	{
		super(curscore, curover, target);
	}

	@Override
	void RunRate() {
		System.out.printf("Required run rate: %.2f", 6.0*(getTarget() - getCurscore())/(90*6 - ((int)getCurover()*6 + (int)((getCurover()- (int)getCurover())*10))));
		
	}

	@Override
	void calBalls() {
		System.out.printf("Need %d runs in %d balls", (getTarget() - getCurscore()), (90*6 - ((int)getCurover()*6 + (int)((getCurover()- (int)getCurover())*10))));
		System.out.println();
	}
	
}



public class Task3New {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Match m = null;
		
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");

		
		System.out.println("Enter your choise:");
		int n = input.nextInt();
		
		System.out.println("Enter the current score:");
		int curscore = input.nextInt();
		
		System.out.println("Enter the current over:");
		float curover = input.nextFloat();
		
		System.out.println("Enter the current Target:");
		int target = input.nextInt();
		
		switch(n)
		{
		case 1:
			m = new ODI(curscore, curover, target);
			m.calBalls();
			m.RunRate();
			break;
		case 2:
			m = new T20(curscore, curover, target);
			m.calBalls();
			m.RunRate();
			break;
		case 3:
			m = new Test(curscore, curover, target);
			m.calBalls();
			m.RunRate();
			break;
		default:
			System.exit(0);
		}
	}

}
