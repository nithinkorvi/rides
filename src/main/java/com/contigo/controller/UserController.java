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
        User u = new User();
        u.setEmail(email);
        u.setFirstName("Nithin");
        return u;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        //Create user in Database
        User createdUser = getUserDao().createUser(user);
        return createdUser;
    }
}
