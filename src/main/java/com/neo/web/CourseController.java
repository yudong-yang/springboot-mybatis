package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neo.entity.Course;
import com.neo.mapper.CourseMapper;

@Controller
public class CourseController {

	@Autowired
	private CourseMapper courseMapper;

	@RequestMapping("/addCourse")
	@ResponseBody
	public String addcourse(Course course) {
		int flag = courseMapper.insert(course);
		if (flag > 0) {
			return "添加成功";
		} else {
			return "添加失败";
		}
	}

	@RequestMapping("/editCourse")
	@ResponseBody
	public String editCourse(Course course) {
		int flag = courseMapper.update(course);
		if (flag > 0) {
			return "==修改成功==";
		} else {
			return "==修改失败==";
		}
	}

	@RequestMapping("/deleteCourse")
	public String deleteCourse(String bno) {
		int flag = courseMapper.delete(bno);
			return "redirect:listCourse";
	}
	
	@RequestMapping("/listCourse")
	public String listCourse(Model model) {
		List<Course> courses = courseMapper.getAll();
		model.addAttribute("courses", courses);
			return "listCourse";
		
	}
}