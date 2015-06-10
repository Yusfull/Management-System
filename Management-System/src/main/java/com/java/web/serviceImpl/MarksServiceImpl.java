package com.java.web.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.model.Marks;
import com.java.web.service.MarksService;

import dao.MarksDao;

@Service
public class MarksServiceImpl implements MarksService {

	@Autowired
	private MarksDao marksDao;

	

	@Override
	public void addMarks(Marks marks) {
		marksDao.addMarks(marks);
	}

	@Override
	public void updateMarks(Marks marks) {
		marksDao.updateMarks(marks);
	}

	@Override
	public void removeMarks(int id) {
		marksDao.removeMarks(id);
	}

	@Override
	public List<Marks> getAllMarks() {
		return marksDao.getAllMarks();
	}

}
