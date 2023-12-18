package com.example.registeringonline.DAO.CourseDAO;

import com.example.registeringonline.Model.Course.Course;

import java.util.List;

public interface CourseDAO {
	List<Course> getCourse(int semester, int schoolYear);

	Course add(Course course);
	Course edit(int courseId, Course course);
	boolean delete(int courseId);

	List<Course> search(String s);
}