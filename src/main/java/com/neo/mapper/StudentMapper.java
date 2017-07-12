package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neo.entity.Student;

@Mapper
public interface StudentMapper {
	
	List<Student> getByPage(@Param("offset") int offset, @Param("limit") int limit);
	
	List<Student> getAll();
	
	Student getOne(Integer sno);

	List<Student> getByName(String userName);
	
	int insert(Student user);

	int update(Student user);

	int delete(Integer sno);

}