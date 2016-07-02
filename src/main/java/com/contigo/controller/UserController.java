package com.contigo.controller;

import com.contigo.dao.UserDao;
import com.contigo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nithin on 6/26/2016.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public User userLogin(@RequestParam String email, @RequestParam String password) {
        User u = getUserDao().findByEmail(email);
        if (u == null) {
            throw new RuntimeException("User not found");
        }

        if (!u.getPassword().equals(password)) {
            throw new RuntimeException("User/Password combination is inccorrect");
        }

        return u;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        User u = getUserDao().findByEmail(user.getEmail());
        if (u != null) {
            throw new RuntimeException("User with email already exists, please login");
        }
        //Create user in Database
        User createdUser = getUserDao().createUser(user);
        return createdUser;
    }
}
