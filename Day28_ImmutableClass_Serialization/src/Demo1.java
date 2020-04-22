
public class Demo1 {
	void m1(int...numbers) {
		System.out.println("Integer varargs");
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.m1(10,20);
		d.m1(10,20,30,40);
	}

}
