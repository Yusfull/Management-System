package com.java.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.model.Test;
import com.java.web.service.TestService;

import dao.TestDao;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	
	
	@Override
	public void addTest(Test test) {
		testDao.addTest(test);
	}

	@Override
	public void updateTest(Test test) {
	testDao.updateTest(test);
	}

	@Override
	public void removeTest(int id) {
	testDao.removeTest(id);
	}

	@Override
	public List<Test> getAllTest() {
		return testDao.getAllTest();
	}

	@Override
	public Test getTestById(int id) {
		return testDao.getTestById(id);
	}
	

	@Override
	public Test getTestByName(Test name) {
		return testDao.getTestByName(name);
	}

}
