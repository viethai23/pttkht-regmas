package com.example.registeringonline.DAO.InstructorDAO;

import com.example.registeringonline.Model.User.Instructor;
import com.example.registeringonline.Repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorDAOImpl implements InstructorDAO {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAll();
    }

    @Override
    public boolean delete(int readerId) {
        Optional<Instructor> readerOptional = instructorRepository.findById(readerId);
        if (readerOptional.isPresent()) {
            instructorRepository.delete(readerOptional.get());
            return true;
        }
        return false;
    }

    @Override
    public Instructor edit(int readerId, Instructor newInstructor) {
        Optional<Instructor> readerOptional = instructorRepository.findById(readerId);
        if (readerOptional.isPresent()) {
            Instructor existingInstructor = readerOptional.get();
            existingInstructor.setRank(newInstructor.getRank());
            existingInstructor.setFaculty(newInstructor.getFaculty());
            existingInstructor.setSubjectGroup(newInstructor.getSubjectGroup());
            existingInstructor.setInstructorID(newInstructor.getInstructorID());
            existingInstructor.setAccount(newInstructor.getAccount());
            existingInstructor.setAddress(newInstructor.getAddress());
            existingInstructor.setGender(newInstructor.getGender());
            existingInstructor.setName(newInstructor.getName());
            existingInstructor.setDob(newInstructor.getDob());
            instructorRepository.save(existingInstructor);
            return existingInstructor;
        }
        return null;
    }

    @Override
    public Instructor add(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> search(String s) {
        return instructorRepository.findByInstructorIDContaining(s);
    }

}
