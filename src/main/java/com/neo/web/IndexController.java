package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.entity.Student;
import com.neo.entity.StudentInfo;
import com.neo.enums.UserSexEnum;
import com.neo.mapper.StudentInfoMapper;
import com.neo.mapper.StudentMapper;
import com.neo.service.StudentService;

@Controller
public class IndexController {
	
	@Autowired
	private StudentService studentservice;
	
	
	@Autowired
	private StudentInfoMapper studentInfoMapper;
	
	
	  @RequestMapping("/addstudent")
	    public String addStudent(int num) {
		  for (int i = 0; i < num; i++) {
			  Student student=new Student();
			  student.setSno(2017001+i);
			  student.setSname("李晓明"+i);
			  student.setCno("1001");
			  student.setSex(UserSexEnum.MAN);
			  student.setBirthday("1998-02-05");
			  if(!studentservice.exist(student))
			  {
				  studentservice.addStudent(student);
			  } 
		}
	        return "redirect:listall";
	    }
	  
	  @RequestMapping("/listall")
	  public String ListAll(Model model){
		  PageHelper.startPage(2,5);
	  		List <Student> lists = studentservice.getAll();
	  		PageInfo<Student> pageinfo = new PageInfo<Student>(lists);
	  		model.addAttribute("pageinfo", pageinfo);
	  		 return "index";
	  }
	  
	  	  
	  @RequestMapping("/pagelist")
//	  @ResponseBody
	  public Object showQuestions(@RequestParam Integer page, @RequestParam Integer pageSize,Model model) {
		  		PageHelper.startPage(page,pageSize);
		  		List <Student> lists = studentservice.getAll();
		  		PageInfo<Student> pageinfo = new PageInfo<Student>(lists);
		  		model.addAttribute("pageinfo", pageinfo);
		  		 return "index";
	  }

	    @RequestMapping("/getStus")
	    public String findByStuno(Integer sno, Model model) {
	    	List<StudentInfo> studentinfos=studentInfoMapper.getBySno(sno);
	    	model.addAttribute("lists", studentinfos);
	        return "studentinfo";
	    }  
	  
}
