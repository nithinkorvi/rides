package com.contigo.dao.mapper;

import com.contigo.domain.RideRequest;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nithin on 7/7/2016.
 */
public class RideRequestMapper implements RowMapper<RideRequest> {
    @Override
    public RideRequest mapRow(ResultSet resultSet, int i) throws SQLException {
        RideRequest ride = new RideRequest();
        ride.setRequestId(resultSet.getLong("Request_id"));
        ride.setSource(resultSet.getString("source"));
        ride.setNotes(resultSet.getString("notes"));
        ride.setApproved(resultSet.getBoolean("approved"));
        ride.setUpdatedDate(resultSet.getDate("updated_date"));
        ride.setDestinationZipcode(resultSet.getString("destiation_zipcode"));
        ride.setCreatedDate(resultSet.getDate("created_date"));
        ride.setSourceZipCode(resultSet.getLong("source_zipcode"));
        ride.setDestination(resultSet.getString("destination"));
        ride.setRideId(resultSet.getLong("ride_id"));
        ride.setUserId(resultSet.getLong("user_id"));
        return ride;

    }

}
