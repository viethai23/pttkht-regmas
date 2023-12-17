package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.ManagerDAO.ManagerDAO;
import com.example.shoppingonline.Model.User.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/librarian")
@CrossOrigin
public class ManagerController {

    private final ManagerDAO managerDAO;

    @Autowired
    public ManagerController(ManagerDAO managerDAO) {
        this.managerDAO = managerDAO;
    }

    @GetMapping
    public List<Manager> getAllManagers() {
        return managerDAO.getAllManager();
    }

}
