import java.util.*;
import java.util.regex.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next().toLowerCase();
		
		if(Pattern.matches("[a-zA-Z0-9]+@+[a-zA-Z]+.+[a-zA-Z&&[\bcom\bin\bnet\borg]]", s)==true)
			System.out.println("Valid email address");
		else
			System.out.println("Invalid email address");
	}

}
