import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("line 1");
//		StringBuffer sb1 = new StringBuffer();
		String sb1 = input.nextLine();
		
		System.out.println("line 2");
//		StringBuffer sb2 = new StringBuffer();
		String sb2 = input.nextLine();
		
		
		if(sb1.contentEquals(sb2))
			System.out.println("RED");
		
		else if(sb1.replaceAll("\\s", "").equals(sb2.replaceAll("\\s", "")))
			System.out.println("YELLOW,");
		
		else if(sb1.equalsIgnoreCase(sb2))
			System.out.println("BLUE");
		
		else
			System.out.println("GREEN");

	}

}

