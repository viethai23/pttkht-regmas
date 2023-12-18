package com.example.registeringonline.Repository;

import com.example.registeringonline.Model.User.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByStudentIDContaining(String s);
}
