package sqlops;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBSuiteInsert {

	//suiteid, orgid,suitename,email,desc

	public String insertUItable(Connection conn, int suiteid,int orgid, String suitename,String email,String desc) {
		String query = "INSERT INTO fiori_test.suite(suite_id,org_id,suite_name,suite_desc)" + "VALUES (?,?,?,?)";
		Connection gconnect = null;
		try {
//			System.out.println(email);
//			System.out.println(pswd);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.151:3306/fiori_test",
					"srikanth", "user987");
			gconnect = con;
			PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
			preparedStmt.setObject(1, suiteid);
			preparedStmt.setObject(2, orgid);
			preparedStmt.setString(3, suitename);
			preparedStmt.setString(4, desc);
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
