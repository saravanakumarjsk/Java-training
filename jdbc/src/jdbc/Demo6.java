package jdbc;
import java.sql.*;

//insert

public class Demo6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"system",
				"sk"
				);
		CallableStatement cs = conn.prepareCall("call emp_details(?,?)");
		cs.setInt(1, 101);
		cs.registerOutParameter(2, java.sql.Types.INTEGER);
		cs.executeUpdate();
		int salary = cs.getInt(2);
		System.out.println(salary);
		
	}

}
