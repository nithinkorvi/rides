package com.contigo.controller;

import com.contigo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nithin on 6/26/2016.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public User login(@RequestParam String email, @RequestParam String password) {
        User u = new User();
        u.setEmail(email);
        u.setFirstName("Nithin");
        return u;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public User userLogin(@RequestParam String email, @RequestParam String password) {
        User u = new User();
        u.setEmail(email);
        u.setFirstName("Nithin");
        return u;
    }
}
