package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Course.Course;
import com.example.shoppingonline.Model.Register.Register;
import com.example.shoppingonline.Model.User.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {

    List<Register> findByStudentAndSemesterAndSchoolYear(Student student, int semester, int schoolYear);

    List<Register> findByStudent(Student student);

    List<Register> findByCourse(Course course);
}
