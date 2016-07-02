package com.contigo.dao;

import com.contigo.domain.User;

/**
 * Created by nithin on 6/26/2016.
 */
public interface UserDao {
    User createUser(User user);

    User findByEmail(String email);
}
