import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Task2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter the string");
		String s = br.readLine();
		char ch[] = new char[s.length()];
		
		for(int i=0; i<s.length(); i++)
			ch[i] = s.charAt(i);
		
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			Integer count = map.get(String.valueOf(ch[i]));
			
			if(map.get(String.valueOf(ch[i])) == null)
			{
				map.put(String.valueOf(ch[i]), 1);
			}
			else
			{
				map.put(String.valueOf(ch[i]), count+1);
			}
		}
		
		Iterator i = map.entrySet().iterator();
		while(i.hasNext())
			System.out.print(i.next()+" ");

	}

}
