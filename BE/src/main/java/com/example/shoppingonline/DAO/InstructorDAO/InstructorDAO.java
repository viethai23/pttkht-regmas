package com.example.shoppingonline.DAO.InstructorDAO;

import com.example.shoppingonline.Model.User.Instructor;

import java.util.List;

public interface InstructorDAO {

    List<Instructor> getAllInstructor();
    boolean delete(int instructorID);
    Instructor edit(int instructorID, Instructor newInstructor);
    Instructor add(Instructor instructor);

    List<Instructor> search(String s);

}
