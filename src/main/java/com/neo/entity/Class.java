package com.neo.entity;

public class Class {

	private String cno;
	private String cname;
	private String grade;
	
	public Class(){
		super();
	}
	
	public Class(String cno, String cname, String grade) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.grade = grade;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Class [cno=" + cno + ", cname=" + cname + ", grade=" + grade
				+ "]";
	}
	
	
	
}
