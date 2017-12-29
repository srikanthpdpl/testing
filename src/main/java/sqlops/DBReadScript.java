package sqlops;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBReadScript {
	
	public boolean UserCheck(Connection conn,String Uname,String Pswd)
	{
		String query = "SELECT * FROM fiori_test.user where email='"+Uname+"' and password='"+Pswd+"'";
		
		 try {
			 
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			int totalrows = rs.getRow();
			if(totalrows>0)
			{   
				st.close();
				return true;
			}
			else
			{
				st.close();
				return false;
			}
//			while (rs.next())
//		      {
//				CompDataBean bean = new CompDataBean();
//				bean.setConfig(rs.getString("id"));
//				bean.setStepno(rs.getString("stepno"));
//				bean.setId(rs.getString("uiid"));
//				bean.setEvtTxt(rs.getString("action"));
//				bean.setName(rs.getString("uiname"));
//				bean.setTooltip(rs.getString("uiname"));
//				bean.setUIType(rs.getString("uiclass"));
//				bean.setValue(rs.getString("value"));
//				
//				beanlist.add(bean);
//		      }
//			
			// st.close();
			//return beanlist; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		 
		// return null;
		  
	}

}
