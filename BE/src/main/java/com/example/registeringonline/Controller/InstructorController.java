package com.example.registeringonline.Controller;

import com.example.registeringonline.DAO.InstructorDAO.InstructorDAO;
import com.example.registeringonline.Model.User.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorDAO instructorDAO;

    @Autowired
    public InstructorController(InstructorDAO instructorDAO) {
        this.instructorDAO = instructorDAO;
    }

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorDAO.getAllInstructor();
    }

    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorDAO.add(instructor);
    }

    @PutMapping("/{instructorId}")
    public Instructor editInstructor(@PathVariable int instructorId, @RequestBody Instructor instructor) {
        return instructorDAO.edit(instructorId, instructor);
    }

    @DeleteMapping("/{instructorId}")
    public boolean deleteInstructor(@PathVariable int instructorId) {
        return instructorDAO.delete(instructorId);
    }

    @GetMapping("/search")
    public List<Instructor> searchInstructors(@RequestParam String s) {
        return instructorDAO.search(s);
    }
}

