package dao;

import java.util.List;

import com.java.web.model.Groups;

public interface GroupDao {
	
	public void addGroup(Groups group);

    public void updateGroup(Groups group);

    public void removeGroup(int id);

    public List<Groups> listGroups();

    public Groups getGroupById(int id);

    public Groups grtGroupsByName(Groups name);

}
