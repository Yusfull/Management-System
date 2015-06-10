package com.java.web.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "TEST")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TEST_ID")
	@GeneratedValue
	private Integer testId;

	@Column(name = "MAXIMUM_MARKS")
	private int maximumMarks;

	@Column(name = "EXAM_DATE")
	private Date examDate;

	@OneToMany
	private Set<Marks> marksList;

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public int getMaximumMarks() {
		return maximumMarks;
	}

	public void setMaximumMarks(int maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Set<Marks> getMarksList() {
		return marksList;
	}

	public void setMarksList(Set<Marks> marksList) {
		this.marksList = marksList;
	}
}
