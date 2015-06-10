package com.java.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.web.model.Subject;
import com.java.web.service.SubjectService;

import dao.SubjectDao;


@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectDao subjectDao;

	
	@Override
	@Transactional
	public void addSubject(Subject Subject) {
		subjectDao.addSubject(Subject);
	}

	@Override
	@Transactional
	public void updateSubject(Subject Subject) {
		subjectDao.updateSubject(Subject);
	}

	@Override
	@Transactional
	public void removeSubject(int id) {
		subjectDao.removeSubject(id);

	}

	@Override
	@Transactional
	public List<Subject> getAllSubject() {
		return subjectDao.getAllSubject();
	}

	@Override
	@Transactional
	public Subject getSubjectById(int id) {
		return subjectDao.getSubjectById(id);
	}

	@Override
	@Transactional
	public Subject grtSubjectByName(Subject name) {
		return subjectDao.grtSubjectByName(name);
	}

}
