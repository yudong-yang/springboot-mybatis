package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neo.entity.StudentInfo;

@Mapper
public interface StudentInfoMapper {

	List<StudentInfo> getBySno(Integer sno);


}