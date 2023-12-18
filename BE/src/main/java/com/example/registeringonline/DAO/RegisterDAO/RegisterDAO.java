package com.example.registeringonline.DAO.RegisterDAO;

import com.example.registeringonline.Model.Course.Course;
import com.example.registeringonline.Model.Register.*;
import com.example.registeringonline.Model.User.Instructor;
import com.example.registeringonline.Model.User.Student;

import java.util.List;

public interface RegisterDAO {

	Register confirmRegister(Student s, Course c);
	List<Course> getTimetable(Student s, int semester, int year);
	List<Course> getRegisterCourse(Student s);
	Instructor getInstructor(Course c);
	List<Student> getListStudent(Course c);
}