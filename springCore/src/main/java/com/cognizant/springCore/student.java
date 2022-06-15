package com.cognizant.springCore;

public class student {

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	private int id;
	private String name;
	private String rollNo;
}
