package com.neo.entity;

import java.util.List;


public class StudentInfo {

	private int id;
 	private Student student;
	private Clazz clases;
	private List<Course> courses;
	private List<SeleCourse> selecourses;
		
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
public Clazz getClases() {
	return clases;
}
public void setClases(Clazz clases) {
	this.clases = clases;
}
public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}
public List<SeleCourse> getSelecourses() {
	return selecourses;
}
public void setSelecourses(List<SeleCourse> selecourses) {
	this.selecourses = selecourses;
}
 
}
