package com.example.registeringonline.Controller;

import com.example.registeringonline.DAO.RegisterDAO.RegisterDAO;
import com.example.registeringonline.Model.Course.Course;
import com.example.registeringonline.Model.Register.*;
import com.example.registeringonline.Model.User.Instructor;
import com.example.registeringonline.Model.User.Student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/register")
@CrossOrigin
public class RegisterController {

    private final RegisterDAO registerDAO;

    @Autowired
    public RegisterController(RegisterDAO registerDAO) {
        this.registerDAO = registerDAO;
    }

    @PostMapping("/confirm-register")
    public Register confirmRegister(@RequestBody RegisterRequest registerRequest) {
        return registerDAO.confirmRegister(registerRequest.getStudent(), registerRequest.getCourse());
    }

    @PostMapping("/cancel-register")
    public boolean cancelRegister(@RequestBody RegisterRequest registerRequest) {
        return registerDAO.cancelRegister(registerRequest.getStudent(), registerRequest.getCourse());
    }

    @PostMapping("/timetable/{semester}/{year}")
    public List<Course> getTimetable(@RequestBody Student student, @PathVariable int semester, @PathVariable int year) {
        return registerDAO.getTimetable(student, semester, year);
    }

    @PostMapping("/register-course")
    public List<Course> getRegisterCourse(@RequestBody Student student) {
        return registerDAO.getRegisterCourse(student);
    }

    @PostMapping("/instructor")
    public Instructor getInstructor(@RequestBody Course course) {
        return registerDAO.getInstructor(course);
    }

    @PostMapping("/list-student")
    public List<Student> getListStudent(@RequestParam Course course) {
        return registerDAO.getListStudent(course);
    }
}

@Data
class RegisterRequest {
    private Student student;
    private Course course;
}
