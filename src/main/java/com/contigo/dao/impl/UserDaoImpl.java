package com.contigo.dao.impl;

import com.contigo.dao.UserDao;
import com.contigo.dao.mapper.UserRowMapper;
import com.contigo.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


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

    @Override
    public User findByEmail(String email) {
        if (email == null) {
            return null;
        }
        String sql = "select * from ride_user where email = ?";
        List<User> users = getJdbcTemplate().query(sql, new Object[]{email}, new UserRowMapper());
        if (users == null || users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }
}
