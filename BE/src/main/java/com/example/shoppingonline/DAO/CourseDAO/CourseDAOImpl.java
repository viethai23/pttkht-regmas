package com.example.shoppingonline.DAO.CourseDAO;

import com.example.shoppingonline.Model.Course.Course;

import java.util.List;

import com.example.shoppingonline.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseDAOImpl implements CourseDAO {

	private final CourseRepository courseRepository;

	@Autowired
	public CourseDAOImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getCourse(int semester, int schoolYear) {
		return courseRepository.findBySemesterAndSchoolYear(semester, schoolYear);
	}

	@Override
	public Course add(Course course) {
		// You may perform additional logic before saving the course
		return courseRepository.save(course);
	}

	@Override
	public Course edit(int courseId, Course course) {
		Course existingCourse = courseRepository.findById(courseId).orElse(null);

		if (existingCourse != null) {
			existingCourse.setStartDate(course.getStartDate());
			existingCourse.setTime(course.getTime());
			existingCourse.setRoom(course.getRoom());
			existingCourse.setCapacity(course.getCapacity());
			existingCourse.setSemester(course.getSemester());
			existingCourse.setSchoolYear(course.getSchoolYear());

			existingCourse.setSubject(course.getSubject());

			return courseRepository.save(existingCourse);
		}

		return null;
	}

	@Override
	public boolean delete(int courseId) {
		Course existingCourse = courseRepository.findById(courseId).orElse(null);

		if (existingCourse != null) {
			courseRepository.delete(existingCourse);
			return true;
		}

		return false;
	}

	@Override
	public List<Course> search(String s) {
		return courseRepository.findBySubjectName(s);
	}
}