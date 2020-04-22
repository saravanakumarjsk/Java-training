package jdbc.cursors;
import java.util.*;
import java.sql.*;
import oracle.jdbc.internal.OracleTypes;


public class Demo8 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		System.out.println("enter design");
		String desig = input.next();
		CallableStatement cs = conn.prepareCall("call displayEmployeeByDesignation(?,?)");
		cs.setString(1, desig);
		cs.registerOutParameter(2, OracleTypes.CURSOR);
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(2);
		while(rs.next())
		{
			System.out.printf("%-10s%-20s%-10s\n",
					rs.getInt("eno"),
					rs.getString("ename"),
					rs.getString("salary"));
		}
		rs.close();
		conn.close();

	}

}
