package com.java.web.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eusuph
 */

@Entity
@Table(name = "GROUPS")
public class Groups implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int groupId;
	
	@Column(name = "GROUP_NAME")
	private String groupName;

	@OneToMany
	private Set<TechSubject> techSubjectList;
	@OneToMany
	private Set<Marks> marksList;
	@OneToMany
	private Set<Students> stdentsList;

	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Set<TechSubject> getTechSubjectList() {
		return techSubjectList;
	}
	public void setTechSubjectList(Set<TechSubject> techSubjectList) {
		this.techSubjectList = techSubjectList;
	}
	public Set<Marks> getMarksList() {
		return marksList;
	}
	public void setMarksList(Set<Marks> marksList) {
		this.marksList = marksList;
	}
	public Set<Students> getStdentsList() {
		return stdentsList;
	}
	public void setStdentsList(Set<Students> stdentsList) {
		this.stdentsList = stdentsList;
	}
	

}
