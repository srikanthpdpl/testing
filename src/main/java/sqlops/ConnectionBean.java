package sqlops;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionBean {
	public Connection g_connect;
	public void openConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.151:3306/fiori_test",
					"srikanth", "user987");
			g_connect = con;
			System.out.println("Connection opened Sucessfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void closeConnect() {

		try {
			if (g_connect != null)
				g_connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
