package com.contigo.dao.impl;

import com.contigo.dao.mapper.RideRequestDao;
import com.contigo.domain.RideRequest;
import org.springframework.stereotype.Repository;

/**
 * Created by nithin on 7/7/2016.
 */
@Repository
public class RideRequestDaoImpl extends AbstractJdbcDao implements RideRequestDao {

    @Override
    public RideRequest requestRide(RideRequest rideRequest) {


        String sql = "insert into ride_request (source, notes, approved, destination_Zipcode, " +
                "created_date,source_Zipcode, destination, ride_id, user_id)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        getJdbcTemplate().update(sql,
                rideRequest.getSource(),
                rideRequest.getNotes(),
                rideRequest.isApproved(),
                rideRequest.getDestinationZipcode(),
                rideRequest.getCreatedDate(),
                rideRequest.getSourceZipCode(),
                rideRequest.getDestination(),
                rideRequest.getUserId(),
                rideRequest.getRideId());
        return rideRequest;
    }

}
