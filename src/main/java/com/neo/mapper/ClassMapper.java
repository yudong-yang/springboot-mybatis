package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.neo.entity.Class;
@Mapper
public interface ClassMapper {
	

	List<Class> getAll();
	
	Class getOne(Integer cno);

	int insert(Class classes);

	int update(Class classes);

	int delete(Integer cno);

}