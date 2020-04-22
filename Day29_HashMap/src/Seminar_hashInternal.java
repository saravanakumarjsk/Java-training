import java.util.*;

public class Seminar_hashInternal {

	public static void main(String[] args) {
		
		// simple demo
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		
// 		hashcode and index
		
		String o = "FB";
		System.out.println(o.hashCode());
		System.out.println(o.hashCode() & 15); // 12
		
		// hash collision
		
//		String s1 = "FB";
//		String s2 = "Ea";
//		System.out.println(s1.hashCode()+" "+s2.hashCode());
//
//		
//		map.put("FB", 1);
//		map.put("Ea", 1);
		
		// get(key) method
		
		System.out.println(map.get("aaa"));
		
		
		// getkey() and setvalue() like find and replace
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry) itr.next();
			if(me.getKey().equals("aaa"))
			{
				me.setValue("found");
			}
		}
		System.out.println(map);
		
		
	}

}
