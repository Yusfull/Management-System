package com.java.web.service;

import java.util.List;

import com.java.web.model.Groups;

public interface GroupService {
	
	public void addGroup(Groups groups);

    public void updateGroup(Groups groups);

    public void removeGroup(int id);

    public List<Groups> listGroups();

    public Groups getGroupById(int id);

    public Groups grtGroupsByName(Groups name);

}
