package com.java.web.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eusuph
 */

@Entity
@Table(name = "MARKS")
public class Marks implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "MARKS_ID")
    @GeneratedValue
    private int markId;
    
    @Column(name = "DATE")
    private Date dated;
    
    @Column(name = "MARKS")
    private int marks;
    
	public int getMarkId() {
		return markId;
	}

	public void setMarkId(int markId) {
		this.markId = markId;
	}

	public Date getDated() {
		return dated;
	}

	public void setDated(Date dated) {
		this.dated = dated;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
    
    
    

    
    
}
