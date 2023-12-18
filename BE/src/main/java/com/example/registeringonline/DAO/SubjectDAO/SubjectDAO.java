package com.example.registeringonline.DAO.SubjectDAO;

import com.example.registeringonline.Model.Course.Subject;

import java.util.List;

public interface SubjectDAO {

	Subject add(Subject s);

	boolean delete(int subjectId);

	List<Subject> getAllSubject();

	Subject edit(int subjectId, Subject newSubject);

	List<Subject> search(String s);

}