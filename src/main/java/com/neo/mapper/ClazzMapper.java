package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.neo.entity.Clazz;
@Mapper
public interface ClazzMapper {
	

	List<Clazz> getAll();
	
	Clazz getOne(Integer cno);

	int insert(Clazz clazz);

	int update(Clazz clazz);

	int delete(Integer cno);

}