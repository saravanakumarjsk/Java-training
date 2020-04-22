import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Hall{
	String name;
	String number;
	double cost;
	String owner;
	
	public Hall()
	{
		
	}
	
	public Hall(String name, String number, double cost, String owner)
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
	
	public void display()
	{
		System.out.printf("%-20s%-20s%-20s%-20s", getName(), getNumber(), String.valueOf(getCost()), getOwner());
	}
	
}


public class Task1 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		boolean res = true;
		
		List<Hall> l = new ArrayList<Hall>();
		
		while(res) 
		{
			System.out.println("1.Add hall");
			System.out.println("2.Remove hall");
			System.out.println("Enter your choice:");
			
			
			
			int ch = input.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the detail in csv format:");
				String[] s = br.readLine().split(",");
				Hall h = new Hall(s[0], s[1], Double.parseDouble(s[2]), s[3]);
				l.add(h);
				
				System.out.println("Do you want to continue");
				char c = input.next().charAt(0);
				if(c == 'Y')
					res = true;
				else
					System.exit(0);
				break;
				
			case 2:
				if(l.isEmpty())
				{
					System.out.println("List is empty");
					System.exit(0);
				}
				else
				{
					System.out.println("Enter the index of the hall to be removed");
					l.remove(input.nextInt());
					System.out.printf("%-20s%-20s%-20s%-20s", "Name", "Number", "Cost", "Owner");
					System.out.println();
					
					ListIterator<Hall> ltr = l.listIterator();
					while(ltr.hasNext())
					{
						Hall hh = ltr.next();
						System.out.printf("%-20s%-20s%-20s%-20s", hh.getName(), hh.getNumber(), String.valueOf(hh.getCost()), hh.getOwner());
					}
				}
			default:
				System.out.println("Enter a valid choise");
				System.out.println("Do you want to continue");
				char ch1 = input.next().charAt(0);
				if(ch1 == 'Y')
					res = true;
				else
					System.exit(0);
				break;
					
			}
		}
		

	}

}


// RR Hall,7388474730,50000,Mahesh
// ML Hall,37463748934,736438,Ganesh