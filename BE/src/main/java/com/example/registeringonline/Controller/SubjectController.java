package com.example.registeringonline.Controller;

import com.example.registeringonline.DAO.SubjectDAO.SubjectDAO;
import com.example.registeringonline.Model.Course.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
@CrossOrigin
public class SubjectController {

    private final SubjectDAO subjectDAO;

    @Autowired
    public SubjectController(SubjectDAO subjectDAO) {
        this.subjectDAO = subjectDAO;
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectDAO.getAllSubject();
    }

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectDAO.add(subject);
    }

    @PutMapping("/{subjectId}")
    public Subject editSubject(@PathVariable int subjectId, @RequestBody Subject subject) {
        return subjectDAO.edit(subjectId, subject);
    }

    @DeleteMapping("/{subjectId}")
    public boolean deleteSubject(@PathVariable int subjectId) {
        return subjectDAO.delete(subjectId);
    }

    @GetMapping("/search")
    public List<Subject> searchSubjects(@RequestParam String s) {
        return subjectDAO.search(s);
    }
}
