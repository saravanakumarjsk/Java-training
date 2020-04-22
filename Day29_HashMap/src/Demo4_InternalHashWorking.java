import java.util.*;

public class Demo4_InternalHashWorking {
	
	public static void display(List<Integer> i)
	{
		Iterator k = i.iterator();
		while(k.hasNext())
			System.out.println(k.next());
	}
	
	public static void disString(List<String> l)
	{
		for(String s: l)
		{
			System.out.println(s);
		}
	}
	
	public static <T> void dis(List<T> l)
	{
		for(Object s: l)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList();
		
		l.add("sri");
		l.add("name");
		l.add("jdf");
//		l.add(14);
//		l.add(15);
		dis(l);
		disString(l);
	}

}
