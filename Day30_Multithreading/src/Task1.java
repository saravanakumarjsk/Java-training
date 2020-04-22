
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task1 {
	static Integer count=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number of lines");
		int n = Integer.parseInt(br.readLine());
		ArticleX a=new ArticleX("");
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Line "+i);
			a = new ArticleX(br.readLine());
			a.start();

		}
		try {
			a.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}

System.out.println("There are "+count+" articles in the given input");
	}

}

class ArticleX extends Thread{
	private String line;
	private int count;
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArticleX(String line) {
		super();
		this.line = line;
	}
	
	@Override
	public void run() {
		StringTokenizer st = new StringTokenizer(line);
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			if(temp.equalsIgnoreCase("a")||temp.equalsIgnoreCase("an")||temp.equalsIgnoreCase("the")) {
				count++;
				
			}
			
		}
		synchronized(Task1.count) {
		Task1.count+=count;
		}
	}
	
	
	
}