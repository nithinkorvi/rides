package com.contigo.dao.mapper;

import com.contigo.domain.Ride;
import com.contigo.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nithin on 7/2/2016.
 */
public class RideRowMapper implements RowMapper<Ride> {
    @Override
    public Ride mapRow(ResultSet resultSet, int i) throws SQLException {
        Ride ride = new Ride();
        ride.setRideId(resultSet.getLong("ride_id"));
        ride.setUserId(resultSet.getLong("user_id"));
        ride.setPassengerCount(resultSet.getLong("passenger_count"));
        ride.setDestination(resultSet.getString("destination"));
        ride.setDestinationZipcode(resultSet.getString("destination_zipcode"));
        ride.setDescription(resultSet.getString("description"));
        ride.setDescription(resultSet.getString("description"));
        return ride;
    }
}
