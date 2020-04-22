import java.util.*;
import java.io.*;

class User{
	private String name;
	private String email;
	private String user;
	private String password;
	
	public User()
	{
		
	}
	
	public User(String name, String email, String user, String password)
	{
		this.name = name;
		this.email = email;
		this.user = user;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

class NameComparator12 implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}

class EmailComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}	
}



public class Task4_Comparator {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of Users ");
		int n = input.nextInt();
		
		List<User> lt2 = new ArrayList<User>();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the details of User "+ (i+1));
			String s[] = br.readLine().split(",");
			lt2.add(new User(s[0], s[1], s[2], s[3]));
		}
		
		System.out.println("Enter the sort option");
		System.out.println("1.Name \n"+""+"2.Email");
		int n1 = input.nextInt();
		
		switch(n1)
		{
		case 1:
			Collections.sort(lt2, new NameComparator12());
			Iterator<User> it = lt2.iterator();
			System.out.format("%-20s%-20s%-20s%-20s\n","Name","Email", "UserName", "Password");
			while(it.hasNext())
			{
				User s = it.next();
				System.out.format("%-20s%-20s%-20s%-20s\n",s.getName(),s.getEmail(),s.getUser(),s.getPassword());
			}
			break;
			
		case 2:
			Collections.sort(lt2, new EmailComparator());
			Iterator<User> it2 = lt2.iterator();
			System.out.format("%-20s%-20s%-20s%-20s\n","Name","Email", "UserName", "Password");
			while(it2.hasNext())
			{
				User s = it2.next();
				System.out.format("%-20s%-20s%-20s%-20s\n",s.getName(),s.getEmail(),s.getUser(),s.getPassword());
			}
			break;
			
		default:
			System.out.println("Enter a valid choice");
			System.exit(0);
		}

	}

}

/*
Mahesh,mahesh@abc.in,mah,123
Ganesh,ganesh@abc.in,gan,456
Suresh,suresh@abc.in,srh,789
*/









