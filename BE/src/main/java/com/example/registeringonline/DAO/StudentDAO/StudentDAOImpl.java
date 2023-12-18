package com.example.registeringonline.DAO.StudentDAO;

import com.example.registeringonline.Model.User.Student;

import com.example.registeringonline.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public boolean delete(int readerId) {
		Optional<Student> readerOptional = studentRepository.findById(readerId);
		if (readerOptional.isPresent()) {
			studentRepository.delete(readerOptional.get());
			return true;
		}
		return false;
	}

	@Override
	public Student edit(int readerId, Student newStudent) {
		Optional<Student> readerOptional = studentRepository.findById(readerId);
		if (readerOptional.isPresent()) {
			Student existingStudent = readerOptional.get();
			existingStudent.setClasss(newStudent.getClasss());
			existingStudent.setFaculty(newStudent.getFaculty());
			existingStudent.setMajor(newStudent.getMajor());
			existingStudent.setStudentID(newStudent.getStudentID());
			existingStudent.setAccount(newStudent.getAccount());
			existingStudent.setAddress(newStudent.getAddress());
			existingStudent.setGender(newStudent.getGender());
			existingStudent.setName(newStudent.getName());
			existingStudent.setDob(newStudent.getDob());
			studentRepository.save(existingStudent);
			return existingStudent;
		}
		return null;
	}

	@Override
	public Student add(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> search(String s) {
		return studentRepository.findByStudentIDContaining(s);
	}

}