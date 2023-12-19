package com.example.registeringonline.Repository;

import com.example.registeringonline.Model.Course.Course;
import com.example.registeringonline.Model.Register.Register;
import com.example.registeringonline.Model.User.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {

    List<Register> findByStudentAndSemesterAndSchoolYear(Student student, int semester, int schoolYear);

    List<Register> findByStudent(Student student);

    List<Register> findByCourse(Course course);

    Register findByStudentAndCourse(Student st, Course c);
}
