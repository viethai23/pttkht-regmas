package com.example.registeringonline.DAO.UserDAO;

import com.example.registeringonline.Model.User.User;

public interface UserDAO {
	User login(String username, String password);
}