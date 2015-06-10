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
@Table(name = "TEACHER")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "TEACHER_ID")
    @GeneratedValue
    private int teacherId;
    
    @Column(name = "FIRST_NAME")
    private String firstname;
    
    @Column(name = "LAST_NAME")
    private String lastname;
    
    @OneToMany
    private Set<TechSubject> techSubjectList;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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

	public Set<TechSubject> getTechSubjectList() {
		return techSubjectList;
	}

	public void setTechSubjectList(Set<TechSubject> techSubjectList) {
		this.techSubjectList = techSubjectList;
	}

    
}
