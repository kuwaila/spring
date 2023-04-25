package com.Spring.Bean;

public class Student {
	private int id1;
	private String name;
	private String qualification;
	public Student(int id1, String name, String qualification) {
		super();
		this.id1= id1;
		this.name = name;
		this.qualification = qualification;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	

}
