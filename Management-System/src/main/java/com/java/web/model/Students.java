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
 * @author Eusuph
 */

@Entity
@Table(name = "STUDENTS")
public class Students implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue
	private int studentId;
    
	
	@Column(name = "FIRST_NAME") 
	private String firstname;

	@Column(name = "LAST_NAME")
	private String lastname;

	@OneToMany
	private Set<Marks> studentMarks;

	public Students() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Marks> getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Set<Marks> studentMarks) {
		this.studentMarks = studentMarks;
	}

}
