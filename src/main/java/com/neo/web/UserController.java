package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neo.entity.Student;
import com.neo.entity.StudentInfo;
import com.neo.mapper.StudentInfoMapper;
import com.neo.service.StudentService;

@RestController
public class UserController {
	
	@Autowired
	private StudentService studentservice;
	
	
	@Autowired
	private StudentInfoMapper studentInfoMapper;
	
	
	@RequestMapping("/getAll")
	public List<Student> getStudents() {
		List<Student> students=studentservice.getAll();
		return students;
	}
	
/*    @RequestMapping("/getStus")
//    @ResponseBody
    public String findBySno(Integer sno,Model model) {
    	List<StudentInfo> studentinfos=studentInfoMapper.getBySno(sno);
    	model.addAttribute("lists", studentinfos);
        return "studentinfo";
    }*/
    
    @RequestMapping("/add")
    @ResponseBody
    public String add(Student students) {
    	if(studentservice.addStudent(students)){
    		return "插入成功";
    	}else{
    		return "添加失败";
    	}
    }
    
    @RequestMapping(value="update")
    @ResponseBody
    public String update(Student students) {
    	if(studentservice.update(students)){
    		return "更新成功";
    	}else{
    		return "更新失败";
    	}
    }
    
    @RequestMapping(value="/delete/{sno}")
    @ResponseBody
    public String delete(@PathVariable("sno") Integer sno) {
    	if(studentservice.delete(sno)){
    		return "删除成功";
    	}else{
    		return "删除失败";
    	}
    }
    
    
}