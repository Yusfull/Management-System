package com.java.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.model.Groups;
import com.java.web.service.GroupService;

import dao.GroupDao;

@Service
public class GroupServiceImpl implements GroupService {

	
	@Autowired
	private GroupDao groupDao;

	

	@Override
	public void addGroup(Groups groups) {
		groupDao.addGroup(groups);

	}

	@Override
	public void updateGroup(Groups groups) {
		groupDao.updateGroup(groups);
	}

	@Override
	public void removeGroup(int id) {
		groupDao.removeGroup(id);
	}

	@Override
	public List<Groups> listGroups() {
		return groupDao.listGroups();
	}

	@Override
	public Groups getGroupById(int id) {

		return groupDao.getGroupById(id);
	}

	@Override
	public Groups grtGroupsByName(Groups name) {

		return groupDao.grtGroupsByName(name);
	}

}
