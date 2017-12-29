package sqlops;

import java.awt.Component;
import java.sql.DriverManager;
import java.util.List;

import javax.ws.rs.FormParam;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBOrgUserInsert {

	public String insertUItable(Connection conn, String fname, String lname,int csize,String email,int orgid) {
		String query = "INSERT INTO fiori_test.org(first_name,last_name,comp_size,email)" + "VALUES (?,?,?,?)";
		Connection gconnect = null;
		try {
//			System.out.println(email);
//			System.out.println(pswd);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.151:3306/fiori_test",
					"srikanth", "user987");
			gconnect = con;
			PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);

			preparedStmt.setString(1, fname);
			preparedStmt.setString(2, lname);
			preparedStmt.setObject(3, csize);
			preparedStmt.setString(4, email);
			preparedStmt.setObject(5, orgid);
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
