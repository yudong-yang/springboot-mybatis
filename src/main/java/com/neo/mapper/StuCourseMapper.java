package com.neo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neo.entity.StuCourse;

@Mapper
public interface StuCourseMapper {
	
	StuCourse getAll(Integer sno);

}