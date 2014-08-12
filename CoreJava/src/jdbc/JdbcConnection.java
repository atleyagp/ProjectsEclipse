package jdbc;
import java.sql.*;
public class JdbcConnection {

	public static void main(String args[])throws Exception
	{
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "atharva";
			String password = "a";
			conn = DriverManager.getConnection(url, username, password);
			if (conn== null)
			{
				System.out.println("Connection not established");
			}
			else
			{
				System.out.println("Connection found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
