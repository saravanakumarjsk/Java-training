
class MyThread extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("i am lazy");
//				Thread.sleep(200);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("I got interrupted");
		}
	}
}

public class Demo2_Interrupt {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		
		m.start();
		m.interrupt();
		for(int i=1; i<=10; i++)
			System.out.println("End of main");

	}

}
