package jdbc.resource_bundle;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = DBConnection2.getConnection();
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
		}

	}

}
