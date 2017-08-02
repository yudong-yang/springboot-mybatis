package com.neo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.entity.Clazz;
import com.neo.mapper.ClazzMapper;

@Service
public class ClassService {
	
	
	@Autowired
	private ClazzMapper clazzmapper;
	
	public List<Clazz> getAllClazz(){
		return clazzmapper.getAll();	
	}

}
