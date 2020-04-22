import java.util.Scanner;

class Mobile {
	public void calling1() {
		System.out.println("Mobile calling ....");
	}

	public void calling2() {
		System.out.println("2nd Mobile calling ....");
	}
}

class Vivo extends Mobile {

	public void calling1() {
		System.out.println("vivo calling");
	}

	public void camera() {
		System.out.println("Camera of vivo");
	}
}

class Vivo2 extends Vivo {
	public void selfie() {
		System.out.println("vivo perfect selfie");
	}
}

public class Assertion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter phone price");
		int s = input.nextInt();

		assert s==32;
		System.out.println("price is " + s);

		Mobile m = new Vivo(); // sub to super class
		m.calling1();

		Vivo v = (Vivo) m;
		v.calling1();
		v.camera();

	}

}
