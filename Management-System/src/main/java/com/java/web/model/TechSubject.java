package com.java.web.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
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
@Table(name = "TEACHER_SUBJECT")
public class TechSubject implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int teachSubId;
   
    @Column(name = "DESCRIPTION")
    private String desc;

	public int getTeachSubId() {
		return teachSubId;
	}

	public void setTeachSubId(int teachSubId) {
		this.teachSubId = teachSubId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
    

  
    
}
