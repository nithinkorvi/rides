package com.contigo.dao.impl;

import com.contigo.dao.mapper.RideRequestDao;
import com.contigo.dao.mapper.RideRequestMapper;
import com.contigo.domain.RideRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nithin on 7/7/2016.
 */
@Repository
public class RideRequestDaoImpl extends AbstractJdbcDao implements RideRequestDao {

    public RideRequest requestRide(RideRequest rideRequest) {
        String sql = "insert into ride (source, notes, approved, updated_date, destination_Zipcode, created_date, source_Zipcode, " +
                "destination, ride_id, user_id," + "values (?, ?, ?, ?, ?," +
                " ?, ?, ?, ?, ?, " +
                ") + returning request_id";


        Long requestId = getJdbcTemplate().queryForObject(sql,
                new Object[]
                        {
                                rideRequest.getSource(),
                                rideRequest.getNotes(),
                                rideRequest.isApproved(),
                                rideRequest.getUpdatedDate(),
                                rideRequest.getDestinationZipcode(),
                                rideRequest.getCreatedDate(),
                                rideRequest.getSourceZipCode(),
                                rideRequest.getDestination(),
                                rideRequest.getUserId(),
                                rideRequest.getRideId(),
                        }, Long.class);
        rideRequest.setRideId(requestId);
        return rideRequest;
    }

}
