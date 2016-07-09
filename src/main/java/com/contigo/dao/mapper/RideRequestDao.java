package com.contigo.dao.mapper;

import com.contigo.domain.Ride;
import com.contigo.domain.RideRequest;

import java.util.List;

/**
 * Created by nithin on 7/7/2016.
 */
public interface RideRequestDao {
    //public List<RideRequest> allRides();

   public RideRequest requestRide(RideRequest rideRequest);
}
