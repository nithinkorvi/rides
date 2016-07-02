package com.contigo.dao.impl;

import com.contigo.dao.UserDao;
import com.contigo.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by nithin on 6/26/2016.
 */
@Repository
public class UserDaoImpl extends AbstractJdbcDao implements UserDao {

    @Override
    public User createUser(User user) {
        if (user == null || user.getEmail() == null || user.getPassword() == null) {
            return null;
        }

        String sql = "insert into ride_user (email, password, first_name, last_name, mobile_number)" +
                " values (?, ?, ?, ?, ?) returning user_id";

        Long userId = getJdbcTemplate().queryForObject(sql,
                new Object[]{
                        user.getEmail(),
                        user.getPassword(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getMobileNumber()
                }, Long.class);

        user.setUserId(userId);
        return user;
    }
}
