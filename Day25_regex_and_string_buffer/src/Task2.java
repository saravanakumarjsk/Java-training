import java.util.*;
import java.util.regex.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter hall booking id to validate");
		String str1 = input.next();
		
		if(Pattern.matches("[0-9]+", str1)==true)
		{
			System.out.println("Valid Booking id");
		}
		else
		{
			System.out.println("Invalid Booking id");
		}

	}

}
