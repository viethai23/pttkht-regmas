package com.example.registeringonline.Controller;

import com.example.registeringonline.DAO.CourseDAO.CourseDAO;
import com.example.registeringonline.Model.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@CrossOrigin
public class CourseController {

    private final CourseDAO courseDAO;

    @Autowired
    public CourseController(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @GetMapping
    public List<Course> getCourses(@RequestParam int semester, @RequestParam int schoolYear) {
        return courseDAO.getCourse(semester, schoolYear);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseDAO.add(course);
    }

    @PutMapping("/{courseId}")
    public Course editCourse(@PathVariable int courseId, @RequestBody Course course) {
        return courseDAO.edit(courseId, course);
    }

    @DeleteMapping("/{courseId}")
    public boolean deleteCourse(@PathVariable int courseId) {
        return courseDAO.delete(courseId);
    }

    @GetMapping("/search")
    public List<Course> searchCourses(@RequestParam String s) {
        return courseDAO.search(s);
    }
}
