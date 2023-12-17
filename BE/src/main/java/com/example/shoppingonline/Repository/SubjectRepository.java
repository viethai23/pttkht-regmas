package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Course.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findByNameContaining(String name);
}
