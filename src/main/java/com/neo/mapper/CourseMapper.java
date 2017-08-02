package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neo.entity.Course;
@Mapper
public interface CourseMapper {
	

	List<Course> getAll();
	
	Course getOne(Integer bno);

	int insert(Course course);

	int update(Course course);

	int delete(String bno);


}
