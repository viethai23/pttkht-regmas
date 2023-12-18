package com.example.registeringonline.Repository;

import com.example.registeringonline.Model.Course.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findByNameContaining(String name);
}
