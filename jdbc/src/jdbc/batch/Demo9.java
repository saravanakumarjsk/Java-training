package jdbc.batch;

import java.util.*;
import java.sql.*;

public class Demo9 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		char p;
		Scanner input = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sk");
		PreparedStatement ps = conn.prepareStatement("insert into empp values(?,?,?,?)");
		do {
			System.out.println("insert data on emp");
			ps.setInt(1, input.nextInt());
			ps.setString(2, input.next());
			ps.setString(3, input.next());
			ps.setInt(4, input.nextInt());
			ps.addBatch();
			System.out.println("insert more y/n");
			p = input.next().charAt(0);
		} while (p == 'y');
		int[] info = ps.executeBatch();
		System.out.println(Arrays.toString(info));
		int count = ps.getUpdateCount();
		System.out.println(count + "records inserted sucessfully");
		conn.close();

	}

}
