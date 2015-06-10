package com.java.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.web.model.Teacher;
import com.java.web.service.TeacherService;

import dao.TeacherDao;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	

	@Override
	@Transactional
	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);

	}

	@Override
	@Transactional
	public void updateTeacher(Teacher teacher) {
		teacherDao.updateTeacher(teacher);

	}

	@Override
	@Transactional
	public void removeTeacher(int id) {
		teacherDao.removeTeacher(id);
	}

	@Override
	@Transactional
	public List<Teacher> getAllTeachers() {
		return teacherDao.getAllTeachers();
	}

	@Override
	@Transactional
	public Teacher getTeacherByName(String name) {
		return teacherDao.getTeacherByName(name);
	}

	@Override
	@Transactional
	public Teacher getTeacherById(int id) {
		return teacherDao.getTeacherById(id);
	}

}
