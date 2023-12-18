package com.example.registeringonline.DAO.RegisterDAO;

import com.example.registeringonline.Model.Course.Course;
import com.example.registeringonline.Model.Register.*;
import com.example.registeringonline.Model.User.Instructor;
import com.example.registeringonline.Model.User.Student;

import java.util.ArrayList;
import java.util.List;

import com.example.registeringonline.Repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterDAOImpl implements RegisterDAO {
	private final RegisterRepository registerRepository;

	@Autowired
	public RegisterDAOImpl(RegisterRepository registerRepository) {
		this.registerRepository = registerRepository;
	}

	@Override
	public Register confirmRegister(Student s, Course c) {
		Register register = new Register();
		register.setSemester(c.getSemester());
		register.setSchoolYear(c.getSchoolYear());
		register.setStudent(s);
		register.setCourse(c);
		return register;
	}

	@Override
	public List<Course> getTimetable(Student s, int semester, int year) {
		List<Register> l = registerRepository.findByStudentAndSemesterAndSchoolYear(s, semester, year);
		List<Course> l1 = new ArrayList<>();
		for(Register st:l) {
			l1.add(st.getCourse());
		}
		return l1;
	}

	@Override
	public List<Course> getRegisterCourse(Student s) {
		List<Register> l = registerRepository.findByStudent(s);
		List<Course> l1 = new ArrayList<>();
		for(Register st:l) {
			l1.add(st.getCourse());
		}
		return l1;
	}

	@Override
	public Instructor getInstructor(Course c) {
		return c.getInstructor();
	}

	@Override
	public List<Student> getListStudent(Course c) {
		List<Register> l = registerRepository.findByCourse(c);
		List<Student> l1 = new ArrayList<>();
		for(Register st:l) {
			l1.add(st.getStudent());
		}
		return l1;
	}
}