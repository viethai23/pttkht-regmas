package com.example.shoppingonline.DAO.SubjectDAO;

import com.example.shoppingonline.Model.Course.Subject;

import java.util.List;

public interface SubjectDAO {

	Subject add(Subject s);

	boolean delete(int subjectId);

	List<Subject> getAllSubject();

	Subject edit(int subjectId, Subject newSubject);

	List<Subject> search(String s);

}