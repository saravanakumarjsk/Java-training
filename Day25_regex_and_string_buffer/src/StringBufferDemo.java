import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class StringBufferDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer("core java");
		StringBuffer sb2 = new StringBuffer("Technology");
		
		System.out.println("sb1 is "+ sb1);
		System.out.println("sb2 is "+ sb2);
		
		StringBuffer sb3 = sb1.append(sb2);
		System.out.println(sb3);
		
		String s1 = "Language";
		sb3.insert(10, s1); // Insert
		System.out.println("After insert: "+sb3);
		
		sb3.replace(0, 4, "completed");// Delete
		System.out.println("After replace "+sb3);
		
		sb3.delete(10, 14);
		System.out.println("Deleted "+sb3);
		System.out.println(sb3.indexOf("comp"));
		
		String s2 = new String(sb2);
		System.out.println(s2);
		
		String sb4 = sb2.reverse().toString();
		System.out.println(sb4);
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer ssb1 = new StringBuffer("saravana");
		ssb1.append("Kumar");
		System.out.println(ssb1);
		
		// STRING TOKENIZER *************
		
		StringTokenizer st = new StringTokenizer("sun -wed  mon  tue");
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
		
		
	}

}
