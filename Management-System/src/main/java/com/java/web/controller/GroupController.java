package com.java.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.web.model.Groups;
import com.java.web.service.GroupService;

@Controller
public class GroupController {

	@Autowired
	private GroupService groupService;

	@RequestMapping(value = "/newGroup", method = RequestMethod.GET)
	public ModelAndView newGroup(@ModelAttribute Groups group) {
		ModelAndView model = new ModelAndView("groupManager");
		model.addObject("group", new Groups());
		return model;

	}
	
	@RequestMapping(value = "/saveGroup", method = RequestMethod.POST)
	public ModelAndView saveGroup(@ModelAttribute Groups group){
		groupService.addGroup(group);
		return new ModelAndView("redirect:/UserList");
	}
}
