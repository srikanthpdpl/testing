package beans;

import java.sql.Date;

public class SuitBean {
private int suite_id;
private int org_id;
private String suite_name;
private String suite_desc;
public int getOrg_id() {
	return org_id;
}
public void setOrg_id(int org_id) {
	this.org_id = org_id;
}
public String getSuite_desc() {
	return suite_desc;
}
public void setSuite_desc(String suite_desc) {
	this.suite_desc = suite_desc;
}
private Date date_created;
private int delete_flag;
public int getSuite_id() {
	return suite_id;
}
public void setSuite_id(int suite_id) {
	this.suite_id = suite_id;
}
public String getSuite_name() {
	return suite_name;
}
public void setSuite_name(String suite_name) {
	this.suite_name = suite_name;
}
public Date getDate_created() {
	return date_created;
}
public void setDate_created(Date date_created) {
	this.date_created = date_created;
}
public int getDelete_flag() {
	return delete_flag;
}
public void setDelete_flag(int delete_flag) {
	this.delete_flag = delete_flag;
}
}
