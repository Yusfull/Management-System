package com.java.web.service;

import java.util.List;

import javax.annotation.Resource;

import com.java.web.model.Students;

@Resource(name = "studentService")
public interface StudentService {

	public void addStudent(Students student);

    public void updateStudents(Students students);

    public void removeStudents(int id);

    public List<Students> getAllStudents();

    public Students getStudentsById(int id);

    public Students grtStudentsByName(Students name);
}
