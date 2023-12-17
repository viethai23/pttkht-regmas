package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.StudentDAO.StudentDAO;
import com.example.shoppingonline.Model.User.Account;
import com.example.shoppingonline.Model.User.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {
    private final StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudent();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentDAO.add(student);
    }

    @PutMapping("/{studentId}")
    public Student editStudent(@PathVariable int studentId, @RequestBody Student student) {
        return studentDAO.edit(studentId, student);
    }

    @DeleteMapping("/{studentId}")
    public boolean deleteStudent(@PathVariable int studentId) {
        return studentDAO.delete(studentId);
    }

    @GetMapping("/search")
    public List<Student> searchStudents(@RequestParam String s) {
        return studentDAO.search(s);
    }
}
