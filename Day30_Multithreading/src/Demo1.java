import java.util.*;


// thread priority and name of thread

class Number implements Runnable{
	public void run(){
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+": "+ Thread.currentThread().getName());
		}
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Number n1 = new Number();
		
		// Thread 1
		Thread t1 = new Thread(n1);
		t1.setName("T1");
		t1.setPriority(10);
		
		// Thread 2
		Thread t2 = new Thread(n1);
		t2.setName("T1");
		t2.setPriority(10);
		
		System.out.println("Main thread: "+ Thread.currentThread().getName());
		System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());
		t1.start();
		t2.start();
		System.out.println("T1 priority is: "+ t1.getPriority());
		System.out.println("T2 priority is: "+ t2.getPriority());
	}

}
