package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCCore {

	public static void main(String args[]) throws SQLException {
		
		Connection con = DriverManager
		.getConnection("jdbc:myDriver:wombat","myLogin", "myPassword");
//DriverManager.
		Statement stmt = con.createStatement();
		con.prepareStatement("select * from HELLO");
		ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM Table1");
		while (rs.next()) {
			int x = rs.getInt("a");
			String s = rs.getString("b");
			float f = rs.getFloat("c");
		
		}
		
		//rs.get

	}
}
