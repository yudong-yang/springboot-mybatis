package com.neo.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;
import com.neo.entity.Student;
import com.neo.enums.UserSexEnum;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void testInsert() throws Exception {
		studentMapper.insert(new Student(2017002, "aa", "a123456","1988-06", UserSexEnum.MAN));
		studentMapper.insert(new Student(2017003, "bb", "a123456","1988-06", UserSexEnum.WOMAN));
		studentMapper.insert(new Student(2017004, "cc", "a123456","1988-06", UserSexEnum.MAN));

		Assert.assertEquals(3, studentMapper.getAll().size());
	}

	@Test
	public void testQuery() throws Exception {
		List<Student> users = studentMapper.getAll();
		if(users==null || users.size()==0){
			System.out.println("is null");
		}else{
			System.out.println(users.toString());
		}
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		Student user = studentMapper.getOne(6);
		System.out.println(user.toString());
		user.setSname("neo");
		studentMapper.update(user);
		Assert.assertTrue(("neo".equals(studentMapper.getOne(6).getSname())));
	}
	
	
	@Test
	public void listPage() throws Exception {
		PageHelper.startPage(0,5);
  		List <Student> lists = studentMapper.getAll();
//  		PageInfo<UserEntity> pageinfo = new PageInfo<UserEntity>(lists);
  		for(Student user : lists){
  			System.out.println(user.getSname());
  		}
	}

}