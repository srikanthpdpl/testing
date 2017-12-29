package sqlops;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBUserInsert {
	


	public String insertUItable(Connection conn, String email, String pswd,int orgid) {
		String query = "INSERT INTO fiori_test.user(email,password,orgid)" + "VALUES (?,?,?)";
		Connection gconnect = null;
		try {
//			System.out.println(email);
//			System.out.println(pswd);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.151:3306/fiori_test",
					"srikanth", "user987");
			gconnect = con;
			PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
			preparedStmt.setString(1, email);
			preparedStmt.setString(2, pswd);
			preparedStmt.setObject(3, orgid);
			//preparedStmt.setString(4, email);
			preparedStmt.execute();
			preparedStmt.close();
			con.close();
			// conn.closeConnect();
		} catch (Exception e) {
			System.err.println("in Exception of insert User");
			e.printStackTrace();
			return e.toString();

		} finally {
			// ((ConnectionBean) gconnect).closeConnect();
		}

		return "Success";

	}
}
