import java.util.*;

public class Demo3_TreeMap {

	public static void main(String[] args) {
//		String[] names = {"ram", "shiva","Keivn","alpa"};
		
		Map<String, Integer> m = new TreeMap<String, Integer>(Collections.reverseOrder());
		m.put("ram", 1);
		m.put("shiva", 2);
		m.put("kevin", 5);
		m.put("alfred", 4);
//		m.put("jdf", null);
//		m.put("uyer", null);
		
//		for(int i=0; i < names.length; i++)
//		{
//			Integer count = m.get(names[i]);
//			if(m.get(names[i]) == null)
//			{
//				m.put(names[i], 1);
//			}
//			else
//			{
//				m.put(names[i], count+1);
//			}
//		}
		System.out.println(m);
	}

}

/*
null
{ram=1}
null
{shiva=1, ram=1}
null
{Keivn=1, shiva=1, ram=1}
null
{alpa=1, Keivn=1, shiva=1, ram=1}
1
{alpa=1, Keivn=1, shiva=1, ram=1}
1
{alpa=1, Keivn=1, shiva=1, ram=1}
null
{alpa=1, Kevin=1, Keivn=1, shiva=1, ram=1}
1
{alpa=1, Kevin=1, Keivn=1, shiva=1, ram=1}
1
{alpa=1, Kevin=1, Keivn=1, shiva=1, ram=1}
*/
