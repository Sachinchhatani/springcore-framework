package com.SC.practice;

public class Employee {
	private String ename;
	private int eid;
	private String eaddress;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", eaddress=" + eaddress + "]";
	}
	public Employee(String ename, int eid, String eaddress) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.eaddress = eaddress;
	}

}
