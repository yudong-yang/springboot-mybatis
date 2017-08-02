package com.neo.entity;

//课程表
public class Course {

	private String bno;//课程号
	private String bname;//课程名称
	private String credits;//课程学分
	
	
	
	public Course() {
		super();
		
	}
	public Course(String bno, String bname, String credits) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.credits = credits;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Course [bno=" + bno + ", bname=" + bname + ", credits="
				+ credits + "]";
	}
	
}
