import java.util.*;

public class Demo1_HahsMap {

	public static void main(String[] args) {
		String[] names = {"ram", "shiva","Keivn","alpa","alpa", "ram", "Kevin", "shiva", "ram"};
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<names.length; i++)
        {
        	Integer count = map.get(names[i]);
        	if(map.get(names[i]) == null)
        	{
        		map.put(names[i], 1);
        	}
        	else
        	{
        		map.put(names[i], count+1);
        	}
        }
        System.out.println(map);
//        for(int i=0; i<names.length; i++)
//        	System.out.println(map.get(names[i]));
	}

}
