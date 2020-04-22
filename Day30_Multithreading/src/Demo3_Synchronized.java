class AlphaNumeric{
	public void display() 
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}

	public void displayAlpha()
	{
		for(int i=97; i<=122; i++)
		{
			System.out.print((char)i);
		}
	}
}

// Synchronized is used to run a single thread at a time, in our case it executes a-z and then 0-9
// if not sync then it prints in any random order

class Thread1 extends Thread{
	AlphaNumeric an;
	Thread1(AlphaNumeric an)
	{
		this.an = an;
	}

	public void run()
	{
		synchronized(an) 
		{
		an.display();
		}
	}
}

class Thread2 extends Thread{
	AlphaNumeric an;
	Thread2(AlphaNumeric an)
	{
		this.an = an;
	}

	public void run()
	{
		synchronized(an)
		{
		an.displayAlpha();
		}
	}
}



public class Demo3_Synchronized {

	public static void main(String[] args) throws InterruptedException{
		AlphaNumeric an = new AlphaNumeric();
		Thread1 t1 = new Thread1(an);
		Thread2 t2 = new Thread2(an);

		t2.start();
		t1.start();

	}

}
