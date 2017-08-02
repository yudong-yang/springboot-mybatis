package com.neo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neo.entity.Student;
import com.neo.mapper.StudentMapper;

@Service
public class StudentService {

	@Resource(name="studentMapper")
	private StudentMapper studentMapper;
	
	public List<Student> getAll(){
		List<Student> students=studentMapper.getAll();
		return students;
	}
	
	public Student getBySno(Integer sno){
		Student student=studentMapper.getOne(sno);
		return student;
	}

	public Boolean addStudent(Student student) {
//		System.out.println(studentMapper.maxSno());
		int sno = studentMapper.maxSno()+1;
//		System.out.println("======"+sno);
		student.setSno(sno);
		int flag = studentMapper.insert(student);
		if(flag!=0){
			return true;
		}else{
			return false;
		}
		
	}

	public Boolean update(Student students) {
		int flag = studentMapper.update(students);
		if(flag!=0){
			return true;
		}else{
			return false;
		}		
	}



public Boolean delete(Integer sno) {
	int flag = studentMapper.delete(sno);
	if(flag!=0){
		return true;
	}else{
		return false;
	}		
}

public boolean exist(Student student) {
	Student exitstu = getBySno(student.getSno());
	if(exitstu!=null){
	return true;
	}else{
		return false;
	}	
}
}