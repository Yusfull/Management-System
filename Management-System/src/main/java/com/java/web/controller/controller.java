package com.java.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.web.model.Students;
import com.java.web.reports.Report;
import com.java.web.service.StudentService;

@Controller
public class controller {

	protected static Logger logger = Logger.getLogger("controller");
	protected final Log logs = LogFactory.getLog(getClass());

	@Autowired
	private StudentService studentService;

	@Autowired
	private Report reportManager;

	@RequestMapping("/")
	public ModelAndView landingRequest() {
		ModelAndView model = new ModelAndView("home");
		logs.debug(model);
		return model;
	}

	@RequestMapping("/UserList")
	public ModelAndView handleRequest() throws Exception {
		List<Students> listUsers = studentService.getAllStudents();
		ModelAndView model = new ModelAndView("UserList");
		model.addObject("studList", listUsers);
		logs.debug(model);
		logs.debug(studentService);
		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newStudent() {
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("students", new Students());
		return model;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request) {
		int studID = Integer.parseInt(request.getParameter("id"));
		Students students = studentService.getStudentsById(studID);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("students", students);
		return model;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		try {
			int studentId = Integer.parseInt(request.getParameter("id"));
			studentService.removeStudents(studentId);
			JOptionPane.showMessageDialog(null, " Student with student no:"
					+ studentId + "deleted !");
			return new ModelAndView("redirect:/UserList");
		} catch (Exception exe) {
			logger.debug("error !!", exe);
			JOptionPane.showMessageDialog(null,
					" Data can only be deleted during working hours !");
		}
		return new ModelAndView("redirect:/UserList");

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Students students) {
		try {
			studentService.addStudent(students);
			JOptionPane.showMessageDialog(null,
					"Student Added / Edited successful!");
			return new ModelAndView("redirect:/UserList");
		} catch (Exception exe) {
			logger.debug("Error log !!", exe);
			JOptionPane.showMessageDialog(null,
					"An update or insert can be done during working hours !");
		}

		return new ModelAndView("redirect:/UserList");

	}

	@RequestMapping(value = "/printAuditReport", method = RequestMethod.GET)
	public ModelAndView printAuditReport() {
		reportManager.printAudit();
		return new ModelAndView("redirect:/UserList");
	}

	@RequestMapping(value = "/printAverage", method = RequestMethod.GET)
	public ModelAndView printAverageReport() {
		reportManager.printAverageMarks();
		return new ModelAndView("redirect:/UserList");
	}

	@RequestMapping(value = "/printTopAchiever", method = RequestMethod.GET)
	public ModelAndView printTopAchieverReport() {
		reportManager.printToAchievers();
		return new ModelAndView("redirect:/UserList");
	}

}