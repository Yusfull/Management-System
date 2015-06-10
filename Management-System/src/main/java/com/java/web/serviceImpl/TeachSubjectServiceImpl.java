package com.java.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.model.TechSubject;
import com.java.web.service.TeachSubjectService;

import dao.TeachSubjectDao;

@Service
public class TeachSubjectServiceImpl implements TeachSubjectService {

	@Autowired
	private TeachSubjectDao teachSubjectDao;

	
	@Override
	public void addTeachSubject(TechSubject techSubject) {
		
     teachSubjectDao.addTeachSubject(techSubject);
	}

	@Override
	public void updateTeachSubject(TechSubject techSubject) {
		teachSubjectDao.updateTeachSubject(techSubject);
	}

	@Override
	public void removeSubject(int id) {
		teachSubjectDao.removeSubject(id);
	}

	@Override
	public List<TechSubject> getAllTeachSubject() {
		return teachSubjectDao.getAllTeachSubject();
	}

	@Override
	public TechSubject getTeachSubjectById(int id) {
		return teachSubjectDao.getTeachSubjectById(id);
	}

	@Override
	public TechSubject grtTeachSubjectByName(TechSubject name) {
		return teachSubjectDao.grtTeachSubjectByName(name);
	
	}

}
