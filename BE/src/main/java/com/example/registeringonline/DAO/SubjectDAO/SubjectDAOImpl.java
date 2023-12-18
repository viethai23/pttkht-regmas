package com.example.registeringonline.DAO.SubjectDAO;

import com.example.registeringonline.Model.Course.Subject;

import java.util.List;

import com.example.registeringonline.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectDAOImpl implements SubjectDAO {

	private final SubjectRepository subjectRepository;

	@Autowired
	public SubjectDAOImpl(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}

	@Override
	public Subject add(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public boolean delete(int subjectId) {
		Subject existingSubject = subjectRepository.findById(subjectId).orElse(null);

		if (existingSubject != null) {
			subjectRepository.delete(existingSubject);
			return true;
		}

		return false;
	}

	@Override
	public List<Subject> getAllSubject() {
		return subjectRepository.findAll();
	}

	@Override
	public Subject edit(int subjectId, Subject newSubject) {
		Subject existingSubject = subjectRepository.findById(subjectId).orElse(null);

		if (existingSubject != null) {
			existingSubject.setName(newSubject.getName());
			existingSubject.setCredit(newSubject.getCredit());
			existingSubject.setFaculty(newSubject.getFaculty());
			existingSubject.setMajor(newSubject.getMajor());
			existingSubject.setClassHour(newSubject.getClassHour());

			return subjectRepository.save(existingSubject);
		}

		return null;
	}

	@Override
	public List<Subject> search(String s) {
		return subjectRepository.findByNameContaining(s);
	}
}