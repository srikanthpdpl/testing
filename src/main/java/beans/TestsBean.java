package beans;

import java.sql.Date;

public class TestsBean {
private int test_id;
private String test_name;
private Date date_created;
public int getTest_id() {
	return test_id;
}
public void setTest_id(int test_id) {
	this.test_id = test_id;
}
public String getTest_name() {
	return test_name;
}
public void setTest_name(String test_name) {
	this.test_name = test_name;
}
public Date getDate_created() {
	return date_created;
}
public void setDate_created(Date date_created) {
	this.date_created = date_created;
}
public Date getDate_updated() {
	return date_updated;
}
public void setDate_updated(Date date_updated) {
	this.date_updated = date_updated;
}
public String getStart_url() {
	return start_url;
}
public void setStart_url(String start_url) {
	this.start_url = start_url;
}
private Date date_updated;
private String start_url;
}
