package com.regdbms.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="TB_USERS" ,uniqueConstraints = @UniqueConstraint(columnNames = "emailid"))
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int userid;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String emailid;
	@Column
	private int securityquestion;
	@Column
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}

