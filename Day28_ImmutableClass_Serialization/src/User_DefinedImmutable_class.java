final class User{
	private int id;
	
	public User(int d)
	{
		this.id = id;
	}
	
	public User modify(int d)
	{
		if(this.id==id)
		{
			return this;
		}
		else
			return new User(id);
	}
}



public class User_DefinedImmutable_class {

	public static void main(String[] args) {
		User u1 = new User(101);
		User u2 = u1.modify(201);
		User u3 = u1.modify(101);
		
		System.out.println(u1==u2);
		System.out.println(u1==u3);
	}

}
