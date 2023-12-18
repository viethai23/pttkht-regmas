package com.example.registeringonline.DAO.StudentDAO;

import com.example.registeringonline.Model.User.Student;

import java.util.List;

public interface StudentDAO {

	List<Student> getAllStudent();
	boolean delete(int studentID);
	Student edit(int studentID, Student newStudent);
	Student add(Student student);

	List<Student> search(String s);

}