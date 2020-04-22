import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

class Hall1 implements Comparable<Hall1>{
	String name;
	String number;
	double cost;
	String owner;
	
	public Hall1()
	{
		
	}
	
	public Hall1(String name, String number, double cost, String owner)
	{
		this.name = name;
		this.number = number;
		this.cost = cost;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public int compareTo(Hall1 h) {
		if(this.cost > h.cost)
			return 1;
		else if(this.cost < h.cost)
			return -1;
		else
			return 0;
	}
		
}



public class Task3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of halls ");
		int n = input.nextInt();
		
		List<Hall1> lt2 = new ArrayList<Hall1>();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the details of hall "+ (i+1));
			String s[] = br.readLine().split(",");
			lt2.add(new Hall1(s[0], s[1], Double.parseDouble(s[2]), s[3]));
		}
		
		Collections.sort(lt2);
		ListIterator<Hall1> ltr = lt2.listIterator();
		System.out.format("%-20s%-20s%-20s%-20s\n","Name","Number", "Cost", "Owner Name");
		while(ltr.hasNext())
		{
			Hall1 h1 = ltr.next();
			System.out.format("%-20s%-20s%-20s%-20s\n",h1.getName(),h1.getNumber(),h1.getCost(),h1.getOwner());
		}

	}

}



//RR Hall,7388474730,50000,Mahesh
//ML Hall,37463748934,736438,Ganesh
