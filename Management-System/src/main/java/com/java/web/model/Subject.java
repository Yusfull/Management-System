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
@Table(name = "Subject")
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SUBJECT_Id")
	@GeneratedValue
	private int subjectId;

	@Column(name = "SUBJECT_NAME")
	private String subjectName;

	@OneToMany
	private Set<TechSubject> techSubjectList;

	@OneToMany
	private Set<Marks> marksList;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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

}
