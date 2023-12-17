package com.example.shoppingonline.DAO.ManagerDAO;

import com.example.shoppingonline.Model.User.Manager;

import com.example.shoppingonline.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerDAOImpl implements ManagerDAO {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public List<Manager> getAllManager() {
        return managerRepository.findAll();
    }
}