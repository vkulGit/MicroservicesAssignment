package com.regms.VO;

public class Users {

	private int userid;
	private String username;
	private String password;
	private String emailid;
	private int securityquestion;
	private String securityans;
	public int getSecurityQuestion() {
		return securityquestion;
	}
	public void setSecurityQuestion(int securityQuestion) {
		this.securityquestion = securityQuestion;
	}
	public String getSecurityAns() {
		return securityans;
	}
	public void setSecurityAns(String securityAns) {
		this.securityans = securityAns;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}

