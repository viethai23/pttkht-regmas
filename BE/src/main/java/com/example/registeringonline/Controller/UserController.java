package com.example.registeringonline.Controller;

import com.example.registeringonline.DAO.UserDAO.UserDAO;
import com.example.registeringonline.Model.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        return userDAO.login(username, password);
    }
}