package com.SCore.CI;

public class person {
	private int id;
	private String pname;
	private Address add;
	public person(int id, String pname, Address add) {
		super();
		this.id = id;
		this.pname = pname;
		this.add = add;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", pname=" + pname + ", add=" + add + "]";
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

}
