package com.example.registeringonline.Repository;

import com.example.registeringonline.Model.Course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findBySubjectName(String s);

    List<Course> findBySemesterAndSchoolYear(int semester, int schoolYear);
}
