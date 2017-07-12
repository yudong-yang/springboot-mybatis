package com.neo.entity;

import java.util.List;


public class StuCourse {
 private Student student;
 private List<SeleCourse> selecourses;
 private int id;
 
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public List<SeleCourse> getSelecourses() {
	return selecourses;
}
public void setSelecourses(List<SeleCourse> selecourses) {
	this.selecourses = selecourses;
}

@Override
public String toString() {
	return "StuCourse [student=" + student + ", selecourses=" + selecourses
			+ "]";
}


}
