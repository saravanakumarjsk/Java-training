import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class RegexDemo {

	public static void main(String[] args) {
//		int count=0;
//		String str = "Welcome to world"+
//		"Welcome to chennai "+
//				"welcome to 3edge";
//		Pattern p = Pattern.compile("[aeiou]");
//		Matcher m = p.matcher(str);
//		
//		while(m.find())
//		{
//			count++;
//		}
//		System.out.println(count);
		System.out.println(Pattern.matches("[saravana]?", "aa"));
		System.out.println(Pattern.matches("[saravana]+", "a"));
		
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		  
		System.out.println("metacharacters D....");//D means non-digit  
		  
		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		  
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
	}

}
