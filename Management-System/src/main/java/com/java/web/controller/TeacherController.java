package com.java.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.web.model.Teacher;
import com.java.web.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value = "/newTeacher", method = RequestMethod.GET)
	public ModelAndView newTeacher(@ModelAttribute Teacher teacher){
		ModelAndView model = new ModelAndView("teacherForm");
		model.addObject("teacher", new Teacher());
		return model;
	}
	
	@RequestMapping(value = "/saveTeacher", method = RequestMethod.POST)
	public ModelAndView saveTeacher(@ModelAttribute Teacher teacher) {
		teacherService.addTeacher(teacher);
		return new ModelAndView("redirect:/UserList");
	}

}
