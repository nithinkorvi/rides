package com.contigo.dao.impl;

import com.contigo.dao.mapper.RideRequestDao;
import com.contigo.domain.RideRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * Created by nithin on 7/7/2016.
 */
@Repository("a")
public class RideRequestDaoImpl extends AbstractJdbcDao implements RideRequestDao {
    private static final Logger logger = Logger.getLogger(RideRequestDaoImpl.class);


    @Override
    public RideRequest requestRide(RideRequest rideRequest) {
        logger.debug("Ride requestdaoimpl started");
        String sql = "insert into ride_request (source, notes, approved, destination_Zipcode, " +
                "created_date,source_Zipcode, destination, ride_id, user_id)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)returning request_id";
        Long requestId = getJdbcTemplate().queryForObject(sql,
                new Object[]{rideRequest.getSource(),
                        rideRequest.getNotes(),
                        rideRequest.isApproved(),
                        rideRequest.getDestinationZipcode(),
                        rideRequest.getCreatedDate(),
                        rideRequest.getSourceZipCode(),
                        rideRequest.getDestination(),
                        rideRequest.getUserId(),
                        rideRequest.getRideId()},
                Long.class);

        rideRequest.setRequestId(requestId);
        logger.debug("Ride requestDaoimpl finished" + requestId);

        return rideRequest;
    }
}
