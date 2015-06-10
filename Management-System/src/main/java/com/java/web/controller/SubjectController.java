package com.java.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.web.model.Subject;
import com.java.web.service.SubjectService;

@Controller
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(value = "/newSubject", method = RequestMethod.GET)
	public ModelAndView newSubject(@ModelAttribute Subject subject){
		ModelAndView model = new ModelAndView("SubjectForm");
		model.addObject("subject",new Subject());
		return model;
	}
	
	@RequestMapping(value = "/saveSubject", method = RequestMethod.POST)
	public ModelAndView saveTeacher(@ModelAttribute Subject subject) {
		subjectService.addSubject(subject);
		return new ModelAndView("redirect:/UserList");
	}
	
}
