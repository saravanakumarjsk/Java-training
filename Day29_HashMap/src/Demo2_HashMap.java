import java.util.*;

public class Demo2_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> obj = new HashMap();
		obj.put(101, "a");
		obj.put(102, "b");
		obj.put(103, "c");
//		obj.put(null, null);
//		obj.put(null, "some value");
//		obj.put(null, "another value");
//		obj.put(108, null);
		obj.put(104, "d");
//		obj.put(101, "Saravana");
		
		

		System.out.println("Key set");
		Set s = obj.keySet();
		System.out.println(s); //[101, 102, 103, 104]
		
		System.out.println();
		
		System.out.println(obj); // {101=a, 102=b, 103=c, 104=d}
		System.out.println();
		
		Collection c = obj.values();
		System.out.println(c);//[a, b, c, d]
		System.out.println();
		
		Set es = obj.entrySet();
		System.out.println(es);//[101=a, 102=b, 103=c, 104=d]
		System.out.println();
		
		System.out.println(obj.values());//[a, b, c, d]
		System.out.println();
		
		
		Set es2 = obj.entrySet();
		Iterator i = obj.entrySet().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		
		
		System.out.println("After replacing\n");
		Iterator i2 = obj.entrySet().iterator();
		while(i2.hasNext())
		{
			Map.Entry me = (Map.Entry) i2.next();
//			System.out.println(me.getValue());
			if(me.getKey().equals(102))
			{
				me.setValue("Kumar");
			}
			System.out.println(me.getValue());
		}

		
	}

}












