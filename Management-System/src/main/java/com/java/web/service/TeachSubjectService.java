package com.java.web.service;

import java.util.List;

import com.java.web.model.TechSubject;

public interface TeachSubjectService {

	public void addTeachSubject(TechSubject techSubject);

    public void updateTeachSubject(TechSubject techSubject);

    public void removeSubject(int id);

    public List<TechSubject> getAllTeachSubject();

    public TechSubject getTeachSubjectById(int id);

    public TechSubject grtTeachSubjectByName(TechSubject name);
}
