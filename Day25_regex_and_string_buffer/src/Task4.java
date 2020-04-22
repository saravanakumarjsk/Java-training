import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println(input.next().replaceAll("[^0-9]", "-"));
	}
}
