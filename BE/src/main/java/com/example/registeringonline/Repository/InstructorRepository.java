package com.example.registeringonline.Repository;

import com.example.registeringonline.Model.User.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    List<Instructor> findByInstructorIDContaining(String s);
}
