package com.java.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.model.Students;
import com.java.web.service.StudentService;

import dao.StudentDao;

@Service("studentService")
public class StudentsServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
    
	@Override
	public void addStudent(Students student) {
		studentDao.addStudent(student);
	}

	@Override
	public void updateStudents(Students students) {
		studentDao.updateStudents(students);
	}

	@Override
	public void removeStudents(int id) {
		studentDao.removeStudents(id);
	}

	@Override
	public List<Students> getAllStudents() {
		
		return studentDao.getAllStudents();
	}

	@Override
	public Students getStudentsById(int id) {
		return studentDao.getStudentsById(id);
	}

	@Override
	public Students grtStudentsByName(Students name) {
		return studentDao.grtStudentsByName(name);
	}

}
