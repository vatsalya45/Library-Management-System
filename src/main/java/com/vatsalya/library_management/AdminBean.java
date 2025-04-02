package com.vatsalya.library_management;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	
	private String aName, password, fName, lName, mailID;
	private long phNo;
	
	public AdminBean() {}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMailID() {
		return mailID;
	}

	public void setMailID(String mailID) {
		this.mailID = mailID;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phno) {
		this.phNo = phno;
	}
	
	

}
