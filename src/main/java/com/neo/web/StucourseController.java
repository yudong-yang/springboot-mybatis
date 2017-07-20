package com.neo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neo.entity.StuCourse;
import com.neo.mapper.StuCourseMapper;

@Controller
public class StucourseController {
	
	@Autowired
	private StuCourseMapper scmapper;
	

	    @RequestMapping("/getSC")
	    @ResponseBody
	   public Object findBySC(Integer sno, Model model) {
	    	StuCourse studentinfos=scmapper.getAll(sno);
	    	model.addAttribute("lists", studentinfos);
	        return studentinfos;
	    }  
	  
	    
	    @RequestMapping("/listSC")
	   public String listSC(Integer sno, Model model) {
	    	StuCourse studentinfos=scmapper.getAll(sno);
	    	model.addAttribute("lists", studentinfos);
	        return "listSC";
	    }  
	  
}
