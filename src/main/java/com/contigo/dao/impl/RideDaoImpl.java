package com.contigo.dao.impl;

import com.contigo.dao.mapper.RideDao;
import com.contigo.dao.mapper.RideRowMapper;
import com.contigo.dao.mapper.UserRowMapper;
import com.contigo.domain.Ride;
import com.contigo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nithin on 7/2/2016.
 */
@Repository
public class RideDaoImpl extends AbstractJdbcDao implements RideDao {

    public Ride createRide(Ride ride) {
        if (ride.getDescription() == null || ride.getSource() == null || ride.getDestination() == null) {
            return null;
        }
        String sql = "insert into ride (user_id, passenger_count, destination, destination_zipcode, description," +
                "ride_date, updated_date, created_date, source_zipcode, source )" +
                " values (?, ?, ?, ?, ?, " +
                "?, now(), now(), ?, ?) returning ride_id";

        Long rideId = getJdbcTemplate().queryForObject(sql,
                new Object[]{
                        ride.getUserId(),
                        ride.getPassengerCount(),
                        ride.getDestination(),
                        ride.getDestinationZipcode(),
                        ride.getDescription(),
                        ride.getRideDate(),
                        ride.getSourceZipcode(),
                        ride.getSource(),
                }, Long.class);
        ride.setRideId(rideId);
        return ride;
    }

    public List<Ride> allrides() {
        String sql = "select * from ride";
        RideRowMapper row = new RideRowMapper();
        List<Ride> rides = getJdbcTemplate().query(sql, row);
        return rides;
    }

}











