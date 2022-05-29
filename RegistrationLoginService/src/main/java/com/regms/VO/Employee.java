package com.regms.VO;

public class Employee {
	private int empId;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	
	private String empName;
	
	
	private String skills;
	
	
	private int experience;
	

	private int userid;
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "user.username") private Users user;
	 */
}
