import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long time1 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		
		for(long i=0; i<10000000; i++)
		{
			sb.append(" course");
		}
		
		String r1 = System.currentTimeMillis() - time1+"ms";
		System.out.println("Time taken by string buffer "+r1);
		
		long time2 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("java");
		
		for(long i=0; i<10000000; i++)
		{
			sb.append(" course");
		}
		
		String r2 = System.currentTimeMillis() - time2+"ms";
		System.out.println("Time taken by StringBuilder "+r2);
	}

}
