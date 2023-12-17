package com.example.shoppingonline.DAO.StudentDAO;

import com.example.shoppingonline.Model.User.Account;
import com.example.shoppingonline.Model.User.Student;

import java.util.List;

public interface StudentDAO {

	List<Student> getAllStudent();
	boolean delete(int studentID);
	Student edit(int studentID, Student newStudent);
	Student add(Student student);

	List<Student> search(String s);

}