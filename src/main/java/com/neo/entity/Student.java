package com.neo.entity;

import com.neo.enums.UserSexEnum;

public class Student  {

	
	private int sno;  //学号
	private String sname;	//姓名
	private String cno;	//班号
	private String birthday;	//出生日期
	private UserSexEnum sex;	//性别

	


	public Student() {
		super();
	}

	public Student(int sno, String sname, String cno, String birthday,
			UserSexEnum sex) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.cno = cno;
		this.birthday = birthday;
		this.sex = sex;
	}

	
	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public UserSexEnum getSex() {
		return sex;
	}

	public void setSex(UserSexEnum sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sname"+ this.sname +"cno"+this.cno +"birthday" +this.birthday +"sex"+this.sex;
	
	}

}