package testing;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sqlops.ConnectionBean;
import sqlops.DBOrgUserInsert;
import sqlops.DBReadScript;
import sqlops.DBSuiteInsert;
import sqlops.DBUserInsert;

@Path("/Auth")
public class MyJerseyPage {
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String checkAuth(@FormParam("email") String email,
			@FormParam("pswd") String pswd,@FormParam("orgid") int orgid) {
		ConnectionBean connbean = new ConnectionBean();
		 connbean.openConnection();
		 DBUserInsert orguser = new DBUserInsert() ;
		 String msg = orguser.insertUItable(connbean.g_connect, email, pswd, orgid);
		//String msg = orguser.insertUItable(connbean.g_connect, email, pswd);
		connbean.closeConnect();
		return msg;		
		
	}
	
	@Path("/SignUp")
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String checkAuth(@FormParam("fname") String fname,
			@FormParam("lname") String lname,@FormParam("csize") int csize,@FormParam("email") String email,
			@FormParam("orgid") int orgid) {
		ConnectionBean connbean = new ConnectionBean();
		 connbean.openConnection();
		DBOrgUserInsert orguser = new DBOrgUserInsert() ;
		String msg = orguser.insertUItable(connbean.g_connect, fname, lname,csize,email,orgid);
		connbean.closeConnect();
		return msg;	
	}
	
	
	
	@Path("/Suite")
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String SuiteCreat(@FormParam("suiteid") int suiteid,
			@FormParam("orgid") int orgid,@FormParam("suitename") String suitename,@FormParam("email") String email,
			@FormParam("desc") String desc) {
		ConnectionBean connbean = new ConnectionBean();
		 connbean.openConnection();
		 DBSuiteInsert orguser = new DBSuiteInsert() ;
		String msg = orguser.insertUItable(connbean.g_connect, suiteid, orgid,suitename,email,desc);
		connbean.closeConnect();
		return msg;	
	}
	
	
	
	
	@Path("/CheckUser")
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String UserCheck(@FormParam("uname") String uname,@FormParam("pswd") String pswd) {
		ConnectionBean connbean = new ConnectionBean();
		 connbean.openConnection();
		 DBReadScript orguser = new DBReadScript() ;
		boolean msg = orguser.UserCheck(connbean.g_connect, uname, pswd);
				//insertUItable(connbean.g_connect, suiteid, orgid,suitename,email,desc);
		connbean.closeConnect();
		return msg+"";	
	}
}
